package pack;

public class Test4 {

	public static void main(String[] args) {
		// 관계연산자
		int a =5;
		
		System.out.println(a > 3);	// 큰가
		System.out.println(a <=3);	// 작거나 같은가
		System.out.println(a == 3);	// 같은가
		System.out.println(a != 3);	// 같지 않는가
		
		boolean bb = a > 3;
		System.out.println("bb:" + bb);
		
		// 논리연산자
		System.out.println();
		int b = 10;
		
		System.out.println(a > 3 && b <= 10);	// 논리곱 (and)
		System.out.println(a >= 3 && b == 5);	// and 이기 때문에 하나라도 틀리면 거짓
		System.out.println(a >= 6 || b == 5);	// 논리합 (or)
		System.out.println(a >= 3 || b == 5);	// or 이기 때문에 하나라도 맞으면 참
		System.out.println(a >= 3 && b < 20 || b == 10);
		
		System.out.println();
		// 연산자의 우선 순위 : () > 산술(*,/ > +,-) > 관계 > 논리 > 치환
		boolean mbc = 3 + 4 * 2 >= a || 2 * (3 + 1) < b;
		System.out.println(mbc);
		
		System.out.println();
		// 시프트(shift) 연산자 : <<, >>, >>>
		int ii = 8, ij = 0;
		System.out.println(ii + " " + ij);
		System.out.println("ii:" + ii + " " + Integer.toBinaryString(ii));	// Integer.toBinaryString : 2진법 표기로 변경
		ij = ii << 1; // 좌측으로 1bit 이동. 남는 우측은 0으로 채움 (2진법 자릿수를 앞으로 한 칸 이동 후 맨뒤를 0으로 채움)
		System.out.println("ij:" + ij + " " + Integer.toBinaryString(ij));
		ij = ii >> 2; // 우측으로 2bit 이동. 남는 촤측은 부호와 같은 값으로 채움. 양수는 0, 음수는 1 (2진법 자릿수를 뒤로 두 칸 이동 후 맨 뒤를 부호에 맞게 채움)
		System.out.println("ij:" + ij + " " + Integer.toBinaryString(ij));
		ij = ii >>> 2; // 우측으로 2bit 이동/ 남는 좌측은 0으로 채움.
		System.out.println("ij:" + ij + " " + Integer.toBinaryString(ij));
		
		System.out.println();
		// 삼항 연산자
		int sbs = 6;
		int result = (sbs <= 5)?100:20 + 30;	// (조건)? 참일 때 처리문, : 거짓일 때 처리문
		// 참일 때는 ? 뒤, 거짓일 때는 : 뒤
		System.out.println("result:" + result);
		
		System.out.println();
		int x, y, z;
		x= y = z = 5;
		System.out.println(x + " " + y + " " + z);
		
		
	}

}
