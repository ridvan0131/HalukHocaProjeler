package day04_switchCase;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        // Girilen bir ay numarasına göre , ayın kaç gün olduğunu sayı ile yazdırınız

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir ay numarasini giriniz: ");
        int ayNumarasi=scanner.nextInt();

        switch (ayNumarasi){
            case 1:
                System.out.println("Ocak ayi 31 gun ceker");
                break;
            case 2:
                System.out.println("Subat ayi 28 gun ceker");
                break;
            case 3:
                System.out.println("Mart ayi 31 gun ceker");
                break;
            case 4:
                System.out.println("Nisan ayi 30 gun ceker");
                break;
            case 5:
                System.out.println("Mayis ayi 31 gun ceker");
                break;
            case 6:
                System.out.println("Haziran ayi 30 gun ceker");
                break;
            case 7:
                System.out.println("Temmuz ayi 31 gun ceker");
                break;
            case 8:
                System.out.println("Agustos ayi 31 gun ceker");
                break;
            case 9:
                System.out.println("Eylul ayi 30 gun ceker");
                break;
            case 10:
                System.out.println("Ekim ayi 31 gun ceker");
                break;
            case 11:
                System.out.println("Kasim ayi 30 gun ceker");
                break;
            case 12:
                System.out.println("Aralik ayi 31 gun ceker");
                break;
            default:
                System.out.println("Hatali bir ay girdiniz.");
        }

    }
}
