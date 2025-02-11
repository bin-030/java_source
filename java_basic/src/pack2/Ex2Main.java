package pack2;

public class Ex2Main {
	public static void main(String[] args) {
		Ex2Programmer programmer1 = new Ex2Programmer();
		System.out.println("보유 기술:" + programmer1.spec);
		programmer1.displayDate();
		
		programmer1.nickName = "웹 전문가";	// public 멤버필드이므로 외부에서 값을 수정 가능
		programmer1.spec = "1종 보통 운전 면허";	// default 멤버필드이므로 외부에서 값을 수정 가능
		programmer1.displayDate();
		
		// 캡슐화 된 멤버를 해당 클래스 밖에서 제어하기 : getter, setter
		// programmer1.age;	// 에러 : 접근 불가
		int nai = programmer1.getAge();	// public 메소드이므로 접근 가능
		System.out.println("programmer1 객체의 age:" + nai);
		programmer1.setAge(33);	// public 메소드 setter를 이용해 private 필드에 값을 전달
		System.out.println("programmer1 객체의 age:" + programmer1.getAge());
		programmer1.displayDate();
		
		programmer1.setAgeEx(55, 333);	// 참고
		System.out.println();
		
		System.out.println("static, final 관련 ---");
		System.out.println("motto:" + programmer1.motto);
		System.out.println("motto:" + Ex2Programmer.motto);	// static 멤버는 클래스명.멤버 형태로 접근
		// programmer1.WEIGHT는 final이므로 수정 불가. 참조만 가능.
		System.out.println("WEIGHT:" + programmer1.WEIGHT);
		System.out.println("PI:" + Ex2Programmer.PI);
		
		System.out.println("\n============");
		Ex2Programmer programmer2 = new Ex2Programmer();	// 세로운 객체 생성
		programmer2.displayDate();
		
		System.out.println("\n객체 변수가 참조하는 주소에 대해(참고)...");
		System.out.println(programmer1 + " " + programmer2);
		// pack2.Ex2Programmer@eed1f14       pack2.Ex2Programmer@7229724f
		System.out.println(programmer1.toString() + " " + programmer2.toString());
		System.out.println(programmer1.hashCode() + " " + programmer2.hashCode());
		
		System.out.println();
		System.out.println("--전문가가 만든 클래스 경험--");
		System.out.println(Integer.MAX_VALUE);
	}
}
/* 은닉화 : 불필요한 정보를 숨기는 것.	ex) private int age
   캡슐화 : 데이터와 메소드를 하나로 묶는 것. ex) private int getAge(){ return age }
   캡슐화는 은닉화를 구현하는 가장 기본적인 방법
 */