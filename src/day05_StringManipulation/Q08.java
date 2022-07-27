package day05_StringManipulation;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        /* Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el
         */

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen bir kelime giriniz: ");
        String kelime=scanner.next();

        String sonIki=kelime.substring(kelime.length()-2,kelime.length());

        if (kelime.length()==3){
            System.out.println("Yazdiginiz kelime: "+kelime);
        }else {
            System.out.println("Girdiginiz kelimenin son harfleri 3 kere yazdiralim: "+sonIki+sonIki+sonIki);
        }
    }
}
