package com.akka.actor.perf

import akka.actor.{Actor, ActorLogging, ActorSystem, Props}
import com.akka.actor.perf.IntentFinder.FindIntent
import com.typesafe.config.ConfigFactory

object ActorSystemPerf {

  implicit private val actorSystem: ActorSystem = ActorSystem.create("nlu-actor-system", ConfigFactory.parseString(
    """
      |akka {
      |  loglevel = "OFF"
      |  loggers = ["akka.event.slf4j.Slf4jLogger"]
      |}
    """.stripMargin))

  private val intentFinder = actorSystem.actorOf(Props.create(classOf[IntentFinder]))

  def main(args: Array[String]): Unit = {

    intentFinder ! FindIntent("What is the weather in Seattle?")

  }

}
