package day02_scanner;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
          /*  Problem Tanımı
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz

        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */
        Scanner scan=new Scanner(System.in);
        double a,b,c;
        System.out.print("Lutfen bir a tamsayisi giriniz: ");
        a=scan.nextDouble();
        System.out.print("Lutfen bir b tamsayisi giriniz: ");
        b=scan.nextDouble();
        System.out.print("Lutfen bir c tamsayisi giriniz: ");
        c=scan.nextDouble();

        double sonuc=(Math.pow(a,2)-Math.pow(b,2))/(c*3);
        System.out.println(sonuc);


    }
}
