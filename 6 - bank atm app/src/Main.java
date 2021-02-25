import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bakiye = 1000;

        System.out.println("***************************");
        String islemler = "1. Bakiye Görüntüle\n" +
                "2. Para Çek\n" +
                "3. Para Yatır\n"+
                "ATM'den çıkmak için x tuşuna basabilirsiniz..\n";
        System.out.println(islemler);
        System.out.println("***************************\n");

        while (true) //sonsuz döngü
        {
            System.out.println("\nYapmak istediğiniz işlemi seçiniz : ");
            String islem = scanner.nextLine();
            if (islem.equals("q"))
            {
                System.out.println("Oturum sonlanmıştır. İyi günler.. \n");
                break;
            }

            else if (islem.equals("1"))
            {
                System.out.println("Bakiyeniz : " + bakiye);

            }
            else if (islem.equals("2"))
            {
                System.out.println("Çekmek istediğiniz tutarı giriniz : \t");
                int tutar = scanner.nextInt();
                scanner.nextLine();

                    if (tutar > bakiye)
                    {
                        System.out.println("Bakiyeniz yetersiz. Bakiyeniz : " + bakiye);
                    }
                    else
                    {
                        bakiye = bakiye - tutar;
                        System.out.println(" TL çektiniz." + tutar + "\nYeni bakiyeniz : " + bakiye);
                    }
            }
            else if (islem.equals("3"))
            {
                System.out.println("Yatırmak istediğiniz tutarı giriniz : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                bakiye = bakiye + tutar;
                System.out.println("Yeni bakiyeniz : " + bakiye);

            }
            else
            {
                System.out.println("Geçersiz işlem.");
            }


        }

    }

}
