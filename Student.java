public class Student {
    String name;
    int roll;
    String address;
    int marks;
    public Student(String name, int roll, String address, int marks)
    {this.name = name;
        this.roll = roll;
        this.address = address;
        this.marks = marks;
        System.out.println("Name :  "+name);
        System.out.println("Roll : "+roll);
        System.out.println("Address : "+address);
        System.out.println("Marks : "+marks);
    }
    public void calcGrade()
    {
        if(marks>=90)
        {
            System.out.println("A+");
        }
        else if (marks>=80) {
            System.out.println("A"); 
        }
        else if (marks>=70) {
            System.out.println("B+"); 
        }
        else if (marks>=60) {
            System.out.println("B"); 
        }
        else if (marks>=50) {
            System.out.println("C+"); 
        }
        else if (marks>=40) {
            System.out.println("C"); 
        }
        else{
            System.out.println("NG");
        }
    }
}