package day03;

import java.util.Scanner;

public class ConditionalOperator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("돈을 입력하세요!");
        int money = scan.nextInt();
        scan.close();
        System.out.println("가진 돈 : " + money);

        String food = money > 5000 ? "육개장" : "라면";
        System.out.println("선택된 음식 : " + food);

    }
}
