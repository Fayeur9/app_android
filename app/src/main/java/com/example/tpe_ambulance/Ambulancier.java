package com.example.tpe_ambulance;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "table_des_amublanciers")
public class Ambulancier {
    @PrimaryKey
    int id_ambulancier;
    @ColumnInfo(name = "nom")                       public String nom;
    @ColumnInfo(name = "prenom")                    public String prenom;
    @ColumnInfo(name = "is_principal_conducteur")   public boolean is_principal_conducteur;

    static int compteur_id=1;
    public Ambulancier(String nom, String prenom, boolean is_principal_conducteur) {
        this.id_ambulancier = compteur_id++;
        this.nom = nom;
        this.prenom = prenom;
        this.is_principal_conducteur = is_principal_conducteur;
    }

    @Override
    public String toString() {
        return "Ambulancier{" +
                "id_ambulancier=" + id_ambulancier +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", is_principal_conducteur=" + is_principal_conducteur +
                '}';
    }

    public int getId_ambulancier() {
        return id_ambulancier;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public boolean isIs_principal_conducteur() {
        return is_principal_conducteur;
    }

    public static int getCompteur_id() {
        return compteur_id;
    }
}
