package day13.api.lang.obj;

public class Member extends Object{

    String name;
    int age;
    String address;

    public Member(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

/*    public String toString(){
//        return "이름 : "+this.name+", 나이 : "+age+", 주소 : "+address;
    // return 할 때는 souf 불가능함. String.format으로 대체
    return String.format("이름 : %s, 나이 : %d, 주소 : %s", name, age,address);
    }*/

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
