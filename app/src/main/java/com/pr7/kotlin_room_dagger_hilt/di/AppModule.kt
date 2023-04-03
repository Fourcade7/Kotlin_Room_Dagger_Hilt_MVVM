package com.pr7.kotlin_room_dagger_hilt.di

import android.content.Context
import androidx.room.Room
import com.pr7.kotlin_room_dagger_hilt.AppDatabase
import com.pr7.kotlin_room_dagger_hilt.Constants
import com.pr7.kotlin_room_dagger_hilt.UserDao
import com.pr7.kotlin_room_dagger_hilt.data.MainRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
class AppModule {



    @Provides
    fun provideAppDatabase(@ApplicationContext context: Context):AppDatabase{
        val db = Room.databaseBuilder(
            context,
            AppDatabase::class.java, "${Constants.TABLE_NAMEE}"
        ).allowMainThreadQueries().build()
        return db
    }

    @Provides
    fun provideUserDao(appDatabase: AppDatabase):UserDao{
        return appDatabase.userDao()
    }


//    @Provides
//    fun provideRepository(userDao: UserDao): MainRepository =MainRepository(userDao)

}