package day08.company;

// juice 패키지 Banana 클래스 import
import day08.juice.Banana;

// java.util.* 모든 것들 사용 가능
import java.util.*;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Random;
//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        day08.company.Apple apple = new day08.company.Apple();
        day08.juice.Apple appleJuice = new day08.juice.Apple();

        // 패키지명을 따로 작성하고 싶지 않다면, 해당 패키지를 import 해주면 된다.
        Banana banana = new Banana();

        java.util.Scanner sc = new java.util.Scanner(System.in); // 원래 문법

        new ArrayList<String>();
        new HashMap<String, String>();
        new Random();

    }
}
