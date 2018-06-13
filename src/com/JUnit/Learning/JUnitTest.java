package com.JUnit.Learning;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class JUnitTest
{
    @Before
    public void BeforeTests()
    {
        System.out.println("Running before tests...");
        System.out.println("Completed before tests.");
    }

    @Test
    public void test_Add()
    {
        System.out.println("Running Addition test cases...");
        Addition app1 = new Addition();
        assertEquals(10, app1.add(5, 5));
        assertNotEquals(500, app1.add(250, 249));
        System.out.println("Completed Addition test cases.");
    }

    @Test
    public void test_Add2()
    {
        System.out.println("Running Addition negative test cases...");
        Addition app1 = new Addition();
        assertEquals(-10, app1.add(-5, -5));
        assertNotEquals(-500, app1.add(250, -249));
        System.out.println("Completed Addition negative test cases.");
    }

    @After
    public void AfterTests()
    {
        System.out.println("Running after cases...");
        System.out.println("Completed after cases.");
    }
}
