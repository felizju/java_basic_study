package day06;

import java.util.Arrays;
import java.util.Scanner;

public class Roulette {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("게임 인원 (2 ~ 4명) ==> ");

        // 총 참여인원
        int no = sc.nextInt();

        // 인원 수의 범위가 적당한지 판단
        if (no < 2 || no > 4) {
            System.out.println("인원 수가 바르지 않습니다. Game Over!");
            return;
        }

        // 플레이어 이름을 저장해 놓을 배열 - 크기는 참여인원만큼 설정
        String[] players = new String[no];

        System.out.println("\n플레이어 이름을 등록합니다.");

        // 참여 인원 수대로 이름을 반복 입력 받은 후 배열에 저장
        for (int i = 0; i < players.length; i++) {
            System.out.print((i + 1) + "번 플레이어 이름 : ");
            players[i] = sc.next();
        }

        // 주석주석
        // 주석주석

        System.out.println(Arrays.toString(players) + " 참가!");
        System.out.print("\n실탄 개수 (6 미만) ==> ");

        int bulletNum = sc.nextInt();

        // 탄창 배열을 만든다 (공간 6개)
        boolean[] magazine = new boolean[6];

        // 입력된 실탄 수만큼 배열 내부값을 랜덤으로 변경한다.
        int successCnt = 0; // 정확하게 총알 장전한 횟수
        while (successCnt < bulletNum) { // 총알이 모두 정해진 수 만큼 장전될 때까지 반복
            // 랜덤 실탄 위치 결정 (0~5)
            int position = (int) (Math.random() * magazine.length);
            if (magazine[position] == false) { // 만약에 실탄이 비어있다면
                magazine[position] = true; // 장전해라
                successCnt++; // 장전 횟수를 올려라
            }
        }
        System.out.println(Arrays.toString(magazine));


        // == 게임 시작 ==
        System.out.println("실탄을 넣고 탄창을 무작위로 돌립니다.");

            // 선턴 플레이어 랜덤 결정
        int turn = (int) (Math.random() * players.length);

        while (true) {
            System.out.println("총을 돌렸습니다. " + players[turn] + "부터 시작합니다.");
            System.out.println("[" + players[turn] + "의 턴!]");

            System.out.println("# 엔터를 누르면 격발합니다.");

            // 실탄의 위치 랜덤설정
            int random = (int) (Math.random() * 5) + 0;

            System.out.println(Arrays.toString(magazine));
            System.out.println(random);

            if (!magazine[random]) {
                System.out.println("휴... 살았습니다.");
                // 만약 마지막 인덱스라면, turn => 0, 아니면 turn ++
                if(turn == players.length-1) {
                    turn = 0;
                }else {
                    ++turn;
                }
            } else {
                System.out.println("빵!!! " + players[turn] + "사망...");
                return;
            }
        }//end while
    }
}
