package day08.modi.member.pac1;

public class E {

    E(){
        D d = new D();

        d.f1 = 1; // public
        d.f2 = 2; // default 같은 패키지라 접근 가능
//        d.f3 = 3; // private 같은 패키지라도 다른 클래스는 접근 불가능.
        
        d.m1();
        d.m2(); // default 같은 패키지라 접근 가능
//        d.m3(); // private 같은 패키지라도 다른 클래스는 접근 불가능.

    }

}
