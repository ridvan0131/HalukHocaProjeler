package day05_StringManipulation;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        //Kullanıcıdan alacağınız, 3 kelimedne oluşan ismi
        // Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen 3'lu isminizi giriniz: ");
        String isim=scanner.nextLine();

        char isim1=isim.toUpperCase().charAt(0);
        String isim2=isim.substring(isim.indexOf(" ")+1,isim.indexOf(" ")+2).toUpperCase();
        String isim3=isim.substring(isim.lastIndexOf(" ")+1,isim.lastIndexOf(" ")+2).toUpperCase();

        System.out.println(isim1+"."+isim2+"."+isim3);
    }
}
