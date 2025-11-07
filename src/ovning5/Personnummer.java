package ovning5;

public class Personnummer {
    public static void main(String[] args) {
        // 19900101-1234
        char[] personnr = {'1', '9', '9', '0', '0', '1', '0', '1', '-', '1', '2', '2', '4' };
        System.out.println(personnr.length);
        if (personnr[8] != '-') System.out.println("Bindestreck saknas");
        if (personnr[personnr.length - 2] % 2 == 0)
            System.out.println("Kvinna");
        else System.out.println("Man");

    }
}