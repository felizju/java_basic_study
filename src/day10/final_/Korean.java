package day10.final_;

public class Korean {

    String name;
    // 상수 (원주율 같은 개념, 공통적으로 사용하고 변경되지 않는 것)
    static final String NATION = "대한민국"; // 국적
    final String ssn; // 주민번호

    Korean(String name, String ssn){
//        nation = "미국"; // final 변경할 수 없음.

        this.name = name;
        this.ssn = ssn;
    }

}
