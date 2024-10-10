package com.example.tpe_ambulance;

import java.util.Date;
import java.time.LocalDateTime;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

@Entity(tableName = "table_des_patients")
public class Patient {
    @PrimaryKey
    public int id_patient;

    @ColumnInfo(name = "nom")               public String nom;
    @ColumnInfo(name = "prenom")            public String prenom;
    @ColumnInfo(name = "sexe")              public String sexe;
    @ColumnInfo(name = "num_secu")          public String num_secu;
    @ColumnInfo(name = "num_telephone")     public String num_telephone;
    @ColumnInfo(name = "mail")              public String mail;
    @ColumnInfo(name = "lien_image_profil") public String lien_image_profil;
    @TypeConverters({TimestampConverter.class}) public Date naissance;
    static int compteur_id=1;

    public Patient( String nom, String prenom, String sexe, String num_secu, String num_telephone, String mail, String lien_image_profil, Date naissance) {
        id_patient = compteur_id++;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.num_secu = num_secu;
        this.num_telephone = num_telephone;
        this.mail = mail;
        this.lien_image_profil = lien_image_profil;
        this.naissance = naissance;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id_patient=" + id_patient +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", sexe='" + sexe + '\'' +
                ", num_secu='" + num_secu + '\'' +
                ", num_telephone='" + num_telephone + '\'' +
                ", mail='" + mail + '\'' +
                ", lien_image_profil='" + lien_image_profil + '\'' +
                ", naissance=" + naissance +
                '}';
    }

    public int getId_patient() {
        return id_patient;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getSexe() {
        return sexe;
    }

    public String getNum_secu() {
        return num_secu;
    }

    public String getNum_telephone() {
        return num_telephone;
    }

    public String getMail() {
        return mail;
    }

    public String getLien_image_profil() {
        return lien_image_profil;
    }

    public Date getNaissance() {
        return naissance;
    }

    public static int getCompteur_id() {
        return compteur_id;
    }
}
