package classes_challenges;

public class javaClassChallenge {
    String city; // Initializes the city string.
    int population; // Initializes the population integer.

    // Constructor, 2 parameters
    public javaClassChallenge(int population, String city) { 
        // Using 'this' to assign values to class variables
         this.population = population;
         this.city = city;
    }

    public void printInfo() {
        System.out.println("City: " + city + "\n" + "Population: " + population);
    }

    public static void main(String[] args) {
        // Constructor: city1.
        javaClassChallenge city1 = new javaClassChallenge(9000000, "London");
        // Constructor: city2
        javaClassChallenge city2 = new javaClassChallenge(8480000, "New York");

        city1.printInfo();
        city2.printInfo();
    }
}
