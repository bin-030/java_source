package pack;

import java.util.Scanner;
public class 복습 {

	public static void main(String[] args) {
		inputTest();
	}
	
	public static void inputTest() {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력:");
		String name = sc.next();
		System.out.print("별명 입력:");
		String nn = sc.next();
		System.out.println(name + " 님은 " + nn + "입니다");

		System.out.println();
		System.out.println("야구장에 입장하기 : 인증 성공");
		String id = "kbs";
		String password = "ok123";
		
		// Scanner 쓰고 ctrl + space bar
		Scanner sca = new Scanner(System.in);
		System.out.print("id:");
		String inputId = sca.nextLine();
		System.out.println("pwd:");
		String inputPwd = sca.nextLine();
		
		// if(inputId == id && inputPwd == password) {	// 기본형 비교이므로 작동 실패함. 참조형은 equals 추가.
		if(inputId.equals(id) && inputPwd.equals(password)) {
			System.out.println("인증 성공");
		}else {
			System.out.println("인증 실패");
		}
		
		System.out.println();
		
		// 문1) 구구단 3단 출력
			for(int dan=1; dan <= 9; dan++) {
				System.out.println("3 * " + dan + " = " + (3 * dan));
			}
				System.out.println("\nfor 탈출10");
				
			// 문2) 2 ~ 9 단까지 출력
			// 2*1=2 2*2=4 ... 2*9=18
			// ...
			// 9*1=9 9*2=18 ... 9*9=81
				
			// 문3) : 1~100 사이의 정수 중 3의 배수이면서(and) 5의 배수를 출력하고 건수와 그들의 총합을 출력.
				
			// 2번 풀이
				for(int dan=2; dan <= 9; dan++) {
					for(int num=1; num <=9; num++) {
					System.out.print(dan + " * " + num + " = "+ (dan * num) + " ");
					}
					System.out.println();
				}
				System.out.println("\nfor 구구단");
				System.out.println();
				
			//3번 풀이
			int cc =0;	//count
			int ha = 0;	// total
			for(int sibo=1; sibo <= 100; sibo++) {
				if(sibo % 3 == 0 && sibo % 5 == 0) {	// 3,5의 공배수
					System.out.print(sibo + " ");
					cc += 1;	// 1씩 누적
					ha += sibo;	// sibo 값을 누적
				}
			}
			
			System.out.println();
			System.out.println("건수:" + cc);
			System.out.println("총합:" + ha);
			
			System.out.println();
			// 문1 : 1 ~ 10 사이의 정수 중 짝수만 출력하고 그 갯수도 출력
			int p = 0;
			int co = 0;	//count
			int tt = 0;	// total
			while(p <= 10) {
				p++;
				if(p % 2 == 0) {
					System.out.print(p + " ");
					co += 1;
					tt += p;
				}
			}
			System.out.println("\n1~10 사이의 짝수 갯수:" + co);
			System.out.println("1~10 사이의 짝수의 합:" + tt);
			
			
			// 문2 : 키보드로 정수를 입력받아 1부터 그 수까지의 합을 출력
			// 조건 : 위 작업을 계속 반복할지 여부를 묻고 탈출 결정
			
			Scanner sa = new Scanner(System.in);
			
			while(true) {	// 무한 반복 (break를 만날 때까지)
				System.out.print("양의 정수를 입력:");
				int num = sa.nextInt();
				// System.out.println(num);
				if(num < 1) {	// 1 미만의 값이 입력되면 작업 종료
					System.out.println("1 이상의 정수를 입력하세요");
					break;
				}
				// 해당 숫자까지의 합 출력
				int n=0, total = 0;
				while(n <= num) {	// 키보드에서 입력한 숫자보다 작은 동안 반복
					total += n;
					n++;
				}
				System.out.println("합(total)은 " + total);
				
				System.out.print("계속할까요(1긍정/0부정)?");
				int imsi = sc.nextInt();
				if(imsi != 1) {	// ! : 조건 부정 (1가 아닐 경우)
					System.out.println("\n작업 종료");
					break;
				}
			}
			
			// 문1 : 1차원 배열 요소에서 홀수와 짝수의 합을 각각 출력
			int arr[] = {1,2,3,4,5,6};
			int oddSum = 0;
			int eventSum = 0;
				for(int i = 0; i < arr.length; i++) {
				//	for(int i:arr) {
				System.out.print(arr[i]);
				//	System.out.print(i);
				if(arr[i] % 2 == 0) {	// 짝수
					eventSum += arr[i];
				}else {	// 홀수
					oddSum += arr[i];
				}
			}
			System.out.println("\n짝수의 합:" + eventSum + ", 홀수의 합:" + oddSum);
			
			System.out.println();
			// 문2 : 2차원 배열 전체 요소의 합을 출력
			int arr2[][] = {{1,2},{3,4}};
			int sum = 0;
			for(int i = 0; i < arr2.length; i++) {
				//	System.out.println(arr2[i]);
				for(int j = 0; j < arr2[i].length; j++) {
					sum += arr2[i][j];
			}
		}
			System.out.println("arr2 배열 요소의 총합:" + sum);
	}

}
