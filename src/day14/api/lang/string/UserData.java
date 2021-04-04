package day14.api.lang.string;

import java.time.LocalDate;

public class UserData {

    private int birthYear; //4자리 출생연도
    private int month;
    private int day;
    private int age;
    private String gender;
    private char genderCode;

    public UserData(String ssn) {
        int[] birthData = makeBirthData(ssn);
        this.birthYear = birthData[0];
        this.month = birthData[1];
        this.day = birthData[2];
        this.age = makeAge(birthYear);
        this.gender = makeGender(genderCode);
    }

    //최종 유저 정보 출력
    public void printUserInfo() {
        System.out.printf("%d년생 %d월 %d일 %d세 %s\n"
                , this.birthYear, this.month, this.day, this.age, this.gender);
    }

    private String makeGender(char genderCode) {
        return (genderCode == '2' || genderCode == '4') ? "여자" : "남자";
    }

    //나이를 계산해서 만들어주는 메서드
    private int makeAge(int birthYear) {
//        return 2021 - birthYear + 1;
        return LocalDate.now().getYear() - birthYear + 1;
    }

    //생년월일 정보를 만들어주는 메서드
    private int[] makeBirthData(String ssn) {
        // 주민번호를 '-'로 나누어 splitSsn String[]에 저장
        String[] splitSsn = ssn.split("-");
        String first = splitSsn[0]; // splitSsn[0] : 주민번호 앞자리
        String second = splitSsn[1]; // splitSsn[1] : 주민번호 뒷자리
        this.genderCode = splitSsn[1].charAt(0);

        return new int[] {
                makeBirthYear(first, genderCode), // [0] : 년도
                Integer.parseInt(first.substring(2, 4)), // [1] : 월
                Integer.parseInt(first.substring(4, 6))  // [2] : 일
        };
    }

    //4자리 출생년도를 만들어주는 메서드
    private int makeBirthYear(String first, char genderCode) {
        String year = first.substring(0, 2);
        return (genderCode == '1' || genderCode == '2')
                ? Integer.parseInt("19" + year) : Integer.parseInt("20" + year);
    }

}