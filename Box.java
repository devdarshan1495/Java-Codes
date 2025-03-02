class Box {
    double len,width,height;
    double volume()
    {
        return len*width*height;
    }
    void setLen( double l)
    {
        len=l;
    }
    void setWidth( double w)
    {
        width=w;
    }
    void setHeight( double h)
    {
        height=h;
    }
    double getLen()
    {
        return len;
    }
    double getWidth()
    {
        return width;
    }
    double getHeight()
    {
        return height;
    }

    public static void main(String[] args) {
        Box b1 =new Box();
        b1.setLen(10);
        b1.setWidth(20);
        b1.setHeight(30);
        System.out.println("Volume of Box is : "+b1.volume());
        System.out.println(b1.getLen());
        System.out.println(b1.getWidth());
        System.out.println(b1.getHeight());
    }
}