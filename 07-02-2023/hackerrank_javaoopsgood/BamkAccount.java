import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class BankAccount {
    private String name;
    private long accountNo;
    private int balance;
    private static long runningAcNo;
    public BankAccount(String name){
        this.name = name;
        balance = 0;
        this.accountNo = runningAcNo;
        runningAcNo++;
    }
    public String getName(){
        return name;
    }
    public long getAcNo(){
        return accountNo;
    }
    public void deposit(int amount){
        balance += amount;
    }
    public static void setAcNo(long startAcNo){
        runningAcNo = startAcNo;
    }
    public void withdraw(int amount){
        if(amount > balance){
            System.out.println("Negative Balance Transaction Cancelled");
        }
        else{
            balance -= amount;
        }
    }
    public void display(){
        System.out.println(accountNo+" "+name+" "+balance);
    }
}
public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        long runningAcNo = sc.nextLong();
        BankAccount.setAcNo(runningAcNo);
        String name = sc.next();
        BankAccount ac = new BankAccount(name);
        int n = sc.nextInt();
        sc.nextLine();
        while(n-- > 0){
            String[] input = sc.nextLine().split(" ");
            if(input[0].toLowerCase().equals("deposit")){
                ac.deposit(Integer.parseInt(input[1]));
            }
            else if(input[0].toLowerCase().equals("withdraw")){
                ac.withdraw(Integer.parseInt(input[1]));
            }
            else if(input[0].toLowerCase().equals("display")){
                ac.display();
            }
        }
    }
}
