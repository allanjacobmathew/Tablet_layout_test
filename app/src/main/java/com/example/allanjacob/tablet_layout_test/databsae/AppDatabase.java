package com.example.allanjacob.tablet_layout_test.databsae;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by allan.jacob on 2/13/2018.
 */

@Database(entities = {SampleDetails.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract SampleDao sampleDao();
}
