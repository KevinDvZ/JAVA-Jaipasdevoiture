package fr.kevindvz;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Bienvenue dans le systeme de gestion de JAIPASDEVOITURE");
        // Création DES VEHICULES
        // Les voitures
        Voiture funCar  = new Voiture("BMW", "grise", "Essence", 5);
        Voiture bigCar = new Voiture("Renault Espace", "blanche", "Essence", 8);
        Voiture sportCar = new Voiture("Ferrari", "noir","Essence",4);
        Voiture cityCar = new Voiture("Toyota", "Gris metallisé", "Hybrid", 5)
        

        // Les vélos
        Velo miniBike = new Velo("Decathlon", "bleu nuit", "Mécanique", "Mini vélo", "S");
        Velo sportBike1= new Velo("Go sport","noir", "Mécanique", "VTT", "M");
        Velo sport2Nike2 = new Velo("Sport +", "rouge pétant", "Mécanique","VTT","L");

        // Création des clients

        Client hamza = new Client("Hamza");
        Client franck = new Client("Franck")
        
        //Création des adresses

        Adresse emplacementRennes =  new Adresse("4 rue des Lilas","Rennes",35200);
        Adresse emplacementNantes = new Adresse("3 rue des Elephants", "Nantes", 44400);
        Adresse emplacementBrest = new Adresse("450 rue des Bateaux", "Brest", 29200);

        //Création des agences

        Agence agenceRennes = new Agence(emplacementRennes);
        Agence agenceNantes = new Agence(emplacementRennes);
        Agence agenceBrest = new Agence(emplacementBrest);


    }
}
