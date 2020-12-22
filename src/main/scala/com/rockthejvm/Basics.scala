package com.rockthejvm

object Basics extends App {
  // define my first value
  val meaningOfLife: Int = 42 // const int meaningOfLife = 42;

  // Int, Boolean, Float, String
  val aBoolean = false // type is optional

  // string and string operation
  val aString = "I love Scala"
  val aComposedString = "I" + " " + "love" + " " + "Scala"
  val anInterpolatedString = s"The meaning of life is $meaningOfLife"

  // expression = structure that can be reduced to a value
  val aExpression = 2 + 3

  // if-expression
  val ifExpression = if (meaningOfLife > 43) 56 else 999
  val chainedIfExpression = {
    if (meaningOfLife > 0) 0
    else if (meaningOfLife > -1) 4
    else 7

  }
  // code blocks
  val aCodeBlock = {
    // definition
    val aLocalValue = 3
    // value of code block if the value of last expression
    aLocalValue + 3
  }

  // define a function
  def myFunction(x: Int, y: String): String = {
    y +  " " + x
  }

  // recursive function
  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else n * factorial((n-1))
  }

  // In scala we don't use loops or iteration but
  // also use recursion







}
