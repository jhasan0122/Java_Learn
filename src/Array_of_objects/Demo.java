package Array_of_objects;

class Student{
    int rollNo;
    String name;
    int marks;
}

public class Demo {
    public static void main(String[] args) {
        Student s1 =new Student();
        s1.rollNo = 1 ;
        s1.name = "Jehan";
        s1.marks = 90;

        Student s2 =new Student();
        s2.rollNo = 2 ;
        s2.name = "Hasan";
        s2.marks = 67;

        Student s3 =new Student();
        s3.rollNo = 3 ;
        s3.name = "Juthi";
        s3.marks = 97;

        Student students[] =new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;


//        for (int i = 0; i < students.length; i++) {
//            System.out.println(students[i].name + " " + students[i].marks);
//        }
        for (Student stu: students){
            System.out.println(stu.name + " " + stu.marks);
        }
    }
}
