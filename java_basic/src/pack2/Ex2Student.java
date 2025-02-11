package pack2;

public class Ex2Student {
   /* 문1) 학생 정보 관리 클래스.
      학생 정보를 관리하기 위한 Student 클래스를 작성하세요.
      클래스 이름은 Student입니다. 다음 필드를 포함합니다.
      String name(학생 이름), int grade(학년), double score(평균 점수)
      생성자는 모든 필드를 초기화할 수 있어야 합니다.
      학생의 정보를 출력하는 printStudentInfo() 메소드를 작성하세요.
      출력 형식은 다음과 같습니다.
      이름: [name], 학년: [grade], 평균 점수: [score]
      main 메소드에서 학생 객체를 생성하고 printStudentInfo() 메소드를 호출하세요.
      */
   
   // 필드
   private String name;
   private int grade;
   private double score;
   
   // 생성자
   public Ex2Student(String name, int grade, double score) {
      this.name = name;   // 생성자를 호출하며 값을 줄 수 있다.
      this.grade = grade;
      this.score = score;
   }
   
   // 매소드
   public void printStudentInfo() {
      System.out.println("이름:" + name + ", 학년:" + grade + ", 평균 점수:" + score);
      
   }
}

/*// 필드
    private String name;
   private int grade;
   private double score;
   
  // 생성자
     public Ex2Student() {
      this.name = name;
      this.grade = grade;
      this.score = score;

  // setter
       public void setName(String name) {
      this.name = name;
   }
   public void setGrade(int grade) {
      this.grade = grade;
   }
   public void setScore(double score) {
      this.score = score;
   }
   
  // 매소드
   public void printStudentInfo() {
      System.out.println("이름:" + name + ", 학년:" + grade + ", 평균 점수:" + score);
      
   } */