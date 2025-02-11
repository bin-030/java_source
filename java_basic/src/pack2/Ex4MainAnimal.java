package pack2;

public class Ex4MainAnimal {

	public static void main(String[] args) {
		System.out.println("메소드 오버로딩 연습");
		Ex4Animal tiger = new Ex4Animal();
		tiger.display();
		tiger.display(3);
		tiger.display("호랑이");
		tiger.display(5, "호랑이");
		tiger.display("호돌이", 2);
		
		System.out.println();
		System.out.println("생성자 오버로딩 연습");
		Ex4Animal rabbit = new Ex4Animal("토끼", 4);
		rabbit.display();
		Ex4Animal hen = new Ex4Animal(2);
		hen.display(2, "닭");
	}
}
