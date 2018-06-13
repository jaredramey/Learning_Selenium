package com.JUnit_AssessmentOne;

import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class JUnit_Tests_Account
{
    private Account customer1 = new Account(1234, 30.0f);
    private Account customer2 = new Account(6543, 80.0f);

    @BeforeClass
    public static void BeforeTests()
    {
        System.out.println("Starting tests...");
    }

    @Before
    public void BeforeCases()
    {
        System.out.println("||--------------------Test--------------------||");
    }

    @Test
    public void Test_AccountCreation()
    {
        System.out.println("Starting AccountCreation test...");
        assertEquals(1234, customer1.getAccountNumber());
        assertEquals(6543, customer2.getAccountNumber());
        assertEquals(30.0f, customer1.getBalance(), 0.1f);
        assertEquals(80.0f, customer2.getBalance(), 0.1f);
        System.out.println("Completed AccountCreation test.");
    }

    @Test
    public void Test_AccountDesposit()
    {
        System.out.println("Starting AccountDeposit test...");
        customer1.Deposit(10.0f);
        assertEquals(40.0f, customer1.getBalance(), 0.1f);

        customer2.Deposit(20.0f);
        assertEquals(100.0f, customer2.getBalance(), 0.1f);
        System.out.println("Completed AccountDeposit test.");
    }

    @Test
    public void Test_AccountWithdraw()
    {
        System.out.println("Starting AccountWithdraw test...");
        customer1.Withdraw(10.0f);
        assertEquals(20.0f, customer1.getBalance(), 0.1f);

        customer2.Withdraw(20.0f);
        assertEquals(60.0f, customer2.getBalance(), 0.1f);
        System.out.println("Completed AccountWithdraw test.");
    }

    @After
    public void AfterCases()
    {
        System.out.println("||----------------Test Complete---------------||");
        System.out.println("Resetting account balances...");
        customer1.setBalance(30.0f);
        customer2.setBalance(80.0f);
        System.out.println("Account balances have been reset.");
    }

    @AfterClass
    public static void AfterTests()
    {
        System.out.println("Test cases are complete.");
    }
}
