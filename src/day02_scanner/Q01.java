package day02_scanner;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
//kullanicinin ad soyad yas boy kilosunu  yazdiriniz
//
//        Scanner scan=new Scanner(System.in);
//        System.out.println("Lutfen isminizi giriniz");
//        String isim=scan.nextLine();
//        Scanner scan1=new Scanner(System.in);
//        System.out.println("Lutfen soyadinizi giriniz");
//        String soyad=scan1.nextLine();
//        Scanner scan2=new Scanner(System.in);
//        System.out.println("Lutfen yasinizi giriniz");
//        double yas=scan2.nextDouble();
//        Scanner scan3=new Scanner(System.in);
//        System.out.println("Lutfen boyunuzu giriniz");
//        double boy=scan3.nextDouble();
//
//        System.out.println("Isminiz: "+isim+"\n"+
//                            "Soyadiniz: "+soyad+"\n"+
//                            "Yasiniz: "+yas+"\n"+
//                            "Boyunuz: "+boy+" cm");
//

        Scanner scan=new Scanner(System.in);
        String isim, soyad;
        int yas, kilo;
        double boy;

        System.out.print("Lutfen isminizi giriniz: ");
        isim=scan.nextLine();
        System.out.print("Lutfen soyadinizi giriniz: ");
        soyad=scan.nextLine();
        System.out.print("Lutfen yasinizi giriniz: ");
        yas=scan.nextInt();
        System.out.print("Lutfen boyunuzu giriniz: ");
        boy=scan.nextDouble();
        System.out.print("Lutfen kilonuzu giriniz: ");
        kilo=scan.nextInt();

        System.out.println("Benim adim: "+isim+
                "\n"+"Benim soyadim: "+soyad+
                "\n"+"Benim yasim: "+yas+
                "\n"+"Benim boyum: "+boy+
                "\n"+"Benim kilom: "+kilo);
    }
}
