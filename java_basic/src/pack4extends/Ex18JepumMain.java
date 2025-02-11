package pack4extends;

public class Ex18JepumMain {

	public static void main(String[] args) {
		// 추상 클래스는 스스로 객체 생성 불가. 자식의 생성자에 의해 객체 생성됨
		// Ex18Jepum jepum = new Ex18Jepum();	// Cannot instantiate the type Ex18Jepum
		Ex18Jepum jepum = null;
		
		Ex18JepumTv tv = new Ex18JepumTv();
		tv.volumeControl();
		tv.volumeShow();
		
		System.out.println();
		Ex18JepumRadio radio = new Ex18JepumRadio();
		radio.volumeControl();
		radio.volumeShow();
		
		System.out.println();
		Ex18JepumPhone phone = new Ex18JepumPhone();
		phone.volumeControl();
		phone.volumeShow();
		
		System.out.println();
		jepum = phone;
		jepum.volumeControl();
		jepum = radio;
		jepum.volumeControl();
		jepum = tv;
		jepum.volumeControl();
		
		System.out.println();
		Ex18Jepum j[] = {tv, radio, phone};
		for(Ex18Jepum jep:j) {
			jep.volumeControl();
		}
	}
}
