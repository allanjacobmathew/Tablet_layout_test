package com.example.allanjacob.tablet_layout_test.databsae;

import android.arch.paging.LivePagedListProvider;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

/**
 * Created by allan.jacob on 2/13/2018.
 */

@Dao
public interface SampleDao {
    @Insert
    long insertContact(SampleDetails sampleDetails);
    @Query("SELECT * FROM SampleDetails")
    LivePagedListProvider<Integer, SampleDetails> getAll();

}
