import java.util.Scanner;

public class Main {

    public static void selamlama()
    {
        System.out.println("Merhaba nasılsın...?");
        System.out.println("Selams..");
    }

    public static void faktoriyel()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı gir knk : ");
        int sayi = scanner.nextInt();

        int faktoriyel = 1;

        while (sayi>0)
        {
            faktoriyel*=sayi;
            sayi--;
        }

        System.out.println("Faktoriyel : " + faktoriyel);

    }

    public static void main(String[] args) {
        selamlama();
        faktoriyel();



    }
}
