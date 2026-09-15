public class CopyConstructor {
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.name = "Parth";
    s1.rollnoo = 84;
    s1.password = "6969";
    s1.marks[0] = 100;
    s1.marks[1] = 90;
    s1.marks[2] = 80;

    Student s2 = new Student(s1);
    s2.password = "9696";
    s1.marks[2] = 100;
    for(int i=0; i<3; i++){
        System.out.println(s2.marks[i]);
    }
  }
}

class Student { 
    String name;
    int rollnoo;
    String password;
    int marks[];

    Student() {
        marks = new int[3];
    }

    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.rollnoo = s1.rollnoo;
        this.password = s1.password;
        this.marks = s1.marks.clone();

    }
}