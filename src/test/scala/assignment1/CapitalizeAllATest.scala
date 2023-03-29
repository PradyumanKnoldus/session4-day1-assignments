package com.knoldus
package assignment1

import org.scalatest.flatspec.AnyFlatSpec

class CapitalizeAllATest extends AnyFlatSpec {

  val capitalizeAllA = new CapitalizeAllA()

  "CapitalizeAllA" should "return a list of strings with all 'a's capitalized" in {
    val inputList = List("My", "name", "is", "Michael", "Scott")
    val expectedOutput = List("My", "nAme", "is", "MichAel", "Scott")
    val actualOutput = capitalizeAllA.capitalizeA(inputList)
    assert(actualOutput == expectedOutput)
  }

  it should "handle an empty list" in {
    val inputList = List.empty[String]
    val expectedOutput = List.empty[String]
    val actualOutput = capitalizeAllA.capitalizeA(inputList)
    assert(actualOutput == expectedOutput)
  }

  it should "handle a list with no 'a's" in {
    val inputList = List("Hello", "world")
    val expectedOutput = List("Hello", "world")
    val actualOutput = capitalizeAllA.capitalizeA(inputList)
    assert(actualOutput == expectedOutput)
  }

  it should "handle a list with only 'a's" in {
    val inputList = List("a", "a", "a", "a")
    val expectedOutput = List("A", "A", "A", "A")
    val actualOutput = capitalizeAllA.capitalizeA(inputList)
    assert(actualOutput == expectedOutput)
  }
}
