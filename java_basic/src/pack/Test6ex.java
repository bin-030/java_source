package pack;

import java.util.Scanner;

public class Test6ex {

	public static void main(String[] args) {
		/* 키보드로 상품명(String sang), 수량(int su), 단가(int dan)를 받아 아래와 같이 출력
		상품명 마우스는 금액 : 5000원이고 세금은 500원
		조건 : 금액(kum)은 수량 * 단가, 세금(sekum)은 금액이 5만원 이상이면 금액의 10%(*0.1), 3만원 이상이면 금액의 5%(*0.05), 나머지는 3%를 적용.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("상품명 입력:");
		String sang = sc.next();
		System.out.print("수량 입력:");
		int su = sc.nextInt();	// int를 받고 싶으면 nextInt
		System.out.print("단가 입력:");
		int dan = sc.nextInt();
		
		int kum = (su * dan);
		System.out.println("합계 :" + kum);
		
		double sekum = 500;
		if(kum >= 50000) {
			sekum = (int)(kum * 0.1);
			System.out.println("세금은 " + sekum + "입니다");
		}else if(kum >= 30000) {
			sekum = (int)(kum * 0.05);
			System.out.println("세금은 " + sekum + "입니다");
		}else {
			sekum = (int)(kum * 0.03);
			System.out.println("세금은 " + sekum + "입니다");
			
		System.out.println("상품명 " + sang + "는 금액:" + kum + "원이고 세금은 " + sekum + "원");
		}
		
		/* 정답 (조금 다른 방법)
		Scanner sc = new Scanner(System.in);
		System.out.print("상품명 입력:");
		String sang = sc.next();
		System.out.print("수량 입력:");
		int su = sc.nextInt();
		System.out.print("단가 입력:");
		int dan = sc.nextInt();
		
		int kum = su * dan;
		double sekum = 0.0;
		if(kum >= 50000) {
			sekum = kum * 0.1;
		}else if(kum >= 30000) {
			sekum = kum * 0.05;
		}else {
			sekum = kum * 0.03;
		}
		
		System.out.println("상품명 " + sang + "는(은) 금액: " + kum + "세금은" + sekum + "원");
		
		*/
	}
}
