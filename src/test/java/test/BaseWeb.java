package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import page.MainPage;

import java.util.concurrent.TimeUnit;

public class BaseWeb {

    WebDriver driver;
    public MainPage main;


    public void start(){
        WebDriverManager.chromedriver().setup();
        //System.out.println("aaaaaaaaaaaaaa it works");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        main = PageFactory.initElements(driver,MainPage.class);
    }

    //@AfterEach
    //public void finish(){
    //  driver.quit();
    //}
}
