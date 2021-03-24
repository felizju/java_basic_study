package day08.compare;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student kim1 = new Student("김철수");
        System.out.print("이름 : ");
        String inputName = sc.next();

        System.out.println("kim1 = " + kim1.name);
        System.out.println("inputName = " + inputName);

        System.out.println(kim1.name == inputName); // false : == 변수 값을 비교, 변수 안에 저장된 주소를 비교함.
        System.out.println(kim1.name.equals(inputName)); // true : equals() 메서드로 변수 값 비교 후 true 면, 타입 비교 후 true 면, 길이 비교 후 문자 하나씩(인덱스) 반복문으로 비교함.
    }
}
