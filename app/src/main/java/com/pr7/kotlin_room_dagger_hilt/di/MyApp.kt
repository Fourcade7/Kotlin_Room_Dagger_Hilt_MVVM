package com.pr7.kotlin_room_dagger_hilt.di

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MyApp constructor():Application() {
}