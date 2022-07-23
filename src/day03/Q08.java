package day03;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        /*
         * SORU 1
         * Kullanicidan aldigi urunun adedini ve liste fiyatini alin,
         * kullaniciya musteri karti olup olmadigini sorun

         * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
         * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
         * alirsa %10 indirim yapin
         */
        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen aldiginiz urunun adedini giriniz: ");
        int urunAdedi=scanner.nextInt();
        System.out.print("Lutfen urununuzun liste fiyatini giriniz: ");
        double fiyat=scanner.nextDouble();
        System.out.println("Musteri kartiniz varsa 1, yoksa 2'ye basiniz");
        int kart=scanner.nextInt();

        if (kart==1){
            if (urunAdedi>=10){
                System.out.println("toplam odemeniz gerekli olan tutar= "+(urunAdedi*fiyat*0.8));
            }else{
                System.out.println("toplam odemeniz gerekli olan tutar= "+(urunAdedi*fiyat*0.85));
            }
        }else if (kart==2){
            if (urunAdedi>=10){
                System.out.println("toplam odemeniz gerekli olan tutar= "+(urunAdedi*fiyat*0.85));
            }else{
                System.out.println("toplam odemeniz gerekli olan tutar= "+(urunAdedi*fiyat*0.9));
            }
        }else {
            System.out.println("Lutfen kartinizin olup olmadigini sadece 1 yada 2 ile girebilirsiniz...");
        }



    }
}
