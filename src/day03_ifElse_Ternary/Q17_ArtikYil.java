package day03_ifElse_Ternary;

import java.util.Scanner;

public class Q17_ArtikYil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir yıl giriniz : ");
        int yil = scan.nextInt();

        if (yil % 100 == 0 && yil % 400 == 0) {
            System.out.println("Girdiğiniz"+yil + " yılı ARTIK YIL");
        } else if (yil % 100 != 0 && yil % 4 == 0) {
            System.out.println("Girdiğiniz"+yil + " yılı ARTIK YIL");
        } else {
            System.out.println("Girdiğiniz"+yil + " yılı ARTIK YIL değildir.");
        }

    }
}
