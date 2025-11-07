package ovning5;

import java.util.Scanner;

public class Uppgift14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 14. Skapa ett program som läser in siffrorna i ett bråk till
        // en array med två platser. Det är inte vanligt att man låter
        // nämnaren vara negativ. Om så är fallet ska bråket ändras så
        // att nämnaren blir positiv.

        int[] brak = new int[2];

        System.out.println("Skriv ut täljaren: ");
        int taljare = scanner.nextInt();
        System.out.println("Skriv ut nämnaren: ");
        int namnare = scanner.nextInt();

        if (namnare < 0)
            namnare = namnare * -1;

        // Sätta nämnaren och täljare.
        brak[0] = taljare;
        brak[1] = namnare;
        System.out.println("Täljare:  " + brak[0]);
        System.out.println("Nämnare:  " + brak[1]);
        System.out.println("Bråktalet: " + brak[0] / brak[1]);
        System.out.println();

    }
}
