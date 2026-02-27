package personal_projects;

interface Animal { // Creates interface; used to ground related methods with empty bodies.
    public void animalSound(); // Creates empty method animalSound.
    public void sleep(); // Creates empty method sleep.
}

class Cat implements Animal { // Creates new class "Cat", and implements (must use ALL methods) the "Animal" interface.
    public void animalSound() { // Implements the previously null animalSound method for its own class needs.
        System.out.println("The cat says: mrow! :3"); // If called, print "The cat says: mrow! :3"
    }
    public void sleep() { // Implements the previously null sleep method for its own class needs.
        System.out.println("hoooonk... mimimimimi.."); // If called, print "hoooonk... mimimimimi.."
    }
}

class Interfaces {
    public static void main(String[] args) { // Intitializes main() method.
        Cat myCat = new Cat(); // Creates myCat object from Cat class.
        myCat.animalSound(); // Calls animalSound method.
        myCat.sleep(); // Calls sleep method.
    }
}