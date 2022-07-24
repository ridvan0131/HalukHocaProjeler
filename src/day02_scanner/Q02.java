package day02_scanner;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        /*
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen uc basamakli bir sayi giriniz: ");
        int sayi=scan.nextInt();

        int birler=sayi%10;
        sayi/=10;
        int onlar=sayi%10;
        sayi/=10;
        int yuzler=sayi;


        System.out.println("Yuzler basamagi: "+yuzler+
                            "\n"+"Onlar basamagi: "+onlar+
                            "\n"+"Birler basamagi: "+birler);

    }
}
