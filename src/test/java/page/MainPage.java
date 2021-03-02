package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage{
    String SITE_URL="https://www.facebook.com/";
    public MainPage(WebDriver driver){
        super(driver);
    }

    public void goTo(){
        driver.get(SITE_URL);
    }

    public void fillInlogin(String login){
        WebElement element = driver.findElement(By.id("email"));
        element.sendKeys(login);
    }

    public void fillInPass(String password){
        WebElement element = driver.findElement(By.id("pass"));
        element.sendKeys(password);
    }

    public void loginButton(){
        WebElement element = driver.findElement(By.name("login"));
        element.click();
    }


    public void loginfail() {


        if(driver.getCurrentUrl().equalsIgnoreCase(
                "https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=120&lwc=1348028")){
            System.out.println("Test2 Pass");
        } else {
            System.out.println("Test2 Failed");
        }

    }

    public void relogin() {
        //String url = driver.getCurrentUrl();
        //System.out.println(url);
        if(driver.getCurrentUrl().equalsIgnoreCase(
                "https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=120&lwc=1348028")){
            System.out.println("Test2 Pass");
        } else {
            System.out.println("Test2 Failed");
        }
    }
}
