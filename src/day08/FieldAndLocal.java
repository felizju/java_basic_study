package day08;

class Test{

    int fVar; // 필드 : 객체의 속성, 클래스 바로 아래 선언.
              // Heap영역 : 자동 초기화값 넣어줌.

    void methodTest(int param){ // 매개변수 : 메서드를 실행하기 위한 매개값 저장용도.
                                // 매개변수는 호출할 때 반드시 값을 줘야함.

        int local; // 지역변수 : 메서드 안에서만 사용하는 변수.
                  // 지역변수 값을 저장해서 내보내고 싶다면, return 값으로 내보내야함.

        System.out.println("fVar = " + fVar);
        System.out.println("param = " + param);
//        System.out.println("local = " + local);
    }

}


public class FieldAndLocal {
    public static void main(String[] args) {

        Test t =  new Test();
        t.methodTest(10);



    }

}
