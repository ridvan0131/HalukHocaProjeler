package day03_ifElse_Ternary;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
     /*
        Kullanıcıdan vize ve final notlarını alınız.
        Kullanıcın istediği oranlarda vize ve final yüzdeleri not ile not ortalamasını hesaplayıp
        not ortalamasını yazdırıp 50 ve büyük ise "Tebrikler dersi başarı ile geçtiniz..." küçük ise
        "Malesef dersten kaldınız..." yazdırınız
         */
        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen vize notunuzu giriniz: ");
        int vize=scanner.nextInt();
        System.out.println("Vizenin yuzdeligini 0 ile 100 arasinda giriniz");
        double vizeyuzde=scanner.nextDouble();
        System.out.print("Lutfen final notunuzu giriniz: ");
        int finalnotu=scanner.nextInt();
        System.out.println("Finalin yuzdeligini 0 ile 100 arasinda giriniz");
        double finalyuzde=scanner.nextDouble();

        boolean hataliGiris=(vizeyuzde+finalyuzde)!=100;
        double notOrtalamasi=(vize*vizeyuzde/100)+(finalnotu*finalyuzde/100);

        System.out.println("Notunuz hesaplaniyor.....");
        System.out.println("Not ortalamaniz= "+notOrtalamasi);

        if (hataliGiris){
            System.out.println("Vize ve final yuzdeleri toplami 100 olmali");
        } else if (notOrtalamasi>=50) {
            System.out.println("Tebrikler dersi BASARI ile gectiniz");
        }else {
            System.out.println("Soylemesi zor ama dersten KALDINIZ");
        }


    }
}
