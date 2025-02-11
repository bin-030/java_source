package pack3;

public class Ex8MainHandle {	// 여러 개의 부품 클래스를 불러다가 완성차를 생산하기 위한 클래스
	int speed = 0;	// Ex8MainHandle의 고유 멤버
	String ownerName;	// Ex8MainHandle의 고유 멤버
	String turnShow;	// Ex8MainHandle의 고유 멤버
	
	// 클래스의 포함 관계 (has a)
	// 프로그램 유지 보수가 편함.
	// Ex8Handle handle = new Ex8Handle();	// 와부 클래스를 현재 클래스의 멤버처러 ㅁ사용하기 위함
	Ex8Handle handle;	// 생성자에 따라 객체 생성. 상위와 같이 기재 시 전체적으로 생성자에 입력됨.
	// 엔진, 타이어, 라이트 etc...를 클래스에 포함 관계로 호출해서 사용. 객체 지향적인 프로그래밍(oop) 철학.
	
	public Ex8MainHandle() {
		
	}
	
	public Ex8MainHandle(String ownerName) {
		this.ownerName = ownerName;
		handle = new Ex8Handle();
	}
	
	void driveTurnHandle(int q) {	// q : 회전량을 의미
		if(q > 0) turnShow = handle.rightTurn(q);
		if(q < 0) turnShow = handle.leftTurn(q);
		if(q == 0) turnShow = handle.straight(q);
	}
}
