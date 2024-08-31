class Student 
{
    public String name;
    public int roll;
    public int marks;
}

public class Array_of_objects {
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.name = "Vishal";
        s1.roll = 1;
        s1.marks = 90;

        Student s2 = new Student();
        s2.name = "Vishal1";
        s2.roll = 2;
        s2.marks = 80;

        Student s3 = new Student();
        s3.name = "Vishal2";
        s3.roll = 3;
        s3.marks = 70;

        Student stud[] = new Student[3];
        stud[0] = s1;
        stud[1] = s2;
        stud[2] = s3;

        // for(int i=0; i<stud.length; i++)
        // {
        //     System.out.println(stud[i].name + " " + stud[i].roll + " " + stud[i].marks);
        // }

        for(Student s: stud)
        {
            System.out.println(s.name + " " + s.roll + " " + s.marks);
        }
    }
}
