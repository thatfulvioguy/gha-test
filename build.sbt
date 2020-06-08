ThisBuild / scalaVersion := "2.13.2"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.example"
ThisBuild / organizationName := "example"

ThisBuild / crossScalaVersions += "2.12.11"

ThisBuild / githubWorkflowJavaVersions := Seq("adopt@1.8", "adopt@1.11")

// TODO determine if we want to publish via github actions
ThisBuild / githubWorkflowPublishTargetBranches := Seq()

lazy val root = (project in file("."))
  .settings(
    name := "gha-test",
    libraryDependencies += "org.specs2" %% "specs2-core" % "4.9.2" % Test
  )
