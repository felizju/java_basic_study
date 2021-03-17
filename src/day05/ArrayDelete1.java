package day05;

import java.util.Arrays;

public class ArrayDelete1 {
    public static void main(String[] args) {

        // 배열의 끝 데이터 삭제
        int[] arr = {10, 20, 30, 40};

        int[] temp = new int[arr.length-1];

        for(int i=0; i<arr.length-1; i++){
            temp[i] = arr[i];
        }
        arr = temp;
        temp = null;
        System.out.println(Arrays.toString(arr));

    }
}
