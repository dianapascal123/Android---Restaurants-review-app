package com.example.android.entity;

import androidx.room.ColumnInfo;
import androidx.room.PrimaryKey;

public class Restaurant {
    @PrimaryKey
    public int id;

    @ColumnInfo(name = "name")
    public String name;

    @ColumnInfo(name = "address")
    public String address;

    @ColumnInfo(name = "telephone")
    public String telephone;

    @ColumnInfo(name = "rating")
    public Float rating;
}
