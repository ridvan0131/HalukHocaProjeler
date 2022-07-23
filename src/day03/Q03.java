package day03;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        /*
		 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		BMI = kilo(kg) /(boy*boy)(cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		 */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen boyunuzu cm cinsinden giriniz " +
                            "Enter'e bastiktan sonra kilonuzu kg cinsinden giriniz");
        double cm=scan.nextDouble()/100;
        double kg=scan.nextDouble();

        double bki=kg/(cm*cm);
        if (bki<=20){
            System.out.println("Beden Kitle indeksiniz: "+bki+" Oldukca zayifsiniz");
        } else if (bki<=25){
            System.out.println("Beden Kitle indeksiniz: "+bki+" Normal sinirlardasiniz");
        } else if (bki<=30) {
            System.out.println("Beden Kitle indeksiniz: "+bki+" Sisman kategorisindesiniz");
        }else {
            System.out.println("Beden Kitle indeksiniz: "+bki+" Obez gurubundansiniz...");
        }

    }

}