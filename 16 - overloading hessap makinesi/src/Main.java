import java.util.Scanner;

public class Main {


    public static float cikarma (int a, int b)
    {
        return ((float)a-b);
    }

    public static double bolme (int a, int b)
    {
        return ((double) a/ b);
    }

    public static int toplama (int a, int b)
    {
        return (a+b);
    }

    public static int toplama (int a, int b, int c)
    {
        return (a+b+c);
    }

    public static int carpma (int a, int b)
    {
        return (a*b);
    }

    public static int carpma (int a, int b, int c)
    {
        return (a*b*c);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String islemler = "1.Toplama işlemi\n"+
                "2.Çıkarma işlemi\n"+
                "3. Çarpma işlemi\n"+
                "4. Bölme işlemi\n"+
                "Çıkmak için q'ya basınız";
        System.out.println("====================================");
        System.out.println(islemler);
        System.out.println("====================================");


        while (true)
        {
            System.out.println("Yapmak istediğiniz işlemi seçiniz : ");
            String secim = scanner.nextLine();

            if (secim.equals("q"))
            {
                System.out.println("Program sonlandı..");
                break;
            }

            else if (secim.equals("1"))
            {
                System.out.println("Kaç sayı toplamak istersiniz ? (2 veya 3) : ");
                int kacsayi = scanner.nextInt();
                if (kacsayi==2)
                {
                    System.out.println("Birinci sayı : ");
                    int a = scanner.nextInt();
                    System.out.println("İkinci sayı : ");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girilen sayıların toplamı : " + toplama(a,b));

                }
                else if (kacsayi==3)
                {
                    System.out.println("Birinci sayı : ");
                    int a = scanner.nextInt();
                    System.out.println("İkinci sayı : ");
                    int b = scanner.nextInt();
                    System.out.println("Üçüncü sayı : ");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girilen sayıların toplamı : " + toplama(a,b,c));
                }
                else
                {
                    System.out.println("Böyle bir parametre bulunmuyor...");

                }
            }

            else if (secim.equals("2"))
            {
                System.out.println("Birinci sayıyı giriniz : ");
                int a = scanner.nextInt();
                System.out.println("İkinci sayıyı giriniz : ");
                int b = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Girilen sayıların farkı : " + cikarma(a,b));
            }

            else if (secim.equals("3"))
            {
                System.out.println("Kaç sayı çarpmak istersiniz ? (2 veya 3) : ");
                int kacsayi = scanner.nextInt();

                if (kacsayi==2)
                {
                    System.out.println("Birinci sayı : ");
                    int a = scanner.nextInt();
                    System.out.println("İkinci sayı : ");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girilen sayıların çarpımı : " + carpma(a,b));

                }
                else if (kacsayi==3)
                {
                    System.out.println("Birinci sayı : ");
                    int a = scanner.nextInt();
                    System.out.println("İkinci sayı : ");
                    int b = scanner.nextInt();
                    System.out.println("Üçüncü sayı : ");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girilen sayıların çarpımı : " + carpma(a,b,c));
                }
                else
                {
                    System.out.println("Böyle bir parametre bulunmuyor...");

                }
            }
            else if (secim.equals("4"))
            {
                System.out.println("Birinci sayıyı giriniz : ");
                int a = scanner.nextInt();
                System.out.println("İkinci sayıyı giriniz : ");
                int b = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Girilen sayıların bölümü : " + bolme(a,b));
            }
            else
            {
                System.out.println("Geçersiz işlem..");
            }
        }

    }

}
