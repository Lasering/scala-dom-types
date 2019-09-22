package com.raquo.domtypes.generic.codecs

/** Use this codec when you don't need any data transformation */
trait AsIsCodec[T] extends Codec[T, T] {
  @inline override def decode(domValue: T): T = domValue
  @inline override def encode(scalaValue: T): T = scalaValue
}
