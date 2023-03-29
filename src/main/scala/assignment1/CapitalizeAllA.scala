package com.knoldus
package assignment1

import scala.util.Try

class CapitalizeAllA {

  // A method that takes a list of strings as input and capitalize all A's present in it
  def capitalizeA (inputList: List[String]): List[String] = {

    Try {
      inputList.map(_.replaceAll("a", "A"))
    }.getOrElse(List[String]())
  }

}
