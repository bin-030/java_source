package pack2;

public class Ex3MainSinger {

	public static void main(String[] args) {
		Ex3Singer bts = new Ex3Singer("BTS", "다이너마이트");
		bts.sing();
		bts.setTitleSong("butter");
		bts.sing();
		
		System.out.println();
		Ex3Singer blackpink = new Ex3Singer("블랙핑크", "how you like that");
		blackpink.sing();
	}
}
