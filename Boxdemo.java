class Box {
    double len,width,height;
    double volume()
    {
        return len*width*height;
    }
}

class Boxdemo {
    public static void main(String[] args) {
        Box b1 =new Box();

        b1.len=10;
        b1.width=20;
        b1.height=30;
        System.out.println("Volume of the Box is : "+b1.volume());
    }
}