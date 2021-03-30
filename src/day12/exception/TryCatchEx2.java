package day12.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchEx2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc = null;

        try {
            System.out.print("정수 1 : ");
            int n1 = sc.nextInt(); // warning

            System.out.print("정수 2 : ");
            int n2 = sc.nextInt(); // warning

            int divResult = n1 / n2; // warning
            System.out.println("divResult = " + divResult);

            sc.close();

        // 멀티 catch - 특정 Exception 을 지정해줘야 함.
        } catch (InputMismatchException e) { // 첫번째 catch
            System.out.println("정수만 입력해주세요!");

        }catch (ArithmeticException e){ // 두번째 catch
            System.out.println("0으로 나눌 수 없습니다!");

        }catch (Exception e){ // 모든 에러 잡을 수 있는 catch - 안전장치
            System.out.println("알 수 없는 예외상황입니다. 점검하겠습니다.");
        }
        System.out.println("프로그램 정상 종료!");
    }
}
