package video1;

public class Array {
    public static void main(String[] args) {
        // Skapa ett program som innehåller en array med fem namn
        //Skriv ut det första och sista namnet

        String[] name = {"Isa", "Erik", "Nina", "Bo", "Maya"};
        System.out.println(name[0] + " " + name[4]);

        // Lägga till data efteråt:

        String[] names = new String[5];
        names[0] = "Isa";
        names[1] = "Erik";
        names[2] = "Nina";
        names[3] = "Bo";
        names[4] = "Maya";
        System.out.println(names[0] + " " + names[4]);

        // String split är en metod i Java som delar upp en sträng
        // i flera delar och returnerar en array av strängar.

        String mySplit = "Hej på dig";
        String[] stringArray = mySplit.split(" "); // <-- Delar vid mellanslag
        System.out.println(stringArray[0]);

        // Skriva ut alla array med for-loop
        for (int i = 0; i < 3; i++) {
            System.out.println(stringArray[i]);
        }

        System.out.println(stringArray.length);

    }
}
