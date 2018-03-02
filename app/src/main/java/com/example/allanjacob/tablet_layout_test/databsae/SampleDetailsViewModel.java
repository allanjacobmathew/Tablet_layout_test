package com.example.allanjacob.tablet_layout_test.databsae;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import android.arch.paging.PagedList;
import android.arch.persistence.room.RoomDatabase;

import com.example.allanjacob.tablet_layout_test.RoomApplication;

/**
 * Created by allan.jacob on 2/14/2018.
 */

public class SampleDetailsViewModel extends ViewModel {

    public LiveData<PagedList<SampleDetails>> getAllData(){
        return RoomApplication.getInstance().getDb().sampleDao().getAll()
                .create(0,new PagedList.Config.Builder()
                        .setPageSize(30).setPrefetchDistance(30).build());
    }

    }

