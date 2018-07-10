package xyz.swatt.testng;

import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * The Class doing the Tests.
 */
public class TestClass {

    @DataProvider
    public static Iterator< Object[] > factoryDataProvider() {

        System.out.println("Factory\tDataProvider");

        final int COUNT = 13;

        List<Object[]> toRet = new ArrayList( COUNT );

        for( int i = 0; i < COUNT; i++ ) {
            char c = (char) ( 'a' + new Random().nextInt( 26 ) );
            toRet.add( new Object[] { String.valueOf(c) } );
        }

        return toRet.iterator();
    }

    private final String INSTANCE_NAME;

    @Factory(dataProvider = "factoryDataProvider")
    public TestClass(String _instanceName) {

        System.out.println("Factory\t" + _instanceName);

        INSTANCE_NAME = _instanceName;
    }

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

    @DataProvider
    public Iterator< Object[] > testMethodDataProvider() {

        System.out.println("TestMethod\tDataProvider");

        final int COUNT = 3;

        List<Object[]> toRet = new ArrayList( COUNT );

        for( int i = 0; i < COUNT; i++ ) {
            toRet.add( new Object[] { String.valueOf(i) } );
        }

        return toRet.iterator();
    }

    @Test(dataProvider = "testMethodDataProvider")
    public void testMethod(String _testName) {
        System.out.println("Test\tMethod " + INSTANCE_NAME + "-" + _testName);
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

    @Override
    public String toString() {
        return INSTANCE_NAME;
    }
}
