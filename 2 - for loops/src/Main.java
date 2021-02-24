import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        int i;

        for (i=0; i<=5 ; i++)
        {
            System.out.println("i = " + i);
        }

         */

        for (int i = 2; i<100 ; i*=2)
        {
            System.out.println("i = " + i);
        }

        System.out.println("********************");

        Scanner scanner = new Scanner(System.in);
        System.out.println("sayı gir : \n");
        int fakt = 1;
        int sayi = scanner.nextInt();
        for ( int b = 1; b <= sayi ; b++)
        {
            fakt *= b;
            System.out.println("Fak = " +fakt + "\nb= :"+ b);
        }

        System.out.println("Faktoriyel = " + fakt);
    }
}
