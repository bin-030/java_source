package pack2;

/* 싱글톤 패턴이란?
객체의 인스턴스가 오직 1개만 생성되는 패턴을 의미한다.
메모리 절약, 데이터 공유가 편리 */

public class Ex6Singleton {
	int kor = 100;
	String name = "tom";
	
	public Ex6Singleton() {
		System.out.println("Ex6Singleton 생성자");
	}
	
	public void kbs() {
		System.out.println("kbs");
	}
	
	// 싱글톤 디자인 패턴
	private static Ex6Singleton singleton = new Ex6Singleton();
	// static 메소드는 static만 쓸 수 있음.
	
	public static Ex6Singleton getInstance() {	// getInstance라고 쓰는 걸 권장. 필수는 아니지만.
		return singleton;
	}
}
