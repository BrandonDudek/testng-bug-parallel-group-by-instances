package xyz.swatt.testng;

import org.testng.annotations.*;

/**
 * The Class doing the Tests.
 */
public class TestClass {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before\tSuite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before\tTest");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before\tClass");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before\tMethod");
    }

    @Test
    public void testMethod() {
        System.out.println("Test\tMethod");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After\tMethod");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After\tClass");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After\tTest");
    }

    @AfterSuite
    public void AfterSuite() {
        System.out.println("After\tSuite");
    }

}
