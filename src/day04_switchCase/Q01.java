package day04_switchCase;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // Kullanıcıdan notunu alın ve aşağıdaki kurallara göre ekrana A, B, C veya D yazdırın.
        // 1. 0()dahil ile 50 arasi - D   2. 50(dahil) ile 60 arası - C   3. 60(dahil) ile 80 arası - B  4. 80(dahil) ustu- A
        // Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin
        // switch() kullanarak yapiniz.

        // switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
        // switch() de int, byte, short, char, String kullanilir.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Notunuzu giriniz: ");
        int not =scanner.nextInt();
        String yazi =scanner.nextLine();
        if (not>=0&&not<50){
            yazi="kaldin";
        } else if (not>=50&&not<60) {
            yazi="yirttin";
        } else if (not>=60&&not<80) {
            yazi="hadi gene iyisin";
        }else if (not>=80&&not<100){
            yazi="gectin gari";
        }else {
            yazi="Ne edisen ule";
        }

        switch (yazi){
            case "kaldin":
                System.out.println("D");
                break;
            case "yirttin":
                System.out.println("C");
                break;
            case "hadi gene iyisin":
                System.out.println("B");
                break;
            case "gectin gari":
                System.out.println("A");
                break;
            default:
                System.out.println(yazi);
                break;
        }
    }
}
