package day03;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        /*Kullanici tarafindan girilen bir sayinin
         *mutlak degerini yazdirmak icin bir program yazin.
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz: ");
        double sayi=scanner.nextDouble();

        if (sayi<0){
            System.out.println("Girilen sayinin mutlak degeri= "+sayi*(-1));
        }else {
            System.out.println("Girilen sayinin mutlak degeri= "+sayi);
        }


    }
}
