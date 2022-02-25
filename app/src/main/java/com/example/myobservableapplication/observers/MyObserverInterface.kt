package com.example.myobservableapplication.observers

import com.example.myobservableapplication.subjects.SubjectToBeObserved

interface MyObserverInterface {

    val mySubjectToBeObserved: SubjectToBeObserved

    fun notifyData()
}
