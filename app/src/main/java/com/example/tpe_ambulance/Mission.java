package com.example.tpe_ambulance;

import android.os.Build;
import android.util.Log;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import kotlin.collections.AbstractMutableCollection;

@Entity(tableName = "table_des_missions")
public class Mission {
    @PrimaryKey(autoGenerate = true)
    public int id_mission;
    public int id_patient;
    public int id_vehicule;
    public int id_lieu_part;
    public int id_lieu_arrivee;
    @TypeConverters({TimestampConverter.class}) public Date date_arrivee;
    @TypeConverters({TimestampConverter.class}) public Date date_depart;

    @Ignore public Ambulancier[] liste_ambulanciers=new Ambulancier[3];

    public Mission(int patient, int vehicule, Ambulancier[] ambulanciers, Date date_depart, Date date_arrivee, int lieu_part, int lieu_arrivee) {
        this.id_patient = patient;
        this.id_vehicule = vehicule;
        this.id_lieu_part = lieu_part;
        this.id_lieu_arrivee = lieu_arrivee;
        int i=0;
        for(Ambulancier ambulancier: ambulanciers){
            this.liste_ambulanciers[i]=ambulancier;
            i++;
        }
        this.date_arrivee=date_arrivee;
        this.date_depart=date_depart;
    }
    public Mission(int id_mission,int patient, int vehicule, Ambulancier[] ambulanciers, Date date_depart, Date date_arrivee, int lieu_part, int lieu_arrivee) {
        this.id_mission = id_mission;
        this.id_patient = patient;
        this.id_vehicule = vehicule;
        this.id_lieu_part = lieu_part;
        this.id_lieu_arrivee = lieu_arrivee;
        int i=0;
        for(Ambulancier ambulancier: ambulanciers){
            this.liste_ambulanciers[i]=ambulancier;
            i++;
        }
        this.date_arrivee=date_arrivee;
        this.date_depart=date_depart;
    }

    public Mission() {

    }

    public void setId_mission(int id_mission) {
        this.id_mission = id_mission;
    }

    public void setId_patient(int id_patient) {
        this.id_patient = id_patient;
    }

    public void setId_vehicule(int id_vehicule) {
        this.id_vehicule = id_vehicule;
    }

    public void setId_lieu_part(int id_lieu_part) {
        this.id_lieu_part = id_lieu_part;
    }

    public void setId_lieu_arrivee(int id_lieu_arrivee) {
        this.id_lieu_arrivee = id_lieu_arrivee;
    }

    public void setDate_arrivee(Date date_arrivee) {
        this.date_arrivee = date_arrivee;
    }

    public void setDate_depart(Date date_depart) {
        this.date_depart = date_depart;
    }

    public void setListe_ambulanciers(Ambulancier[] liste_ambulanciers) {
        this.liste_ambulanciers = liste_ambulanciers;
    }

    public int getId_mission() {
        return id_mission;
    }

    public int getId_patient() {
        return id_patient;
    }

    public int getId_vehicule() {
        return id_vehicule;
    }

    public int getId_lieu_part() {
        return id_lieu_part;
    }

    public int getId_lieu_arrivee() {
        return id_lieu_arrivee;
    }

    public Date getDate_arrivee() {
        return date_arrivee;
    }

    public Date getDate_depart() {
        return date_depart;
    }

    public Ambulancier[] getListe_ambulanciers() {
        return liste_ambulanciers;
    }

    @Override
    public String toString() {
        return "Mission{" +
                "id_mission=" + id_mission +
                ", id_patient=" + id_patient +
                ", id_vehicule=" + id_vehicule +
                ", id_lieu_part=" + id_lieu_part +
                ", id_lieu_arrivee=" + id_lieu_arrivee +
                ", date_arrivee=" + date_arrivee +
                ", date_depart=" + date_depart +
                ", liste_ambulanciers=" + Arrays.toString(liste_ambulanciers) +
                '}';
    }
}
