package ovning5;

public class FemtioTal {
    public static void main(String[] args) {
        long[] tal = new long[50];

        // 3. En array med 50 inlästa tal finns. Fördubbla värdet på talen på varje plats i arrayn.
        tal[0] = 1;
        for (int i = 0; i < tal.length - 1; i++) {
            System.out.print(tal[i] + " ");
            tal[i + 1] = tal[i] * 2;
        }
        System.out.println();
        for (int i = 1; i < tal.length; i++) {
            System.out.print(tal[i - 1] + " ");
            tal[i] = tal[i - 1] * 2;
        }

        // 4.En array med 50 inlästa tal finns.
        // Addera talet 2 till talen på indexplats 0, 2, 4,… i arrayn.

        System.out.println();
        int[] tal2 = new int[50];
        tal2[0] = 5;
        for (int i = 1; i < tal2.length; i++) {
            System.out.print(tal2[i - 1]);
            tal2[i] = tal2[i - 1];
        }
        for (int i = 0; i < tal2.length; i += 2) {
            tal2[i] += 2;
        }
        System.out.println();
        for (int i = 0; i < tal2.length; i++) {
            System.out.print(tal2[i]);
        }
        System.out.println();

        // Skapar en talföljd med uppräkning [1,2,3,4,5.....49,50}
        int[] numbers = new int[50];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        for(int number: numbers){       // Ett enklare sätt att göra for "alla" talen i en array
            System.out.print(number + " ");
        }

        // 5.En array med 50 inlästa tal finns.
        // Ta reda på och skriv ut hur många tal som är positiva.
        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0)
                System.out.print(numbers[i] + " ");
        }

        // 6.En array med 50 inlästa tal finns. Ta reda på och skriv ut hur
        // många tal som är större är det första talet.
        System.out.println();

        int count = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[0] < numbers[i])
                count++;
        }
        System.out.println(count);

        // 7.En array med 50 inlästa tal finns. Bestäm och skriv ut index för det
        // sista negativa talet i arrayn. (Tips: Börja bakifrån i arrayn).
        System.out.println();


        // 11.En array med 10 inlästa tal finns.
        // Lägg över dessa tal i en annan array så att talen kommer i omvänd ordning.
        System.out.println();

        int[] tioTal = new int[10];
        for (int i = 0; i < tioTal.length; i++) {
            tioTal[i] = i + 1;
        }
        for(int number: tioTal){
            System.out.print(number + " ");
        }
        int[] tioTalBak = new int[10];
        int indexBak = 9;
        for (int i = 0; i < tioTal.length; i++) {
            tioTalBak[indexBak] = tioTal[i];
            indexBak--;
        }
        for(int number: tioTalBak){
            System.out.print(number + " ");
        }

    }
}
