package team;

import java.util.Arrays;
import java.util.Scanner;

public class board {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[][] boardArr = new String[1000][4];
        int boardCount = 0; // 총 게시물 수

        while (true){

            // 프로그램 메뉴
            System.out.println("====== [사용자] 게시판 프로그램 ======");
            System.out.println("# 1. 게시판 글 작성");
            System.out.println("# 2. 게시판 글 전체 보기");
            System.out.println("# 3. 게시판 글 수정");
            System.out.println("# 4. 게시판 글 삭제");
            System.out.println("# 5. 게시판 글 검색");
            System.out.println("# 6. 게시판 프로그램 종료");
            System.out.println("====================================");

            System.out.print("메뉴 입력 >> ");
            int menuIdx = sc.nextInt();
            sc.nextLine();

            if(menuIdx == 6) break;

            switch (menuIdx){
                case 1:
                    // 1. 게시판 글 작성
                    System.out.println("# 게시판 글 등록을 시작합니다.");

                    String[] board = new String[4];

                    System.out.print("- 글 번호 >> ");
                    String boardNum = sc.nextLine();

                    System.out.print("- 이름 >> ");
                    String userName = sc.nextLine();

                    System.out.print("- 글 제목 >> ");
                    String boardTitle = sc.nextLine();

                    System.out.print("- 글 내용 >> ");
                    String boardContent = sc.nextLine();

                    board[0] = boardNum;
                    board[1] = userName;
                    board[2] = boardTitle;
                    board[3] = boardContent;

                    boardArr[boardCount++] = board;

                    System.out.printf("%s님의 게시판 글이 정상 등록되었습니다.\n",userName);
                    System.out.println(Arrays.toString(board));
                    break;

                case 2:
                    // 2. 게시판 글 전체 보기
                    System.out.println("전체 게시판 글 보기입니다.");
//                    System.out.println(boardCount);
                    if(boardCount == 0){
                        System.out.println("등록된 게시물이 없습니다.");
                    }else{
                        for (int i = 0; i < boardCount; i++) {
                            System.out.printf("글 번호 : %s | 작성자 : %s | 제목 : %s | 내용 : %s \n"
                                    ,boardArr[i][0],boardArr[i][1],boardArr[i][2],boardArr[i][3]);
                        }
                    }

                    break;
                case 3:
                    // 3. 게시판 글 수정
                    if(boardCount == 0){
                        System.out.println("등록된 게시물이 없습니다.");
                    }else {
                        System.out.println("수정할 글 번호를 입력해주세요.");
                        String modifyIdx = sc.next();
                        System.out.print(">> ");

                        for (int i = 0; i < boardCount; i++) {
                            if(modifyIdx.equals(boardArr[i][0])){
                                System.out.printf("글 번호 : %s | 작성자 : %s | 제목 : %s | 내용 : %s \n"
                                        ,boardArr[i][0],boardArr[i][1],boardArr[i][2],boardArr[i][3]);

                            }
                        }

                    }

                    break;
                case 4:
                    // 4. 게시판 글 삭제
                    if(boardCount == 0){
                        System.out.println("등록된 게시물이 없습니다.");
                    }else{
                        System.out.println("삭제할 글 번호를 입력해주세요.");
                        String deleteIdx = sc.next();
                        System.out.print(">> ");

                        for (int i = 0; i < boardCount; i++) {
                            if(boardArr[i][0].equals(deleteIdx)){
                                // 삭제할 글 번호가 입력한 번호와 일치할 때
                                System.out.printf("글 번호 : %s | 작성자 : %s | 제목 : %s | 내용 : %s \n"
                                        ,boardArr[i][0],boardArr[i][1],boardArr[i][2],boardArr[i][3]);
                                System.out.println("해당 게시물을 정말로 삭제하시겠습니까? Y/N ");
                                System.out.print(">> ");

                                String deleteMenu = sc.next();
                                if(deleteMenu.equals("Y")){
                                    // 삭제 게시물 배열에서 삭제
                                    for (int j = i; j < boardArr.length-1; j++) {
                                        boardArr[i] = boardArr[i+1];
                                    }
                                    String[][] temp = new String[boardArr.length-1][];
                                    for (int j = 0; j < temp.length; j++) {
                                        temp[i] = boardArr[i];
                                    }
                                    boardArr[i] = temp[i]; temp[i] = null;

                                    // 총 게시물 수 감소
                                    boardCount--;

                                    System.out.println(boardCount);
                                    System.out.println("삭제 완료되었습니다.");
                                    for (int k = 0; k < boardCount; k++) {
                                        System.out.printf("글 번호 : %s | 작성자 : %s | 제목 : %s | 내용 : %s \n"
                                                ,boardArr[k][0],boardArr[k][1],boardArr[k][2],boardArr[k][3]);
                                    }

                                }else{
                                    System.out.println("삭제가 취소되었습니다.");
                                }
                                break;
                            }

                        }

                    }

                    break;
                case 5:
                    // 4. 게시판 글 검색
                    break;
                case 6:
                    break;
                default:
                    System.out.println("잘못된 메뉴를 입력하셨습니다. 프로그램을 종료합니다.");
                    break;

            }
        }

    }
}
