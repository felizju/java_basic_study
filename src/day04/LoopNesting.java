package day04;

public class LoopNesting {
    public static void main(String[] args) {

        int level = 2; //단수 지정
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d x %d = %d\n",i,j,i*j);
            }
            System.out.println("===================================");
        }


    }
}
