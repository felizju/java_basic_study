package day10.party;

import day09.inherit.player.Player;

public class Main {

    public static void main(String[] args) {

        // 파티 생성
        Party party = new Party(3);
        
        // 파티원 추가
        party.addPlayer(new Player("전사맨뽀로로"));
        party.addPlayer(new Player("전사맨루피"));
        party.addPlayer(new Player("전사맨에디"));

        // 파티원 추방
        System.out.println("==============================");
        party.kickPlayer("전사맨에디");

        // 파티원 정보보기
        party.showPartiInfo();

    }
}
