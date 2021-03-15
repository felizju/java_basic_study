package day03;

public class LogicalOperator {
    public static void main(String[] args) {

        int x = 10, y = 20;

//        boolean result1 = (x != 10) & (++y == 21);  // false & true == false
//        boolean result2 = (x == 10) | (++y == 20);  // true | false == true

        boolean result3 = (x != 10) && (++y == 21);  // false && == false (왼쪽만 보고 판단)
        boolean result4 = (x == 10) || (++y == 20);  // true || == true (왼쪽만 보고 판단)

//        System.out.println("result1 = " + result1);
//        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        // y값이 22에서 20으로 변함, 왼쪽만 보고 판단하기 때문에 뒤에 조건 연산하지 않음
        // 속도는 빨라지지만, 실행해야 하는 조건이라면 &, | 로 바꿔서 작성해야 함.

    }
}
