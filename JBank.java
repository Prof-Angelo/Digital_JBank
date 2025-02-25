import java.util.Scanner;

public class JBank {
    
    static Scanner scr = new Scanner(System.in); 
    
    public static void main(String[] args) {
        
        int yourChoice;
        double balance = 0;
        double withdrawal;
        double deposit;
        boolean isRunning = true;
        
        while(isRunning) {
       System.out.println("*******************************");
        System.out.println("DIGITAL JBANK (MADE BY BLANCO)");
        System.out.println("*******************************\n");
        
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        
        System.out.println("\n*******************************");
        
        System.out.print("Enter your choice: ");
        yourChoice = scr.nextInt();
        
        switch(yourChoice) {
            case 1:
            System.out.print("\nYour balance is: " + balance);
            break;
            
            case 2:
            System.out.print("\nAmount of deposit: ");
            deposit = scr.nextDouble();
            
            if(deposit == 0) {
                System.out.println("Minimum of 1 pesos deposit!");
            } else if(deposit < 0) {
                 System.out.println("Negative can't be deposited!");
            } else {
                balance += deposit;
                System.out.print("\nSUCCESSFUL TRANSACTION! \nYour new balance is " + balance);
            }
            break;
            
            case 3:
            System.out.print("\nAmount of withdrawal: ");
            withdrawal = scr.nextDouble();
            
            if(withdrawal < 0) {
                System.out.println("\nWITHDRAWAL CAN'T BE NEGATIVE!");
            } else if(balance == 0) {
                System.out.println("\nINSUFFICIENT FUNDS!");
            } else if(withdrawal > balance) {
                System.out.println("\nINSUFFICIENT FUNDS!");
            } else {
                balance -= withdrawal;
               System.out.print("\nSUCCESSFUL TRANSACTION! \nYour new balance is " + balance);
            } 
            break;
            
            case 4:
            isRunning = false;
            System.out.print("\n\nThank you for trusting Digital JBank as your co-partner!");
            break;
            
            default:
            System.out.print("\nNone of the choices!");
        }
            
        }
            scr.close();
   }
}