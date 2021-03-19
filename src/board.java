import java.util.Arrays;
import java.util.Scanner;

public class board {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[][] board2dArr = new String[1000][4];
        int articleCount = 0; //총게시물수
        while (true){

            // 프로그램 메뉴
            System.out.println("====== [사용자] 게시판 프로그램 ======");
            System.out.println("# 1. 게시판 글 작성");
            System.out.println("# 2. 게시판 글 전체 보기");
            System.out.println("# 3. 게시판 글 수정");
            System.out.println("# 4. 게시판 글 삭제");
            System.out.println("# 5. 게시판 글 검색");
            System.out.println("# 0. 게시판 프로그램 종료");
            System.out.println("====================================");

            System.out.print("메뉴 입력 >> ");
            int menuNum = sc.nextInt();
            sc.nextLine();

            if(menuNum == 0) break;

            switch (menuNum){
                case 1:
                    // 1. 게시판 글 작성
                    System.out.println("# 게시판 글 등록을 시작합니다.");

                    String[] boardArr = new String[4];

                    System.out.print("- 글 번호 >> ");
                    String boardNum = sc.nextLine();

                    System.out.print("- 이름 >> ");
                    String userName = sc.nextLine();

                    System.out.print("- 글 제목 >> ");
                    String boardTitle = sc.nextLine();

                    System.out.print("- 글 내용 >> ");
                    String boardContent = sc.nextLine();

                    boardArr[0] = boardNum;
                    boardArr[1] = userName;
                    boardArr[2] = boardTitle;
                    boardArr[3] = boardContent;

                    board2dArr[articleCount++] = boardArr;

                    System.out.printf("%s님의 게시판 글이 정상 등록되었습니다.\n",userName);
                    System.out.println(Arrays.toString(boardArr));
                    break;

                case 2:
                    // 2. 게시판 글 전체 보기
                    System.out.println("전체 게시판 글 보기입니다.");
                    System.out.println(articleCount);
                    if(articleCount==0){
                        System.out.println("등록된 게시물이 없습니다.");
                    }else{
                        for (int i = 0; i <= articleCount; i++) {
                            for (int j = 0; j <= articleCount; j++) {
                                System.out.print(board2dArr[i][j]);
                            }
                            System.out.println();
                        }
                    }

                    break;
                case 3:
                    // 3. 게시판 글 수정

                    break;
                case 4:
                    // 4. 게시판 글 삭제

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
