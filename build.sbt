ThisBuild / scalaVersion := "2.13.2"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.example"
ThisBuild / organizationName := "example"

// TODO check which versions specs2 cross builds with
ThisBuild / crossScalaVersions ++= Seq("2.12.11", "2.11.12")

// TODO determine if we want to publish via github actions
ThisBuild / githubWorkflowPublishTargetBranches := Seq()

lazy val root = (project in file("."))
  .settings(
    name := "gha-test",
    // TODO cross build with js and native
    // TODO also use githubWorkflowBuildMatrixAdditions
    libraryDependencies += "org.specs2" %% "specs2-core" % "4.9.2" % Test
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
