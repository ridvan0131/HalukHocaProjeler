package day06_methodCreation;

import java.util.Scanner;

public class Q03_Kendime {
    public static void main(String[] args) {
        /*      TASK :
        Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        ceviren bir method yaziniz.

        */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen islem yapacaginiz birimi giriniz(saat, mil, kg lardan birisi) giriniz");
        String secim=scanner.next();
        System.out.println("Lutfen neyden ne kadar cevirmek istersiniz rakaminizi giriniz: ");
        double cevir=scanner.nextDouble();

        cevirBak(secim,cevir);

    }

    private static void cevirBak(String secim, double cevir) {
        switch (secim){
            case "saat":
                System.out.println(cevir+ " saat "+cevir*60*60+" saniyedir");
            break;
            case "mil":
                System.out.println(cevir+ " mil "+cevir*1.61+" kilometredir");
            break;
            case "kg":
                System.out.println(cevir+ " kg "+cevir*1000+" gramdir");
                break;
            default:
                System.out.println("le haci ne edisen... ");
        }

    }
}
