package day13.exception;

// 사용자 정의 예외 클래스 - extends Exception 해줘야 함.
public class BalanceInsufficientException extends Exception{

    public BalanceInsufficientException(String message) {
        super(message);
    }

}
