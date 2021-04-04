package day13.exception;

public class Account {
    
    private int balance; // 잔액

    // 생성자
    public Account(int balance) {
        this.balance = balance;
    }

    // getter
    public int getBalance() {
        return balance;
    }

    // 출금 기능
    public void withDraw(int money) throws BalanceInsufficientException {
        if(balance < money){
            // throw : 발생시키다, 유발하다 (raise)
            throw new BalanceInsufficientException("잔액 부족!!");
        }
        this.balance -= money;
    }
}
