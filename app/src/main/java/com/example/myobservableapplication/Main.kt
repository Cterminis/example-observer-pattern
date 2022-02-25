package com.example.myobservableapplication

import com.example.myobservableapplication.observers.MyObserver
import com.example.myobservableapplication.subjects.SubjectToBeObserved

fun main() {

    val subject = SubjectToBeObserved()
    MyObserver(subject)
    val mySecondObserver = MyObserver(subject)

    subject.state = "durmiendo"
    println("-----------------------------------")
    subject.state = "despierto"
    println("-----------------------------------")
    subject.removeObserver(mySecondObserver)
    println("-----------------------------------")
    subject.state = "durmiendo nuevamente"
    println("-----------------------------------")
    subject.state = null
}
