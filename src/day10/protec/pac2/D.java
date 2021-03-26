package day10.protec.pac2;

import day10.protec.pac1.A;

public class D extends A {


    protected D(String b) {
//        super(10); // default
        super("AA"); // protected

//        this.f1 = 10; // default
        this.f2 =  22; // protected

//        m1(); // default
        m2(); // protected


    }

}
