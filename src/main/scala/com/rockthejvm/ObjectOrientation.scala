package com.rockthejvm

object ObjectOrientation extends App{
  // class and instance notion
  class Animal {
    // define field
    val age: Int = 0
    def eat(): Unit = println("I'm eating")
  }
  val anAnimal = new Animal

  // inheritance
  class Dog(val name: String) extends Animal // constructor
  val aDog = new Dog("Lassie")
  // constructor arg is not a val
  // subtype polymorphism
  val aDeclaredAnimal: Animal = new Dog("Hachi")
  aDeclaredAnimal.eat()


  // Abstract class
  abstract class WalkingAnimal {
    val hasLegs = true // by default public
    def walk(): Unit
  }

  // Interface
  trait Carnivore {
    def eat(animal: Animal): Unit
  }

  // Single class inheritance, multi trait
  class Crocodile extends Animal with Carnivore {
    override def eat(animal: Animal): Unit = print("im eating you, animal")
  }
  val aCroc = new Crocodile
  aCroc.eat(aDog)




}
