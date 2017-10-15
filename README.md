## Goal

Building a play frontend for an akka cluster. The frontend provides

* A cluster state dashboard
* A job-execute frontend to calculate the factorial

## Getting Started

Run each line in a new terminal.

```
sbt "backend/run 2551"
sbt "backend/run 2552"
sbt "project frontend" run
```

Go to [localhost:9000](http://localhost:9000) and enjoy the frontend.

