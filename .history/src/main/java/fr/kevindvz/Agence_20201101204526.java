package fr.kevindvz;

import java.util.ArrayList;

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
            System.out.println(
                    indice + " : " + detailStock.getClass().getSimpleName() + " " + detailStock.marque + " de couleur "
                            + detailStock.couleur + (detailStock.disponible ? ", disponible." : ", pas disponible."));
            if (detailStock.disponible == false) {
                System.out.println(detailStock.locataire.nom + " loue pour le moment ce véhicule.");
            }
            indice++;
        }

    }

    public void louerVehicule(int numeroVehicule, Client client) {
        System.out.println("");
        System.out.println("Réservation de véhicule pour " + client.nom + " en cours...");
        if ((numeroVehicule >= 0) && (numeroVehicule < this.stockActuel.length)) {

            if (this.stockActuel[numeroVehicule].disponible == true) {
                this.stockActuel[numeroVehicule].locataire = client;
                this.stockActuel[numeroVehicule].disponible = false;
                System.out.println(this.stockActuel[numeroVehicule].marque + " bien loué à "
                        + this.stockActuel[numeroVehicule].locataire.nom);
            } else {
                System.out.print(this.stockActuel[numeroVehicule].marque + " n'est pas disponible. ");
                System.out
                        .println(this.stockActuel[numeroVehicule].locataire.nom + " loue pour le moment ce véhicule.");
            }
        } else {
            System.out.println("La réservation a échoué. Il n'y a pas de véhicule à cet emplacement du stock.");
        }
    }

    public void retournerVehicule(int numeroVehicule) {
        System.out.println("Retour véhicule demandé.");
        if ((numeroVehicule >= 0) && (numeroVehicule < this.stockActuel.length)) {

            if (this.stockActuel[numeroVehicule].disponible == false) {
                this.stockActuel[numeroVehicule].disponible = true;
                ((Voiture) this.stockActuel[numeroVehicule]).niveauCarburant /= 2;
                System.out.println(this.stockActuel[numeroVehicule].marque + "a réintégré le stock de "
                        + this.adresse.ville + ".");
            } else if (this.stockActuel[numeroVehicule].disponible == true) {
                System.out.println(
                        this.stockActuel[numeroVehicule].marque + "déjà dans le stock de" + this.adresse.ville);
            } else {
                System.out.println("Emplacement du véhicule inexistant dans le stock.");
            }
            ;

        }
    }
}
