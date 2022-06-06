package fix.pixiv

object SingleConditionMatch {

  private val result = Some(1)

  Some(1).foreach {
  result => println(result)
}

  println(Some(1))

  {
  val result = Some(1)
  println(result.getOrElse(result))
}

  {
  val result = Some(1)
  println(result)
  println(result)
}

  Some(1) match {
    case Some(result) =>
      println(result)
  }

  Some(1) match {
        case Some(result2) => println(result2)
        case _ => println("hoge")
      }
}