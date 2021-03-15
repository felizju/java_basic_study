package day03;

public class RandomEx {
    public static void main(String[] args) {

        double rn = Math.random();
        System.out.println("rn = " + rn);

        // 랜덤 정수 생성방법
        /*
            # 1 ~ 10사이의 랜덤 정수값 생성
                Math.random()                       -> 0.0 < ~ < 1.0
                Math.random() * 10                  -> 0.0 < ~ < 10.0
                (int) (Math.random() * 10)          -> 0 < ~ < 10
                (int) (Math.random() * 10) + 1      -> 0 < ~ < 11

            # 공식 x 이상 y 이하의 랜덤정수
                (int) (Math.random() * (y - x + 1)) + x
         */

        int rn2 = (int) (Math.random() * 10) + 1;
        System.out.println("rn2 = " + rn2);

    }
}
