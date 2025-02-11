package pack5;

import java.io.FileReader;

// 예외 처리 : 키보드 입력, 파일 입출력, 네트워크, DB 처리 등 외부 장치와 연결해 사용하는 경우
// 예기지 못한 장치 에러가 발생할 수 있는데 이를 방지할 목적으로 사용
// 형식 : try{ } catch{ } finally {} <== 에러를 내가 잡아 예외를 처리
// throws 로 예외를 JVM에게 던저버릴 수도 있다.

public class Ex31Try {
	public String name = "tom";
	
	public void test() {
		try {
			int a [] = {1, 2, 3};
			// System.out.println("배열 값 출력 : " + a[1]);
			System.out.println("배열 값 출력 : " + a[5]);
			
		} catch (Exception e) {
			System.out.println("배열오류 - 지역이 우선함 " + e);
		}
	}
	
	public void test2() throws Exception{
		FileReader fr2 = new FileReader("c:/work/kbs.txt");
	}
	
	public static void main(String[] args) {
		try {
			// 파일 작업은 강제로 예외 처리를 요구
			// aa.txt가 없는 경우에만 catch 블럭을 수행
		FileReader fr = new FileReader("c:/work/aa.txt");
		
		} catch (Exception e) {
			System.out.println("파일 읽기 오류");
		}
		
		try {
		// int su = 0; // 키보드로 변수값을 기억한다고 가정
		int su = 2;
		int result = 10 / su;
		System.out.println("result : " + result);
		
		Ex31Try ex31try = new Ex31Try();
		// Ex31Try ex31try = null;
		System.out.println("이름은 " + ex31try.name);
		
		ex31try.test();
		
		ex31try.test2();
		} catch (ArithmeticException e) {
			System.out.println("나누기 오류 : 0으로 나누기 불가");
		} catch (NullPointerException hi) {
			System.out.println("참조 변수 오류(변수가 주소를 참조하지 않네요) " + hi);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 참조 에러:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("위 catch 이외의 나머지 모든 오류는 여기서 처리");
			// Exception을 가장 먼저 적으면 모든 예외처리는 Exception 블럭에서 처리
		} finally {
			System.out.println("에러 유무에 상관없이 반드시 수행");
			
		}
		System.out.println("프로그램 종료");
	}
}