package com.example.tpe_ambulance;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface Ambulancier_DAO {
    @Query("SELECT * FROM table_des_amublanciers")
    List<Ambulancier> getAll();

    @Query("SELECT * FROM table_des_amublanciers WHERE id_ambulancier=:id_ambulancier")
    List<Ambulancier> getByID(int id_ambulancier);

    @Insert
    void insertAll(Ambulancier... ambulanciers);

    @Query("DELETE FROM table_des_amublanciers where 1=1")
    void deleteAll();
}
