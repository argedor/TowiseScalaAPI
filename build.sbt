name := "towise"

version := "0.2"

organization := "com.argedor"

scalaVersion := "2.12.8"

libraryDependencies +=  "org.scalaj" %% "scalaj-http" % "2.4.1"

libraryDependencies += "com.typesafe.play" %% "play-json" % "2.7.2"

publishTo := Some(Resolver.file("file",new File("/Users/admin/Projects/tour-scala")))
