package day04;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {

        int total = 0;
        int n = 0;

        Scanner sc = new Scanner(System.in);

        /*
        while(n != 0){
            // while의 시작 조건이 처음부터 false이므로 0회 반복됨.
            System.out.println("정수(0입력 시 종료):");
            n = sc.nextInt();
            total += n;
        }
       */
       do {
           // while : 선 조건판단 후 반복 - false이면 반복 0회
           // do-while : 선 반복 후 조건판단 - false라도 최소 반복 1회
            System.out.println("정수(0입력 시 종료) : ");
            n = sc.nextInt();
            total += n;
        }  while(n != 0);

        System.out.println("입력 누적 값 : " + total);
        sc.close();

    }
}
