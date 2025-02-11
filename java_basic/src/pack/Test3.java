package pack;

public class Test3 {
	public static void main(String[] args) {
		// 산술 연산자
		int a = 5;	// =(대입연산자)의 기능 : a 변수에 리터럴 5를 기억시킴
		int b = 3;
		int c = a + b;
		
		System.out.println(c);
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);	// 나눗셈의 몫만 나옴
		System.out.println(a % b);	// 나눗셈의 나머지 값
		System.out.println(a / (double)b);	// 실수로 바꿨기 때문에 실수 연산. 몫과 나머지.
		
		System.out.println();
		// System.out.println(a / 0);	// 불가능 runtime error(실행 오류)
		System.out.println(a / 0.0);	// Infinity (무한대)
		System.out.println(a % 0.0);	// NaN(Not a number) 숫자가 아니라서 숫자로 표현할 수 없는 상태
		
		System.out.println("산술 연산자 우선 순위");
		System.out.println(3 + 4 * 5);
		System.out.println((3+4) * 5);
		
		System.out.println("문자열 더하기");
		String ss1 = "대한";	// String은 기본형이 아니라 참조형 변수임. 사용방법은 기본형과 같다.
		String ss2 = "민국";		
		System.out.println(ss1 + ss2);
		// System.out.println(ss1 - ss2);	// 문자열은 더하기만 가능
		System.out.println(ss2 + " " + 2025);	// 2005 정수는 문자열로 자동 형변환 후 문자열 더하기
		System.out.println(ss2 + " " + 2000 + 25);	// 전부 자동 형변환이 되기 때문에 문자열 더하기로 나열됨
		System.out.println(ss2 + " " + (2000 + 25));	// 괄호를 통해 우선 순위가 덧셈이 되었기 때문에 형변환이 일어나기 전에 계산됨.
		
		String ss3 = "5"+ 6;
		System.out.println("ss3:" + ss3);	// 따옴표를 사용해 문자열로 형변환 시켰기 때문에 문자열 덧셈이 이루어짐.
		
		System.out.println("5" + 6);
		System.out.println(5 + 6);
		System.out.println(Integer.toString(5) + 6);	// Integer.toString = " " 문자열 형변환이므로 "5" + 6
		System.out.println(Integer.parseInt("5") + 6);	// Integer.parseInt = Int로 해석하라는 뜻이므로 정수 5로 변환.
		
		System.out.println();
		System.out.println("누적");
		int no = 1;
		no = no + 1;
		no += 1;	// no -= 0 no *= 1, no /= 1
		no++;	// 증감 연산자 (후위)	no--;	계산 후에 늘어남
		++no;	// 증감 연산자 (전위)	--no;	계산 전에 늘어남
		// 증감 연산자는 계산엔 둘 다 참여 안 함. 독립적으로 사용함.
		System.out.println("no:" + no);
		
		System.out.println();
		int imsi = 5;
		int result = ++imsi + 1;
		System.out.println("result:" + result);
		System.out.println("imsi:" + imsi);
		
		int imsi2 = 5;
		int result2 = imsi2++ + 1;
		System.out.println("result2:" + result2);
		System.out.println("imsi2:" + imsi2);
		
		System.out.println();
		System.out.println("부호");
		int imsi3 = 7;
		System.out.println("imsi3:" + imsi3);
		System.out.println("imsi3:" + -imsi3);
		System.out.println("imsi3:" + (-1 * imsi3));
		int imsi4 = -1 * imsi3;
		System.out.println("imsi4:" + imsi4);
		// \n, \t, \b ... escape 문자 (char)13 or (char)10 과 동일하게 사용 가능
		// System.out.println(/n); < 명령어 안 괄호에도 사용 가능
		System.out.println("여기까지가 산술연산자" + (char)13 + "및 기타 \n연습 끝");
	}
}
