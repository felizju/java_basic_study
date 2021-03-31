package day13.exception;

public class AccMain {

    public static void main(String[] args) {

        Account account = new Account(1000);
        try {
            account.withDraw(50000);
        } catch (BalanceInsufficientException e) {
            // 개발 시 에러 로그 확인에 도움.
            e.printStackTrace(); // 에러 로그 보여줌.
        }
        System.out.println("잔액 : " + account.getBalance()); // 출금 안함.
        System.out.println("프로그램 정상 종료!"); // 정상 종료함.
    }
}
