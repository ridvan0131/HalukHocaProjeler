package day05_StringManipulation;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
          /*
        kullanıcıdan bir e-posta adresi girmesini isteyin, ardından "hotmail" içeriyorsa, "gmail" ile değiştirin,
        örneğin: johnbrown@hotmail.com ==> johnbrown@gmail.com
            */

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen bir e-posta adresi giriniz: ");
        String email=scanner.nextLine();

        boolean iceriyorMu=email.contains("hotmail");
        boolean gmail=email.contains("gmail");
        if (gmail){
            System.out.println("Sifreniz kaydedildi");
        }else if (iceriyorMu){
            System.out.println(email.replace("hotmail","gmail")+"olarak kaydedildi.");
        }else {
            System.out.println("Mailiniz gmail olmali");
        }
    }
}
