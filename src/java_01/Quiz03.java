package java_01;

public class Quiz03 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                sum+= i;
                System.out.println(sum);
            }
        }
            System.out.println("2의 배수의 총합");
    }
}
