package day03_ifElse_Ternary;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
                /*
        Kulanıcıdan aracının hızını alınız
        Trafik cezasının değerini hesaplayın.
            45 hız sınırıdır.
            Eğer hızınız 55-74 arasında ise:
            Ceza 100 $'dır.

            Eğer hızınız 75 - 84 arasında ise:
            Ceza 150 $'dır.

            Eğer hızınız 85 -94 arasında ise:
            Ceza 320 $'dır.

            Eğer hızınız 94'den daha fazla ise:
            Ceza 500 $'dır.

            ve ayrıca,
            Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

            Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.

-----------------------------------------

            Örn;

            currentSpeed(Hızınız) 87
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;

            sonuç 320 olmalıdır.

            currentSpeed(Hızınız) 65
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;

            sonuç 300 olmalıdır.
     */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen radara giris hizinizi giriniz");
        int hiz = scanner.nextInt();
        System.out.println("Ehliyetiniz varsa 1'e yoksa 2'ye basiniz");
        int ehliyet = scanner.nextInt();

        if (ehliyet == 1) {
            if (hiz <= 45) {
                System.out.println("Hiziniz cok guzel dikkatli surmeye devam ediniz.");
            } else if (hiz < 55) {
                System.out.println("Bu kisma bir ceza isabet ettmedi, yine sasnslisin. ");
            } else if (hiz < 75) {
                System.out.println("Cezaniz uzulerek belirtiyorum ki 100$ dir");
            } else if (hiz < 85) {
                System.out.println("Cezaniz uzulerek belirtiyorum ki 150$ dir");
            } else if (hiz < 95) {
                System.out.println("Cezaniz uzulerek belirtiyorum ki 320$ dir");
            } else {
                System.out.println("Cezaniz uzulerek belirtiyorum ki 500$ dir");
            }
        } else if (ehliyet == 2) {
            if (hiz <= 45) {
                System.out.println("Hiziniz cok guzel dikkatli surmeye devam ediniz.");
            } else if (hiz < 55) {
                System.out.println("Bu kisma bir ceza isabet ettmedi, yine sasnslisin. ");
            } else if (hiz < 75) {
                System.out.println("Cezaniz uzulerek belirtiyorum ki 300$ dir");
            } else if (hiz < 85) {
                System.out.println("Cezaniz uzulerek belirtiyorum ki 350$ dir");
            } else if (hiz < 95) {
                System.out.println("Cezaniz uzulerek belirtiyorum ki 520$ dir");
            } else {
                System.out.println("Cezaniz uzulerek belirtiyorum ki 700$ dir");
            }
        }
        else {
            System.out.println("Lutfen ehliyetinizin var olup olmadigi hakkinda bilginizi dogru giriniz");
        }
    }
}
