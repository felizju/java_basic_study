package day05;

import java.util.Arrays;

public class ArrayInsert2 {
    public static void main(String[] args) {
        
        // 원본 배열
        int[] arr = {1, 3, 5, 7, 9, 11, 13}; // 배열 길이 : 7
                    //1,3,5,( 6 )7,9,11,13

        int newData = 6;

        System.out.println("삽입 전 : "+ Arrays.toString(arr));

//        arr[6] = arr[5];
//        arr[5] = arr[4];
//        arr[4] = arr[3];
//        arr[3] = newData;

        // 원본보다 +1 배열 생성
        int[] temp = new int[arr.length+1]; // 배열 길이 : 8
        
        // 추가할 인덱스 위치
        int insertIdx = 3;

        // 임시 배열에 복사
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        for (int j = temp.length-1; j > insertIdx; j--) {
            temp[j] = temp[j-1];
        }
        temp[insertIdx] = newData;

        arr = temp; temp = null;

        System.out.println("삽입 후 : "+Arrays.toString(arr));

    }
}
