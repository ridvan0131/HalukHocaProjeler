package day01_variables;

public class Q_1 {
    public static void main(String[] args) {
        //verilen 12345 sayisinin rakamlarini yukaridan asagiya
        //1
        //2
        //3
        //4
        //5
        // seklinde yazin

        int sayi=12345;
        int birler=sayi%10;
        sayi/=10;

        int onlar=sayi%10;
        sayi/=10;

        int yuzler=sayi%10;
        sayi/=10;

        int binler=sayi%10;
        sayi/=10;

        int onbinler=sayi%10;
        sayi/=10;

        System.out.println(onbinler+"\n"+binler+"\n"+yuzler+"\n"+onlar+"\n"+birler);

    }
}
