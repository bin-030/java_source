package pack2;

public class Ex2MainStudent {
public static void main(String[] args) {
   Ex2Student tom = new Ex2Student("톰",  3,  85.5);
   tom.printStudentInfo();
   
   Ex2Student james = new Ex2Student("제임스", 2, 90.2);
   james.printStudentInfo();
   }
}

/* Ex2Student stu = new Ex2Student();
   stu.setName("제임스");
   stu.setGrade(3);
   stu.setScore(85.5);
   stu.printStudentInfo(); */