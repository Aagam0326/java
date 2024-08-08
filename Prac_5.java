import java.util.*;
class Prac5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Select the option: 1. IsEven 2.IsElligible 3.IsInteger :");
        int option = sc.nextInt();
        if (option == 1) {
            System.out.println("You have selected Even or Odd");
            System.out.println("Enter the number: ");
            int num = sc.nextInt();
            String IsEven = (num % 2 == 0)? "Even" :"Odd" ;
            System.out.println("The number is " + IsEven);
        } else if (option == 2) {
            System.out.println("You have selected Age Checker");
            System.out.println("Enter your age: ");
            int age = sc.nextInt();
            if (age >= 18) {
                System.out.println("You are eligible to vote");
            } else {
                System.out.println("You are not eligible to vote");
            }
        } else if (option == 3) {
            System.out.println("You Have Choosen Integer Checker");
            System.out.println("Enter the number: ");
            int num = sc.nextInt(); //checking for +ve  , 0 ,or -ve
            String IsInteger = (num > 0)? "Positive" : (num == 0)? "Zero" : "Negative";
            System.out.println("The number is " + IsInteger);
        } else {
            System.out.println("Invalid Option");
        }
        sc.close();
    }
}

class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Burger, Pizza, Sandwhich;
        double Total;
        double Tax = 0.12;
        System.out.println("What Do You Want To Order?");
        System.out.println("1. Burger");
        System.out.println("2. Pizza");
        System.out.println("3. Sandwhich");
        System.out.print("Choose Your Option:");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter The Quantity Of Burger:");
                Burger = sc.nextInt();
                Total = Burger * 150;
                if (Burger > 5) {
                    Total = Total - (Total * 0.1);
                    Total = Total + (Total * Tax);    
                } else {
                    Total = Total + (Total * Tax);
                }
                System.out.println("Total Amount: INR " + Total);
                break;
            case 2:
                System.out.print("Enter The Quantity Of Pizza:");
                Pizza = sc.nextInt();
                Total = Pizza * 300;
                if (Total > 1000) {
                    Total = Total - (Total * 0.15);
                    Total = Total + (Total * Tax);    
                } else {
                    Total = Total + (Total * Tax);
                }
                System.out.println("Total Amount: INR " + Total);
                break;
            case 3:
                System.out.print("Enter The Quantity Of Sandwhich:");
                Sandwhich = sc.nextInt();
                Total = Sandwhich * 100;
                if (Total > 500) {
                    Total = Total - (Total * 0.2);
                    Total = Total + (Total * Tax);    
                } else{
                    Total = Total + (Total * Tax);
                }
                System.out.println("Total Amount: INR " + Total);
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }
        sc.close();
    }
}

class Days_and_Months {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month;
        int day;
        System.out.println("Enter the month:");
        month = sc.nextInt();
        System.out.println("Enter the day:");
        day = sc.nextInt();
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                break;
        }
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                break;
        }
        sc.close();
    }
}

class Insurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the person's health condition:");
        String health = sc.next();
        System.out.println("Enter the person's age:");
        int age = sc.nextInt();
        System.out.println("Enter the person's location(City/Village):");
        String location = sc.next();
        System.out.println("Enter the person's Gender(Male/Female):");
        String Gender = sc.next();
        
        if(health.equals("excellent") && age >= 25 && age <= 35 && location.equals("City") && Gender.equals("male")){
            System.out.println("The person should be insured");
            System.out.println("The premium rate is Rs.4000");
            System.out.println("The maximum amount for which he/she can be insured is Rs.2,00,000");
        }
        else if(health.equals("excellent") && age >= 25 && age <= 35 && location.equals("City") && Gender.equals("female")){
            System.out.println("The person should be insured");
            System.out.println("The premium rate is Rs.3000");
            System.out.println("The maximum amount for which he/she can be insured is Rs.1,00,000");
        }
        else if(health.equals("poor") && age >= 25 && age <= 35 && location.equals("Village") && Gender.equals("male")){
            System.out.println("The person should be insured");
            System.out.println("The premium rate is Rs.6000");
            System.out.println("The maximum amount for which he/she can be insured is Rs.10,000");
        }
        else{
            System.out.println("The person is not insured");
        }
        sc.close();
    }
}