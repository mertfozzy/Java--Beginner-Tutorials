import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bnakaya hoşgeldin. Faiz oranı %6");

        int vade, anapara;
        System.out.println("Yatırmak istediğiniz tutar : ");
        anapara = scanner.nextInt();
        System.out.println("Paranızı kaç yıl vadeli yatırmak istiyorsunuz : ");
        vade = scanner.nextInt();

        double toplampara = anapara;

        double faizorani = 0.06;

        for (int i = 1 ; i<= vade ; i++)
        {
            toplampara = (toplampara * faizorani) + toplampara;
            System.out.println( i + ".yılın sonunda yeni bakiye : " + (float)toplampara);
        }


    }
}
