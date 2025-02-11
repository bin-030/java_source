package pack4extends;

public class Ex16MainDog {

	public static void main(String[] args) {
		Ex16Dog dog = new Ex16Dog("개");
		dog.print();
		System.out.println(dog.callName());
		
		System.out.println();
		Ex16HouseDog houseDog = new Ex16HouseDog("집개");
		houseDog.print();
		System.out.println(houseDog.callName());
		houseDog.show();
		
		System.out.println();
		Ex16WolfDog wolfDog = new Ex16WolfDog("늑대");
		wolfDog.print();
		System.out.println(wolfDog.callName());
		wolfDog.show();
		
		System.out.println("-----------");
		Ex16WolfDog bushdog = wolfDog;	// 주소를 치환 (타입이 같은 경우 치환 성공)
		wolfDog.print();
		bushdog.print();
		
		// promotion
		Ex16Dog dog2 = wolfDog;	// 주소를 치환 (타입이 다른데도 불구하고 치환 성공 - 자식의 주소를 부모 객체 변수에 주는 경우)
		dog2.print();	// 부모 메소드를 오버라이딩한 것만 호출 가능.
		// dog2.show();	// 오버라이딩이 아니기 때문에 호출 불가능. (자식 고유 메소드는 호출 불가능)
		// Ex16WolfDog hidog = dog2; // Type mismatch: cannot convert from Ex16Dog to Ex16WolfDog
		Ex16WolfDog hidog = (Ex16WolfDog)dog2;	// 같은 주소이지만 타입 미스 매치. // casting (부모 주소를 캐스팅했을 경우에만 자식에게 줄 수 있음. 그냥은 줄 수 없음.)
		hidog.print();
		
		System.out.println("-----------");
		Ex16Dog coyote = new Ex16Dog("코요테");	// 부모(super) 클래스
		coyote.print();
		System.out.println(coyote.callName());
		Ex16WolfDog wolfDog2 = new Ex16WolfDog("늑대2");	// Dog의 자식 클래스
		wolfDog2.print();
		wolfDog2.show();
		
		coyote = wolfDog2;	// promotion : 자식 객체 주소를 부모 객체변수에 치환
		coyote.print();		// 오버라이딩 된 메소드는 허용
		// coyote.show();	// 자식 고유 메소드는 호출 불가
		coyote.getName();	// 부모 메소드는 호출 가능
		
		Ex16WolfDog wolfDog3 = null;
		// wolfdog3.show();		// java.lang.NullPointerException
		wolfDog3 = wolfDog2;	// 타입이 같으므로 성공
		// wolfDog3 = houseDog;	// 타입이 다르므로 실패
		// wolfDog3 = coyote;	// 타입이 다르므로 실패. 하지만 부모 타입인 coyote 변수는 자식의 주소를 기억 중!
		wolfDog3 = (Ex16WolfDog)coyote;	// ★ 그러므로 casting을 통해 치환할 수 있다.
		wolfDog3.print();
	}
}
