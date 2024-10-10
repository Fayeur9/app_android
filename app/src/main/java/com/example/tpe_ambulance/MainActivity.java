package com.example.tpe_ambulance;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.util.Log;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "bdd_ambulance_chateauneuf").allowMainThreadQueries().build();
        Missions_DAO missionDAO = db.missionDAO();
        Ambulancier_DAO Ambulancier_DAO = db.Ambulancier_DAO();
        Vehicule_DAO Vehicule_DAO = db.Vehicule_DAO();
        Patient_DAO Patient_DAO = db.Patient_DAO();
        Lieux_DAO Lieux_DAO = db.Lieux_DAO();

        Lieux lieu_depart = new Lieux("girac", "la couronne", "france", true);
        Lieux lieu_arrivee = new Lieux("maison", "barbezieux", "france", false);


       // if(Lieux_DAO.getByID(lieu_depart.getId_lieu())==null){Lieux_DAO.insertAll(lieu_depart);}
        //if(Lieux_DAO.getByID(lieu_arrivee.getId_lieu())==null){Lieux_DAO.insertAll(lieu_arrivee);}

        Ambulancier ambulancier_1 = new Ambulancier("baptiste", "freminet", false);
        Ambulancier ambulancier_2 = new Ambulancier("mael", "badet", true);

        Log.i("bapt",(Ambulancier_DAO.getByID(ambulancier_1.getId_ambulancier()))+"");
        Log.i("bapt",(Ambulancier_DAO.getByID(ambulancier_1.getId_ambulancier())==[]));
        if(Ambulancier_DAO.getByID(ambulancier_1.getId_ambulancier())==null){Ambulancier_DAO.insertAll(ambulancier_1);}
        if(Ambulancier_DAO.getByID(ambulancier_2.getId_ambulancier())==null){Ambulancier_DAO.insertAll(ambulancier_2);}

        Vehicule vehicule_1 = new Vehicule("ambulance", "renaud", "ab-123-cd");
        Vehicule vehicule_2 = new Vehicule("taxi", "renaud", "ef-456-gh");

        if(Vehicule_DAO.getByID(vehicule_1.getId_vehicule())==null){Vehicule_DAO.insertAll(vehicule_1);}
        if(Vehicule_DAO.getByID(vehicule_2.getId_vehicule())==null){Vehicule_DAO.insertAll(vehicule_2);}

        LocalDateTime date_naissance= null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            date_naissance = LocalDateTime.of(2022, 11, 26, 0, 0);
        }
        Patient patient = new Patient("patient",
                "test",
                "homme",
                "123456789",
                "0123456789",
                "test@test",
                "qisdjhfqhsgfljhqsdgfpuqhg",
                new Date(0)
        );
        if(Patient_DAO.getByID(patient.getId_patient())==null){Patient_DAO.insertAll(patient);}

        Ambulancier[] ambulanciers = new Ambulancier[2];
        ambulanciers[0]=ambulancier_1;
        ambulanciers[1]=ambulancier_2;
        Mission mission_test=new Mission(1,patient.getId_patient(), vehicule_1.getId_vehicule(), ambulanciers, new Date(), new Date(), lieu_depart.getId_lieu(), lieu_arrivee.getId_lieu());
        missionDAO.deleteAll();
        if(missionDAO.getByID(mission_test.getId_mission())==null){missionDAO.insertAll(mission_test);}
    }
}