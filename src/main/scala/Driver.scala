package com.knoldus

import assignment1.CapitalizeAllA
import assignment2.SquareRootCalculator
import assignment3.ElementFinder

object Driver extends App {

  println("---------------------------------------------------------------------")
  println("Assignment One")

  val capitalizeAllA = new CapitalizeAllA()

  // Call the capitalizeA method with a list of strings
  private val listForAssignmentOne = List("apple", "banana", "carrot")
  private val outputForAssignmentOne = capitalizeAllA.capitalizeA(listForAssignmentOne)

  println(s"Input List: $listForAssignmentOne")
  println(s"Output List: $outputForAssignmentOne")

  println("---------------------------------------------------------------------")
  println("Assignment Two")

  val squareRoot = new SquareRootCalculator()

  // Call the squareRootList method with a list of integers
  private val listForAssignmentTwo = List(1, 4, 9, 16, -1, 25)
  private val outputForAssignmentTwo = squareRoot.squareRootOfListElements(listForAssignmentTwo)

  println(s"Input List: $listForAssignmentTwo")
  println(s"Output List: $outputForAssignmentTwo")

  println("---------------------------------------------------------------------")
  println("Assignment Three")

  val elementFinder = new ElementFinder()

  // Call the kthElementFromEnd method with a list of integers
  private val listForAssignmentThree = List(1, 2, 3, 4, 5)
  val positionFromEnd = 2

  try {
    val outputForAssignmentThree = elementFinder.kthElementFromEnd(listForAssignmentThree, positionFromEnd)
    println(s"The $positionFromEnd-th element from the end is $outputForAssignmentThree")

  } catch {
    case ex: IndexOutOfBoundsException => println(ex.getMessage)
  }

  println("---------------------------------------------------------------------")

}
