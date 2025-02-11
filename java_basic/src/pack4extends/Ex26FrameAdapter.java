package pack4extends;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex26FrameAdapter extends WindowAdapter{ // 클래스의 상속 관계
	private Frame frame; // 클래스의 포함 관계
	private Ex26Mouse mouse;
	
	public Ex26FrameAdapter() {
		frame = new Frame("어뎁터 사용");
		frame.setSize(400, 300);
		frame.setLocation(200, 200);
		frame.setVisible(true);
		frame.setTitle("내가 만든 창");
		
		frame.addWindowListener(this);
		mouse = new Ex26Mouse();
		frame.addMouseListener(mouse);
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		// 윈도우 이벤트 관련 메소드 중 원하는 메소드만 오버라이딩 가능해짐
		System.exit(0);
	}
	
	public class Ex26Mouse extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			int r = (int)(Math.random() * 255);
			int g = (int)(Math.random() * 255);
			int b = (int)(Math.random() * 255);
			frame.setBackground(new Color(r, g, b));
		}
	}
}
