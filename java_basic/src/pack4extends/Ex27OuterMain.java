package pack4extends;

public class Ex27OuterMain {

	public static void main(String[] args) {
		Ex27Outer outer = new Ex27Outer();
		outer.aa();
		outer.bb();
		
		// Inner inner = new Inner();	// 내부 클래스는 독립적인 객체 생성(new) 불가
		//Ex27Outer.Inner inner = outer.new Inner();	// 이렇게는 가능하나 비권장
		//inner.cc();
		
		System.out.println();
	}
}
