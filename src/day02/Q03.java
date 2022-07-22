package day02;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        // kullanicidan 2 tam sayi alip bu 2 tamsayinin  dort islem sonucunu yazdiriniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki tamsayi giriniz, birincisini girdikten sonra ENTER'e basiniz");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();

        int toplama, carpma, cikarma, bolme;
        toplama=sayi1+sayi2;
        cikarma=sayi1-sayi2;
        carpma=sayi1*sayi2;
        bolme=sayi1/sayi2;
        System.out.println("Toplamlari: "+toplama+"\n"
                            +"Farklari: "+cikarma+"\n"
                            +"Carpimlari: "+carpma+"\n"
                            +"Bolumleri: "+bolme);

    }
}
