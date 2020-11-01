
package fr.kevindvz;

import java.util.ArrayList;

class Vehicule {

    String marque;
    String couleur;
    String typeEnergie;
    boolean disponible;
    ArrayList<Option> options;
    Client locataire;

    public Vehicule(String marque, String couleur, String typeEnergie) {
        this.marque = marque;
        this.couleur = couleur;
        this.typeEnergie = typeEnergie;
        this.disponible = true;
        this.options = new ArrayList<Option>();
        this.locataire = null;
    }

    public void ajoutOption(Option... optionsAjoutees) {
        for (Option ajout : optionsAjoutees) {
            this.options.add(ajout);
        }
    }

}
