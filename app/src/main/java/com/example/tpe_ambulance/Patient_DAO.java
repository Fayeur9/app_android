package com.example.tpe_ambulance;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;
@Dao
public interface Patient_DAO {
    @Query("SELECT * FROM table_des_patients")
    List<Patient> getAll();

    @Query("SELECT * FROM table_des_patients WHERE id_patient=:id_patient")
    List<Patient> getByID(int id_patient);

    @Insert
    void insertAll(Patient... patients);

    @Query("DELETE FROM table_des_patients where 1=1")
    void deleteAll();
}
