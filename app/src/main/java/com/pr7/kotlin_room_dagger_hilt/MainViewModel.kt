package com.pr7.kotlin_room_dagger_hilt

import androidx.lifecycle.ViewModel
import com.pr7.kotlin_room_dagger_hilt.data.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor(
    val repository: MainRepository
):ViewModel() {



    fun insertnewdata(user: User){
        repository.insertData(user)
    }

}