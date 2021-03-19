package day05;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMember {
    public static void main(String[] args) {

        String[] members = new String[0];

        Scanner sc = new Scanner(System.in);

    while(true) {
            System.out.println("===== 멤버 관리 시스템 =====");
            System.out.println("# 1. 멤버 등록");
            System.out.println("# 2. 멤버 수정");
            System.out.println("# 3. 멤버 삭제");
            System.out.println("# 4. 멤버 조회");
            System.out.print(">> ");
            int menuIdx = sc.nextInt();


            switch (menuIdx) {
                case 1:
                    // 멤버 등록
                    System.out.println("===== 멤버 등록 =====");
                    System.out.println("추가할 멤버의 이름을 입력하세요.");

                    System.out.print(">> ");
                    String newMember = sc.next();

                    String[] temp = new String[members.length + 1];

                    for (int i = 0; i < members.length; i++) {
                        temp[i] = members[i];
                    }
                    temp[temp.length - 1] = newMember;
                    members = temp; temp = null;

                    System.out.println("등록이 완료되었습니다.");
                    System.out.println(">> 회원 정보 : " + Arrays.toString(members));
                    break;

                case 2:
                    // 멤버 수정
                    System.out.println("===== 멤버 수정 =====");

                    System.out.println("수정할 멤버의 이름 입력");
                    System.out.print(">> ");
                    String name = sc.next();

                    int searchIdx;
                    for (searchIdx = 0; searchIdx < members.length; searchIdx++) {
                        if (name.equals(members[searchIdx])) {
                            break;
                        }
                    }
                    if (searchIdx < members.length) {
                        System.out.println(members[searchIdx] + "의 이름을 변경하시겠습니까?");
                        System.out.println("새로운 이름을 입력해주세요.");
                        String newName = sc.next();
                        members[searchIdx] = newName;
                        System.out.println("변경 완료되었습니다.");
                        System.out.println(">> 회원 정보 : " + Arrays.toString(members));

                    } else {
                        System.out.println(name + "은(는) 없는 정보입니다.");
                    }


                    break;
                case 3:
                    // 멤버 삭제
                    System.out.println("===== 멤버 삭제 =====");

                    System.out.println("삭제할 멤버의 이름 입력");
                    System.out.print(">> ");
                    String deleteName = sc.next();

                    boolean check = false;
                    int deleteIdx;
                    for (deleteIdx = 0; deleteIdx < members.length; deleteIdx++) {
                        if(deleteName.equals(members[deleteIdx])){
                            check = true;
                            break;
                        }
                    }
                    if(check){
                        System.out.println(deleteName+"의 정보를 삭제합니다.");

                        for (int i = deleteIdx; i < members.length -1; i++) {
                            members[i] = members[i+1];
                        }
                        String[] temp2 = new String[members.length-1];
                        for (int i = 0; i < temp2.length; i++) {
                            temp2[i] = members[i];
                        }
                        members = temp2; temp2 = null;
                        System.out.println("삭제 완료되었습니다.");
                        System.out.println(">> 회원 정보 : " + Arrays.toString(members));

                    } else {
                        System.out.println(deleteName + "은(는) 없는 정보입니다.");
                    }

                    break;
                case 4:
                    // 멤버 조회
                    System.out.println("===== 멤버 조회 =====");
                    System.out.println(Arrays.toString(members));
                    break;
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다.");
                    break;
            }

        }
    }
}
