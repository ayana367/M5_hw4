package com.example.m5_hw4

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.android.material.snackbar.Snackbar

class MainViewModel: ViewModel() {

    private val _count: MutableLiveData<Int> = MutableLiveData()
    val count: LiveData<Int> = _count
    var variable = 0

    fun plus(view: View) {
        if(variable==10){
            snackBar(view)
        }else{
            variable++
            _count.value = variable
        }
    }

    fun minus(view: View) {
        if(variable==0){
            snackBar(view)
        }else{
            variable--
            _count.value = variable
        }
    }
    fun snackBar(view: View){
        Snackbar.make(view, "Вы достигли предела! \uD83E\uDD73", Snackbar.LENGTH_LONG).show()
    }
}