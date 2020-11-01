package fr.kevindvz;

import java.util.ArrayList;

public class Agence {
    String nom;
    Adresse adresse;
    ArrayList<Vehicule> stock;

    public Agence(String nom, Adresse adresse) {
        this.nom = nom;
        this.adresse = adresse;
    }

}
