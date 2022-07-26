package day05_StringManipulation;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        // Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
        // ad ayrı soyad ayrı sekilde ekrana yazdırınız.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen ad soyadinizi giriniz: ");
        String adSoyad=scanner.nextLine();

        String ad=adSoyad.substring(0,adSoyad.indexOf(" "));
        String soyad=adSoyad.substring(adSoyad.indexOf(" ")+1,adSoyad.length());

        System.out.println(ad);
        System.out.println(soyad);


    }
}
