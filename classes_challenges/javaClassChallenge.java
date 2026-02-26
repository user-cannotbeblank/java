package classes_challenges;

public class javaClassChallenge {
    String city; // Initializes the city string.
    int population; // Initializes the population integer.

    public javaClassChallenge() {
        city = "London";
        population = 9000000;
    }

    public static void main(String[] args) {
        javaClassChallenge myObj = new javaClassChallenge(); // Instantiates the javaClassChallenge class and create myObj object.
        System.out.println(myObj.city); // Prints the value of the city variable for the myObj object.
        System.out.println(myObj.population); // Prints the value of the population variable for the myObj object.
    }
}
