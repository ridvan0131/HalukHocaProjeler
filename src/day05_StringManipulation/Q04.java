package day05_StringManipulation;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen 4 harfli bir kelime giriniz: ");
        String kelime=scanner.next();

        System.out.println("*************1. Yontem****************");
        System.out.println(kelime.charAt(3)+""+kelime.charAt(2)+""+kelime.charAt(1)+""+kelime.charAt(0));
        System.out.println("*************2. Yontem****************");
        System.out.println(kelime.substring(3)+kelime.substring(2,3)+kelime.substring(1,2)+kelime.substring(0,1));
    }
}
