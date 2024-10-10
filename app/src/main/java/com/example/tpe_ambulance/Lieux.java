package com.example.tpe_ambulance;
import androidx.room.ColumnInfo;
        import androidx.room.Entity;
        import androidx.room.PrimaryKey;

@Entity(tableName = "table_des_lieux")
public class Lieux {
    @PrimaryKey
    int id_lieu;
    @ColumnInfo(name = "adresse")           public String adresse;
    @ColumnInfo(name = "ville")             public String ville;
    @ColumnInfo(name = "pays")              public String pays;
    @ColumnInfo(name = "is_lieu_depart")    public boolean is_lieu_depart;

    static int compteur_id=1;

    public Lieux( String adresse, String ville, String pays, boolean is_lieu_depart) {
        id_lieu = compteur_id++;
        this.adresse = adresse;
        this.ville = ville;
        this.pays = pays;
        this.is_lieu_depart = is_lieu_depart;
    }

    @Override
    public String toString() {
        return "Lieux{" +
                "id_lieu=" + id_lieu +
                ", adresse='" + adresse + '\'' +
                ", ville='" + ville + '\'' +
                ", pays='" + pays + '\'' +
                ", is_lieu_depart=" + is_lieu_depart +
                '}';
    }

    public int getId_lieu() {
        return id_lieu;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getVille() {
        return ville;
    }

    public String getPays() {
        return pays;
    }

    public boolean isIs_lieu_depart() {
        return is_lieu_depart;
    }

    public static int getCompteur_id() {
        return compteur_id;
    }
}
