package com.rekklesdroid.blogjetpackapp.persistence

import androidx.room.Database
import androidx.room.RoomDatabase
import com.rekklesdroid.blogjetpackapp.model.AccountProperties
import com.rekklesdroid.blogjetpackapp.model.AuthToken

/**
 * Created on 7/30/2020.
 */
@Database(entities = [AuthToken::class, AccountProperties::class], version = 1)
abstract class AppDatabase: RoomDatabase() {

    abstract fun getAuthTokenDao(): AuthTokenDao

    abstract fun getAccountPropertiesDao(): AccountPropertiesDao

    companion object {
        const val DATABASE_NAME = "app_db"
    }
}