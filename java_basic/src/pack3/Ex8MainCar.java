package pack3;

public class Ex8MainCar {

	public static void main(String[] args) {
		// 새로운 자동차 객체 생성
		Ex8MainHandle tom = new Ex8MainHandle("미스터 톰");
		tom.driveTurnHandle(20);
		System.out.println(tom.ownerName + "의 회전량은 " + tom.turnShow + " " + tom.handle.quantity);
		// .이 두 개면 클래스의 포함 관계. handle 내의 quantity의 값을 불러오기.
		
		tom.driveTurnHandle(0);
		System.out.println(tom.ownerName + "의 회전량은 " + tom.turnShow + " " + tom.handle.quantity);
		
		Ex8MainHandle oscar = new Ex8MainHandle("오스카");
		oscar.driveTurnHandle(-10);
		System.out.println(oscar.ownerName + "의 회전량은 " + oscar.turnShow + " " + oscar.handle.quantity);
		
	}

}
