package day02;

public class Casting2 {
    public static void main(String[] args) {

        char c = 'B';   // ASCII Code = 66 (B)
        int i = 2;
        System.out.println(c + i); // 큰쪽인 int 타입으로 자동 변환

        char result = (char) (c + i);
        System.out.println("result = " + result); // char 타입에 명시적 변환

        char result2 = (char) (50000 + 60000);
        System.out.println("result2 = " + result2);

        // int 보다 작은 (byte, short, char)의 연산은 결과가 자동으로 int 로 변환
        byte b1 = 100;
        byte b2 = 110;
//        byte b3 = b1 + b2; // 더하면 byte 값 오버플로우
        System.out.println('A' + 'B');

        int n1 = 27;
        int n2 = 5;

        double res = (double) n1 / n2;
        System.out.println("res = " + res);

    }
}
