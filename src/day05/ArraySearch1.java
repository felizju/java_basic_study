package day05;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] foods = {"치킨", "피자", "삼겹살", "족발"};

        System.out.print("찾을 음식 : ");
        String targetFood = sc.next();

        // 순차 탐색 알고리즘
        boolean containFood = false;

        int i;
        for (i = 0; i < foods.length; i++) {
            if(targetFood.equals(foods[i])){
                containFood = true;
                break;
            }
        }


        if(containFood){ // true
            System.out.println("해당 음식은 존재합니다.");

            // 인덱스 탐색
            System.out.println("찾은 음식의 인덱스 : " + i);

            // 수정 로직
            System.out.print("새로운 음식명 : ");
            foods[i] = sc.next();
            System.out.println("수정 후 음식 : "+ Arrays.toString(foods));
            
        }else{
            System.out.println("해당 음식은 없는 음식입니다.");
        }

    }
}
