public class University {
    public static void main(String[] args) {
        System.out.println("----Persion Detail----");
        person p= new person();
        p.name="Rajveer";
        p.age=21;
        p.detail();
        System.out.println();

        System.out.println("----Student Detail----");
        student s= new student();
        s.name="Arjun";
        s.age=23;
        s.rollnum=101;
        s.marks=300;
        s.detail();
        System.out.println();

System.out.println("----Rearchers Detail----");
        researchstudent r=new researchstudent();
        r.name="Vishal";
        r.age=22;
        r.rollnum=102;
        r.marks=299;
        r.topic="On global warming";
        r.guidename="Atul";
        r.detail();

        
    }
}
class person{
    String name;
    int age;
    void detail(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
class   student extends person{
    int rollnum;
    int marks;
      void detail(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Rollnumber: "+rollnum);
        System.out.println("Marks: "+marks);
    }

}
class researchstudent extends student{
    String topic, guidename;
     void detail(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Rollnumber: "+rollnum);
        System.out.println("Marks: "+marks);
        System.out.println("Topic: "+topic);
        System.out.println("Guidname: "+guidename);
    }

}
