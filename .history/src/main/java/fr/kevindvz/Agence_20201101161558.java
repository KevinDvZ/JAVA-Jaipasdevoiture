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

        if (stockActuel == null) {
            Vehicule[] stockActuel = new Vehicule[this.stock.size()];
        }
        this.stockActuel = this.stock.toArray(stockActuel);

    }

    public void afficherStock() {
        int indice = 0;
        System.out.println("Détail du stock de l'agence " + this.nom + " de " + this.adresse.ville + " possédant "
                + this.stockActuel.length + " véhicules :");
        for (Vehicule detailStock : stockActuel) {
            System.out.print(indice + " : " + detailStock.marque + " de couleur " + detailStock.couleur
                    + (detailStock.disponible ? "oui" : "non"));
        }

    }

}
