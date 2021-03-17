package day05;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsertQuiz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("# 먹고 싶은 음식을 입력하세요!!");
        System.out.println("# 입력을 중지하려면 <그만>이라고 입력하세요.");

        // 원본 배열 생성
        String[] foods = new String[0];
//        String[] foods = {}; // 빈 배열

        while(true){
            System.out.print("> ");
            String newFood = sc.next();

            if(newFood.equals("그만")) {
                System.out.println("입력종료!");
                sc.close();
                break;
            }
            
            // 원본 배열보다 사이즈가 1개 큰 배열 생성
            String[] temp = new String[foods.length + 1];
            
            // 원본 배열 데이터 복사하기
            for (int i = 0; i < foods.length; i++){
                temp[i] = foods[i];
            }
            // 추가 데이터 마지막에 저장하기
            temp[temp.length - 1] = newFood;

            // 기존 배열에 임시 배열 주소 저장
            foods = temp;

            // 임시 배열 null 저장
            temp = null;
        }// end while

        System.out.println("내가 먹고 싶은 음식들 : "+ Arrays.toString(foods));
    }
}
