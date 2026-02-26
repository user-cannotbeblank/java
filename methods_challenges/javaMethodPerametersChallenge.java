package methods_challenges;

/*
Inside Main, complete the following steps:

- Fix the method welcomeMessage so it takes a String parameter named name
- Call welcomeMessage() with any name inside main()

Note: The method must be static.
*/

public class javaMethodPerametersChallenge {
    public static void main(String[] args) {
        welcomeMessage("Michael"); // Calls welcomeMessage Method.
    }

    // welcomeMessage Method
    static void welcomeMessage(String name) {
        System.out.println("Welcome to Java, " + name + "!"); // Prints "Welcome to Java" with the name chosen in the main method.
    }
}
