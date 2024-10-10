package com.example.tpe_ambulance;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;
@Dao
public interface Vehicule_DAO {
    @Query("SELECT * FROM table_des_vehicules")
    List<Vehicule> getAll();

    @Query("SELECT * FROM table_des_vehicules WHERE id_vehicule=:id_vehicule")
    List<Vehicule> getByID(int id_vehicule);

    @Insert
    void insertAll(Vehicule... vehicules);

    @Query("DELETE FROM table_des_vehicules where 1=1")
    void deleteAll();
}
