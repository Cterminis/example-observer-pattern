package com.example.myobservableapplication.subjects

import com.example.myobservableapplication.observers.MyObserver

class SubjectToBeObserved : SubjectObservable {

    constructor(state: String? = null) {
        this.state = state
    }

    var state: String?
        set(value) {
            value?.let {
                field = it
            } ?: apply {
                field = "sin estado"
            }
            sendNotifyAll()
        }
    private val observers = arrayListOf<MyObserver>()

    override fun addObserver(observer: MyObserver) {
        observers.add(observer)
    }

    override fun removeObserver(observer: MyObserver) {
        observers.remove(observer)
    }

    override fun sendNotifyAll() {
        observers.forEach { observer ->
            observer.notifyData()
        }
    }
}
