package day03_ifElse_Ternary;

import java.util.Scanner;

public class Q1_NotHesaplama {
    public static void main(String[] args) {
            /*
        1.Kullanıcıya    "Vize sınav sonucunuzu giriniz :"
        2.vize notu double değerinde girilecek.
        3. Kullanıcıya  "Vize sınavı yüzdesini giriniz". ->> double olmalı ->> 0,40 etkiliyor   !!Yüzde kaç etkilediğini Sisteme siz giriyorsunuz.!!

        4.Kullanıcıya    "Final sınav sonucunuzu giriniz.

        5. final notu double değerinde olmalı. (örn: 65,5)

        6.Kullanıcıya    "Final sınavı yüzdesini giriniz"-->> double olmalı ->> 0,60 etkiliyor.

        7. Gecme notunu bulmak için, vize nin yüzde40 ı, finalin yüzde60 ı alınmalı ve çıkan sonuçlar toplanmalıdır.

        8. Çıkan sonucu (dersin not ortalamasını)   double toplam  ' a eşitleyebilirsiniz.

                                        todo    Koşul kısmı

                                        eğer ortalaması 90(90 dahil) 'dan büyük ise, harf notu olarak AA,
                                                                        80(80dahil)   ile 90 arasında ise  BA,
                                                                        70(70 dahil)   ile 80 arasında ise BB,
                                                                        60(60dahil) ile 70 arasında ise CB,
                                                                        50(50 dahil) ile 60 arasında ise CC,
                                                                     40(40 dahil) ile 50 arasında ise DC,
                                                                     30(30 dahil) ile 40 arasında ise DD,
                                                                     30 'dan düşük ise FF            gelmeli.
         */

        Scanner scan=new Scanner(System.in);
        double vize, finalnotu, sonuc;
        System.out.println("Lutfen vize notunuzu giriniz: ");
        vize=scan.nextDouble();
        System.out.println("Lutfen final notunuzu giriniz: ");
        finalnotu=scan.nextDouble();

        sonuc=(vize*0.4)+(finalnotu*0.6);
        if (sonuc>100||sonuc<0){
            System.out.println("Notlarinizi kontrol ederek tekrar giriniz");
        }else if (sonuc>=90){
            System.out.println("Notunuz: "+"AA");
        }else if (sonuc>=80){
            System.out.println("Notunuz: "+"BA");
        }else if (sonuc>=70){
            System.out.println("Notunuz: "+"BB");
        }else if (sonuc>=60){
            System.out.println("Notunuz: "+"CB");
        }else if (sonuc>=50){
            System.out.println("Notunuz: "+"CC");
        }else if (sonuc>=40){
            System.out.println("Notunuz: "+"DC");
        }else if (sonuc>=30){
            System.out.println("Notunuz: "+"DD");
        }else
            System.out.println("Notunuz: "+"FF");
        }


    }

