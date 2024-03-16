package chap6;

public class Person {
   //속성 :  이름, 나이, 성별, 학년
	String name;
	int age;
	String gender;
	int grade;
	
   //행위 : 속성값을 모두 출력
	
	void showInfo() {
		System.out.printf("이름 : %s, 나이 : %d, 성별 : %s, 학년 : %d%n ", name, age, gender, grade);
	}
	
}
