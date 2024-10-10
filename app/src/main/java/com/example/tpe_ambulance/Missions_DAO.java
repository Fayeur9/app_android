package com.example.tpe_ambulance;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;
@Dao
public interface Missions_DAO {
    @Query("SELECT * FROM table_des_missions")
    List<Mission> getAll();

    @Query("SELECT * FROM table_des_missions WHERE id_mission=:id_mission")
    List<Mission> getByID(int id_mission);

    @Insert
    void insertAll(Mission... missions);

    @Query("DELETE FROM table_des_missions where 1=1")
    void deleteAll();
}
