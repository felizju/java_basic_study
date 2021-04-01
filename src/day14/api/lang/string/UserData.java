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
                , birthYear, month, day, age, gender);
    }

    private String makeGender(char genderCode) {
        return (genderCode == '2' || genderCode == '4') ? "여자" : "남자";
    }

    //나이를 계산해서 만들어주는 메서드
    private int makeAge(int birthYear) {
        return LocalDate.now().getYear() - birthYear + 1;
    }

    //생년월일 정보를 만들어주는 메서드
    private int[] makeBirthData(String ssn) {
        String[] splitSsn = ssn.split("-");
        String first = splitSsn[0];
        this.genderCode = splitSsn[1].charAt(0);

        return new int[] {
                makeBirthYear(first, genderCode),
                Integer.parseInt(first.substring(2, 4)),
                Integer.parseInt(first.substring(4, 6))
        };
    }

    //4자리 출생년도를 만들어주는 메서드
    private int makeBirthYear(String first, char genderCode) {
        String year = first.substring(0, 2);
        return (genderCode == '1' || genderCode == '2')
                ? Integer.parseInt("19" + year) : Integer.parseInt("20" + year);
    }

}