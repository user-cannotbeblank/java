package personal_projects;

class Animal {
    public void animalSound() { // Creates public void method "animalSound".
        System.out.println("The animal makes a sound..."); // Sends "The animal makes a sound..." if called.
    }
}

class Cat extends Animal { // Creates child class "Cat" to the parent class "Animal".
    public void animalSound() { // Reuses public void method "animalSound," modifying it to its specific class needs.
        System.out.println("The cat says: mrow!"); // Sends "The cat says: mrow!" if called.
    }
}

class Dog extends Animal { // Creates child class "Dog" to the parent class "Animal".
    public void animalSound() { // Reuses public void method "animalSound," modifying it to its specific class needs.
        System.out.println("The dog says: awoof!"); // Sends "The dog says: awoof!" if called.
    }
}

class Main { 
    public static void main(String[] args) { // Initializes main() method.
        Animal myAnimal = new Animal(); // Creates myAnimal object from Animal class.
        Animal myCat = new Cat(); // Creates myCat object from Cat class.
        Animal myDog = new Dog(); // Creates myDog object from Dog class.

        myAnimal.animalSound(); // Calls animalSound method from class.
        myCat.animalSound(); // Calls animalSound method from class.
        myDog.animalSound(); // Calls animalSound method from class.
    }
}

