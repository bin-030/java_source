package pack4extends;

/* 문제)
 - Vehicle 클래스는 모든 탈것의 공통 속성을 정의합니다. 
 - Car 클래스는 차량의 추가 속성인 연료 용량(fuelCapacity)을 다룹니다.
 - Bicycle 클래스는 자전거의 기어 수(gearCount)를 다룹니다.
 메서드 오버라이딩을 통해 각 클래스에서 describe() 메서드를 고유하게 정의합니다.

조건:
 Vehicle이라는 부모 클래스를 만들고, 이를 상속받는 Car와 Bicycle 클래스를 작성하세요.
 - Vehicle 클래스는 brand와 speed 필드를 가지며, 이를 설정하는 생성자를 작성하세요.
 - Vehicle 클래스에 describe() 메서드를 추가하여 "This is a vehicle"을 출력하세요.
 - Car 클래스는 fuelCapacity 필드를 추가하고, describe() 메서드를 오버라이드하여
   "This is a car of brand [brand] with a fuel capacity of [fuelCapacity] liters"를 출력하게 하세요.
 - Bicycle 클래스는 gearCount 필드를 추가하고, describe() 메서드를 오버라이드하여
    "This is a bicycle of brand [brand] with [gearCount] gears"를 출력하게 하세요.
 - Main 클래스에서 Car와 Bicycle 객체를 생성하고 describe() 메서드를 호출하세요.

출력 예:
This is a car of brand Kia with a fuel capacity of 50 liters
This is a bicycle of brand Giant with 21 gears */

public class Ex15Vehicle {
	protected String brand;
	protected int speed;
	
	public Ex15Vehicle(String brand, int speed) {
		this.brand = brand;
		this.speed = speed;
	}
	
	public void describe() {
		System.out.println("This is a vehicle");
	}
}
