package ovning5;

import java.util.Scanner;

public class Uppgift13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 13. Skapa ett program som läser in siffrorna i ett bråk
        // (täljare och nämnare) till en array med två platser.
        // Eftersom det är otillåtet att ha 0 i nämnaren ska ett
        // felmeddelande skrivas ut om så är fallet.

        int[] brak = new int[2];

        System.out.println("Skriv ut täljaren: ");
        int taljare = scanner.nextInt();
        System.out.println("Skriv ut nämaren: ");
        int namnare = scanner.nextInt();

        // Sätta nämnaren och täljare om nämnaren inte är 0
        if (namnare == 0)
            System.out.println("Otillåtet att ha 0 i nämnaren");
        else {
            brak[0] = taljare;
            brak[1] = namnare;
            System.out.println("Täljare:  " + brak[0]);
            System.out.println("Nämnare:  " + brak[1]);
            System.out.println("Bråktalet: " + brak[0]/brak[1]);
        }
    }
}
