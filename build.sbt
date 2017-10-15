import NativePackagerHelper._

val commonSettings = Seq(
  organization := "your.organization",
  version := "2.4.20",
  scalaVersion := "2.11.11",
  //scalaVersion := "2.10.4",
  
  // build info
  buildInfoPackage := "meta",
  buildInfoOptions += BuildInfoOption.ToJson,
  buildInfoKeys := Seq[BuildInfoKey](
    name, version, scalaVersion,
    "sbtNativePackager" -> "1.0.0"
  )
)

lazy val root = (project in file("."))
  .settings(
    name := "play-akka-cluster"
  )
  .aggregate(api, frontend, backend)

val kamonVersion = "0.6.6"
  
lazy val frontend = (project in file("frontend"))
    .enablePlugins(PlayScala, BuildInfoPlugin, JavaAppPackaging)
    .settings(
        name := "cluster-play-frontend",
        libraryDependencies ++= (Dependencies.frontend  ++ Seq(filters, cache)),
	libraryDependencies ++= Seq( "io.kamon" %% "kamon-core" % "0.6.6", "io.kamon" %% "kamon-jmx" % "0.6.6","io.kamon" %% "kamon-akka-2.4" % "0.6.6","io.kamon" %% "kamon-akka-http" % "0.6.6"),
        pipelineStages := Seq(rjs, digest, gzip),
        RjsKeys.paths += ("jsRoutes" -> ("/jsroutes" -> "empty:")),
        javaOptions ++= Seq(
            "-Djava.library.path=" + (baseDirectory.value.getParentFile / "backend" / "sigar" ).getAbsolutePath,
            "-Xms128m", "-Xmx1024m"),
        fork in run := true,
        mappings in Universal ++= directory(baseDirectory.value.getParentFile / "backend" / "sigar"),
        bashScriptExtraDefines ++= Seq(
          """declare -r sigar_dir="$(realpath "${app_home}/../sigar")"""",
          """addJava "-Djava.library.path=${sigar_dir}""""
        ),
        commonSettings
    ).dependsOn(api)

lazy val backend = (project in file("backend"))
    .enablePlugins(BuildInfoPlugin, JavaAppPackaging)
    .settings(
        name := "cluster-akka-backend",
        libraryDependencies ++= Dependencies.backend,
	libraryDependencies ++= Seq("io.kamon" %% "kamon-core" % "0.6.5",  "io.kamon" %% "kamon-jmx" % "0.6.5"),
        javaOptions ++= Seq(
            "-Djava.library.path=" + (baseDirectory.value / "sigar").getAbsolutePath,
            "-Xms128m", "-Xmx1024m"),
        // this enables custom javaOptions
        fork in run := true,
        mappings in Universal ++= directory(baseDirectory.value / "sigar"),
        bashScriptExtraDefines ++= Seq(
          """declare -r sigar_dir="$(realpath "${app_home}/../sigar")"""",
          """addJava "-Djava.library.path=${sigar_dir}""""
        ),
        commonSettings
    ).dependsOn(api)
    
lazy val api = (project in file("api"))
    .enablePlugins(BuildInfoPlugin)
    .settings(
        name := "cluster-api",
        libraryDependencies ++= Dependencies.backend,
        commonSettings
    )

//
// Scala Compiler Options
// If this project is only a subproject, add these to a common project setting.
//
scalacOptions in ThisBuild ++= Seq(
  "-target:jvm-1.8",
  "-encoding", "UTF-8",
  "-deprecation", // warning and location for usages of deprecated APIs
  "-feature", // warning and location for usages of features that should be imported explicitly
  "-unchecked", // additional warnings where generated code depends on assumptions
  "-Xlint", // recommended additional warnings
  "-Ywarn-adapted-args", // Warn if an argument list is modified to match the receiver
  "-Ywarn-value-discard", // Warn when non-Unit expression results are unused
  "-Ywarn-inaccessible",
  "-Ywarn-dead-code"
)

