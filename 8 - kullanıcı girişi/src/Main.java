import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int giris_hakki = 3;

        String sys_kullanici_adi = "Mert";
        String sys_parola = "12345";
        System.out.println("---------------------------------");
        System.out.println("Kullanıcı girişine hoşgeldiniz..");
        System.out.println("---------------------------------");

        while (true)
        {
            System.out.println("Kullanıcı Adı : ");
            String kullanici = scanner.nextLine();
            System.out.println("Parolanız : ");
            String parola = scanner.nextLine();

            if (kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola))
            {
                System.out.println("Hoşgeldiniz, " + kullanici);
                break;
            }

            else if (kullanici.equals(sys_kullanici_adi) && !parola.equals(sys_parola))
            {
                System.out.println("Parolanız yanlış..");
                giris_hakki = giris_hakki - 1;

            }
            else if (!kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola))
            {
                System.out.println("Kullanıcı adınız yanlış..");
                giris_hakki = giris_hakki - 1;

            }
            else
            {
                System.out.println("Kullanıcı adınız ve parolanız yanlış..");
                giris_hakki = giris_hakki - 1;
            }

            if (giris_hakki == 0)
            {
                System.out.println("Giriş hakkınız tükenmiştir.");
                break;
            }


        }

    }

}
