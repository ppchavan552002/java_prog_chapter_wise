package javaDynamicExp;

class Employee {
    int basicsal;
    int hra;
    int da;

    public Employee() {
        basicsal = 20000;
        hra = 2000;
        da = 5000;
    }

    public Employee(int bs, int hr, int da) {
        this.basicsal = bs;
        this.hra = hr;
        this.da = da;
    }

    public double calculateSalary() {
        return basicsal + hra + da;
    }
}

class Manager extends Employee {
    private int incentive;

    public Manager() {
        super();
        this.incentive = 5000; // Default incentive value
    }

    public Manager(int bs, int hr, int da, int incentive) {
        super(bs, hr, da);
        this.incentive = incentive;
    }

    public double calculateIncentive() {
        return incentive;
    }

    static void displaySalary(Manager emp) {
        System.out.println("Salary: " + emp.calculateSalary());
        System.out.println("Incentives: " + emp.calculateIncentive());
    }

    public static void main(String[] args) {
        Manager man = new Manager();
        displaySalary(man);
    }
}
