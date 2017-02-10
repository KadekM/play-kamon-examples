name := """play2.5-kamon"""
organization := "com.marekkadek"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.8"

resolvers += Resolver.bintrayRepo("kamon-io", "releases")

val kamonCoreVersion = "0.6.6"
val kamonVersion = "0.6.5"

libraryDependencies += filters
libraryDependencies ++= Seq(
  "io.kamon"    %% "kamon-core"           % kamonCoreVersion,
  "io.kamon"    %% "kamon-log-reporter"   % kamonVersion,
  "io.kamon"    %% "kamon-play-2.5"       % kamonVersion,

  "io.kamon"    %% "kamon-akka-2.4"       % kamonVersion,

  "org.aspectj" % "aspectjweaver" % "1.8.10",

  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test
)

