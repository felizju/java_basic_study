package day05;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] members = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
        System.out.println("* 우리반 학생들의 별명 : "+ Arrays.toString(members));

        while(true) {
            System.out.println("- 삭제할 학생의 별명을 입력하세요!");
            System.out.print("> ");

            String alias = sc.next();
            boolean contain = false;

            int idx;
            for (idx = 0; idx < members.length; idx++) {
                if (alias.equals(members[idx])) {
                    contain = true;
                    break;
                }
            }
            if (contain) {
                System.out.println(alias + "의 별명을 삭제합니다.");

                for (int i = idx; i < members.length - 1; i++) {
                    members[i] = members[i + 1];
                }
                String[] temp = new String[members.length - 1];
                for (int i = 0; i < temp.length; i++) {
                    temp[i] = members[i];
                }
                members = temp;
                temp = null;

                System.out.println("* 삭제 후 정보 : " + Arrays.toString(members));
                break;
            } else {
                System.out.println("해당 별명(" + alias + ") 은 존재하지 않습니다.");
            }
        }//end while
    }
}
