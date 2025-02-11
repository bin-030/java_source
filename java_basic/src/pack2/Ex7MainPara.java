package pack2;

public class Ex7MainPara {

	public static void main(String[] args) {
		Person tom = new Person("한국인", 22);
		System.out.println("변경 전 이름:" + tom.name + " " + tom);
		System.out.println("tom 변수 기억 주소:" + tom);
		Person james;
		james = tom;
		System.out.println("james 변수 기억 주소:" + james);
		Person per = tom;
		System.out.println("per 변수 기억 주소:" + per);
		
		PersonService service = new PersonService();
		service.changeName(tom, "신나는");	// person 변수가 가진 주소를 전달
		System.out.println("변경 후 이름:" + tom.name + " " + tom);	// person 부분을 다른 걸로 변경해도 괜찮음. (변수의 임시명이기 때문)
	}

}
