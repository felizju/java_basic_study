package day05;

import java.util.Arrays;

public class ArrayBasic {
    public static void main(String[] args) {

        // 1. 배열 변수를 선언
        int[] points;

        // 2. 배열 객체의 생성
        points = new int[5]; // 주소를 리턴해줌

//        System.out.println("points = " + points);

        // 3. 배열 데이터 저장
        points[0] = 87;
        points[1] = 95;
        points[2] = points[0] + 3;
        points[3] = (int) 33.145;
        points[4] = 100;
//        points[5] = 100;

        // 4. 배열의 길이
        System.out.println("배열의 길이 : " + points.length);

        // 5. 배열의 반복문 처리
        int total = 0;
    /*    for (int i = 0; i < points.length; i++) {
            total += points[i];
        }
    */
        // 향상된 for 문
        for (int n : points) {
            total += n;
        }
        System.out.println("배열 데이터의 총합 : " + total);

        
        // 값 목록으로 배열 생성하기
        // new type[]을 생략할 수 있는 상황은 변수를 선언할 때 뿐임, 선언할 때는 생략할 수 있게 해줌.
        String[] foods = {"탕수육", "김치볶음밥", "짬뽕"};
        foods = new String[] {"오렌지", "자몽", "레몬"};
        System.out.println(foods.length);

        // 배열 내부값 한번에 출력하기 - Arrays.toString();
        System.out.println(Arrays.toString(foods));
        System.out.println(Arrays.toString(points));

        // 배열 값 초기화를 안하면 각 타입의 기본값이 저장됨
        double[] dArr = new double[4];
        System.out.println(Arrays.toString(dArr)); // 초기값 0.0

        boolean[] bArr = new boolean[6];
        System.out.println(Arrays.toString(bArr)); // 초기값 false

        String[] sArr = new String[2];
        System.out.println(Arrays.toString(sArr)); // 초기값 null

        // 배열의 주소 개념
        int[] iArr = {1, 3, 5, 7, 9, 11};
//        int[] copyArr = iArr;

        // 배열 복사 알고리즘
        int[] copyArr = new int[iArr.length];

        for (int i = 0; i < copyArr.length; i++){
            copyArr[i] = iArr[i];
        }

        copyArr[0] = 100;
        iArr[1] = -50;
        System.out.println("======================================");
        System.out.println("copy : "+Arrays.toString(copyArr));
        System.out.println("iArr : "+Arrays.toString(iArr));

    }
}
