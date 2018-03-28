package tests;

import org.junit.*;

public class BasicAnnotations {
    @BeforeClass
    public static void beforeClass() {
        System.out.println("BeforeClass - Run first only one time\n");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("AfterClass - Run last only one time");
    }
    @Before
    public void beforeMethod() {
        System.out.println("Before - Run before each @Test");
    }
    @After
    public void afterMethod() {
        System.out.println("After - Run after each @Test\n");
    }

    @Test
    public void testMethodOne() {
        System.out.println("Test - Test number 1");
    }

    @Test
    public void testMethodTwo() {
        System.out.println("Test - Test number 2");
    }
}
