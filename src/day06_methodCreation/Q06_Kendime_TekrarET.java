package day06_methodCreation;

public class Q06_Kendime_TekrarET {
    public static void main(String[] args) {
         /*
           TASK  :
           Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method create ediniz.
           Test Data:
           input: "aabbcccccddddaaa"
           output: abcd
        */

        String cumle="aabbcccccddddaaa";
        System.out.println(araBul(cumle));
    }

    private static String araBul(String cumle) {
        String degistir="";
        for (int i = 0; i <= cumle.length()-1; i++) {
            if (!degistir.contains(cumle.substring(i,i+1))){
                degistir+=cumle.substring(i,i+1);
            }
        }
        return degistir;
    }
}
