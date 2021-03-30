package day12.exception;

public class TryCatchEx1 {

    public static void main(String[] args) {

        int n1 = 10, n2 = 0;
        System.out.println("나눗셈 시작!");

        try {
            // 예외 발생 가능성이 있는 코드를 예외처리
            // n2가 0일 가능성이 있음
            System.out.printf("%d / %d = %d\n", n1, n2, n1/n2);

        }catch (Exception e){
            // 예외 발생 시 실행할 코드를 기재
            System.out.println("0으로 나눌 수 없습니다.");
        }
        System.out.println("프로그램 정상 종료!");
    }
}
