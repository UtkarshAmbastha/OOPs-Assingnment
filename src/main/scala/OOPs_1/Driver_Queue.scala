package OOPs_1

import scala.collection.mutable.ListBuffer

object Driver_Queue extends App {

  val list = ListBuffer(8, 9, 10, 2, 7, 3)
  println("Originally the Queue is: ")
  for (i <- list.indices) println(list(i)+ " " )


  var double_list = new Double_Queue(list)           //This will double the elements in the queue
  println("\n After doubling the elements in the Queue: ")
  for (i <- list.indices) println(list(i)+ " ")


  var squareQueue = new Square_Queue (list)       //Squaring the elements in the queue
  println("\n After squaring the elements in the Queue: ")
  for (i <- list.indices) println(list(i)+ " ")

  squareQueue.dequeue(list)
}
