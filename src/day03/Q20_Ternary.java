package day03;

import java.util.Scanner;

public class Q20_Ternary {
    public static void main(String[] args) {
        // Kullanıcıdan bir pozitif tamsayı girmesini isteyin, o pozitif tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
        // 3 basamaklı degilse çift olup olmadigini kontrol edin. Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
        // Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.”

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen 3 basamakli pozitif bir sayi giriniz= ");
        int sayi=scanner.nextInt();

        System.out.println((sayi>=100&&sayi<1000)?"Uc basamakli bir sayi":
                            (sayi%2==0)?"Uc basamakli olmayan CIFT bir sayi":"Uc basamakli olmayan TEK sayi");

    }
}
