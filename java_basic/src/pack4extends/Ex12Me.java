package pack4extends;

public final class Ex12Me extends Ex12Father{	// final로 인해 Me는 자식 클래스 생성 불가
	public Ex12Me() {
		System.out.println("내 생성자");
	}
	
	@Override
	public void say() {
		System.out.println("인생은 아름다워~~~");
	}
	
	public final void Biking() {	// Me의 자식 클래스는 Biking() override 불가
		System.out.println("자전거로 전국 일주");
	}
}

// me에서 super를 사용하면 father로 감. 다이렉트로 grandfa에게 갈 수 없음.
