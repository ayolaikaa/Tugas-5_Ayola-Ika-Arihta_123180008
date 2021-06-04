package com.example.databaselokal.entity;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface DataBukuDAO {
    @Insert
    Long insertData (DataBuku dataBuku);

    @Query("Select * from buku_db")
    List<DataBuku> getData();

    @Update
    int updateData(DataBuku item);

    @Delete
    void deleteData(DataBuku item);
}
