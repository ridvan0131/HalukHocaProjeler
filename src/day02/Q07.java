package day02;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        /*
		 Kullanicidan kilosunu ve boyunu alip
		 Vucut kitle indeksini hesaplayan bir program yaziniz.
		 Ipucu : Vucut
		 Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
		 ORNEK:
		 INPUT      : Kilo: 71
		                   Boy: 1,72
		 OUTPUT  : Vucut Kitle Indeksiniz : 23
		 	 */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen kilonuzu giriniz: ");
        double kilo=scan.nextDouble();
        System.out.print("Lutfen boyunuzu metre cinsinden giriniz: ");
        double boy=scan.nextDouble();

        System.out.println("Vucut Kitle Indeksiniz: "+(kilo/(boy*boy)));

    }
}
