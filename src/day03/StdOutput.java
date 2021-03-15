package day03;

public class StdOutput {
    public static void main(String[] args) {

        String dog = "멍멍이";
        String cat = "야옹이";

        System.out.print(dog + "\n");
        System.out.println(cat);

        String filePath = "D:\\temp\\new.jpg";
        System.out.println(filePath);

        String msg = "he said \"warning!\" to me";
        System.out.println(msg);

        int month = 4;
        int day = 5;
        String anni = "식목일";

        System.out.println(month + "월 " + day + "일은 " + anni + "입니다.");
        System.out.printf("%d월 %d일은 %s입니다.\n",month,day,anni);
        // printf 는 개행 안함.
        System.out.println("야호");

        // %f 는 기본적으로 소수점이하 6자리까지 강제로 표현함.
        double saleRate = 0.2512;
        System.out.printf("할인율은 %.2f%%입니다.", saleRate * 100);


        

    }
}
