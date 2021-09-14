package com.example.countermvc

import androidx.lifecycle.MutableLiveData

class Controller {

    var x: MutableLiveData<Int> = MutableLiveData(0)

    fun counter(){
        x.value = x.value?.plus(1)
    }
}