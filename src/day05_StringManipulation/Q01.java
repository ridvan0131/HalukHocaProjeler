package day05_StringManipulation;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // Kullanıcıdan alacağını bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen bir cumle giriniz: ");
        String cumle=scanner.nextLine();

        if (cumle.contains(" ")){
            System.out.println("Cumlede bosluk bulunmaktadir.");
        }else {
            System.out.println("Cumlede bosluk yoktur, Hayat bosluk kabul etmez");
        }
    }
}
