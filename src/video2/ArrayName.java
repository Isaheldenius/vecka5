package video2;

import java.util.Scanner;

public class ArrayName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Skapa ett program som läser in fem namn ifrån terminalen och sparar dem i en array
        //Skriv ut det första och sista namnet

        System.out.println("Skriv fem namn:");

        String[] names = new String[5];
        for (int i = 0; i < names.length; i++) {
            names[i] = scanner.nextLine();
        }
        System.out.println("Det första namnet du skrev är " + names[0] + " och det sista är " + names[4]);

    }
}
