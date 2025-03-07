import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        MAak een scanner en een arraylist
        Scanner scanner = new Scanner(System.in);

        ArrayList<String[]> todos = new ArrayList<>();

        while(true) {
            System.out.println("Wil je nog een todo toevoegen?");
            System.out.println("Kies 1 voor ja, kies 2 voor nee:");
            int startKeuze = scanner.nextInt();
            scanner.nextLine();
            if(startKeuze == 2){
                scanner.close();
                return;
            }

//            Schrijf hier je code....

            // Voeg een TODO toe
            System.out.println("Voeg een TODO toe");
            System.out.print("Invoer voor de datum: ");
            String datum = scanner.nextLine();

            System.out.println("Invoer voor de inhoud: ");
            String inhoud = scanner.nextLine();

            String[] newTodo = {datum, inhoud};
            todos.add(newTodo);

            // Vraag welke TODO de gebruiker wil zien
            System.out.println("Welke TODO wil je zien?");
            System.out.print("Kies een nummer: ");
            int keuze = scanner.nextInt();

            // Print de gekozen TODO
            String[] gekozenTodo = todos.get(keuze - 1);
            System.out.println("\nTODO " + keuze + ":");
            System.out.println("Datum: " + gekozenTodo[0]);
            System.out.println("Inhoud: " + gekozenTodo[1]);
        }

    }
}