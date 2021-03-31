package day13.exception;

import java.util.Scanner;

class Basic {

    int number;

    public Basic(int n){

        try { // 예외 처리 당첨
            this.number = aaa(n);
        } catch (Exception e) {
            System.out.println("n에는 0을 전달할 수 없습니다.");
        }
    }
    
    public int aaa(int n) throws Exception { // 예외 던지기
        return bbb(n) / n;
    }
    public int bbb(int n) throws Exception { // 예외 던지기
        return ccc(n) / n;
    }
    public int ccc(int n) throws Exception { // 예외 던지기
        return 100 / n;
    }
}


public class ThrowsEx {

    public static void main(String[] args) {
        
        Basic basic = new Basic(0);
        System.out.println(basic.number);

        System.out.println("프로그램 종료!");

        new Scanner(System.in).nextInt();



    }
}
