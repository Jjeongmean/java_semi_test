package java_02.Quiz01;

public class Student {
    String name = "김철수"; //학생 이름
    int ban = 1; //반
    int no = 10; //번호
    int kor = 90; //국어점수
    int eng = 70; //영어점수
    int math = 85; //수학점수

    //생성자
    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    //메소드
    public void getTotal() {

    }

    public void getAverage() {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
