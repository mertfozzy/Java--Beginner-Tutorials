import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayı gir knk:");
        int sayi = scanner.nextInt();
        int faktoriyel = 1;

        while(sayi > 0)
        {
            faktoriyel *= sayi;
            sayi--;
        }
        System.out.println("Faktoriyel : " + faktoriyel);



    }

}
