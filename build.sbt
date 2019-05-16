name := "towise"

version := "0.6.0-SNAPSHOT"

organization := "io.towise"

scalaVersion := "2.12.8"

libraryDependencies +=  "org.scalaj" %% "scalaj-http" % "2.4.1"

libraryDependencies += "com.typesafe.play" %% "play-json" % "2.7.2"

scmInfo := Some(
  ScmInfo(
    url("https://github.com/argedor/TowiseScalaAPI"),
    "scm:git@github.com:argedor/TowiseScalaAPI.git"
  )
)
developers := List(
  Developer(
    id    = "harunkeles0glu",
    name  = "Harun KELEŞOĞLU",
    email = "harunkelesoglu_@hotmail.com",
    url   = url("https://github.com/harunkelesoglu")
  )
)
description := "Towise assists you to detect human faces and bodies with using the latest and reliable technology."
licenses := List("MIT" -> new URL("https://github.com/argedor/TowiseScalaAPI/blob/master/LICENCE.txt"))
homepage := Some(url("https://github.com/argedor/TowiseScalaAPI"))
publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value) Some("snapshots" at nexus + "content/repositories/snapshots")
  else Some("releases" at nexus + "service/local/staging/deploy/maven2")
}
publishMavenStyle := true
