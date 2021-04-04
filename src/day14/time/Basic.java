package day14.time;

import java.time.*;

public class Basic {

    public static void main(String[] args) {
        // 날짜 정보 제어 : LocalDate.now()
        LocalDate curDate = LocalDate.now();
        System.out.println("현재 날짜 : " + curDate);

        // 임의의 날짜 생성 : LocalDate.of(년,월,일)
        LocalDate targetDate = LocalDate.of(2022,5,21);
        System.out.println("생성 날짜 : "+targetDate);

        // 시간 정보 제어 : LocalTime.now()
        LocalTime curTime = LocalTime.now();
        System.out.println("현재 시간 : " + curTime);

        // 임의의 시간 생성 : LocalTime.of(시,분,초)
        LocalTime targetTime = LocalTime.of(20,00,03);
        System.out.println("생성 시간 : "+targetTime);

        // 날짜와 시간 정보 제어 : LocalDateTime.now()
        LocalDateTime curDateTime = LocalDateTime.now();
        System.out.println("현재 날짜와 시간 : "+curDateTime);

        // 임의의 날짜와 시간 생성 : LocalDateTime.of(년,월,일,시,분,초)
        LocalDateTime targetDateTime = LocalDateTime.of(2022,3,5,20,00,03);
        System.out.println("생성 날짜와 시간 : " + targetDateTime);

        // 각 날짜와 시간정보 추출
        // 현재 년도 출력 : curDateTime.getYear()
        int year = curDateTime.getYear();
        System.out.println("year = " + year);

        // 현재 월 출력 : curDateTime.getMonth() - ex)APRIL (type:Month)
        //             curDateTime.getMonthValue() - ex)4 (type:int)
        Month month = curDateTime.getMonth();
        System.out.println("month = " + curDateTime.getMonth());
        int monthValue = curDateTime.getMonthValue();
        System.out.println("monthValue = " + monthValue);


        // 현재 요일 출력 : curDateTime.getDayOfWeek() - ex)MONDAY (type:DayOfWeek)
        DayOfWeek dayOfWeek = curDateTime.getDayOfWeek();
        System.out.println("dayOfWeek = " + dayOfWeek);

    } 
}
