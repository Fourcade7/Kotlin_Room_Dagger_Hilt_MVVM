package com.pr7.kotlin_room_dagger_hilt.data

import com.pr7.kotlin_room_dagger_hilt.User
import com.pr7.kotlin_room_dagger_hilt.UserDao
import javax.inject.Inject

class MainRepository @Inject constructor(
    val userDao: UserDao
) {


    fun insertData(user: User){
        userDao.insertUser(user)
    }

}