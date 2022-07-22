package day02;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {

         /*  Problem Tanımı
        Bir işçinin işi bitirme süresini ve toplam işçi sayısını alarak, işin bitme süresini
        hesaplayan kodu yazınız.
        Örneğin, Bir işçi bir işi 10 günde yapabilmektedir.
        Buna göre 2 işçi aynı işi kaç günde yapar?

        Örnek Ekran Çıktısı
         Bir işçi işi kaç günde bitirmektedir? 10
         Toplam kaç işçi çalışacak? 2
        İşin bitme süresi 5 gündür.
    */

        Scanner scan=new Scanner(System.in);
        int toplamisci, birIsci;
        double bitmeSuresi;
        System.out.println("Bir isci isi kac gunde bitirmektedir? :");
        birIsci =scan.nextInt();
        System.out.println("Toplam kac isci calisacaktir? :");
        toplamisci =scan.nextInt();

        bitmeSuresi=birIsci/toplamisci;

        System.out.println("Isin bitme suresi: "+bitmeSuresi);

    }
}
