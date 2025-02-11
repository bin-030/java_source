package pack2;

public class Ex2Book {
/* 문2) 책 관리 클래스.
   도서관에서 책을 관리하기 위한 Book 클래스를 작성하세요.
   클래스 이름은 Book입니다. 다음 필드를 포함합니다:
   String title (책 제목), String author (저자), boolean isAvailable (대출 가능 여부)
   생성자 또는 메소드를 통해 필드에 값을 저장할 수 있어야 합니다.
   다음 메서드를 작성하세요.
 - borrow(): 책을 대출할 수 있으면 isAvailable 값을 false로 바꾸고 성공 메시지를 출력. 대출 불가능하면 실패 메시지를 출력.
 - returnBook(): 책을 반납하면 isAvailable 값을 true로 바꾸고 반납 성공 메시지를 출력.
 - printBookInfo(): 책 정보를 출력하는 메서드. 
   main 메서드에서 책 객체를 생성하고 위 메서드들을 호출해 보세요.

   출력 형식:
   제목: [title], 저자: [author], 대출 가능: [isAvailable] */
   
   // 필드
   private String title;
   private String author;
   private boolean isAvailable;
   
   // 생성자
   public Ex2Book(String title, String author, boolean isAvailable) {
      this.title = title;
      this.author = author;
      this.isAvailable = isAvailable;
   }
   // borrow() 메소드
   public void borrow() {
      if(isAvailable) {
         isAvailable = false;
         System.out.println("책을 대출할 수 있습니다.");
      }else {
         System.out.println("책을 대출 중입니다. 대출할 수 없습니다.");
      }
   }
   // returnBook() 메소드
   public void returnBook() {
       isAvailable = true;
       System.out.println("반납 성공");
   }
   // 책 정보 출력 메소드
   public void printBookInfo() {
      System.out.println("책 제목:" + title + ", 저자:" + author + ", 대출 가능 여부:" + isAvailable);   
   }
}


/* // 필드
private String title;
private String author;
private boolean isAvailable;

// 생성자
public Ex2Book(String title, String author, boolean isAvailable) {
   this.title = title;
   this.author = author;
   this.isAvailable = isAvailable;
}
// borrow() 메소드
public boolean borrow() {
   if(isAvailable) {
      isAvailable = true;
      System.out.println("책을 대출할 수 있습니다.");
   }else {
      System.out.println("책을 대출 중입니다. 대출할 수 없습니다.");
   }
	return false; }
// returnBook() 메소드
 public void returnBook() {
       isAvailable = true;
       System.out.println("반납 성공");
        }
// 책 정보 출력 메소드
public void printBookInfo() {
   System.out.println("책 제목:" + title + ", 저자:" + author + ", 대출 가능 여부:" + isAvailable);   
	}
}
*/