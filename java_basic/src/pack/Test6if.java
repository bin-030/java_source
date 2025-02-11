package pack;

import java.util.Scanner;

public class Test6if {

	public static void main(String[] args) {
		// 조건 판단문 if == ture? false?
		System.out.println("뭔가를 수행 후 if문 만나기");
		int num = 7;
		
		if(num >= 5) {	// 조건에 성립 안 할 경우 스킵함. 1줄 이상의 조건을 묶고 싶을 땐 중괄호 사용
			System.out.println("크구나");
			System.out.println("진짜로 크네");
		}
		
		System.out.println("계속1");
		
		if(num >=8) {	// 조건이 ture
			System.out.println("크구나");
			System.out.println("진짜로 크네");
		}else { // 조건이 false
			System.out.println("크지 않네");
		}
		
		System.out.println("계속2");
		System.out.println();
		int jumsu = 40;
		
		if(jumsu >= 70) {	// 다중 if
			if(jumsu >= 90) {
				System.out.println("우수");
			}else {
				System.out.println("보통");
			}
		}else {
			if(jumsu >=50) {
				System.out.println("저조");
			}else {
				System.out.println("매우 저조");
			}
		}
		
		System.out.println("계속3");
		System.out.println();
		int jumsu2 = 66;
		String result = "";
		
		if(jumsu2 >= 90) {
			result = "수";
		}else if(jumsu2 >= 80) {	
			result = "우";
		}else if(jumsu2 >= 70) {
			result = "미";
		}else if(jumsu2 >=60) {
			result = "양";
		}else {	// if(jumsu2 < 50) 생략 권장 (당연한 조건이라 필요 없음)
			result = "가";
			
		}
		System.out.println("평과 결과는 " + result);
		
		System.out.println("계속4");
		System.out.println();
		// 어느 공원의 입장료가 8세 이하, 65세 이상인 경우 무료.
		// 9세 이상 20세 미만인 경우 3000원
		// 그 외는 5000원
		int age = 19;
		if(age <= 8 || age >= 65) {
			System.out.println("무료");
		}
		if(age >= 9 && age < 20) {
			System.out.println("3000원");
		}
		if(age >= 20 && age < 65) {
			System.out.println("5000원");
		}
		
		int price = 0;
		if(age >= 9 && age < 20) {
			price = 3000;
		}else if(age >= 20 && age < 65) {
			price = 5000;
		}else {
			price = 0;
		}
		System.out.println("입장료는 " + price);
		
		System.out.println("계속5");
		System.out.println();
		System.out.println("야구장에 입장하기 : 인증 성공");
		String id = "kbs";
		String password = "ok123";
		
		// Scanner 쓰고 ctrl + space bar : 바로 import 적용됨.
		Scanner sca = new Scanner(System.in);
		System.out.print("id:");
		String inputId = sca.nextLine();
		System.out.println("pwd:");
		String inputPwd = sca.nextLine();
		
		// if(inputId == id && inputPwd == password) {	// 기본형 비교이므로 작동 실패함. 참조형은 equals 추가.
		if(inputId.equals(id) && inputPwd.equals(password)) {
			System.out.println("인증 성공");
		}else {
			System.out.println("인증 실패");
		}
		
	}

}
