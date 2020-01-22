name := "scoping-example"
version := "0.1"
scalaVersion := "2.13.1"

lazy val root = (project in file(".")).aggregate(controller, service, repository)

lazy val controller = (project in file("controller")).dependsOn(service)
lazy val    service = (project in file("service"   )).dependsOn(repository)
lazy val repository =  project in file("repository")
