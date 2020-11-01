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
        Voiture cityCar2 = new Voiture("Hyundai Getz", "Blanc cassé", "Essence", 5);

        // Les vélos
        Velo miniBike = new Velo("Decathlon", "bleu nuit", "Mécanique", "Mini vélo", "S");
        Velo sportBike1 = new Velo("Go sport", "noir", "Mécanique", "VTT", "M");
        Velo sportBike2 = new Velo("Sport +", "rouge pétant", "Mécanique", "VTT", "L");
        Velo electricBike = new Velo("Nakamura", "vert", "Electrique", "VTT", "S");
        Velo cityBike = new Velo("Nakamua", "rose", "Electrique", "Ville Homme", "L");

        // Les options

        Option allumeCigare = new Option("allume-cigare", (float) 140);
        Option bluetooth = new Option("bluetooth", (float) 125);
        Option degelParebrise = new Option("dégele pare-brise", (float) 400.00);
        Option purSound = new Option("pur sound system", (float) 156.78);
        Option assiseChauffante = new Option("assise chauffante", (float) 777.77);
        Option megaLumière = new Option("mega éclairage", (float) 1524.75);

        // Ajout d'option sur certains véhicules
        cityBike.ajoutOption(assiseChauffante);

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

        // Ajout de vehicules dans les stocks

        agenceBrest.ajoutVehicule(sportBike1, funCar, cityCar);
        agenceNantes.ajoutVehicule(sportCar2, bigCar);
        agenceRennes.ajoutVehicule(sportBike2, electricBike);

        // Ajout des options dans les véhicules des véhicules des stocks

        agenceBrest.stockActuel[0].ajoutOption(megaLumière, assiseChauffante);
        agenceBrest.stockActuel[1].ajoutOption(bluetooth);

        // Affichage des stocks des agences

        agenceBrest.afficherStock();
        agenceRennes.afficherStock();
        agenceNantes.afficherStock();

        // Location des véhicules
        agenceBrest.louerVehicule(2, hamza);
        agenceBrest.louerVehicule(2, gino);
        ((Voiture) agenceBrest.stockActuel[2]).controleReserveCarburant();
    }
}
