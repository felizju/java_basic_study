package day11.overloading;

public class Basic {

    // 오버로딩
    // 메서드 이름은 똑같이 사용 가능. 매개변수 타입을 다르게 설정.
    // 타입이 같으면 중복해서 만들 수 없음. 리턴타입은 중요하지 않음.

    // typeCheck(String)
    void typeCheck(String s){
        System.out.println("문자열 1개가 들어옴!");
    }
    // typeCheck(int)
    void typeCheck(int i){
        System.out.println("정수 1개가 들어옴!");
    }
    // typeCheck(String, int)
    void typeCheck(String s, int i){
        System.out.println("문자열 1개, 정수 1개가 들어옴!");
    }
    // typeCheck(int, String)
    void typeCheck(int i, String s){
        System.out.println("정수 1개, 문자열 1개 들어옴!");
    }
    // typeCheck(String, String)
    void typeCheck(String s1, String s2){
        System.out.println("문자열 1개, 문자열 1개 들어옴!");
    }



    public static void main(String[] args) {
        Basic b = new Basic();
        b.typeCheck("dddd");
        b.typeCheck(10);
        b.typeCheck("aaa","bbb");

        System.out.println();

    }

}
