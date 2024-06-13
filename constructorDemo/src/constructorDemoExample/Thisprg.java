package constructorDemoExample;



public class Thisprg {
    int dd;

    // Default constructor
    public Thisprg() {
        // Calling the parameterized constructor with this
        this(20);
    }

    // Parameterized constructor
    public Thisprg(int dd) {
        this.dd = dd;
    }

    // Method to print the value of dd
    public void printValue() {
        System.out.println("Value of dd: " + this.dd);
    }

    public static void main(String[] args) {
        // Creating an instance using the default constructor
        Thisprg obj = new Thisprg();
        
        // Printing the value of dd
        obj.printValue();

        // Creating an instance of MyDate
        MyDate date = new MyDate(10, 5, 2024);
//        date.MyDate(20,05,2020);
        date.printDate();
    }
}

// Separate class MyDate
class MyDate {
    int dd;
    int mm;
    int yy;

    // Parameterized constructor for MyDate
    public MyDate(int dd, int mm, int yy) {
        this.dd = dd;
        this.mm = mm;
        this.yy = yy;
    }
    // Method to print the date
    public void printDate() {
        System.out.println("Date: " + this.dd + "/" + this.mm + "/" + this.yy);
    }
}

