package com.example.myobservableapplication.observers

import com.example.myobservableapplication.subjects.SubjectToBeObserved

class MyObserver : MyObserverInterface {

    constructor(subjectToBeObserved: SubjectToBeObserved) {
        this.mySubjectToBeObserved = subjectToBeObserved
    }

    override var mySubjectToBeObserved: SubjectToBeObserved
        set(value) {
            field = value
            mySubjectToBeObserved.addObserver(this)
        }

    override fun notifyData() {
        println("el sujeto está ${mySubjectToBeObserved.state}")
    }
}
