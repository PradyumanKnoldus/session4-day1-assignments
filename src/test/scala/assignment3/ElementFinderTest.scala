package com.knoldus
package assignment3

import org.scalatest.flatspec.AnyFlatSpec

class ElementFinderTest extends AnyFlatSpec {

  val elementFinder = new ElementFinder()

  "kthElementFromEnd" should "return the last element of the list when k is 1" in {
    val list = List(1, 2, 3, 4, 5)
    val k = 1
    val expected = 5

    assert(elementFinder.kthElementFromEnd(list, k) == expected)
  }

  it should "return the first element of the list when k is the length of the list" in {
    val list = List(1, 2, 3, 4, 5)
    val k = 5
    val expected = 1

    assert(elementFinder.kthElementFromEnd(list, k) == expected)
  }

  it should "throw an exception when k is greater than the length of the list" in {
    val list = List(1, 2, 3, 4, 5)
    val k = 6

    assertThrows[IndexOutOfBoundsException] {
      elementFinder.kthElementFromEnd(list, k)
    }
  }

  it should "throw an exception when the list is empty" in {
    val list = List.empty[Int]
    val k = 1

    assertThrows[IndexOutOfBoundsException] {
      elementFinder.kthElementFromEnd(list, k)
    }
  }
}
