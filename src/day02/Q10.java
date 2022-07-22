package day02;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        // Write a Java program to convert temperature from Fahrenheit to Celsius degree.

        // formula

        // c = (f-32)*5/9

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen Fahrenheit olarak hissettiginiz sicaklik degerini yaziniz: ");
        int f= scan.nextInt();
        double sonuc=(f-32)*5/9;

        System.out.println("Hissettiginiz sicaklik "+sonuc+" Celsius derecedir");

    }
}
