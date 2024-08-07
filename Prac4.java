import java.util.*;
class Prac4_1 {
    public static void main(String[] args) {
        Scanner sj = new Scanner(System.in);
        System.out.println("Enter your options: ");
        System.out.println("1. Age Checker");
        System.out.println("2. Password length Checker");
        int option = sj.nextInt();
        if (option == 1) {
            System.out.println("You have selected Age Checker");
            System.out.println("Enter your age: ");
            int age = sj.nextInt();
            if (age >= 18) {
                System.out.println("You are eligible to vote");
            } else {
                System.out.println("You are not eligible to vote");
            }
        } else if (option == 2) {
            System.out.println("You have selected Password length Checker");
            System.out.println("Enter the password: ");
        String password = sj.next();
        if (password.length() >= 8 && password.length() <= 14) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password is invalid");
        }
        } else {
            System.out.println("Invalid option");
            
        }
        sj.close();
    }
}

class Prac4_2 {
    public static void main(String[] args) {
        Scanner sv = new Scanner(System.in);
        System.out.println("Enter your options: ");
        System.out.println("1. Discount");
        System.out.println("2. Pass or Fail");
        System.out.println("3. Even or Odd");
        int option = sv.nextInt();
        if (option == 1) {
            System.out.println("You have selected Discount");
            System.out.println("Enter the amount: ");
            double amount = sv.nextDouble();
            double discount = (amount > 1000)? amount * 0.1 : 0;
            System.out.println("The discount is " + discount);
        } else if (option == 2) {
            System.out.println("You have selected Pass or Fail");
            System.out.println("Enter the marks: ");
            int marks = sv.nextInt();
            String result = (marks >= 40)? "Pass" : "Fail";
            System.out.println("The result is " + result);
        } else if (option == 3) {
            System.out.println("You have selected Even or Odd");
            System.out.println("Enter the number: ");
            int num = sv.nextInt();
            String IsEven = (num % 2 == 0)? "Even" :"Odd" ;
            System.out.println("The number is " + IsEven);
        } else {
            System.out.println("Invalid option");
        }
        sv.close();
    }
}