package day01;

public class Variable {
    public static void main(String[] args) {
        
        // 변수 선언
        // 정수 저장하는 데이터타입 : int
        int number = 20;
//        int point = 78.9; // 선언 타입이 다르면 저장 불가함

        number = 70;
        System.out.println("number = " + number);

        //        int tripleNumber = number * 3;
        //        System.out.println("tripleNumber = " + tripleNumber);
        //
        //        // 문자열 저장하는 데이터타입 : String
        //        String name = "김철수";
        //        System.out.println("name = " + name);
        //
        //        // 변수의 범위 : 변수는 선언된 블록을 벗어나면 메모리에서 제거됨.
        int n1 = 1, n2 = 2;

        if(true){
            int n3 = n1+n2;
//            int n3 = 10; // 같은 이름 변수 불가능

        }// end if
        int n3 = 10; // if 끝난 후 사용 가능
//      System.out.println(n3); n3의 범위는 if 범위까지만 사용 가능함


    }// end main
}// end class