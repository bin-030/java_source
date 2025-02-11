package pack2;
/* 문제 : 사람의 나이를 출력하는 메소드를 작성하세요.
   사람의 이름과 나이를 출력하는 printAge 메소드를 작성하세요.
   조건 :
   - 이름과 나이를 매개변수로 전달하면 "이름은 [이름]. 나이는 [나이]살입니다" 출력.
   - 이름만 전달하면 "이름은 [이름], 나이는 알 수 없습니다." 출력.
   - 매개변수가 없으면 "이름과 나이가 모두 없습니다." 출력.
 */

public class Ex4Exam2 {
	// 필드 (굳이 필요 없음)
	// private int age;
	// private String name;
	
	// 생성자 (생략 가능)
	public Ex4Exam2() {
		
	}
	
	// 메소드 (오버로딩) + 매개변수 이용
	public void printAge() {
		System.out.println("이름과 나이가 모두 없습니다.");
	}

	public void printAge(int age) {
		System.out.println("이름은 알 수 없습니다. 나이는 " + age + "살입니다.");
	}
	
	public void printAge(String name) {
		System.out.println("이름은 " + name + ". 나이는 알 수 없습니다.");
	}
	
	public void printAge(int age, String name) {
		System.out.println("이름은 " + name + ". 나이는 " + age + "살입니다.");
	}
}
