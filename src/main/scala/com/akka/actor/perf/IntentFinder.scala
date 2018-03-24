package com.akka.actor.perf

import akka.actor.{Actor, ActorLogging}

class IntentFinder extends Actor with ActorLogging {

  import IntentFinder._

  override def receive: Receive = {

    case FindIntent(utterance: String) =>
      println(s"received $utterance")

      println("responding intent")
      IntentNotification("cool-intent-name")

    case _ => InvalidIntentEvent("send me good utterances")
  }
}

object IntentFinder {

  case class FindIntent(utterance: String)

  case class IntentNotification(intentName: String)

  case class InvalidIntentEvent(info: String)

}
