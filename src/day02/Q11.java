package day02;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
           /*
        TechProEd spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini yazdırınız.
         */
        String isim, soyad;
        int yas, boy, ay;
        double kilo;
        Scanner scan=new Scanner(System.in);
        System.out.print("Spor salonumuz icin isminizi giriniz: ");
        isim=scan.nextLine();
        System.out.print("Spor salonumuz icin soyadinizi giriniz: ");
        soyad=scan.nextLine();
        System.out.print("Spor salonumuz icin yasinizi giriniz: ");
        yas=scan.nextInt();
        System.out.print("Spor salonumuz icin boyunuzu cm cinsinden giriniz: ");
        boy=scan.nextInt();
        System.out.print("Spor salonumuz icin kilonuzu giriniz: ");
        kilo=scan.nextDouble();
        System.out.print("Spor salonumuza kac ay devam edeceksiniz: ");
        ay=scan.nextInt();

        System.out.println("Isim: "+isim+"\n"
                            +"Soyad: "+soyad+"\n"
                            +"Yas: "+yas+"\n"
                            +"Boy: "+boy+"\n"
                            +"kilo: "+kilo+"\n"
                            +"Toplam borcunuz: "+(ay*20)+" dolardir...");




    }
}
