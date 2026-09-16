 import java.util.*;
public class StudentReportCard {
    public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
result r=new result();
System.out.println("Enter student name");
r.name=sc.nextLine();
System.out.println("Rollnum");
r.rollnum=sc.nextInt();
System.out.println("Enter the subject marks");
System.out.println("s1 ");
r.s1=sc.nextInt();
System.out.println("s2 ");
r.s2=sc.nextInt();
System.out.println("s3 ");
r.s3=sc.nextInt();
System.out.println("s4 ");
r.s4=sc.nextInt();
System.out.println("s5 ");
r.s5=sc.nextInt();
r.claculate();
r.display( );
sc.close();
    }
}

class Student {
    String name;
    int rollnum;
    int s1, s2, s3, s4, s5;
}


class result extends Student {
    int totalmarks;
    double percentage;
    String grade;


    void claculate() {
        totalmarks = (s1 + s2 + s3 + s4 + s5);
        percentage = ((totalmarks*100)/500);
        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 80) {
            grade = "B";
        } else if (percentage >= 70) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "fail";
        }
    }

    void display() {
        System.out.println("Name " + name);
        System.out.println("ROllnum " + rollnum);
        System.out.println("s1 " + s1);
        System.out.println("s2 " + s2);
        System.out.println("s3 " + s3);
        System.out.println("s4 " + s4);
        System.out.println("s5 " + s5);
        System.out.println("totalmarks "+totalmarks);
        System.out.println("percentage "+percentage);
        System.out.println("grade "+grade);
    }
}

