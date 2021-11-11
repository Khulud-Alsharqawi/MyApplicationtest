package com.example.myapplicationtest

import androidx.lifecycle.ViewModel



class ScoreViewModel :ViewModel() {

    private var _score = 0
    val score get() = _score


    fun AddFour(){
        _score+=4
    }

    fun AddOne(){
        _score++
    }
    fun Sub(){
        _score-=2
    }
}
