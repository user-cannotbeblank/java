package personal_projects;

class Vehicle { 
    protected String brand = "Ford"; // Creates protected string, inaccessible from random classes.
    public void honk() { // Creates public void method for a console message.
        System.out.println("Honk honk!"); // Sends "Honk honk!" if called.
    }
}

class Car extends Vehicle { // Creates "Car" child class related to "Vehicle" parent class. 
    private String modelName = "Mustang"; // Creates private String variable modelName.
    public static void main(String[] args) { // Initializes main() method.
        Car myCar = new Car(); // Creates myCar object from Car class.
        
        myCar.honk(); // Calls the honk method.

        System.out.println(myCar.brand + " " + myCar.modelName); // Prints to console: brand + {white space} + modelName.
    }
}