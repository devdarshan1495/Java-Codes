package InheritenceEx;
class Dog1{
    private int age;
    private String breed;
    private String color;

    Dog1(){
        age = 0;
        breed = "Labrador";
        color = "Golden Brown";
    }

    Dog1( int i, String b, String c){
        age = i;
        breed =b;
        color =c;
    }
    public String toString(){
        return "Age:  "+age+"\nBreed: "+breed+"\nColor: "+color;
    }

    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age=age;
    }

    public String getBreed() {
        return breed;
    }
    
    public void setBreed(String breed) {
        this.breed=breed;
    }
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color=color;
    }

    public void About(){
        System.out.println("About the dog :");
    }

    
}

class Dog{
    public static void main(String[] args) {
        
    }
}