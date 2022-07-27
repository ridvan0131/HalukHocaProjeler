package day05_StringManipulation;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        /*
        Kullanicidan email girmesini isteyin
       @ isareti icermiyorsa "gecerli bir email girin" yazdirin
       @ isaretinden sonra sadece "gmail.com" yaziyorsa "email onaylandi" yazdirin
       @ isaretinden sonra "gmail.com" disinda birsey yaziyorsa "Lutfen gmail hesabinizi girin" yazdirin
       ORNEK:
       INPUT : techproed.com OUTPUT : "gecerli bir email girin "
       INPUT : techproed@gmail.com OUTPUT :  "email onaylandi "
       INPUT : techproed@hotmail.com OUTPUT : "Lutfen gmail hesabinizi girin"
       */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen emailinizi giriniz: ");
        String email=scanner.next();

        if (!email.contains("@")){
            System.out.println("Lutfen gecerli email adresinizi giriniz...");
        }else if (email.endsWith("@gmail.com")){
            System.out.println("email onaylandi...");
        }else {
            System.out.println("Lutfen gmail adresinizi giriniz...");
        }



    }
}
