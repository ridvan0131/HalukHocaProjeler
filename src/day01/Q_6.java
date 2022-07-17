package day01;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.SortedMap;

public class Q_6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz");
        String isim=scan.nextLine();
        System.out.println("Lutfen soyadinizi giriniz");
        String soyad=scan.nextLine();
        System.out.println("Lutfen yasinizi giriniz");
        int yas=scan.nextInt();
        System.out.println("Lutfen boyunuzu giriniz(cm cinsinden...)");
        int boy=scan.nextInt();
        System.out.println("Lutfen kilonuzu giriniz");
        double kilo=scan.nextDouble();


        System.out.println("Isminiz: "+isim+"\n"+"Soyadiniz: "+soyad+"\n"+"Yasiniz: "+yas+"\n"+"Boyunuz: "+boy+"cm"+"\n"+"Kilonuz: "+kilo);
    }
}
