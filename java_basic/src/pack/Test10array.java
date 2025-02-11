package pack;

import java.net.MulticastSocket;

public class Test10array {

	public static void main(String[] args) {
		/* 배열 : 타입(성격과 크기)이 일치하는 여러 개의 기억 장소(변수)를
		 * 대표명 하나만 주고 첨자(색인)로 쓰고, 각 기억 장소를 구분. 반복 처리에 효과적. 
		 */
		
		// 예 : 3과목 점수의 합 구하기
		int kor, eng, mat;	// 단순 변수 : 모든 기억 장소를 독립적으로 선언
		kor = 90; eng = 80; mat = 100;
		int tot = kor + eng + mat;
		System.out.println("세 과목 점수의 합은 " + tot);
		
		// 예2 : 배열을 사용해 3과목 점수의 합 구하기 (변수의 양이 많을수록 사용하기 편함)
		int jumsu[] = new int[3];	//	int[] jumsu = new int[3];
		jumsu[0] = 90; jumsu[1] = 80; jumsu[2] = 100;
		int tot2 = 0;
		for(int i = 0; i < 3; i++) {
			tot2 = tot2 + jumsu[i];
		}
		System.out.println("세 과목 점수의 합은 " + tot2);
		
		System.out.println();
		// int ar;	< 4바이트짜리 하나를 잡은 것
		
		// int ar[];	// 여러 개의 4바이트를 잡음, 배열로 선언(아직 기억 장소를 확보하지 못함), int[] ar;
		// ar = new int[5];	// 5개의 기억 장소가 확보됨
		// 위 두 줄을 한 줄로 선언
		int ar[] = new int[5];	// 대표명 ar인 int type의 변수 5개를 선언
		System.out.println("배열의 크기:" + ar.length);
		ar[0] = 10; ar[1] = 20;
		ar[2] = ar[0] + ar[1];
		System.out.println("ar[2]:" + ar[2]);
		System.out.println(ar[3]);	// 기본값 0을 기억
		// System.out.println(ar[5]);	// ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
		// 배열의 index는 0부터 출발, 0이상의 양의 정수만 가능.
		
		int kbs = 2;
		System.out.println("ar[2]:" + ar[2] + " " + ar[kbs] + " " + ar[kbs + 1 - 1]);
		// ar[kbs] <== kbs를 첨자 변수 또는 색인 변수. index variable라고 부른다.
		
		System.out.println();
		// 배열 선언 후 초기값 저장
		int[] ar2 = {1,2,3,4,5};	// 내부적으로 new를 함
		System.out.println(ar2[0] + " " + ar2[4]);
		
		for(int i = 0; i < ar2.length; i++) {	// 배열 요소값 반복문으로 출력
			System.out.print(ar2[i] + " ");
		}
		System.out.println();
		for(int k=0; k < ar2.length; k++) {	// 반복문으로 배열 요소에 값 저장
			ar2[k] = k + 10;
		}
		
		for(int k=0; k < ar.length; k++) {	// 표준 for문으로 배열을 반복
			System.out.print(ar2[k] + " ");
		}
		
		System.out.println();
		// 배열을 이용한 반복 처리 시 향상된 for를 사용 가능. 통상적으로 자주 씀.
		for(int no:ar2) {	// ar2 배열 요소가 차례대로 no에 치환되면서 반복 처리
			System.out.print(no + " ");
		}
		
		System.out.println();
		double silsu[] = {3.5, 2.1, 6.8};
		for(int i=0; i < silsu.length; i++) {
			System.out.print(silsu[i] + " ");
		}
		
		System.out.println();
		String[] city = {"서울", "제주", "원주"};
		for(int abc = 0; abc < city.length; abc++) {
			System.out.print(city[abc] + " ");
		}
		System.out.println();
		for(String aa:city) {
			System.out.print(aa + " ");
		}
		
		System.out.println();
		// 5명의 사람 키(정수)를 배열에 저장하고 평균 키 출력
		int[] heights = {178, 166, 177, 175, 180};
		int hap = 0;
		for(int i = 0; i < heights.length; i++) {
			hap += heights[i];
		}
		double heightAvg = (double)hap / heights.length;	//	175.2
		// double heightAvg = hap / heights.length;	//	175.0
		System.out.println(heights.length + "명의 키 평균은 " + heightAvg);
		//	heights 기억	장소는 1차원 배열 : 한 행에 요소(열)로만 구성된 배열
		
		System.out.println();
		//2차원 배열 (다차원 배열)
		// int su;	//	한 개의 독립 변수
		// int su[];	//	열로만 구성된 집합 변수 : 1차원 배열
		// int su[][];	// 행과 열로 구성된 집합 변수 : 2차원 배열
		// su = new int[3][4] ;
		int su[][] = new int[3][4];	// 1차원 배열로 선언하면 int su = new int[12];
		System.out.println("행의 갯수:" + su.length);
		System.out.println("열의 갯수:" + su[0].length);
		su[0][0] = 7;	//2차원 배열 su의 0행 0열에 7을 기억
		System.out.println("su[0][0] : " + su[0][0]);
		
		System.out.println();
		// 2차원 배열 su에 값 저장
		int num = 10;
		for(int i = 0; i < su.length; i++) {
			for(int j=0; j < su[i].length; j++) {
				su[i][j] = num++;	//	su[i][j] = ++num; 값이 다름.
			}
		}
		// System.out.println("su[0][0] : " + su[0][0]);
		
		System.out.println();
		// 2차원 배열 su에 값 출력
		for(int i = 0; i < su.length; i++) {
			for(int j=0; j < su[i].length; j++) {
				System.out.print(su[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
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
