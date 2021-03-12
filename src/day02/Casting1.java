package day02;

public class Casting1 {
    public static void main(String[] args) {

        // 묵시적 형변환, upcasting(promotion)
        byte a = 100;
        int b = a; // a가 byte -> int 자동 형 변환

        double c = b; // b가 int -> double 자동 형 변환
        System.out.println("c = " + c);

        // 명시적 형변환, downcasting
        int n = 1000;
        byte m = (byte) n;
        System.out.println("m = " + m);

        double d = 500.3333;
        int i = (int) d;
        System.out.println("i = " + i);




    }
}
