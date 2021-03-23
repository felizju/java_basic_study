package day07;

import java.util.Arrays;

public class MethodBasic {

    // 리턴타입 메서드명 (매개변수타입 매개변수,parameter)
    static int calculateTotal(int n) {
        int total = 0;
        for(int i = 1; i <= n; i++){
            total += i;
        }
        return  total;
    }

    // String 메서드
    static String selectRandomFood() {
        String[] foods = {"김밥", "볶음밥", "오렌지", "닭강정", "귤"};
        return foods[(int)(Math.random()* foods.length)];
    }

    // 배열 메서드
    static int calcNumbersTotal(int... numbers) {
//  static int calcNumbersTotal(int[] numbers) {
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }

    // main함수
    public static void main(String[] args) {

        // 1 ~ n 까지의 총합을 구해주는 로직
        int result = calculateTotal(10);
        System.out.println("result = " + result);
        
        int result2 = calculateTotal(100);
        System.out.println("result2 = " + result2);

        System.out.println("food = " + selectRandomFood());

        System.out.println("----------------------------------");

        // 배열 메서드 호출 시 new int[] 생략 불가능.
        // 배열은 선언할 때만 new int[] 생략 가능함.
        int total = calcNumbersTotal(new int[]{10,20,30,100,200});
        System.out.println("total = " + total);
        
        int total2 = calcNumbersTotal(10,20,40,80,99);
        System.out.println("total2 = " + total2);
        System.out.println("----------------------------------");


        // 리턴이 없기 때문에 단독 함수로 작성해야함. 변수에 저장할 수 없음.
        sayHello("둘리");
        System.out.println("----------------------------------");

        int[] results = operateAll(20,5);
        System.out.println(Arrays.toString(results));
        
    }// end main
    
    
    
    
    
    // 사용자의 이름을 전달하면 인사를 출력해주는 함수
        // 리턴 타입이 없을 경우 : void
    static void sayHello(String userName) {
        System.out.println(userName+"님 안녕하세요.");
    }

    // 여러 값을 리턴하고 싶은 경우
    static int[] operateAll(int n1, int n2) {
        return new int[] {n1+n2, n1-n2, n1*n2, n1/n2};
        // 위에 리턴에서 함수가 끝나기 때문에 아래 코드는 작동하지 않음.
//        int a = 1;
    }


}// end class
