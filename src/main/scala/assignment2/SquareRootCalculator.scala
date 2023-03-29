package com.knoldus
package assignment2

import scala.util.Try

class SquareRootCalculator {

  // A method that takes a list of integers as input and returns a list of square roots of the input numbers
  def squareRootOfListElements(inputList: List[Int]): List[Double] = {

    Try {
      inputList.map(number => if (number >= 0) Math.pow(number, 0.5) else Double.NaN)
    }.getOrElse(List[Double]())

  }
}

