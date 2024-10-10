package com.example.tpe_ambulance;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "table_des_vehicules")
public class Vehicule {
    @PrimaryKey
    public int id_vehicule;

    public String type;
    public String marque;
    public String plaque;

    static int compteur_id=1;
    public Vehicule( String type, String marque, String plaque) {
        id_vehicule = compteur_id++;
        this.type = type;
        this.marque = marque;
        this.plaque = plaque;
    }

    public int getId_vehicule() {
        return id_vehicule;
    }

    public String getType() {
        return type;
    }

    public String getMarque() {
        return marque;
    }

    public String getPlaque() {
        return plaque;
    }

    public static int getCompteur_id() {
        return compteur_id;
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "id_vehicule=" + id_vehicule +
                ", type='" + type + '\'' +
                ", marque='" + marque + '\'' +
                ", plaque='" + plaque + '\'' +
                '}';
    }
}
