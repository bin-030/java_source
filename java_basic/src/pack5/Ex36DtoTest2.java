package pack5;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex36DtoTest2 {
	private ArrayList<Ex36StudDto> list = new ArrayList<Ex36StudDto>();
	private String name;
	private int kor, eng;
	
	public void insertData() {
		
		boolean c = true;
		while (c) {
			Scanner sc = new Scanner(System.in);
			System.out.print("이름:");
			name = sc.next();
			System.out.print("국어:");
			kor = sc.nextInt();
			System.out.print("영어:");
			eng = sc.nextInt();
			
			Ex36StudDto student = new Ex36StudDto();
			student.setName(name);
			student.setKor(kor);
			student.setEng(eng);
			list.add(student);
			
			System.out.println("계속할까요? (네 / 아니오)");
			String a = sc.next();  
			if (a.equals("아니오")) {
	            c = false;
	            System.out.println("작업 종료");
	        } else if (a.equals("네")) {
	            
	        } else {
	            System.out.println("잘못된 입력입니다. '네' 또는 '아니오'으로 입력해 주세요.");
	        }
		}
	}
	
	public void showData() {
		int count = 0;	// 인원 수 출력용
		
		for(int i=0; i < list.size(); i++) {
			Ex36StudDto studentDto = list.get(i);
			// Ex36StuDto studentDto = new Ex36StuDto();
			// studentDto = list.get(i);
			
			int tot = studentDto.getKor() + studentDto.getEng();
			System.out.println("이름 : " + studentDto.getName() + ", 국어 : " +
								studentDto.getKor() + ", 영어 : " +
								studentDto.getEng() + ", 총합 : " +
								tot);	
			
			count += 1;
		}
		System.out.println("응시 인원 : " + count);
		// System.out.println("응시 인원 : " + list.size());
	}

	
	
	public static void main(String[] args) {
		Ex36DtoTest2 test2 = new Ex36DtoTest2();
		test2.insertData();
		test2.showData();
	}

}