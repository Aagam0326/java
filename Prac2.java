import java.util.Scanner;

class Prac2_1 {
    public static void main(String[] args) {
        double inr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount in INR");
        inr = sc.nextDouble();
        double CHF = inr * 0.01015;
        System.out.println(inr + " INR is equal to " + CHF + "CHF");
        sc.close();
    }
}

class Prac2_2 {
    public static void main(String[] args) {
        Scanner sv = new Scanner(System.in);
        int OOP , DBMS , DSA , AEM ;
        System.out.print("Enter the marks of OOP:");
        OOP = sv.nextInt();
        System.out.print("Enter the marks of DBMS:");
        DBMS = sv.nextInt();
        System.out.print("Enter the marks of DSA:");
        DSA = sv.nextInt();
        System.out.print("Enter the marks of AEM:");
        AEM = sv.nextInt();
        double avg = (OOP + DBMS + DSA + AEM) / 4;
        System.out.println("Average of marks is " + avg);
        char grade;
        if (avg >= 80) {
            grade = 'A';
            } else if (avg >= 60) {
                grade = 'B';
                } else if (avg >= 40) {
                    grade = 'C';
                    } else {
                        grade = 'F';
                        }
        System.out.println("Grade is " + grade);
        sv.close();
    }
}