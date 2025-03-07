public class Main {
    public static void main(String[] args) {

//        Maak een scanner om input te vragen
//        Maak een arraylist waar we alle todos in op gaan slaan

        while(true) {
            System.out.println("Wil je nog een todo toevoegen?");
            System.out.println("Kies 1 voor nee, kies iets anders voor ja");
            int startKeuze = scanner.nextInt();
            scanner.nextLine();
            if(startKeuze == 1){
                scanner.close();
                return;
            }

//            Schrijf hier je code....

            // Voeg een TODO toe
            System.out.println("Voeg een TODO toe");
            System.out.print("Geef de datum: ");
//          code hier ...

            System.out.println("Geef de inhoud: ");
//            code hier...

//            Maak een Array [datum, inhoud] en voeg dat toe aan de Arraylist
//            code hier...


            // Vraag welke TODO de gebruiker wil zien
            System.out.println("Welke TODO wil je zien?");
            System.out.print("Kies een nummer: ");
//            code hier...

            // Print de gekozen TODO in de vorm:
//            "TODO keuze ..."
//            "Datum ...."
//            "Inhoud ..."

//            code hier...
        }

    }
}