package day03_ifElse_Ternary;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {

    /*  Problem Tanımı
        Kullanıcıdan bir tarihi gün, ay ve yıl şeklinde alıp bu tarihi
        ay, gün, yıl ve yıl, ay, gün sıralarına çevirerek yazan bir kod yazınız.
    ipucu: her else komutundan sonra return; komutu kullanınız...

        Örnek Ekran Çıktısı
        Lütfen günü giriniz: 10
        Lütfen ayı giriniz: 02
        Lütfen yılı giriniz: 2009
        Gün ay yıl: 10.02.2009
        Ay gün yıl: 02.10.2009
        Yıl ay gün: 2009.02.10
        */

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen gun giriniz: ");
        int gun=scanner.nextInt();
        System.out.print("Lutfen ayi giriniz: ");
        int ay =scanner.nextInt();
        System.out.print("Lutfen yili giriniz: ");
        int yil=scanner.nextInt();

        if (gun>=1&&gun<=31){
            System.out.println("Gun: "+gun);
        }else {
            System.out.println("Gunu yanlis giris yaptiniz program sonlaniyor");
            return;
        }
        if (ay>=1&&ay<=12){
            System.out.println("Ay: "+ay);
        }else {
            System.out.println("Ayi yanlis giris yaptiniz program sonlaniyor");
            return;
        }
        if (yil>=1000&&yil<=2023){
            System.out.println("Yil: "+yil);
        }else {
            System.out.println("Yili yanlis giris yaptiniz program sonlaniyor");
            return;
        }
        System.out.println("Gun Ay Yil: "+gun+"."+ay+"."+yil);
        System.out.println("Ay Gun Yil: "+ay+"."+gun+"."+yil);
        System.out.println("Yil Ay Gun: "+yil+"."+ay+"."+gun);
    }
}
