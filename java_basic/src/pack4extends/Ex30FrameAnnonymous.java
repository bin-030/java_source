package pack4extends;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex30FrameAnnonymous extends Frame{
	int x, y;
	
	public Ex30FrameAnnonymous() {
		setTitle("내부 무명 클래스 사용");
		setSize(400, 300);
		setLocation(200, 200);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// setBackground(new Color(0, 0, 225)); 
				// setBackground(Color.BLUE); 
				int r = (int)(Math.random() * 255);
				int g = (int)(Math.random() * 255);
				int b = (int)(Math.random() * 255);
				setBackground(new Color(r, g, b)); 
				
				x = e.getX();
				y = e.getY();
			}
		});
	}
	public void paint(Graphics g) {
		g.drawString("ㅎㅎ", x, y);
	}
}
