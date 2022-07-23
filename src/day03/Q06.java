package day03;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        //// Kullanıcıdan aldığınız koordinat noktasının hangi bölgede olduğunu yazdıran bir kod yazınız.

        Scanner scanner = new Scanner(System.in);
        System.out.println("X eksenindeki degeri giriniz: ");
        int x = scanner.nextInt();
        System.out.println("Y eksenindeki degeri giriniz: ");
        int y = scanner.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("Girdiginiz " + "(" + x + "," + y + ")" + " noktasi Orijin noktasidir.");
        } else if (x>0&&y>0) {
            System.out.println("Girdiginiz " + "(" + x + "," + y + ")" + " 1. Bolgededir");
        } else if (x<0&&y>0) {
            System.out.println("Girdiginiz " + "(" + x + "," + y + ")" + " 2. Bolgededir");
        } else if (x<0&&y<0) {
            System.out.println("Girdiginiz " + "(" + x + "," + y + ")" + " 3. Bolgededir");
        } else if (x>0&&y<0){
            System.out.println("Girdiginiz " + "(" + x + "," + y + ")" + " 4. Bolgededir");
        } else if (x==0) {
            if (y>0){
                System.out.println("Girdiginiz " + "(" + x + "," + y + ")" + " Pozitif y ekseni uzerindedir");
            }else {
                System.out.println("Girdiginiz " + "(" + x + "," + y + ")" + " Negatif y ekseni uzerindedir");
            }
        } else if (y==0) {
            if (y>0){
                System.out.println("Girdiginiz " + "(" + x + "," + y + ")" + " Pozitif x ekseni uzerindedir");
            }else {
                System.out.println("Girdiginiz " + "(" + x + "," + y + ")" + " Negatif x ekseni uzerindedir");
            }
        }

    }
}
