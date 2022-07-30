package day06_methodCreation;

import java.util.Scanner;

public class Q01_Kendime {
    public static void main(String[] args) {
        /* TASK :
           String girildiginde ilk iki karakteri haric string return eden java method yaziniz
           Ancak ilk karakter 'g' veya ikinci karakteri 'h' ise bu karakterler de return edilsin
          ORNEK:
           INPUT      :  goat
                         photo
                         ghost
                         kalem
           OUTPUT :      gat
                         hoto
                         ghost
                         lem
		 */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz: ");
        String kelime=scanner.nextLine();

        System.out.println(ilkIkiHaric(kelime));
    }

    public static String  ilkIkiHaric(String kelime) {
        String ilkIkiHaric="";
        if (kelime.substring(0,1).contains("g")){
            System.out.println(kelime.substring(0));
        } else if (kelime.substring(1,2).contains("h")) {
            System.out.println(kelime.substring(1));
        } else {
            System.out.println(kelime.substring(2));
        }
        return ilkIkiHaric;
    }
}
