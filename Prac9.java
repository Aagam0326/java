import java.util.Scanner;

class Upast {
    void display() {
        System.out.println("This is Upcast");
    }
}

class Docast extends Upast {
    void display() {
        System.out.println("This is Downcast");
    }
}

class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, int id, double salary, String department) {
        super(name, id, salary);
        this.department = department;
    }

    void display() {
        System.out.println("Manager Name: " + name + ", ID: " + id + ", Salary: " + salary + ", Department: " + department);
    }
}

class Developer extends Employee {
    String project;

    Developer(String name, int id, double salary, String project) {
        super(name, id, salary);
        this.project = project;
    }

    void display() {
        System.out.println("Developer Name: " + name + ", ID: " + id + ", Salary: " + salary + ", Project: " + project);
    }
}

class Intern extends Employee {
    String university;

    Intern(String name, int id, double salary, String university) {
        super(name, id, salary);
        this.university = university;
    }

    void display() {
        System.out.println("Intern Name: " + name + ", ID: " + id + ", Salary: " + salary + ", University: " + university);
    }
}

class Product {
    int id;
    String name;
    double price;
    int quantity;

    Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Product ID: " + id + ", Name: " + name + ", Price: " + price + ", Quantity: " + quantity);
    }
}

class Electronics extends Product {
    String brand;

    Electronics(int id, String name, double price, int quantity, String brand) {
        super(id, name, price, quantity);
        this.brand = brand;
    }

    void display() {
        System.out.println("Electronics ID: " + id + ", Name: " + name + ", Price: " + price + ", Quantity: " + quantity + ", Brand: " + brand);
    }
}

class Clothing extends Product {
    String size;

    Clothing(int id, String name, double price, int quantity, String size) {
        super(id, name, price, quantity);
        this.size = size;
    }

    void display() {
        System.out.println("Clothing ID: " + id + ", Name: " + name + ", Price: " + price + ", Quantity: " + quantity + ", Size: " + size);
    }
}

class Groceries extends Product {
    String expiryDate;

    Groceries(int id, String name, double price, int quantity, String expiryDate) {
        super(id, name, price, quantity);
        this.expiryDate = expiryDate;
    }

    void display() {
        System.out.println("Groceries ID: " + id + ", Name: " + name + ", Price: " + price + ", Quantity: " + quantity + ", Expiry Date: " + expiryDate);
    }
}

public class Prac9 {
    public static void main(String[] args) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        while (choice != 4) {
            System.out.println("What do you want to do?");
            System.out.println("1. Employee");
            System.out.println("2. Online");
            System.out.println("3. Upcast And Downcast");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Employee Emp = new Employee("Nisarg", 232, 35000);
                    Emp.display();
                    Manager Mg = new Manager("Ved", 343, 345000, "CSE");
                    Mg.display();
                    Developer Dv = new Developer("Saurin", 224, 50000, "Medical");
                    Dv.display();
                    Intern It = new Intern("Anik", 356, 45000, "GUNI");
                    It.display();
                    break;
                case 2:
                    Product Pd = new Product(12, "Laptop", 50000, 2);
                    Pd.display();
                    Electronics M11 = new Electronics(12, "Mobile", 10000, 1, "Samsung");
                        M11.display();
                        Clothing Fr = new Clothing(12, "T-shirt", 2300, 2, "XL");
                        Fr.display();
                        Groceries Tea = new Groceries(23, "Red label", 2300, 1, "27-10-2024");
                        Tea.display();
                        break;
                    case 3:
                        Upast up = new Docast(); // Upcasting
                        up.display();
                        Docast down = (Docast) up; // Downcasting
                        down.display();
                        break;
                    case 4:
                        System.exit(0);
                        break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
        sc.close();
    }
}