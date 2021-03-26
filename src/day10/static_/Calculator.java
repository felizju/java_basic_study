package day10.static_;

public class Calculator {
    
    String madeBy; // 제조사
    String color; // 색상
    static double pi = 3.14; // 원주율

    Calculator(){
        pi = 3.14;
    }

    // 정적 초기화자(static initialize)
    // 정적 데이터의 초기값 세팅.
    static{
        System.out.println("정적 데이터 생성!");
        pi = 3.14;
    }

    // 메서드 내부에 인스턴스 필드(this)가 필요하면 non-static
    // 인스턴스 필드가 필요없으면 static
    void paint(String color){
        this.color = color;
    }
    
    // 원의 넓이를 구해주는 기능
    static double calcAreaCircle(int r){
        return pi * r * r;
    }


}
