
name := "akka-actors-perf"

version := "0.1"

scalaVersion := "2.12.5"

assemblyJarName in assembly := "akka-actors-perf.jar"

libraryDependencies += "com.typesafe.akka" %% "akka-http" % "10.1.0"

libraryDependencies += "com.typesafe.akka" %% "akka-stream" % "2.5.11"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test

libraryDependencies += "com.typesafe.akka" %% "akka-slf4j" % "2.5.18"

libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.3" 

mainClass in assembly := Some("com.akka.actor.perf.ActorSystemPerf")
