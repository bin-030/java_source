package pack3;

public class Ex11Student {
	private String name;
	// private Ex11Book book = new Ex11Book(name, name);
	private Ex11Book book;	// 포함 관계 (아직 걕체 생성은 안 하고 null 상태인 book 변수 생성)

	public Ex11Student(String name, Ex11Book book) {
		this();	// 생성자는 다른 생성자를 호출할 수 있다.
		this.name = name;
		this.book = book;
	}
	
	public Ex11Student() {
		System.out.println("나는 생성자");
	}
	
	public Ex11Student(int kor) {
		System.out.println(kor + "을 받은 생성자");
	}
	
	public void showStudentDetail() {	// 학생 정보 출력
		System.out.println("학생 이름은 " + name);
		System.out.println("소유한 책은 " + book.getBookInfo());
	}
}
