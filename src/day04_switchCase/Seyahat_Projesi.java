package day04_switchCase;

import java.util.Locale;
import java.util.Scanner;

public class Seyahat_Projesi {
    public static void main(String[] args) {
         /*

       2.  Sistem bize "Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):   "   sorusunu sorsun.

       case:1  ise
        " 1 kişilik " yazdırın. (1 kişilik seçerseniz bir işlem yapmanıza gerek kalmaz,
        bilet ücreti yukarıda çoktan belirlenmiş olur.)

        case:2 ise

        "2 kişilik " yazdırın
        2 kişi için bilet fiyatını hesaplayın.


        todo  Son olarak yolculugunuzu check edin;

        konsolda örn:   Frankfurt  - 2 Kişilik    yazsın.

        1.Bakiyemi belirtin.
        2.Toplam Tutarı belirtin.
        3.double paraUstu oluşturun ve hesaplayın.
        4.Double para üstünü yazdırın
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nereye gitmek istiyorsunuz:\nFrankfurt : 60 KM\nKoln : 80 KM \n---(20 KM basina 5 euro bilet parasi alinmaktadir..");
        String gidilecekYer = scanner.nextLine().toUpperCase();

       // System.out.println(gidilecekYer.toUpperCase() + " 15 Euro ucretiniz mevcuttur.");
        System.out.println("Kac Kisilik bilet istiyorsunuz (Max:2 Kisilik secebilirsiniz)");
        int kacKisilikBilet = scanner.nextInt();
        int ucret;
        if (gidilecekYer.equalsIgnoreCase("frankfurt")) {
            ucret = 15;
        } else {
            ucret = 20;
        }
        if (kacKisilikBilet <= 0 || kacKisilikBilet >= 3) {
            System.out.println("Hatali giris yaptiniz, Maximum 2 kisilik girebilirsiniz");
        } else if (kacKisilikBilet == 1) {
            if (gidilecekYer.equalsIgnoreCase("FRANKFURT")) {
                System.out.println("ROTA: " + gidilecekYer);
                System.out.println("1 Kisilik");
                System.out.println(gidilecekYer + " " + ucret + " Euro'dur");
            } else {
                System.out.println("ROTA: " + gidilecekYer);
                System.out.println("1 Kisilik");
                System.out.println(gidilecekYer + " " + ucret + " Euro'dur");
            }
        } else if (kacKisilikBilet == 2) {
            if (gidilecekYer.equalsIgnoreCase("FRANKFURT")) {
                System.out.println("ROTA: " + gidilecekYer);
                System.out.println("2 Kisilik");
                System.out.println(gidilecekYer + " " + ucret*2 + " Euro'dur");
            } else {
                System.out.println("ROTA: " + gidilecekYer);
                System.out.println("2 Kisilik");
                System.out.println(gidilecekYer + " " + ucret*2 + " Euro'dur");
            }


        }
    }
}
