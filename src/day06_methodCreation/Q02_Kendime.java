package day06_methodCreation;

import java.util.Scanner;

public class Q02_Kendime {
    public static void main(String[] args) {
        /*
		name1 ve name2 degiskenlerini olusturun.
		name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
		name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirinan bir method oluşturun
		          e.g:
		         name1= mehmet
		         name2= ahmet
		         Print ==> mehahmetmet
		*/

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen iki isim giriniz: ");
        String isim1=scanner.next();
        String isim2=scanner.next();

        isimYerlestir(isim1,isim2);
    }

    private static void isimYerlestir(String isim1, String isim2) {
        if (isim1.length()%2==0){
            System.out.println(isim1.substring(0,isim1.length()/2)+isim2+isim1.substring(isim1.length()/2));
        }else {
            System.out.println("ilk girdiginiz isim cift sayili olmadigi icin ortasina yerlestiremedik");
        }
    }
}
