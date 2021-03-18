package day06;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {

        // 2차원 배열
        // 배열을 값 목록으로 생성
        int[][] arr2d = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println("arr2d.length : "+arr2d.length);
        System.out.println(Arrays.toString(arr2d[1]));
        System.out.println(Arrays.toString(arr2d[2]));

        int[] temp = arr2d[2];
        System.out.println(arr2d[2][0]);

        int number = arr2d[2][2];
        System.out.println(number);

        System.out.println("==============================");

        arr2d[1][1] = 0;
        arr2d[2] = new int[]{10,20,30};

        for(int[] arr : arr2d){
            for(int n : arr){
                System.out.print(n+" ");
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(arr2d));
        System.out.println(arr2d[1]);

        // 배열 생성문으로 배열 생성
        int[][] testArr = new int[4][5];
        for(int[] ints : testArr){
            for (int n : ints){
                System.out.print(n+" ");
            }
            System.out.println();
        }

        // 3차원 배열
        int[][][] arr3d = {
                {
                        {1,2,3},
                        {4,5,6}
                },
                {
                        {7,8,9},
                        {10,11,12}
                },
                {
                        {13,14,15},
                        {16,17,18}
                }
        };
        System.out.println("arr3d.length : "+arr3d.length);
        System.out.println(arr3d[2][0][2]);

        for(int[][] arr2 : arr3d){
            for (int[] arr1 : arr2){
                for(int n : arr1){
                    System.out.print(n+" ");
                }
                System.out.println();
            }
        }


    }
}
