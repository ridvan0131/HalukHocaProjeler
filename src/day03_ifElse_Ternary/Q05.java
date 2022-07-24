package day03_ifElse_Ternary;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        /*
		Problem tanimi :
		Kullanicidan  yasini ve kilosunu aliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */
        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen yasinizi giriniz:");
        int yas=scanner.nextInt();
        System.out.print("Lutfen kilonuzu giriniz: ");
        double kilo=scanner.nextDouble();


        if (yas<18){
            System.out.println("Yasiniz Kan bagisi yapmaya elverissiz, ");
        } else if (yas>=18&&kilo<50) {
            System.out.println("Kilonuz yetersiz, Kan bagisi yapamazsiniz");
        }else {
            System.out.println("Kan bagisi yapabilirsiniz");
        }
    }
}
