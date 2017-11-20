package com.raquo.domtypes.jsdom.defs.events

import org.scalajs.dom

import scala.scalajs.js

/** Represents an event for which we know what exact type the `target` is. */
@js.native
trait TypedTargetEvent[+E <: dom.EventTarget] extends dom.Event {
  override def target: E = js.native
}