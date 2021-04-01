package day14.api.lang.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateManipulation {
    public static void main(String[] args) {

        LocalDate orderDate = LocalDate.now();

        LocalDate takeDate = orderDate.plusDays(3);
        System.out.println("주문 날짜 = " + orderDate);
        System.out.println("수령 예상 날짜 = " + takeDate);

        // Builder 패턴
        LocalDateTime targetTime1 = LocalDateTime.now().plusYears(1).plusMonths(10).plusHours(3);
        System.out.println("targetTime1 = " + targetTime1);
        LocalDateTime targetTime2 = LocalDateTime.now().minusYears(2).minusMonths(2).minusDays(10).minusMinutes(20);
        System.out.println("targetTime2 = " + targetTime2);

        // 축제 시작일, 종료일
        LocalDateTime startDate = LocalDateTime.of(2021, 3, 1, 0, 0, 0);
        LocalDateTime endDate = LocalDateTime.of(2021, 3, 31, 23, 59, 59);

        // 현재 시간
        LocalDateTime now = LocalDateTime.now();

        if(now.isBefore(endDate)){
            System.out.println("현재 진행 중인 행사입니다.");
        }else{
            System.out.println("종료된 행사입니다.");
        }

        // 날짜 연산 - 날짜 사이 갭 (뺄셈)
        long between = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("행사 진행 일 수  = " + between);

    }
}
