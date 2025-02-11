package pack4extends;

public class Ex12Father extends Ex12GrandFa{
	private final int Nai = 50;	// nai 수정 불가, final은 대문자 표기.
	public String gabo = "청자 비슷한 물병"; // 부모의 멤버가 은닉화 됨.
	private int house = 1;
	
	public Ex12Father() {
		super();	// 부모 생성자 호출 (안 썼을 때도 매개변수가 없는 생성자가 생략되어 있음)
		System.out.println("아버지 생성자");
	}
	
	@Override // annotation (뭔가를 처리하는 기능)
	// 오버라이딩(override) (메소드 재정의) (덮어쓰기)
	public int getNai() {
		// int imsi = 0;	// 부모와 다른 코드를 적을 수 있다. 재정의.
		return Nai;	// 내용이 달라도 메소드 명이 같으면 오버라이딩.
	}
	
	@Override
	public void say() {
		String ss = "아버지 말씀 : 풀스택 개발자로 고~";
		System.out.println(ss);
	}
	
	public int getHouse() {
		return house;
	}
	
	public void showData() {
		String gabo = "맥북";
		System.out.println(gabo);
		System.out.println(this.gabo);
		System.out.println(super.gabo);
		
		say();
		this.say();
		super.say();
	}
}
