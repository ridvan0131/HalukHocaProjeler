package day02;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        /*
         *  Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
         *
         *   Ex :
         *   input  : 12345
         *   output : 12
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sayi giriniz: ");
        int sayi=scan.nextInt();

        int birler, onlar, yuzler, binler, onbinler;
        birler=sayi%10;
        sayi/=10;
        onlar=sayi%10;
        sayi/=10;
        yuzler=sayi%10;
        sayi/=10;
        binler=sayi%10;
        sayi/=10;
        onbinler=sayi;

        System.out.println("Girilmis olan sayinin ilk iki ve son iki basamaklarinin rakamlar toplami: "+
                (birler+onlar+binler+onbinler));


    }
}
