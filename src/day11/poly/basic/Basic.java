package day11.poly.basic;

class A{}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}

public class Basic {

    A a = new A();
    B b = new B();
    C c = new C();

    // 모든 자식 객체는 부모의 타입으로 변환가능
    A ab = new B();
    A ac = new C();

    B bd = new D(); // 부모도 가능
    A ad = new D(); // 조상도 가능
    Object o1 = bd;

    C ce = new E();
    // 상속관계가 없으면 타입 변환 불가능
//    B be = new E();
//    D de = new E();

    public static void main(String[] args) {

        Basic b = new Basic();
        System.out.println(b.o1); // o1은 D


    }


}
