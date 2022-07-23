package day03;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        /*
		 *  Kullanicidan IT alanini isteyerek
		 *  meslegi = qa ==> Quality Analyst
		             dev ==> Developer
					  ba ==> Busines Analyst
				 	  pm ==> Project Manager
		yazdiriniz
		 */
        Scanner scanner=new Scanner(System.in);
        System.out.println("IT alaninizi giriniz: \n qa \n dev \n ba \n pm");
        String isi=scanner.next();

        if (isi.equalsIgnoreCase("qa")){
            System.out.println("Mesleginiz: Quality Analyst");
        }else if (isi.equalsIgnoreCase("dev")){
            System.out.println("Mesleginiz: Developer");
        } else if (isi.equalsIgnoreCase("ba")) {
            System.out.println("Mesleginiz: Busines Analiyst");
        } else if (isi.equalsIgnoreCase("pm")) {
            System.out.println("Mesleginiz: Project Manager");
        }else {
            System.out.println("Meslek isminizi bilerek yazarsaniz sizin ne is yaptiginizi biliriz. ");
        }
    }
}
