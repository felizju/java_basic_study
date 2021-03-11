package day01;

public class DataType {
    public static void main(String[] args) {

        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        long d = 2147483648L; // 접미사 'L' 붙임.
        System.out.println("d = " + d);

        int i = 0;
        double n = 0.0;
        for (i = 0; i < 100; i++) {
            n += 0.1;
        }
        System.out.println("0.1을 100번 더한 결과" + n);

        float f1 = 3.74564654687521F; // 4byte - 접미사 'F' 붙임.
        double d1 = 3.7465468765415; // 8byte

        System.out.println(f1);
        System.out.println(d1);

    }
}
