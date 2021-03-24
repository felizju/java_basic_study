package day08.modi.member.pac2;

import day08.modi.member.pac1.D;

public class F {

    F(){
        D d = new D();
        d.f1 = 1;
//        d.f2 = 2; // default - 패키지 다름.
//        d.f3 = 3; // private - 클래스 & 패키지 모두 다름.

        d.m1();
//        d.m2(); // default
//        d.m3(); // private

    }

}
