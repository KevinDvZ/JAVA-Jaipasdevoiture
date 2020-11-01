package fr.kevindvz;

public class Voiture extends Vehicule {

    int nombredePlace;
    int niveauCarburant;

    public Voiture(String marque, String couleur, String typeEnergie, int nombredePlace) {
        super(marque, couleur, typeEnergie);
        this.nombredePlace = nombredePlace;
        this.niveauCarburant = 50;
    }

    public void controleReserveCarburant(){
        if (this.niveauCarburant == 0){
            System.out.println("Carburant épuisé pour" +this.marque +" de l'agence"+ this.);
            this.fairePlein();
            System.out.println("Plein effectué pour le véhicule" +this.marque);
        } else if(this.niveauCarburant>0 && this.niveauCarburant<50){
            System.out.println("Niveau de carburant en dessous de la moitié.");
        } else if(this.niveauCarburant>50){System.out.println("Niveau de carburant au dessus de la moitié");}
        else (this.niveauCarburant == 100){System.out.println(this.marque +" a le réservoir plein.");}
    }

    public void fairePlein() {
        if (this.niveauCarburant <= 100) {
            this.niveauCarburant = 100;
            System.out.println("Le véhicule " + this.marque + " de type " + this.typeEnergie
                    + " a bénéficié d'un plein de carburant.");
        } else {
            System.out.println("Le niveau de carburant de" + this.marque + " est déjà maximum.");
        }
    }

}
