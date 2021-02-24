import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        int i = 0;

        do {
            System.out.println("i : " + i);
            i++;
        }
        while (i < 5);
*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı gir kurba eyvallah : ");
        int sayi = scanner.nextInt();
        int toplam = 0;
        do {
            toplam += sayi % 10;
            sayi = sayi / 10;
            System.out.println("sayi : " + sayi);
        }while (sayi > 0);

        System.out.println("Rakam toplamı : " + toplam);
    }

}
