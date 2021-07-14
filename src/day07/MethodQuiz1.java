package day07;

public class MethodQuiz1 {


    static int calcDivisor(int n) {
        int total = 0; // 약수 총합
        // 약수 판별
        System.out.printf("%d의 약수 : ", n);
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                // 총합
                total += n;
                System.out.print(i+" ");
            }
        }
        System.out.println();
        return total;
    }

    public static void main(String[] args) {
        System.out.println("10의 약수의 총합 : "+calcDivisor(10));
        System.out.println("----------------------------------");
        System.out.println("30의 약수의 총합 : "+calcDivisor(30));
    }

}
