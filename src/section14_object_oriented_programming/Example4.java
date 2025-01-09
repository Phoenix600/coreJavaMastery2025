package section14_object_oriented_programming;

class Student
{
    public int rollNumber;
    public String name;
    public String course;
    public double m1;
    public double m2;
    public double m3;

    public double total()
    {
        return m1 + m2 + m3;
    }

    public double average()
    {
        return (m1+m2+m3)/3;
    }

    public char grade()
    {
        double avg = average();
        if(avg >= 60)
        {
            return 'A';
        }
        else
        {
            return 'B';
        }
    }

    // try to change the name of this method from details to toString()
    public String details()
    {
        return  String.format("Roll %d\n Name %s\n Course %s",rollNumber,name,course);
    }

}

// Assignment -3
public class Example4 {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Pranay Ramteke";
        s1.rollNumber = 4;
        s1.course = "ETC";

        s1.m1 = 60;
        s1.m2 = 80;
        s1.m3 = 90;

        System.out.println("Total   : " + s1.total());
        System.out.println("Average : " + s1.average());
        System.out.println("Details : " + s1.details());

    }
}
