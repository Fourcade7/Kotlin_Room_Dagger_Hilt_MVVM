package com.pr7.kotlin_room_dagger_hilt
import androidx.lifecycle.LiveData
import androidx.room.*
import com.pr7.kotlin_room_dagger_hilt.Constants.TABLE_NAMEE


@Dao
interface UserDao {
    @Query("SELECT * FROM $TABLE_NAMEE")
    fun getAllUsers(): List<User>
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUser(user: User)
    @Update
    fun updateUser(user: User)
    @Delete
    fun deleteUser(user: User)
    @Query("DELETE FROM $TABLE_NAMEE")
    fun deleteAllUsers()
    @Query("SELECT * FROM $TABLE_NAMEE WHERE id=:idd ")
    fun loadbyid(idd:Int):User
}