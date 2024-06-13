package javaDynamicExp;


class Animal {
    protected void eat() {
        System.out.println("Animal eats");
    }
}

class Tiger extends Animal {
    @Override
    protected void eat() {
        System.out.println("Tiger eats");
    }
}

class Elephant extends Animal {
    @Override
    protected void eat() {
        System.out.println("Elephant eats");
    }
}

public class override12 {

	public static void main(String[] args) {
        // Creating objects of subclasses using superclass references
        Animal tiger = new Tiger();
        Animal elephant = new Elephant();

        // Invoking eat method to display specific eat behavior
        ((Animal) tiger).eat(); // Casting to Tiger to access overridden method
        ((Animal) elephant).eat(); // Casting to Elephant to access overridden method
	}
}
