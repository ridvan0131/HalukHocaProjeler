package day04_switchCase;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // Bugüne göre 100 gün sonra hangi gün olduğunuz yazdırınız.
        // pazartesi

        Scanner scanner=new Scanner(System.in);
        System.out.print("Bugun gunlerden hangisi" +
                "\nPazartesi ise:1 e basiniz" +
                "\nSali ise:2 ye basiniz" +
                "\nCarsamba ise:3 e basiniz" +
                "\nPersembe ise:4 e basiniz" +
                "\nCuma ise:5 e basiniz" +
                "\nCumartesi ise:6 ya basiniz" +
                "\nPazar ise:7 ye basiniz");
        int gunlerdenHangisi=scanner.nextInt();
        System.out.print("Merak ettiginiz gunun sayisini giriniz: ");
        int merakEdilenGun=scanner.nextInt();

        int sonuc=merakEdilenGun%7;

        switch (gunlerdenHangisi){
            case 1:
                System.out.println("Merak edilen gun olan: "+merakEdilenGun+ ", Pazartesi gunudur.");
            break;
            case 2:
                System.out.println("Merak edilen gun olan: "+merakEdilenGun+ ", Sali gunudur.");
                break;
            case 3:
                System.out.println("Merak edilen gun olan: "+merakEdilenGun+ ", Carsamba gunudur.");
                break;
            case 4:
                System.out.println("Merak edilen gun olan: "+merakEdilenGun+ ", Persembe gunudur.");
                break;
            case 5:
                System.out.println("Merak edilen gun olan: "+merakEdilenGun+ ", Cuma gunudur.");
                break;
            case 6:
                System.out.println("Merak edilen gun olan: "+merakEdilenGun+ ", Cumartesi gunudur.");
                break;
            case 7:
                System.out.println("Merak edilen gun olan: "+merakEdilenGun+ ", Pazar gunudur.");
                break;
            default:
                System.out.println("Hatali bir gun girdiniz...");

        }
    }
}
