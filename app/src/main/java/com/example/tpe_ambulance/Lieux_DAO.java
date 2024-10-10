package com.example.tpe_ambulance;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.ArrayList;
import java.util.List;
@Dao
public interface Lieux_DAO {
    @Query("SELECT * FROM table_des_lieux")
    List<Lieux> getAll();

    @Query("SELECT * FROM table_des_lieux WHERE id_lieu=:id_lieu")
    List<Lieux> getByID(int id_lieu);

    @Insert
    void insertAll(Lieux... lieux);

    @Query("DELETE FROM table_des_lieux where 1=1")
    void deleteAll();
}
