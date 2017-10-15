
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""<!DOCTYPE html>
<html>
  <head>
    <title data-ng-bind="pageTitle"></title>
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*5.55*/routes/*5.61*/.Assets.versioned("images/favicon.png")),format.raw/*5.100*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*6.50*/routes/*6.56*/.Assets.versioned("lib/bootswatch-yeti/css/bootstrap.css")),format.raw/*6.114*/("""" />
    """),format.raw/*7.33*/("""
    """),format.raw/*8.5*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*8.50*/routes/*8.56*/.Assets.versioned("css/main.css")),format.raw/*8.89*/("""">
    <script data-main=""""),_display_(/*9.25*/routes/*9.31*/.Assets.versioned("js/main.js")),format.raw/*9.62*/("""" type="text/javascript" src=""""),_display_(/*9.93*/routes/*9.99*/.Assets.versioned("lib/requirejs/require.js")),format.raw/*9.144*/(""""></script>
  </head>
  <body>
    """),format.raw/*12.22*/("""
    """),format.raw/*13.5*/("""<header class="navbar navbar-default navbar-fixed-top" role="navigation" ng-controller="HeaderCtrl" ng-cloak>
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="/">Play <span class="glyphicon glyphicon-heart"></span> Akka </a>
        </div>
        <div class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li><a href="#/dashboard">Dasbhoard</a></li>
            <li><a href="#/services/factorial">Factorial</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </header>
    """),format.raw/*32.29*/("""
    """),format.raw/*33.5*/("""<div data-ng-view data-ng-cloak></div>
    

    <footer class="footer">
      <div class="container">
        <p class="text-muted pull-right">
            <em>"""),_display_(/*39.18*/meta/*39.22*/.BuildInfo.name),format.raw/*39.37*/("""</em> with version 
            <em>"""),_display_(/*40.18*/meta/*40.22*/.BuildInfo.version),format.raw/*40.40*/("""</em> running on 
            <em>scala """),_display_(/*41.24*/meta/*41.28*/.BuildInfo.scalaVersion),format.raw/*41.51*/("""</em></p>
      </div>
    </footer>
    
  </body>
</html>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Sun Oct 01 21:53:11 EDT 2017
                  SOURCE: /home/david/appdynamics/scala/activator-play-cluster-sample/frontend/app/views/index.scala.html
                  HASH: ecb5809d914dbe4cf3d09b74c74f810445fa83ff
                  MATRIX: 520->1|616->3|773->134|787->140|847->179|925->231|939->237|1018->295|1054->332|1085->337|1156->382|1170->388|1223->421|1276->448|1290->454|1341->485|1398->516|1412->522|1478->567|1541->619|1573->624|2507->1554|2539->1559|2728->1721|2741->1725|2777->1740|2841->1777|2854->1781|2893->1799|2961->1840|2974->1844|3018->1867
                  LINES: 20->1|25->1|29->5|29->5|29->5|30->6|30->6|30->6|31->7|32->8|32->8|32->8|32->8|33->9|33->9|33->9|33->9|33->9|33->9|36->12|37->13|56->32|57->33|63->39|63->39|63->39|64->40|64->40|64->40|65->41|65->41|65->41
                  -- GENERATED --
              */
          