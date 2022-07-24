package day01_variables;

import java.util.Scanner;

public class Q_7 {
    public static void main(String[] args) {
        //kullanicidan iki tam sayi alip bu iki sayinin dort islem sonucu?

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen birinci tamsayi degerini giriniz: ");
        int sayi1= scan.nextInt();
        System.out.print("Lutfen ikinci tamsayi degerini giriniz: ");
        double sayi2= scan.nextInt();

        System.out.print("sayilarin carpimi= "+(sayi1*sayi2)+"\n"+
                            "sayilarin toplami= "+(sayi1+sayi2)+"\n"+
                            "sayilarin farki= "+(sayi1-sayi2)+"\n"+
                            "sayilarn orani= "+(double)(sayi1/sayi2));
    }
}
