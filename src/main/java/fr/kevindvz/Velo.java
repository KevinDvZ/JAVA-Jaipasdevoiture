package fr.kevindvz;

public class Velo extends Vehicule {
    String typedeVelo;
    String taille;

    public Velo(String marque, String couleur, String typeEnergie, String typedeVelo, String taille) {
        super(marque, couleur, typeEnergie);
        this.typedeVelo = typedeVelo;
        this.taille = taille;
    }
}
