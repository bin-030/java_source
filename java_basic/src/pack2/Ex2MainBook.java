package pack2;

public class Ex2MainBook {
public static void main(String[] args) {
   Ex2Book ex2Book1 = new Ex2Book("여진이의 대모험", "한세빈", true);
   ex2Book1.printBookInfo();
   ex2Book1.borrow();
   
   System.out.println();
   System.out.println("-------------");
   System.out.println();
   
   Ex2Book ex2Book2 = new Ex2Book("여진이의 대모험", "한세빈", false);
   ex2Book2.printBookInfo();
   ex2Book2.borrow();
   ex2Book2.returnBook();
   }
}

/* package pack2;

public class Ex2MainBook {
public static void main(String[] args) {
   Ex2Book ex2Book1 = new Ex2Book("여진이의 대모험", "한세빈", true);
   ex2Book1.printBookInfo();
   ex2Book1.borrow();
   
   Ex2Book ex2Book2 = new Ex2Book("여진이의 대모험", "한세빈", false);
   ex2Book2.printBookInfo();
   ex2Book2.borrow();
   
   Ex2Book ex2Book3 = new Ex2Book("여진이의 대모험", "한세빈", false);
   ex2Book3.returnBook();
   }
} */