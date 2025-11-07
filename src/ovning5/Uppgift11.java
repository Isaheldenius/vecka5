package ovning5;

public class Uppgift11 {
    public static void main(String[] args) {

        // Skapar en array med 10 tal
        int[] tioTal = new int[10];

        // Sätter talen från 1-10
        for (int i = 0; i < tioTal.length; i++)
            tioTal[i] = i + 1;

        // Skriver ut alla tal
        for (int number : tioTal)
            System.out.print(number + " ");

        System.out.println();

        // Skapar en till array med 10 tal
        int[] tioTalBak = new int[10];

        // Sätter talen 1-10 baklänges från första array
        for (int i = 0; i < tioTal.length; i++) {
            tioTalBak[tioTal.length - 1 - i] = tioTal[i];
        }

        /*
        int indexBak = 9;
        for (int i = 0; i < tioTal.length; i++) {
            tioTalBak[indexBak] = tioTal[i];
            indexBak--;
        }
         */

        // Skriver ut alla tal från andra array
        for (int number : tioTalBak)
            System.out.print(number + " ");
    }
}
