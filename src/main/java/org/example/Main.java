package org.example;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;
class Bank
{
    private static final Logger LOGGER=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
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
            LOGGER.log(Level.INFO,"your savings are low amount choose less amount: ");
        }
        else{
            LOGGER.info("You are successfully withdraw amount is "+withamount);
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
        LOGGER.log(Level.INFO,"Enter your name:");
        name=sc.nextLine();
        LOGGER.log(Level.INFO,"Enter Account number:");
        accountno=sc.nextLong();
        LOGGER.log(Level.INFO,"Enter the amount:");
        balance=sc.nextInt();
        Bank person=new Bank(name,accountno,balance);
        while(true)
        {
            LOGGER.log(Level.INFO,"\n1)DEPOSIT \n2)WITHDRAW\n3)CURRENT BALANCE\n4)EXIT");
            int select;
            LOGGER.log(Level.INFO,"Select any one of the option in the above: ");
            select=sc.nextInt();
            if(select==1)
            {
                LOGGER.log(Level.INFO,"How much amout deposit: ");
                amount=sc.nextInt();
                person.deposit(amount);
            }
            else if(select==2)
            {
                LOGGER.log(Level.INFO,"Enter how much amout withdraw: ");
                withamount=sc.nextInt();
                person.withdraw(withamount);
            }
            else if(select==3)
            {
                LOGGER.log(Level.INFO,Integer.toString(person.currentBalance()),"Current Balance in the account: "+person.currentBalance());
            }
            else{
                LOGGER.log(Level.INFO,"THANK YOU USER COME AGAIN");
                break;
            }
        }
    }
}