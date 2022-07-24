package day02_scanner;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */
        Scanner scan=new Scanner(System.in);
        int v1,v2,finalnot;
        double ortalama;
        System.out.print("Lutfen vize-1 notunuzu giriniz: ");
        v1=scan.nextInt();
        System.out.print("Lutfen vize-2 notunuzu giriniz: ");
        v2=scan.nextInt();
        System.out.print("Lutfen final notunuzu giriniz: ");
        finalnot=scan.nextInt();

        ortalama=((v1+v2)*0.3/2)+finalnot*0.7;
        System.out.println("Gecme notunuz: "+ortalama);

    }
}
