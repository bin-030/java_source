package pack2;

import java.time.LocalDate;

public class Ex6MainSingleton {

	public static void main(String[] args) {
		Ex6Singleton ex1 = new Ex6Singleton();
		Ex6Singleton ex2 = new Ex6Singleton();
		System.out.println(ex1 + " " + ex2);	// 두 개의 객체변수(instance) 주소가 다름
		System.out.println(ex1.name + " " + ex2.name);
		ex1.name = "홍길동";
		System.out.println(ex1.name + " " + ex2.name);
		
		System.out.println("\n싱글톤 패턴을 적용...");
		Ex6Singleton my1 = Ex6Singleton.getInstance();
		Ex6Singleton my2 = Ex6Singleton.getInstance();
		System.out.println(my1 + " " + my2);
		System.out.println(my1.name + " " + my2.name);
		my1.name = "한국인";
		System.out.println(my1.name + " " + my2.name);
		
		System.out.println();
		LocalDate localDate = LocalDate.now();	// 싱글톤 패턴이 적용
		LocalDate localDate2 = LocalDate.now();	// static일 경우 글자에 기울임이 들어감.
		System.out.println(localDate.hashCode() + " " + localDate2.hashCode());
		System.out.println(localDate);
	}

}