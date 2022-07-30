package day06_methodCreation;

import java.util.Scanner;

public class Q05_Kendime_TekrarET {
    public static void main(String[] args) {
          /*
        TASK :
        Bir String içinde kaç kelime olduğunu yazdıran bir method create ediniz.
       Test Data:
       Input the string: The quick brown fox jumps over the lazy dog.
 	   Expected Output: Number of words in the string: 9
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz: ");
        String cumle=scanner.nextLine();

        System.out.println("Girdiginiz cumlede "+kelimeSayisi(cumle)+" bosluk vardir.");
    }

    private static int kelimeSayisi(String cumle) {
        int sayim=0;
        char bosluk=' ';

        if (cumle.contains(" ")){
            for (int i = 0; i <=cumle.length()-1 ; i++) {
                if (cumle.charAt(i)==bosluk){
                    sayim++;
                }
            }
        }else {
            System.out.println("Cumleniz tek kelimeden olusmaktadir...");
        }
        return sayim;
    }
}
