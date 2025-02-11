package pack3;

public class Ex10Machine {
	int cupCount;
	
	public Ex10Machine() {
		cupCount = 50;
	}
	
	public void showdata() {
        System.out.println("현재 커피 잔 수: " + cupCount);
    }
	
	public void cupplus(int cup) {
		cupCount += cup;
	}
	
	public void cupminus(int cup) {
		cupCount -= cup;
	}
}


/* 답안 풀이
package pack3;

import java.util.Scanner;

public class Ex10Machine {
	private int cupCount;
	private Ex10CoinIn coinin = new Ex10CoinIn();
	
	public Ex10Machine() {
	}
	
	public void showData() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("동전을 입력하세요 : ");
		coinIn.setCoin(scanner.nextInt());
		System.out.print("몇 잔을 원하세요 : ");
		cupCount = scanner.nextInt();
		System.out.println(coinin.calc(cupCount));
	}
} */
