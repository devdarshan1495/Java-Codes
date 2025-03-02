

class Studentclasses
{
    private int id;
    private String name;
    private int marks1;
    private int marks2;

    Studentclasses(){
        id=0;
        name="";
        marks1=0;
        marks2=0;
    }

    public Studentclasses(int id, String name, int marks1, int marks2) {
        this.id = id;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
    }

    public Studentclasses(int id) {
        this.id = id;
    }

    // can be done this way as well
    //public Studentclasses(int identity, String n, int m1, int m2) {
    //    id = identity;
    //    name = n;
    //    marks1 = m1;
    //    marks2 = m2;
    // }

    @Override
    public String toString(){
        return "Student ID: "+id+"\nName: "+name+"\nMarks1: "+"Marks2:"+marks2;
    }
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public String getName()
    {
        return name;
    }
    public void setName (String name){
        this.name=name;
    }
    public int getMarks1()
    {
        return marks1;
    }
    public void setMarks1(int marks1){
        this.marks1=marks1;
    }
    public int getMarks2()
    {
        return marks2;
    }
    public void setMarks2(int marks2){
        this.marks1=marks2;
    }
    //methods
    public void result(){
        System.out.println("Total Marks "+(marks1+marks2));
    }
}

@SuppressWarnings("unused")
class ClassEx4StudCons {
    public static void main(String[] args) {
        Studentclasses s1=new Studentclasses();
        System.out.println(s1);
        s1.setId(11);
        s1.setName("ABC");
        s1.setMarks1(90);
        s1.setMarks2(80);
        System.out.println("After setting values of s1 "+s1);
        s1.result();

        Studentclasses s2 = new Studentclasses();
        System.out.println(s2);
        s2.setId(33);
        System.out.println("After setting id=33 for s2 "+s2);
    }
}