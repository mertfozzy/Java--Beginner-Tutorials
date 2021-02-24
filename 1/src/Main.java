import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Sistemimize hoşgeldiniz.\n");
            System.out.println("*************************\n");
            System.out.println("Yapmak istediğiniz işlemi seçiniz\n");
            String islemler = "1. Toplama İşlemi\n"
                    + "2. Çıkarma İşlemi\n"
                    + "3. Çarpma İşlemi\n"
                    + "4. Bölme İşlemi";
            System.out.println(islemler);
            System.out.println("*************************\n");
            String islem = scanner.nextLine();
            int a;
            int b;
            switch (islem) {
                case "1":
                    System.out.println("Birinci sayı : \n");
                    a = scanner.nextInt();
                    System.out.println("İkinci sayı : \n");
                    b = scanner.nextInt();
                    System.out.println("Sonuç : \n" + (a + b));
                    break;

                case "2":
                    System.out.println("Birinci sayı : \n");
                    a = scanner.nextInt();
                    System.out.println("İkinci sayı : \n");
                    b = scanner.nextInt();
                    System.out.println("Sonuç : \n" + ((double) a - b));
                    break;

                case "3":
                    System.out.println("Birinci sayı : \n");
                    a = scanner.nextInt();
                    System.out.println("İkinci sayı : \n");
                    b = scanner.nextInt();
                    System.out.println("Sonuç : \n" + (a * b));
                    break;

                case "4":
                    System.out.println("Birinci sayı : \n");
                    a = scanner.nextInt();
                    System.out.println("İkinci sayı : \n");
                    b = scanner.nextInt();
                    System.out.println("Sonuç : \n" + ((double) a / (double) b));
                    break;

                default:
                    System.out.println("Daha islem numarası giremiyosun amk\nSie!!");
                    break;
            }

        }



}
