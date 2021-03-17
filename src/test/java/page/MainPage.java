package page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MainPage extends BasePage {
    String SITE_URL = "https://www.facebook.com/";

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void goTo() {
        driver.get(SITE_URL);
    }

    @FindBy(xpath = "//input[@id='email']")
    private WebElement fieldEMail;


    public void enterTextInEMailfield(String login) {
//        WebElement element = driver.findElement(By.id("email"));
//        element.sendKeys(login);
        fieldEMail.sendKeys(login);
    }

    public void enterTextInPasswordField(String password) {
        WebElement element = driver.findElement(By.id("pass"));
        element.sendKeys(password);
    }

    public void clickLogInButton() {
        WebElement element = driver.findElement(By.name("login"));
        element.click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
    }


    public void loginfail() {
        if (driver.getCurrentUrl().equalsIgnoreCase(
                "https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjE0NjYzNjY2LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D")) {
            System.out.println("Test2 Pass");
        } else {
            System.out.println("Test2 Failed");
        }

    }

    public void relogin() {
        //String url = driver.getCurrentUrl();
        //System.out.println(url);
        if (driver.getCurrentUrl().equalsIgnoreCase(
                "https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjE0NjYzNjY2LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D")) {
            System.out.println("Test2 Pass");
        } else {
            System.out.println("Test2 Failed");
        }
    }
}
