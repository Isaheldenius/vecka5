package ovning5;

import java.util.Arrays;

public class Uppgift12 {
    public static void main(String[] args) {

        // 12. Skapa ett program som läser in 10 heltal till en array
        // och sedan skriver ut talen baklänges. Endast en array ska användas.

        // Array med 10 tal
        int[] tal = new int[10];

        // Sätter talen 1-10
        for (int i = 0; i < tal.length; i++)
            tal[i] = 1 + i;

        // Skriver ut talen baklänges
        for (int i = tal.length - 1; i >= 0; i--) {
            System.out.print(tal[i] + " ");
        }


        // Tomas lösning:
        for (int i = 0; i < tal.length/2; i++) {
            int temp = tal[i];
            tal[i] = tal[tal.length - 1 - i];
            tal[tal.length-1-i] = temp;
        }

        System.out.println(Arrays.toString(tal));
    }
}
