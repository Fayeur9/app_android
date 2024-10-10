package com.example.tpe_ambulance;

import android.content.Context;
import android.util.Log;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.tpe_ambulance.Mission;

@Database(entities = {Mission.class, Ambulancier.class, Lieux.class, Patient.class, Vehicule.class}, version = 2)
public abstract class AppDatabase extends RoomDatabase {
    public abstract Missions_DAO missionDAO();
    public abstract Ambulancier_DAO Ambulancier_DAO();
    public abstract Lieux_DAO Lieux_DAO();
    public abstract Vehicule_DAO Vehicule_DAO();
    public abstract Patient_DAO Patient_DAO();

}