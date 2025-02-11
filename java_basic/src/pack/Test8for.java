package pack;

public class Test8for {

	public static void main(String[] args) {
		System.out.println("뭔가를 하다가... 반복문 만나기");
		// 반복문 for
		int a;
		int hap = 0;	// 누적 변수명
		for(a = 1; a <= 5; a = a+1) {	//for(변수 초기화; 조건; 증감치) {반복 내용}
		// a+ = 1, a++, a+1 = 1 전부 동일
			System.out.print(a + "\t");	// 블럭 내에서만 같은 문자 인식. 블럭이 다르면 문자 중복도 가능. 밖에서는 인식 못함. 로컬 베리어.
			// \t 는 Tab키
			// a = 7; 반복문 블럭 내에서 for 문에 사용 중인 변수는 갱신 비권장
			hap = hap + a;
		}

		System.out.println("\nfor 탈출:" + a);
		System.out.println("합은 " + hap);
		
		System.out.println();
		for(int i = 65; i <= 90; i++) {	// 변수 선언은 웬만하면 블럭 내에서
			System.out.print((char)i + " ");
		}
		System.out.println("\nfor 탈출2");
		
		System.out.println();
		for(int i='A'; i <= 'Z'; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nfor 탈출3");
		
		System.out.println();
		for(int i = 10; i > 1; i -= 2) {
			System.out.print(i + " ");
		}
		System.out.println("\nfor 탈출4");
		
		System.out.println();	// for 뒤에 변수 1개 이상도 가능
		for(int ytn = 0, tvn = 5; ytn <= 5; ytn++, tvn++) {
			System.out.print(ytn + "," + tvn + " ");
		}
		
		System.out.println("\nfor 탈출5");
		System.out.println();
		int aa = 1;	// 초기값을 밖에 적어도 됨
		for(; aa <= 5; aa++) {
			System.out.print(aa + " ");
		}
		System.out.println("\nfor 탈출6");
		
		System.out.println();	// 블럭 안에 블럭 생성 가능. 겹치는 건 불가능.
		for(int sbs = 1; sbs <= 10; sbs++) {
			if(sbs % 2 == 0) {	// 짝수만 출력
			System.out.print(sbs + " ");
			}
			
			if(sbs == 6) break;	// 반복문 무조건 탈출
		}
		
		System.out.println("\nfor 탈출7");
		System.out.println();
		// 다중 for
		for(int m = 1; m <= 3; m++) {
			System.out.println("m:" + m);
			for(int n=1; n<=4; n++) {
				System.out.print("n=" + n + " ");
			}	// n변수 for문 블럭 괄호이기 때문에 n을 먼저 반복
			System.out.println();
		}	// m변수 for문 블럭 괄호이기 때문에 m을 반복하러 다시 감.
		System.out.println("\nfor 탈출8");
		System.out.println();
		
		for(char i = 65; i <= 90; i++) {
			System.out.print(i + " : ");
			for(char j=i; j <= 'Z'; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("\nfor 탈출9");
		
		System.out.println();
		System.out.println("문제");
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
		int cc =0;	// count
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
		System.out.println("continue, break ---");
		for(int i=1; i <= 10; i++) {
			// if(i == 3) continue;	// 자기와 대응되는 for문으로 무조건 이동 (값에 해당하면 밑으로 안 내려가고 위로 올라가서 다시 진행)
			// if(i == 5) continue;
			if (i == 3 || i == 5) continue;	// 위의 두 줄을 합쳐서 씀	// &&는 사용 불가
			System.out.println(i);
			if(i == 7) break;
			
		}
		System.out.println();
		// 무한 반복문
		int kk = 0;
		for(;;) {
			kk++;
			System.out.println("kk");	// 여기까지만 기재 시엔 무한대로 값이 나옴
			if(kk == 5) break;
		}
	}

}
