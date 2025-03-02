package InheritenceEx;

interface FigureI {
    final static float pi = 3.14F;
    void area();
    void perimeter();
}

class CircleI implements FigureI {
    double radius;

    CircleI(double r) {
        radius = r;
    }

    public void area() {
        System.out.println("Area is " + (pi * radius * radius));
    }

    public void perimeter() {
        System.out.println("Perimeter is " + (2 * pi * radius));
    }
}

class SquareI implements FigureI {
    double side;

    SquareI(double s) {
        side = s;
    }

    public void area() {
        System.out.println("Area is " + (side * side));
    }

    public void perimeter() {
        System.out.println("Perimeter is " + (4 * side));
    }
}

class Interface_Runtime {
    public static void main(String args[]) {
        FigureI c;
        c = new CircleI(5.5);
        c.area();
        c.perimeter();

        c = new SquareI(5.5);
        c.area();
        c.perimeter();
    }
}
