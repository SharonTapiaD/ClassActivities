package com.example.classactivities.ui.theme.Classes

fun main(){
    val age:Int = 20
    val long_number:Long = 789123128937
    val temperature:Float = 27.33f
    val weight:Double = 64.1231

    val gender:Char = 'M'
    val name:String = "Ricardo Reyes"

    val isGreater:Boolean = false

    val names = arrayOf("Erick", "Sofia", "Javier", "Veronica")

    println(age)
    println("Welcome $name, to your first kotlin project")
    println(add())
    println(producto(5,8))
    printArray(names)

    val numbers = arrayOf(1,2,3,4,5,6,7,8,9,10)
    isEven(numbers)

    print(getDay(1))
    val person = Person("Mar", 25)
    person.displayInformation()
    println(person.name)
    println(person.age)
}

fun add():Int{
    val x = 10
    val y = 5
    return (x+y)
}

fun producto(x:Int, y:Int):Int{
    return(x*y)
}

fun printArray(names:Array<String>){
    println(names)
    for (name in names){
        println("Hello $name")
    }
}

fun isEven(numbers:Array<Int>){
    for(number in numbers){
        if(number %2 == 0){
            println("The number $number is even")
        } else{
            println("The number $number is odd")
        }
    }
}

fun getDay(day:Int):String{
    var name = ""
    when(day){
        1 -> name = "Monday"
        2 -> name = "Tuesday"
        3 -> name = "Wednesday"
        4 -> name = "Thursday"
        5 -> name = "Friday"
        6 -> name = "Saturday"
        7 -> name = "Sunday"
        else -> name = "Incorrect value"
    }
    return name
}

class Person(val name:String, val age:Int){
    fun displayInformation(){
        println("Name: $name Age: $age")
    }
}