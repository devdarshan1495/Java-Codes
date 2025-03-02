interface Printable {
    void print();
}

class InterfaceEx1 implements Printable {
    public void print() {
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        InterfaceEx1 obj = new InterfaceEx1(); // Fixed object creation
        obj.print();
    }
}
