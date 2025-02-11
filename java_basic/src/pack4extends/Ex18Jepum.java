package pack4extends;

// 전자제품 관련 부모 클래스	// 추상 클래스는 상속된 자식이 무조건 오버라이딩을 해야 함.
abstract public class Ex18Jepum {	// 전자제품이 공통으로 가져야 할 멤버 선언
	public int volume = 0;
	
	public Ex18Jepum() {
		System.out.println("Jepum 추상 클래스 생성자");
	}
	abstract public void volumeControl();	// 추상 메소드 {body가 없음)
		
	public void volumeShow() {
		System.out.println("소리 크기 : " + volume);
	}
}
