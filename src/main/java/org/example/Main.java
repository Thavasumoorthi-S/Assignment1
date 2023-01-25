package org.example;

import java.util.*;
class Bank
{
    String name;
    long accountno;
    int balance;
    Bank(String name,long accountno,int balance)
    {
        this.name=name;
        this.accountno=accountno;
        this.balance=balance;
    }
    public void deposit(int amount)
    {
        balance=balance+amount;
    }
    public void withdraw(int withamount)
    {
        if(balance<withamount)
        {
            System.out.println("your savings are low amount choose less amount: ");
        }
        else{
            System.out.println("You are successfully withdraw amout is "+withamount);
            balance=balance-withamount;
        }
    }
    public int currentBalance()
    {
        return balance;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String name;
        long accountno;
        int balance;
        int amount;
        int withamount;
        System.out.println("Enter your name:");
        name=sc.nextLine();
        System.out.println("Enter Account number:");
        accountno=sc.nextLong();
        System.out.println("Enter the amount:");
        balance=sc.nextInt();
        Bank person=new Bank(name,accountno,balance);
        while(true)
        {
            System.out.println("\n1)DEPOSIT \n2)WITHDRAW\n3)CURRENT BALANCE\n4)EXIT");
            int select;
            System.out.println("Select any one of the option in the above: ");
            select=sc.nextInt();
            if(select==1)
            {
                System.out.println("How much amout deposit: ");
                amount=sc.nextInt();
                person.deposit(amount);
            }
            else if(select==2)
            {
                System.out.println("Enter how much amout withdraw: ");
                withamount=sc.nextInt();
                person.withdraw(withamount);
            }
            else if(select==3)
            {
                System.out.println("current balance in the bank account "+person.currentBalance()+"/-");
            }
            else{
                System.out.println("THANK YOU USER COME AGAIN");
                break;
            }
        }
    }
}