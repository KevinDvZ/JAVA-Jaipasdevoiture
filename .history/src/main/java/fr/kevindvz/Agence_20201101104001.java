package fr.kevindvz;

import java.util.ArrayList;

public class Agence {
    String nom;
    Adresse adresse;
    ArrayList<Vehicule> stock;

    public Agence(Adresse adresse) {
        this.nom = "Jaipasdevoiture";
        this.adresse = adresse;
        this.stock = new ArrayList<Vehicule>(); // a verifier si necessaire
    }

    public void ajoutVehicule(Vehicule... vehiculeAjoute) {
        for (Vehicule vehicule : vehiculeAjoute) {
            this.stock.add(vehicule);
        }
    }

}
