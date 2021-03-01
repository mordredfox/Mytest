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
        //проверочка

        if(driver.getCurrentUrl().equalsIgnoreCase(
                "https://www.facebook.com/")){
            System.out.println("Test2 Pass");
        } else {
            System.out.println("Test2 Failed");
        }

    }

    public void relogin() {
        String url = driver.getCurrentUrl();
        System.out.println(url);
        if(driver.getCurrentUrl().equalsIgnoreCase(
                "https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjE0NjIwMzQxLCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D")){
            System.out.println("Test2 Pass");
        } else {
            System.out.println("Test2 Failed");
        }
    }
}
