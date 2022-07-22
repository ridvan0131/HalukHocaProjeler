package day02;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
         /*  Problem Tanımı
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.

        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13
          */
        double knr1=3;
        double knr2=4;
        double kare1=knr1*knr1;
        double kare2=knr2*knr2;
        double toplami=kare1+kare2;

        System.out.println("Hipotenus= "+(Math.pow(toplami,0.5)));// girilen sayinin ussunu verdik
        System.out.println("Hipotenus= "+Math.sqrt(toplami));// direk ussunu aldik





    }
}
