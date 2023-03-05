package practice.exercises;

import org.junit.*;

public class Q6_before_after {
    @BeforeClass
    public static void setUp(){
        System.out.println("Before Class");
    }

    @AfterClass
    public static void tearDown(){
        System.out.println("After Class");
    }

    @Before
    public void before(){
        System.out.println("Before");
    }

    @After
    public void after(){
        System.out.println("After");
    }

    @Test
    public void ahmet(){
        System.out.println("Ahmet");
    }

    @Test
    public void beyza(){
        System.out.println("Beyza");
    }

    @Test
    public void mehmet(){
        System.out.println("Mehmet");
    }

}
