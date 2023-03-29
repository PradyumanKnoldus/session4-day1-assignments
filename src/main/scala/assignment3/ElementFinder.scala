package com.knoldus
package assignment3

class ElementFinder {

  /* Method that takes a List of type T and an Int, and returns an element of type T
     The element is the kth element from the end of the list
   */
  def kthElementFromEnd[T](inputList: List[T], positionFromEnd: Int): T = {

    if (positionFromEnd <= 0 || positionFromEnd > inputList.length) {
      throw new IndexOutOfBoundsException("Position Entered is out of bound !")
    }

    // Index of kth element from the last
    val index = inputList.length - positionFromEnd
    inputList(index)

  }
}
