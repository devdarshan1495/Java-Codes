

class Vehicle{
    String make;
    String model;
    int year;
    String fuel_type;

    public void Fuel_efficiency(){ 
    }
    public void Distance_travelled(){
    }
    public void max_speed(){
    }
}

class Truck extends Vehicle
{
        public void Fuel_efficiency(){ 
            System.out.println("Truck Fuel Efficiency");
    }
    public void Distance_travelled(){
        System.out.println("Truck Distance Travelled");
    }
    public void max_speed(){
        System.out.println("Truck Max Speed");
    }
}
class car extends Vehicle
{
        public void Fuel_efficiency(){ 
            System.out.println("Car Fuel Efficiency");
    }
    public void Distance_travelled(){
        System.out.println("Car Distance Travelled");
    }
    public void max_speed(){
        System.out.println("Car Max Speed");
    }
}
class motorcycle extends Vehicle
{
        public void Fuel_efficiency(){ 
            System.out.println("Motorcycle Fuel Efficiency");
    }
    public void Distance_travelled(){
        System.out.println("Motorcycle Distance Travelled");
    }
    public void max_speed(){
        System.out.println("Motorcycle Max Speed");
    }
}

class abc{
    public static void main(String[] args) {
        
    }
}