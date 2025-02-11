package pack2;

public class Ex3Singer {
	private String name = "무명 가수";
	private String titleSong = " 아 대한민국";
	
	public Ex3Singer(String name, String title) {
		// 생성자
		this.name = name;
		titleSong = title;
	}
	
	public void sing() {
		// String name = "아이유";	// 지역변수
		// System.out.println(name + "의 노래 제목은 " + titleSong);	// 아이유의 노래 제목은 아 대한민국
		System.out.println(this.name + "의 노래 제목은 " + titleSong);	// 무명 가수의 노래 제목은 아 대한민국
	}
	
	public void setTitleSong(String titleSong) {	// setter
		this.titleSong = titleSong;
	}
}
