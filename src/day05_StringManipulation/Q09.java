package day05_StringManipulation;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
	            /*
				StringMethods:
				cift uzunlukta bir degiskenin ilk yarisini konsolda yazdirmak icin bir Java programi yaziniz.
	    	    ORNEK:
		     	INPUT      :  Python
				OUTPUT :   Pyt
	            */

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen bir kelime giriniz: ");
        String kelime=scanner.nextLine();

        Integer harfSayisi=kelime.length();
        String ilkKelime=kelime.substring(0,kelime.length()/2);
        String ikinciKelime=kelime.substring(kelime.length()/2,kelime.length());
        if (harfSayisi%2!=0){
            System.out.println("Girdiginiz kelimenin karakter sayisi cift degil");
        }else {
            System.out.println(ilkKelime+" "+ikinciKelime);
        }

    }
}
