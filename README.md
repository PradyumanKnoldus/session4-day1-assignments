# Session 4 Day 1 Assignments

## Assignment 1
### CapitalizeAllA

CapitalizeAllA is a Scala class that provides a method to capitalize all the lowercase "a"s present in a list of strings.

#### Method Signature

    def capitalizeA(inputList: List[String]): List[String]
   
inputList: A list of strings that need to be processed.
Returns: A new list of strings where all the lowercase "a"s have been capitalized.

#### Exception Handling

If the input list is null or empty, the capitalizeA method returns an empty list.

## Assignment 2
### SquareRootCalculator

SquareRootCalculator is a Scala class that provides a method to calculate the square root of each element in a list of integers.

#### Mathod Signature

    def squareRootOfListElements(inputList: List[Int]): List[Double]

inputList: A list of integers whose square roots need to be calculated.
Returns: A new list of doubles containing the square roots of the input numbers. If a number is negative, its square root is considered NaN.

#### Exception Handling

If the input list is null or empty, the squareRootOfListElements method returns an empty list.

## Assignment 3
### ElementFinder

ElementFinder is a class that provides a method to find the kth element from the end of a list.

#### Method Signature

    def kthElementFromEnd[T](inputList: List[T], positionFromEnd: Int): T

inputList: A list of type T.
positionFromEnd: An integer that represents the position of the element from the end of the list.

#### Exception Handeling

If the positionFromEnd is less than or equal to 0, or greater than the length of the inputList, then an IndexOutOfBoundsException is thrown.





