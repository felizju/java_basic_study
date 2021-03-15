package day03;

public class BitOperator {
    public static void main(String[] args) {

        // 비트 연산
        byte a = 5; // 2진수로 변환 0000 0101
        byte b = 3; // 2진수로 변환 0000 0011

        // 비트 곱 : 각 자리수를 곱하기
        System.out.println(a & b); // 0000 0001 -> 1

        // 비트 합 : 각 자리수를 더하고 1+1은 1로 처리
        System.out.println(a | b); // 0000 0111 -> 7

        // 배타적 논리합 : 다르면 1
        System.out.println(a ^ b); // 0000 0110 -> 6

        // 비트 이동 연산
        int x = 192;
        System.out.println(x << 3); // 192 * 2의 3승
        System.out.println(x >> 3); // 192 * 2의 -3승

        // 비트 반전 (단항)
        int y = 8; // 0000 1000
        System.out.println(~y); // 1111 0111 (반전 후 1더하고 음수기호) -> 9


    }
}
