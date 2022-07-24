package day03_ifElse_Ternary;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
         *  dort islemden biri ile isleme koyup sonucun yazdiriniz
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz: ");

        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();

        System.out.println("Hangi dort islemi secmek istersiniz: " +
                "       \n Toplama icin 1 e basiniz," +
                "       \n Cikarma icin 2 e basiniz," +
                "       \n Carpma icin 3 e basiniz,," +
                "       \n Bolme icin 4 e basiniz,");
        int islem=scan.nextInt();

        if (islem==1){
            System.out.println("Toplama isleminizin sonucu= "+(sayi1+sayi2));
        } else if (islem==2) {
            System.out.println("Cikarma isleminizin sonucu= "+(sayi1-sayi2));
        } else if (islem==3) {
            System.out.println("Carpma isleminizin sonucu= "+(sayi1*sayi2));
        } else if (islem==4) {
            System.out.println("Bolme isleminizin sonucu= "+(sayi1/sayi2));
        }


    }
}
