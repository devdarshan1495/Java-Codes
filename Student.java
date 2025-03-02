class Student
{
    int roll_no;
    String name;
    int mark1,mark2;

    void setRollno(int roll){
        roll_no=roll;
    }
    void setName(String n){
        name=n;
    }
    void setMarks(int marks1,int marks2){
        mark1=marks1;
        mark2=marks2;
    }
    void display(){ 
        System.out.println("\n\n**********************************");
        System.out.println("*          Report Card           *");
        System.out.println("**********************************");
        System.out.println("*  Roll No: "+roll_no+"                   *");
        System.out.println("*  Name: "+name+"                   *");
        System.out.println("*  Marks in Subject 1: "+mark1+"        *");
        System.out.println("*  Marks in Subject 2: "+mark2+"        *");
        System.out.println("**********************************");
        System.out.println("*  Total Marks: "+(mark1+mark2)+"              *");
        System.out.println("**********************************\n\n");
    }
    double getRollno()
    {
        return roll_no;
    }
    String getName()
    {
        return name;
    }
    int getMarks1()
    {
        return mark1;
    }
    int getMarks2()
    {
        return mark2;
    }

    public static void main(String[] args) {
        Student s1=new Student();
        s1.setRollno(10);
        s1.setName("Rahul");
        s1.setMarks(90,80);
        s1.display();
        s1.getRollno();
        s1.getName();
        s1.getMarks1();
        s1.getMarks2();
    }
}