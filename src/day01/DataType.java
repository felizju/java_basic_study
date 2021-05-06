package day01;

public class DataType {
    public static void main(String[] args) {
        
        // 정수형 데이터타입
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
    
        // 실수형 데이터타입
        float f1 = 3.74564654687521F; // 4byte - 접미사 'F' 붙임.
        double d1 = 3.7465468765415; // 8byte

        System.out.println(f1);
        System.out.println(d1);

        // 논리형 데이터타입
        boolean b1 = true;
        boolean b2 = false;
//        boolean b3 = 0; // 0,1 값으로 논리형 분류 불가
//        boolean b4 = null;
//        boolean b5 = "true";
//        boolean b6 = True; // 대문자 True 불가

        // 문자형 데이터타입
        // char 타입은 문자 1개를 저장할 수 있는 타입, 홑따옴표로 저장
        char c1 = 'A';
        // String 타입은 문자열을 저장할 수 있는 타입, 곁따옴표로 저장
        // char 타입의 배열 형태 char value[];
        String s1 = "ABC";
        String s2 = "A";

        System.out.println("100"+"200");
        System.out.println(100+"200");  // 자동 형변환 : 문자열
//        System.out.println("200"-100); // 숫자와 문자열의 덧셈만 문자열 반환처리

    }
}
