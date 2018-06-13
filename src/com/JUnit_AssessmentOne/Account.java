package com.JUnit_AssessmentOne;

public class Account
{
    private int accountNumber;
    private float balance;


    public Account(int _accountNumber, float _balance)
    {
        accountNumber = _accountNumber;
        balance = _balance;
    }

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountNumber(int _accountNumber)
    {
        accountNumber = _accountNumber;
    }

    public float getBalance()
    {
        return balance;
    }

    public void setBalance(float _balance)
    {
        balance = _balance;
    }

    public void Deposit(float _amountToAdd)
    {
        balance += _amountToAdd;
    }

    public void Withdraw(float _amountToTake)
    {
        if((balance - _amountToTake) >= 0)
        {
            balance -= _amountToTake;
        }
    }
}
