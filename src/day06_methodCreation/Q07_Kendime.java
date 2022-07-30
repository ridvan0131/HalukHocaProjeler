package day06_methodCreation;

import java.util.Scanner;

public class Q07_Kendime {
    public static void main(String[] args) {
         /*      TASK:
        reverseString isminde bir method create ediniz.
        Bu method bir String'i parametre olarak alsın.
        Ve bu method, girilen String'i tersten print etsin.


        Örn: String = "Java'yı Seviyorum."
        Print: .muroyiveS ıy'avaJ
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz: ");
        String cumle=scanner.nextLine();

        terstenYazdir(cumle);

        System.out.println(terstenYazdir(cumle));
    }

    private static String terstenYazdir(String cumle) {
        String konteynir="";
        for (int i = cumle.length()-1; i >=0 ; i--) {
            konteynir+=cumle.substring(i,i+1);

        }
        return konteynir;
    }
}
