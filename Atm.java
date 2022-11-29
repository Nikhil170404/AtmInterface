//import required classes and packages
import java.util.Scanner;

//create ATMExample class to implement the ATM functionality
public class Registers {

    //main method starts
    public static void main(String args[] )
    {
    Scanner sc = new Scanner(System.in);



        //declare and initialize balance, withdraw, and deposit
        int balance = 100000 , withdraw,deposit,transfer;
        String Transfer;



        while(true)
        {
            System.out.println("Automated Teller Machine");
            System.out.println("1.   Withdraw");
            System.out.println("2.   Deposit");
            System.out.println("3.   Check Balance");
            System.out.println("4.   Transfer");
            System.out.println("5.   EXIT");
            System.out.print("Choose the operation you want to perform:");

            //get choice from user
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter money to be withdrawn:");

                    //get the withdrawl money from user
                    withdraw = sc.nextInt();

                    //check whether the balance is greater than or equal to the withdrawal amount
                    if(balance >= withdraw)
                    {
                        //remove the withdrawl amount from the total balance
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                    }
                    else
                    {
                        //show custom error message
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;

                case 2:

                    System.out.print("Enter money to be deposited:");

                    //get deposite amount from te user
                    deposit = sc.nextInt();

                    //add the deposit amount to the total balanace
                    balance = balance + deposit;
                    System.out.println("Your Money has been successfully deposited");
                    System.out.println("");
                    break;

                case 3:
                    //displaying the total balance of the user
                    System.out.println("Balance : "+balance);
                    System.out.println("");
                    break;

                case 4:
                    // Recipient Name
                    System.out.println("Enter Recipient Name :");
                    //Getting recipient name from user
                    Transfer = sc.next();
                    System.out.println("Recipient Name :"+Transfer);
                    // Taking input of transfer Money
                    System.out.println("Enter Money to transfer :");
                    transfer = sc.nextInt();
                    if(balance >= transfer)
                    {
                        //remove the withdrawl amount from the total balance
                        balance = balance - transfer;
                        System.out.println("Money Has Been Sent to"+ Transfer);
                    }
                    else
                    {
                        //show custom error message
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;

                case 5:
                    //exit from the menu
                    System.exit(0);
            }
        }
    }
}
