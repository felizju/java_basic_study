package day05;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearchQuiz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] members = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
        System.out.println("* 변경 전 정보 : "+ Arrays.toString(members));

        while(true) {
            System.out.println("수정할 멤버의 이름을 입력하세요.");
            System.out.print("> ");
            String name = sc.next();

            int idx;
            for (idx = 0; idx < members.length; idx++) {
                if (name.equals(members[idx])) {
                    break;
                }
            }
            if (idx < members.length) { // 찾아냄
                System.out.println(members[idx]+"의 별명을 변경합니다.");
                String newName = sc.next();
                members[idx] = newName;
                System.out.println("변경완료!");
                System.out.println("* 변경 후 정보 : " + Arrays.toString(members));
                break;
            } else {
                System.out.println(name + "은(는) 없는 이름 입니다.");
            }
        } // end while
    }
}
