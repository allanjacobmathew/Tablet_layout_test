package com.example.allanjacob.tablet_layout_test;

import android.app.Application;
import android.arch.persistence.room.Room;

import com.example.allanjacob.tablet_layout_test.databsae.AppDatabase;
import com.facebook.stetho.Stetho;

/**
 * Created by allan.jacob on 2/13/2018.
 */

public class RoomApplication extends Application {
    private static RoomApplication roomApplication;

    public AppDatabase getDb() {
        return db;
    }

    private AppDatabase db;

    @Override
    public void onCreate() {
        super.onCreate();

        Stetho.initializeWithDefaults(this);
        roomApplication = this;
        db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "contactdb").allowMainThreadQueries().build();
    }

    public static RoomApplication getInstance() {
        return roomApplication;
    }
}
