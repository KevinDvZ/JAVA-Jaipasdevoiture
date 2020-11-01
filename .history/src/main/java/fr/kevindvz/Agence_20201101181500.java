package fr.kevindvz;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.IdentityHashMap;

public class Agence {
    String nom;
    Adresse adresse;
    ArrayList<Vehicule> stock;
    Vehicule[] stockActuel;

    public Agence(Adresse adresse) {
        this.nom = "Jaipasdevoiture";
        this.adresse = adresse;
        this.stock = new ArrayList<Vehicule>(); // a verifier si necessaire
    }

    public void ajoutVehicule(Vehicule... vehiculeAjoute) {
        for (Vehicule vehicule : vehiculeAjoute) {
            this.stock.add(vehicule);
        }

        stockActuel = stock.toArray(new Vehicule[0]);

    }

    public void afficherStock() {
        int indice = 1;
        System.out.println("Détail du stock de l'agence " + this.nom + " de " + this.adresse.ville + " possédant "
                + this.stockActuel.length + " véhicules :");
        for (Vehicule detailStock : stockActuel) {
            System.out.println(indice + " : " + detailStock.marque + " de couleur " + detailStock.couleur
                    + (detailStock.disponible ? "qui est disponible" : "qui n'est pas disponible."));
            if (detailStock.disponible == false) {
                System.out.println(detailStock.locataire.nom + " loue pour le moment ce véhicule.");
            }
            indice++;
        }

    }

    public void louerVehicule(int numeroVehicule, Client client){
        if((numeroVehicule >= 0) && (numeroVehicule< this.stockActuel.length){
            if(this.stockActuel[numeroVehicule].disponible == true){
            this.stockActuel[numeroVehicule].locataire = client;
            this.stockActuel[numeroVehicule].disponible = false;
            System.out.println(this.stockActuel[numeroVehicule].marque+" loué à "+ this.stockActuel[numeroVehicule].locataire.nom);}
            else{System.out.println(this.stockActuel[numeroVehicule].marque + "n'est pas disponible");}
        } else {System.out.println("Il n'y a pas de véhicule à cet emplacement");}
    }

}
