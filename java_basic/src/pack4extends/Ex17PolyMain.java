package pack4extends;

public class Ex17PolyMain {
	public static void main(String[] args) {
		Ex17PolyCar car1 = new Ex17PolyCar();
		Ex17PolyBus bus1 = new Ex17PolyBus();
		Ex17PolyTaxi taxi1 = new Ex17PolyTaxi();
		
		System.out.println();
		car1.displayData();
		System.out.println(car1.getSpeed());
		
		System.out.println();
		System.out.println("버스에 대해 ...");
		bus1.displayData();
		System.out.println(bus1.getSpeed());
		bus1.show();
		
		System.out.println("\n택시에 대해 ...");
		taxi1.displayData();
		System.out.println(taxi1.getSpeed());
		
		System.out.println("\n=====주소 치환=====");
		Ex17PolyCar car2 = new Ex17PolyBus();	// promotion // 자식의 주소 부모에게 치환
		car2.displayData();
		// car2.show();	// 불가능. 자식 고유의 메소드는 불러올 수 없음
		
		System.out.println();
		Ex17PolyCar car3 = taxi1;	// promotion
		car3.displayData();
		
		System.out.println("\n-----다형성-----");
		// Ex17PolyBus bus2 = new Ex17PolyCar(); // 불가능. 타입 미스 매치
		Ex17PolyBus bus2 = (Ex17PolyBus)car2;	// 부모 타입이지만 자식의 주소를 가지므로 casting 가능
		bus2.displayData();
		bus2.show();
		
		System.out.println();
		// Ex17PolyTaxi taxi2 = new Ex17PolyCar(); // 불가능. 타입 미스 매치.
		Ex17PolyTaxi taxi2 = (Ex17PolyTaxi)car3;
		taxi2.displayData();
		
		// Ex17PolyTaxi taxi3 = (Ex17PolyTaxi)car1; // ClassCastException (에러, 타입 미스 매치)
		
		System.out.println("\n^^^^^^^^^");
		Ex17PolyCar p[] = new Ex17PolyCar[3];	// Car 타입의 배열 선언
		p[0] = car1;
		p[1] = bus1;
		p[2] = taxi1;
		
		p[0].displayData();
		p[1].displayData();
		p[2].displayData();
		
		System.out.println();
		for(int i=0; i < p.length; i++ ) {
			p[i].displayData();
		}
		System.out.println();
		for(Ex17PolyCar car:p) {
			car.displayData();
		}
	}
}
