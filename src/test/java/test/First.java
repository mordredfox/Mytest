package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.MainPage;

import java.util.concurrent.TimeUnit;

public class First extends BaseWeb {

    @Test
    public void firsttest(){
          main.goTo();
          main.fillInlogin("mord");
          main.fillInPass("neroONE");
          main.loginButton();
          main.loginfail();
          main.relogin();
    }
}
