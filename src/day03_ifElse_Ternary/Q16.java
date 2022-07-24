package day03_ifElse_Ternary;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        /*
    Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve
    en kucuk olanlarini konsola yazdiriniz
    int num1
    int num2
    int num3
    */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz: ");
        int s1=scanner.nextInt();
        System.out.println("Lutfen bir sayi giriniz: ");
        int s2=scanner.nextInt();
        System.out.println("Lutfen bir sayi giriniz: ");
        int s3=scanner.nextInt();

        if ((s1>s2&&s2>s3)||(s1>s3&&s3>s2)) {
            System.out.println("Buyuk= "+s1);
            if (s2>s3){
                System.out.println("Kucuk= "+s3);
            }else {
                System.out.println("Kucuk= "+s2);
            }
        } else if ((s2>s3&&s3>s1)||(s2>s1&&s1>s3)) {
            System.out.println("Buyuk= "+s2);
            if (s3>s1){
                System.out.println("Kucuk= "+s1);
            }else {
                System.out.println("Kucuk= "+s3);
            }
        } else {
            System.out.println("Buyuk= "+s3);
            if (s1>s2){
                System.out.println("Kucuk= "+s2);
            }else {
                System.out.println("Kucuk= "+s1);
            }
        }

    }
}
