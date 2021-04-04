package day08.player;

public class Main {
    public static void main(String[] args) {

        Player lee = new Player(); // 1번 생성자
        System.out.println("====================================");

        Player kim = new Player("김철수"); // 2번 생성자
        System.out.println("====================================");

        Player park = new Player("박영희", 20); // 3번 생성자
        System.out.println("====================================");

        lee.info();
        kim.info();
        park.info();

//        System.out.println("kim의 주소 값 = " + kim);
//        System.out.println("park의 주소 값 = " + park);

//        kim.attack(park);
//        kim.attack(new Player("고길동"));
//        new Player("둘리").attack((new Player("도우너")));

//        kim.info();


    }
}
