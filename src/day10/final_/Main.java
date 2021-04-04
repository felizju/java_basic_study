package day10.final_;

public class Main {

    public static void main(String[] args) {

        Korean kim = new Korean("김철수", "123456-1234567");
        kim.name = "김말종";
//        kim.nation = "미국";
        // ssn - final이기 때문에 변경할 수 없음.
//        kim.ssn = "123456-444444";
    }

}
