package day06_methodCreation;

import java.util.Scanner;

public class Q04_Kendime {
    public static void main(String[] args) {
        /*  TASK :
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden method create ediniz.
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz: ");
        String kelime=scanner.nextLine();

        System.out.println(iceriyorMu(kelime));
    }

    private static String iceriyorMu(String kelime) {
        String bakhele="";
        if (kelime.contains("xyz")){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
        return bakhele;
    }
}
