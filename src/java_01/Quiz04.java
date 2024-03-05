package java_01;

public class Quiz04 {
    public static void main(String[] args) {
        int i = 2, a = 1;
        for (i = 2; i <= 9; i++) {
            for (a = 1; a <= 9 ; a++) {
                System.out.println(i+"*"+a+"="+i*a);
            }
            System.out.println();
        }
    }
}
