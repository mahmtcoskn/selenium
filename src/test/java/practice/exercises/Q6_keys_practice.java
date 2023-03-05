package practice.exercises;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q6_keys_practice {

    static WebDriver driver;

    WebElement searchBox;

    @BeforeClass
    public static void setUp(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Before
    public void before(){
        driver.get("https://www.google.com/");
        searchBox = driver.findElement(By.xpath("//input[@title='Ara']"));
    }

    @Test
    public void test01(){
        searchBox.sendKeys("The Lord of the Rings" + Keys.ENTER);
        WebElement sonuc1 = driver.findElement(By.id("result-stats"));
        System.out.println(sonuc1.getText());
    }

    @Test
    public void test02(){
        searchBox.sendKeys("Brave Heart" + Keys.ENTER);
        WebElement sonuc2 = driver.findElement(By.id("result-stats"));
        System.out.println(sonuc2.getText());
    }

    @Test
    public void test03(){
        searchBox.sendKeys("Harry Potter" + Keys.ENTER);
        WebElement sonuc3 = driver.findElement(By.id("result-stats"));
        System.out.println(sonuc3.getText());
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }

}
