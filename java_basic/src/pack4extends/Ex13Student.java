package pack4extends;

public class Ex13Student extends Object{	// 모든 클래스는 Object를 상속 받음. 생략되어 있을뿐임.
	public String name;
	
	public Ex13Student() {
		name = "tom";
	}
	
	@Override
	public String toString() {
		System.out.println("원래 의미 싫어. 바꿀 거야");
		return "이 클래스의 사용자는 " + name;
	}
	
	// -----------------------------------(메인 클래스. 별개의 클래스)
	public static void main(String[] args) {
		Ex13Student student = new Ex13Student();
		System.out.println(student);
		System.out.println(student.toString());	// 위와 동일한 쓰임.
	}
}
