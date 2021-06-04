package com.example.databaselokal.entity;

import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "buku_db")
public
class DataBuku {

    @NonNull
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private int id;
    @ColumnInfo(name = "name")
    private  String name;
    @ColumnInfo(name = "address")
    private String address;
    @ColumnInfo(name = "jumlah")
    private int bk;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBk() {
        return bk;
    }

    public void setBk(int bk) {
        this.bk = bk;
    }
}
