object HelloWord {
 def main(args:Array[String]): Unit = {
  val text : String = "hello word, mon premier programme"
   println(text)


  def Macollection(): Unit = {
   val Maliste = List("jde","tar","jar")
   val Maliste2 :List[String] = List("jule","Richard")
   Maliste.foreach(l => println(l.toUpperCase))
  }
  val Sequence = Seq("doh","rez","rime","faha","solo","kore","marie","ange","narcisse","liam")
  val  Newseq : Seq[Int] = Sequence.map(i =>i.length)
  val affich = Sequence.foreach(println )
  val affich1 = Newseq.foreach (println)

  /* flitre*/
   val tri : Seq[String] = Sequence.filter(_.length() > 3 )
   tri.foreach(println)
  /*tuple*/
   val monMap: Map[String,String] = Map (
    "yop" -> "yopougon",
    "ry" -> "riverra",
    "ab" -> "abobo"
  )

  val l = monMap.values.map(l => l).toList
  println(l)


 }





}

