package com.example.allanjacob.tablet_layout_test.databsae;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by allan.jacob on 2/13/2018.
 */

@Entity
public class SampleDetails {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "data1")
    private String data;

    @ColumnInfo(name = "subdata")
    private String subdata;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String name) {
        this.data = name;
    }

    public String getSubdata() {
        return subdata;
    }

    public void setSubdata(String mobile) {
        this.subdata = subdata;
    }
}
