package pack4extends;

public class Ex17PolyTaxi extends Ex17PolyCar{
	private int passenger = 2;

	public Ex17PolyTaxi() {
		// super(); // 생략되어 있음
		System.out.println("난 Car의 자식인 Taxi 생성자입니다");
	}
	@Override
	public void displayData() {
		String msg = "택시 안에 몇 명이 타고 있니? " + passenger + "명";
		System.out.println(msg);
	}
}
