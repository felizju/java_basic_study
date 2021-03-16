package day04;

public class ForQuiz {
    public static void main(String[] args) {

        int random = (int) (Math.random()*8)+2;

        System.out.println("-------------------------");
        System.out.println("랜덤 구구단 "+random+"단");
        System.out.println("-------------------------");

        for (int i = 1; i <= 9 ; i++) {
            System.out.println(random+"*"+i +" = "+ (random*i));
        }

    }
}
