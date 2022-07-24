package day03_ifElse_Ternary;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        /*  Problem Tanımı
        Kullanıcıdan üç adet sayı alarak bu sayıların
        bir dik üçgenin kenar uzunlukları olup olmadığını hesaplatan bir kod yazınız
        (Yardım: Bir üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor
        bağlantısından yararlanabilirsiniz)

        Örnek Ekran Çıktısı
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        Bu bir dik üçgen değildir.

        Bu bir dik üçgendir
     */

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen kisa bir kenar giriniz:");
        double a=scanner.nextDouble();
        System.out.print("Lutfen kisa bir kenar daha giriniz:");
        double b=scanner.nextDouble();
        System.out.print("Lutfen en uzun kenari giriniz:");
        double c=scanner.nextDouble();

        if ((a*a)+(b*b)==c*c){
            System.out.println("Bu bir DIK ucgendir");
        }else if ((c*c)+(b*b)==a*a){
            System.out.println("Bu bir DIK ucgendir");
        } else if ((c*c)+a*a==(b*b)) {
            System.out.println("Bu bir DIK ucgendir");
        }else {
            System.out.println("DEGILDIR gardadim DEGILDIR... Bu bir dik ucgen DEGILDIR");
        }

    }
}
