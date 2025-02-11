package pack2;

// method overloading : 클래스 내에 동일 이름의 메소드를 복수로 만듦
public class Ex4Animal {	// 동물이 가져야 할 속성(field)과 행위(method)를 클래스로 설계
	private int leg = 4;
	private int age;
	private String name;
	public final static int MOUTH = 1;	// final 대문자 표기, static으로 바로 생성, 값 고정.
	
	public Ex4Animal() {
		// 내용이 없는 생성자는 안 적으면 컴파일러가 자동으로 만들어 줌
		System.out.println("내용이 없는 생성자");
	}
	
	public Ex4Animal(int leg) {
		// 생성자 오버로딩
		this.leg = leg;
		System.out.println("정수 1개를 받는 생성자");
	}
	
	public Ex4Animal(String name, int age) {
		// 생성자 오버로딩
		this.name = name;
		this.age = age;
		System.out.println("2개의 매개변수가 있는 생성자");
	}
	
	public void display() {
		System.out.println("leg:" + leg + ", age:" + age + ", name:" + name);
	}
	
	// 오버로딩 성립 조건
	// 매개변수의 갯수, 순서, 타입이 다르면 성립
	public void display(int age) {	// 메소드 오버로딩
		// this.age = age;	// 지역 변수로 고정값 변경.
		System.out.println("leg:" + leg + ", age:" + age + ", name:" + name);
	}
	
	public void display(String name) {	// 메소드 오버로딩
		System.out.println("leg:" + leg + ", age:" + age + ", name:" + name);
	}
	
	public void display(int age, String name) {	// 메소드 오버로딩
		System.out.println("leg:" + leg + ", age:" + age + ", name:" + name);
	}
	
	public void display(String name, int age) {	// 메소드 오버로딩
		System.out.println("leg:" + leg + ", age:" + age + ", name:" + name);
	}
	
}	
	// 성립 안 되는 경우
	// public void display(int leg) {	// 같은 타입의 변수에는 적용 안 됨 (위에서 int age 적용)
		// System.out.println("leg:" + leg + ", age:" + age + ", name:" + name);

	// public void display(String name, int leg) {	// 같은 타입의 변수에는 적용 안 됨2
		// System.out.println("leg:" + leg + ", age:" + age + ", name:" + name);

	//private int display(int leg) {	// 메소드의 이름과 매개변수만 따지기 때문에, 앞의 내용이 바뀌어도 적용 불가.
		// System.out.println("leg:" + leg + ", age:" + age + ", name:" + name);
		// return 5;