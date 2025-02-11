package pack3;

import java.awt.Frame;

public class Ex9FramePoham {	// 창 띄우기!
	String name = "신기해";
	private Frame frame;	// 외부 클래스를 사용
	
	public Ex9FramePoham() {
		frame = new Frame("포함 연습용");	// 클래스의 포함 관계
		
		// frame.setSize(500, 300);	// 너비와 높이 지정
		// frame.setLocation(350, 250);	// 창이 뜨는 좌표
		// frame.setVisible(true);	// 창 보임 표시 ( 참: 보여줌, 거짓: 안 보여줌)
	}
	
	// 생성자는 초기화 및 전체 윤곽만 적고, 나머지(처리 로직)는 별도 메소드로 작성하는 것니 좋음
	public void frameVisible() {
		frame.setSize(500, 300);
		frame.setLocation(350, 250);
		frame.setVisible(true);
	}
}