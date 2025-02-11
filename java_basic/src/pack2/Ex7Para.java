package pack2;

// 매개변수로 기본형뿐만 아니라 참조형도 가능

class Person{	// 별개의 클래스 (편의상 같이 만들어둠. 원래는 따로 만들어야 함.)
	String name;
	int age;
	
	public Person(String name, int age) {	// String name:참조형, int age:기본형
		this.name = name;
		this.age = age;
	}
}

class PersonService{
	public PersonService() {
		
	}
	
	public void changeName(Person person, String newName) {
		person.name = newName;
	}
}
public class Ex7Para {
	
}
