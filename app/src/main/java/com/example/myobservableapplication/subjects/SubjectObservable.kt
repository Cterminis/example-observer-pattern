package com.example.myobservableapplication.subjects

import com.example.myobservableapplication.observers.MyObserver

interface SubjectObservable {

    fun sendNotifyAll()

    fun addObserver(observer: MyObserver)

    fun removeObserver(observer: MyObserver)
}
