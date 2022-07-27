package day05_StringManipulation;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
         /*
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen 3 harfli bir isim giriniz: ");
        String isim=scanner.next();

        String i1=isim.substring(0,1);
        String i2=isim.substring(1,2);
        String i3=isim.substring(2,3);

        System.out.println("***************IF ILE***************");
        if (isim.length()!=3){
            System.out.println("Lutfen isminizi 3 karakter olarak giriniz.");
        }else if (!i1.equals(i2)&&!i1.equals(i3)){
            System.out.println("Girdiginiz isim dogru girilmistir...");
        } else {
            System.out.println("Girdiginiz isimde ayni karakterler vardir...");
        }

        System.out.println("***************TERNARY ILE***************");
        String  sonuc=(isim.length()!=3)?("Lutfen isminizi 3 karakter olarak giriniz."):((!i1.equals(i2)&&!i1.equals(i3))?("Girdiginiz isim dogru girilmistir..."):("Girdiginiz isimde ayni karakterler vardir..."));
        System.out.println(sonuc);


    }
}
