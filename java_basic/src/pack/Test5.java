package pack;

import java.util.Scanner;	// java.lang 이외의 파일들은 불러오기

public class Test5 {	// 논리 연산 주의점,,, 다시 확인

	public static void main(String[] args) {
		System.out.println("출발");
		// aa 묶음(메소드)을 호출. 반환 값이 void일 때
		boolean bbb = aa();	// 반환 값이 boolean일 때
		System.out.println(bbb);
		System.out.println("계속");
		
		System.out.println();
		// 논리 연산자 처리할 때 주의할 점
		boolean a = true, b = false, c;
		c = a || b;	// (or) 둘 중에 하나가 참이면 참.
		System.out.println("c는" + c);
		c = a && b;	// (and) 둘 다 참이어야만 참. 하나라도 거짓이면 거짓.
		System.out.println("c는" + c);
		
		System.out.println("\n*******");
		c = abc() || def();
		System.out.println("묶음 수행 후 c는(or)" + c);
		c = def() || abc();
		System.out.println("묶음 수행 후 c는(or)" + c);
		
		System.out.println("\n~~~~~~");
		c = abc() && def();
		System.out.println("보따리 수행 후 c는(and)" + c);
		c = def() && abc();
		System.out.println("보따리 수행 후 c는(and)" + c);
		
		System.out.println("\n~~모두 수행하기~~");	// |, & 기호 표시를 하나만 쓸 경우 모두 출력.
		c = abc() | def();
		System.out.println("묶음 수행 후 c는(or)" + c);
		c = def() | abc();
		System.out.println("묶음 수행 후 c는(or)" + c);
		
		c = abc() & def();
		System.out.println("보따리 수행 후 c는(and)" + c);
		c = def() & abc();
		System.out.println("보따리 수행 후 c는(and)" + c);
		
		System.out.println("\n\n좀 다른 이야기 실습 : 키보드(표준 입력 장치)로 값 받기");
		inputTest();
		
	}
	

	//  public static void aa() {	// 독립적(반복적)으로 실행되는 코드를 별도의 묶음으로 작성
		public static boolean aa() 	{	// aa 처리 후 돌아갈 때 boolean 값을 가지고 감. 반환값
			System.out.println("아자");
			return true;	// void를 제외한 나머지 명령어는 return을 필수 사용
		 }
		public static boolean abc() {
			System.out.println("abc 출력, 한 줄 수행했지만 abc는 여러 행으로 구성된다고 가정");
			return true;
		 }
		 
		 public static boolean def() {
			 System.out.println("def 출력");
			 return false;
		 }
		 
		 public static void inputTest() {
			 String ir = "손오공";
			 int nai = 22;
			 System.out.println(ir + "님의 나이는" + nai);
			 
			 System.out.println();
			 Scanner sc = new Scanner(System.in);
			 System.out.print("이름 입력:");	//ln을 떼면 옆에 입력 가능
			 String name = sc.next();
			 System.out.print("나이 입력:");
			 int age = sc.nextInt();
			 System.out.println(name + " 씨의 나이는 " + age);
		 }
	}