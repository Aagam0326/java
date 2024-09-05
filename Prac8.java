class BAM{
    private float balance;
    private int accountNumber;

    public float getBalance(){
        return balance;
    }

    public void setBalance(float balance){
        this.balance = balance;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
}

class ED{
    private String name;
    private int age;
    private float salary;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public float getSalary(){
        return salary;
    }

    public void setSalary(float salary){
        this.salary = salary;
    }
}

public class Prac8 {
    public static void main(String[] args){
        BAM b = new BAM();
        b.setBalance(1000);
        b.setAccountNumber(123456789);

        ED e = new ED();
        e.setName("John Doe");
        e.setAge(25);
        e.setSalary(50000);

        System.out.println("Account Number: " + b.getAccountNumber());
        System.out.println("Balance: " + b.getBalance());
        System.out.println("Name: " + e.getName());
        System.out.println("Age: " + e.getAge());
        System.out.println("Salary: " + e.getSalary());
    }
}