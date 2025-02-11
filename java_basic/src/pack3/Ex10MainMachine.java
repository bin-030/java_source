package pack3;

import java.util.Scanner;

public class Ex10MainMachine {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 Ex10CoinIn coinIn = new Ex10CoinIn();

		 
		 
		 System.out.print("넣으신 동전 값을 입력하세요 : ");
	        int coinin = scanner.nextInt();

	     System.out.print("원하시는 잔 수를 입력하세요 : ");
	        int cup = scanner.nextInt();
	        
	     coinIn.calc(coinin, 200, cup);
            if (coinin >= 200 * cup) {
              System.out.println("커피 " + cup + "잔과 ");
              coinIn.showjandon();
            }
	}
}


/* 답안 풀이
package pack3;

public class Ex10MainMachine {
	public static void main(String[] args) {
		Ex10Machine machine = new Ex10Machine();
		machine.showData();
	}
} */