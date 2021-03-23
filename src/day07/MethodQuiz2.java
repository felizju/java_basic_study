package day07;

public class MethodQuiz2 {

    public static void main(String[] args) {
        int[] numbers = {57, 89, 78, 91 ,93, 47};
        double[] arrTotAvg = calcArrayTotal(numbers);
        System.out.printf("총점 : %d점, 평균 : %.2f점\n", (int)arrTotAvg[0], arrTotAvg[1]);

    }//end main

    static double[] calcArrayTotal(int... numbers){
        int total = 0;
        for (double n : numbers) {
            total += n;
        }
        double avg = (double) total / numbers.length;
        return new double[] {total,avg};
    }

}//end class
