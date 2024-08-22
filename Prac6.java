import java.util.*;
public class Prac6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Table of 10=> ");
        for(int i=1; i<=10; i++) {
            System.out.println("10 x "+i+" = "+(10*i));
        }
        //Write a program that takes a string as input and uses a for loop to print the string in reverse.
        String str;
        System.out.println("Enter a string: ");
        str = sc.nextLine();
        for(int i=str.length()-1; i>=0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println("\n");
        int n = 0;
        for(int i=1; i<=100; i++) {
            n += i;
        }
        System.out.println("Sum of first 100 natural numbers: "+n);
        
        sc.close();
    }  
}

/**
 * Share
 */

class Share {
    public static void main(String[] args) {
        Scanner cv = new Scanner(System.in);
        float Sell_price , Buy_price , Profit , loss;
        System.out.print("Enter your Selling Price:");
        Sell_price = cv.nextFloat();
        System.out.print("Enter your Buying Price:");
        Buy_price = cv.nextFloat();
        if (Buy_price > Sell_price) {
            loss = Buy_price - Sell_price;
            System.out.println("Your loss is :"+ loss);
            System.out.println("And Your Loss Percentage is:"+ ((loss/Buy_price)*100));
        } else if (Buy_price == Sell_price) {
            System.out.println("You Have not earned profit and loss");
        } else {
            Profit = Sell_price - Buy_price;
            System.out.println("Your Profit is :"+ Profit);
            System.out.println("And Your Profit Percentage is:"+ ((Profit/Buy_price)*100));
        }
        cv.close();
    }
}