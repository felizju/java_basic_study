package day05;

import java.util.Arrays;
import java.util.Scanner;

public class Prac {
    public static void main(String[] args) {

        // 배열
        String[] members = {"기면주","적재","영광이"};
        Scanner sc = new Scanner(System.in);



/*        // 배열 삽입
        System.out.println("새 멤버 이름 : ");
        String newMember = sc.next();

        String[] temp = new String[members.length+1];
        for (int i = 0; i < members.length; i++) {
            temp[i] = members[i];
        }
        temp[temp.length-1] = newMember;
        members = temp;
        temp = null;

        System.out.println("등록 완료!");
        System.out.println(Arrays.toString(members));*/



/*        // 배열 삭제
        System.out.println("삭제 멤버 이름 : ");
        String deleteMember = sc.next();
        boolean contain = false;

        int deleteIdx;
        for (deleteIdx = 0; deleteIdx < members.length; deleteIdx++) {
            if(deleteMember.equals(members[deleteIdx])){
                contain = true;
                break;
            }
        }
        if(contain){
            for (int i = deleteIdx; i < members.length-1; i++) {
                members[i] = members[i+1];
            }
            String[] temp2 = new String[members.length-1];
            for (int i = 0; i < temp2.length; i++) {
                temp2[i] = members[i];
            }
            members = temp2; temp2 = null;
            System.out.println("삭제 완료!");
            System.out.println(Arrays.toString(members));
        }else{
            System.out.println("해당 멤버는 존재하지 않습니다.");
        }*/


/*        // 배열 찾기 & 배열 수정
        System.out.println("수정 멤버 이름 :");
        String searchMember = sc.next();

        // 찾기
        int searchIdx;
        for (searchIdx = 0; searchIdx < members.length; searchIdx++) {
            if(searchMember.equals(members[searchIdx])){
                break;
            }
        }

        // 수정
        if(searchIdx<members.length){
            System.out.println("변경 진행!");
            String modifyMember = sc.next();
            members[searchIdx] = modifyMember;
            System.out.println("변경 완료!");
            System.out.println(Arrays.toString(members));

        }else{
            System.out.println("해당 멤버는 존재하지 않습니다.");
        }*/



    }

}
