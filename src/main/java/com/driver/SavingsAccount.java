package com.driver;

public class SavingsAccount extends BankAccount{
    double rate;
    double maxWithdrawalLimit;

    public SavingsAccount(String name, double balance, double maxWithdrawalLimit, double rate) {
        super(name, balance,0);
        // minimum balance is 0 by default
       this.maxWithdrawalLimit = maxWithdrawalLimit;
       this.rate = rate;
    }
    public void withdraw(double amount) throws Exception {

        if(amount > this.maxWithdrawalLimit)
        {
            //If the amount exceeds maximum withdrawal limit
            throw new Exception("Maximum Withdraw Limit Exceed");
        }
        if(amount > getBalance())
        {
            // if amount exceed balance
            throw new Exception("Insufficient Balance");
        }
        this.setBalance(this.getBalance() - amount);
    }

    public double getSimpleInterest(int years){
        // Return the final amount considering that bank gives simple interest on current amount
            //Simple Interest = (P × R × T) ÷ 100
            //Amount = SI + P

        double simple_In = (getBalance() * this.rate * years) / 100;
        double amount = simple_In + getBalance();
        return amount;
    }

    public double getCompoundInterest(int times, int years){
        // Return the final amount considering that bank gives compound interest on current amount given times per year
        double amount = this.getBalance() * Math.pow(1 + (this.rate / times), times * years);
        double cinterest = amount - this.getBalance();
        return cinterest;
    }

}
