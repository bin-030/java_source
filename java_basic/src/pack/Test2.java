package pack;

public class Test2 {
	public static void main(String[] args) {
		// 주석 : 실행과는 무관. 설명을 달 경우 사용
		/*
		 여러 줄
		 주석
		 */
		String irum = "신기해";	// 주석 : 문자열을 변수에 기억
		System.out.print(irum);	// 계속 이어서 출력
		System.out.println(irum);	// 라인 스킵 후 출력
		System.out.print(irum);
		System.out.println();
		
		// 변수 : 값(데이터)을 저장할 수 있는 메모리 공간(새로운 값을 입력하면 덮어쓰기됨)
		// 변수명 : 변수에 대한 임의의 이름. 형식: 타입 변수명 = 리터럴(문자, 숫자 ...)
		// 상수 : 처음에 입력한 값이 계속 유지되는 메모리 공간
		
		// 변수 기본형 타입 : bcbsilfd
		// 기본형처럼 사용하는 참조형 변수 : String
		
		// byte type
		byte var1; // 1바이트(-128~ 127) 정수 기억장소
		var1 = 10;
		var1 = 5;
		System.out.println(var1);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		byte var2 = 123;	// 대입(치환) 연산자
		var2 = 127;
		System.out.println("var2:" + var2);
		
		System.out.println();
		// short type
		short var3 = 10;	// 2바이트(-32768 ~ 32767) 정수 기억장소
		System.out.println("var3:" + var3);
		
		System.out.println();
		// int type
		int var4 = 10;	// 4바이트(+- 약20억) 정수 기억장소
		var4 = 2147483647;
		System.out.println("var4:" + var4);
		
		System.out.println("행변환에 대해 ...");
		byte aa = 10;	// 자동 형변환함(promotion) (int 타입의 10을 byte type으로 자동 형변환 후 기억)
		aa = (byte)10; // 강제 형변환 (cast 연산자를 이용해 casting함)
		aa = (byte)200;
		aa = 5;
		int imsi = 7;
		byte bb = 7;
		byte cc = (byte)imsi;
		System.out.println("aa:" + aa);
		System.out.println("bb:" + bb);
		
		// long type
		long var5; // 8바이트 정수 기억장소
		var5 = 2147483648L;	// long type의 데이터
		var5 = 123L;
		System.out.println("var5:" + var5);
		
		System.out.println("실수에 대해 ...");
		float f1 = 3;	// 실수형 기억장소 (4byte) : 소수 이하 7자리 정밀도 보장
		// 정수는 실수로 자동 형변환 (promotion)
		// f1 =123.12;	err
		f1 = 123.12f;	// 123.123F	float type의 데이터
		f1 = (float)123.12;
		System.out.println("f1:" + f1);
		
		double d1 =123;	// 실수형 기억장소 (8byte) : 소수 이하 15자리 정밀도 보장
		d1 = 123.12;
		System.out.println("d1:" + d1);
		
		System.out.println();
		//int aa1 = 3.5;	err
		int aa1 = (int)3.7;	// 소수 이하는 버리고 정수만 기억
		System.out.println("aa1:" + aa1);
		
		int aa2 = 12 + (int)10.5;	// casting 되어 실수가 정수화 후 연산에 참여
		aa2 = (int)(12.6 + 10.5);	// 연산 우선이기 때문에 23
		aa2 = (int)10.5 + 12;
		aa2 = (int)10.5 + (int)12.6;	// casting 우선이기 때문에 22
		System.out.println("aa2:" + aa2);
		double aa3 = 12 + 10.5;	// 정수는 실수화 후 연산에 참여
		System.out.println("aa3:" + aa3);
		
		System.out.println("논리형(boolean, 참 또는 거잣 결과의 자료형)에 대해 ...");
		boolean bu1 = true;
		bu1 = false;
		// boolean bu1 한 블록에 중복 선언 안 됨
		System.out.println("bu1:" + bu1);
		
		System.out.println("문자형(char, 한 개의 문자 기억)에 대해 ...");
		// 'a' 문자 (작은 따옴표 사용) "ab" 문자열 (큰 따옴표 사용)
		// 문자열 = String (기본형 x, 참조형)
		char c1 = 'a';
		// c1 = "b" err	c1 ='ab' err
		System.out.println("c1:" + c1 + " " + (int)c1 + " " + (char)65);
		// Ascii 코드에서 'A'는 십진수 65, 'a'는 십진수 97, '0'은 십진수 48......
		
		System.out.println("안녕" + (char)10 + "반가워"); // ln을 빼면 엔터 1번, ln이 있으면 엔터 2번
		// (char)10, (char)13 둘 다 엔터 기능
		int abc = 0x0f; // 16진수(0x리터럴)를 10진술 int형으로 저장
		System.out.println("abc:" + abc + " " + Integer.toHexString(15));
		System.out.println("abc:" + abc + " " + Integer.toBinaryString(15));
		int abc2 = 007;	// 8진수(0리터럴)를 10진수 int형으로 저장
		System.out.println("abc2:" + abc2);
		
		System.out.println();
		final double PI = 3.14;	// 상수 (final로 입력 시엔 대문자로 표기)
		// PI = 5.6;	final을 넣으면 새로 오는 수치는 변수로 입력 불가. 이미 상수로 전환됨.
		System.out.println("PI:" + PI);
		
	}
}
