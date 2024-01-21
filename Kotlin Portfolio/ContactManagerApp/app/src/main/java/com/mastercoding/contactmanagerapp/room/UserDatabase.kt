package com.mastercoding.contactmanagerapp.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities=[User::class],version=1)
abstract class UserDatabase: RoomDatabase() {
    abstract val userDAO: UserDAO
    // Singleton Design Pattern:
    // This class is for Connection Purposes:
    companion object {
        @Volatile
        private var INSTANCE:UserDatabase?=null
        fun getInstance(context: Context): UserDatabase{
            synchronized(this){
                var instance = INSTANCE
                // If there is No DataBase Object:
                if(instance == null){
                    // Creating the DataBase Object:
                    instance = Room.databaseBuilder(
                       context.applicationContext,
                        UserDatabase::class.java,
                        "users_db"
                    // Run the build method:
                    ).build()
                }
                // If the object is already created:
                return instance
            }
        }
    }
}