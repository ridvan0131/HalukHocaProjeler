package day03;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        	/*
		 * Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada
		hatali giris seklinde kod yazniz
		 */

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen bir karakter giriniz: ");
        char karakter=scanner.next().charAt(0);

        if (karakter>='A'&&karakter<='Z'){
            System.out.println("Buyuk harf girdiniz");
        } else if (karakter>='a'&&karakter<='z') {
            System.out.println("Kucuk harf girdiniz");
        }else {
            System.out.println("Hatali giris yaptiniz");
        }
    }
}
