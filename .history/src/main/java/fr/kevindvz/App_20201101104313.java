package fr.kevindvz;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Bienvenue dans le systeme de gestion de JAIPASDEVOITURE");
        // Création DES VEHICULES
        // Les voitures
        Voiture funCar = new Voiture("BMW", "grise", "Essence", 5);
        Voiture bigCar = new Voiture("Renault Espace", "blanche", "Essence", 8);
        Voiture sportCar = new Voiture("Ferrari", "noir", "Essence", 4);
        Voiture cityCar = new Voiture("Toyota Yaris", "Gris metallisé", "Hybrid", 5);
        Voiture sportCar2 = new Voiture("Renault R21", "Vert pomme", "Diesel", 4);

        // Les vélos
        Velo miniBike = new Velo("Decathlon", "bleu nuit", "Mécanique", "Mini vélo", "S");
        Velo sportBike1 = new Velo("Go sport", "noir", "Mécanique", "VTT", "M");
        Velo sportBike2 = new Velo("Sport +", "rouge pétant", "Mécanique", "VTT", "L");
        Velo electricBike = new Velo("Nakamura", "vert", "Electrique", "VTT", "S");

        // Création des clients

        Client hamza = new Client("Hamza");
        Client franck = new Client("Franck");
        Client gino = new Client("Gino");
        Client elodie = new Client("Elodie");
        Client marianna = new Client("Marianna");
        Client joseph = new Client("Joseph");
        Client manu = new Client("Manu");

        // Création des adresses

        Adresse emplacementRennes = new Adresse("4 rue des Lilas", "Rennes", 35200);
        Adresse emplacementNantes = new Adresse("3 rue des Elephants", "Nantes", 44400);
        Adresse emplacementBrest = new Adresse("450 rue des Bateaux", "Brest", 29200);

        // Création des agences

        Agence agenceRennes = new Agence(emplacementRennes);
        Agence agenceNantes = new Agence(emplacementRennes);
        Agence agenceBrest = new Agence(emplacementBrest);

        // Ajout de vehicules dans le sstock

        agenceBrest.ajoutVehicule(sportBike1, funCar, cityCar);
        agenceNantes.ajoutVehicule(sport);

    }
}
