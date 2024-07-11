import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("Welcome to Bank of XYZ");
        int balance = 10000, deposit, withdraw; 
        while (true) {
            System.out.println("Press botton 1 for deposit");
            System.out.println("Press botton 2 for withdraw");
            System.out.println("Press botton 3 for checkbalance ");
            System.out.println("Press botton 4 for Exit");
            System.out.println(" choose correct Choice");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                System.out.println("Enter your deposit Amount");
                deposit = scan.nextInt();
                balance = balance + deposit;
                System.out.println( "Your balance are update" + balance);
                System.out.println("Thankyou");
                System.exit(0);
                    break;
                    case 2:
             System.out.println("Enter Amount to withdrawl");
                withdraw = scan.nextInt();
                if(balance >= withdraw ){
                balance = balance -  withdraw;
                System.out.println( "Your balance are update" + + balance);
                System.out.println("Thankyou");
                System.exit(0);
                }
                else{
                System.out.println("Insufficiant balance");
                }
                
                    break;
                    case 3:
                    System.out.println( "Your  current account balance  " + balance);
                    System.out.println("Thankyou");
                    System.exit(0);
                    System.out.println();
                    break;
                    case 4 :
                    System.exit(0);
                    break;
                 
            }
        }
    }
}
