package pack4extends;

public class Ex19Lion extends Ex19Animal{
	@Override
	public String name() {
		return "사자";
	}
	@Override
	public String eat() {
		return "고기";
	}
	@Override
	public String action() {
		return "밤";
	}
	
 public void eatOther() {	// Lion 고유 매소드
	 System.out.println("가끔은 소시지도 먹음:");
 }
}
