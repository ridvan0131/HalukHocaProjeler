package day03;

import java.util.Scanner;

public class Q19_Ternary {
    public static void main(String[] args) {
        // Kullanicidan bir character girmesini isteyiniz
        // Character harf ise kucuk harf olup olmadigini kontrol ediniz
        // Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
        // Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
        // Harf degilse ekrana "Harf degil" yazdiriniz
        //97:a  122:z ascii değeri

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen bir karakter giriniz: ");
        char krk=scanner.next().charAt(0);

        System.out.println((krk>='A'&&krk<='Z')?"Buyuk Harf":(krk>='a'&&krk<='z')?"Kucuk Harf":"Harf DEGILDIR");
    }
}
