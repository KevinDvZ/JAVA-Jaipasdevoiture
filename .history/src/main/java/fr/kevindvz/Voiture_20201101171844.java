package fr.kevindvz;

public class Voiture extends Vehicule {

    int nombredePlace;
    int niveauCarburant;

    public Voiture(String marque, String couleur, String typeEnergie, int nombredePlace) {
        super(marque, couleur, typeEnergie);
        this.nombredePlace = nombredePlace;
        this.niveauCarburant = 50;
    }

    public void fairePlein(){
        if (this.niveauCarburant <= 100){
                    this.niveauCarburant = 100;
        System.out.println("Le véhicule " + this.marque + " de type " + this.typeEnergie + " a bénéficié d'un plein de carburant.");
        } else { System.out.println("Le niveau de carburant de" + this.marque + " est déjà");}
    }

    

}
