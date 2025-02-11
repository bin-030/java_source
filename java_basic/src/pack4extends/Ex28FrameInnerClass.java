package pack4extends;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex28FrameInnerClass extends Frame{
	int x, y;

	public Ex28FrameInnerClass() {
		setTitle("내부 클래스 사용");
		setSize(400, 300);
		setLocation(200, 200);
		setVisible(true);
		
		// Wevent wevent = new Wevent();
		// addWindowListener(wevent);
		addWindowListener(new Wevent());
		addMouseListener(new Mevent());
	}
	
	class Wevent extends WindowAdapter{	// 내부 클래스
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	
	class Mevent extends MouseAdapter{	// 내부 클래스
		@Override
		public void mouseClicked(MouseEvent e) {
			// setBackground(new Color(225, 225, 0);
			// System.out.println(e.getX() + " " + e.getY());	// 내가 찍은 마우스 좌표 보이기
			// setTitle(e.getX() + " " + e.getY()); // 창 타이틀 제목을 좌표값으로 바꿈
			
			int r = (int)(Math.random() * 255);
			int g = (int)(Math.random() * 255);
			int b = (int)(Math.random() * 255);
			setBackground(new Color(r, g, b)); 
			
			x = e.getX();
			y = e.getY();
			
			paint(getGraphics());
		}
	}
	
	@Override
	public void paint(Graphics g) {	// Frame은 paint()를 처음 실행 시 한 번 호출
		g.drawString("홍길동", x, y);
	}
}
