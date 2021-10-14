package jp.techacademy.yusuke.shimozono.taskapp

import android.app.Application
import io.realm.Realm

class TaskApp: Application() {
    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
    }
}