package com.knoldus
package assignment2

import org.scalatest.flatspec.AnyFlatSpec

class SquareRootCalculatorTest extends AnyFlatSpec {

  val squareRoot = new SquareRootCalculator()

  "squareRootList" should "return a list of square roots of input numbers" in {
    assert(squareRoot.squareRootOfListElements(List(1, 4, 9)) === List(1.0, 2.0, 3.0))
    assert(squareRoot.squareRootOfListElements(List(2, 3, 5)) === List(Math.sqrt(2), Math.sqrt(3), Math.sqrt(5)))
    assert(squareRoot.squareRootOfListElements(List(16, 25, 36)) === List(4.0, 5.0, 6.0))
  }

  it should "return an empty list for an empty input list" in {
    assert(squareRoot.squareRootOfListElements(List.empty[Int]) === List.empty[Double])
  }

  it should "handle negative input numbers and return NaN" in {
    assert(squareRoot.squareRootOfListElements(List(-4, 9, -16)) === List(Double.NaN, 3.0, Double.NaN))
  }

}
