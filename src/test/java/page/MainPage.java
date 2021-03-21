package page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

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

    @FindBy(xpath = "//input[@id='pass']")
    private WebElement fieldPassword;

    @FindBy(xpath = "//button[@name='login']")
    private WebElement buttonLogin;

    @FindBy(xpath = "//a[contains(text(),'Найдите свой аккаунт и войдите в систему.')]")
    private WebElement messageError;

    @FindBy(xpath = "//button[@id='loginbutton']")
    private WebElement buttonRelogin;

    public void enterTextInEMailfield(String login) {
        fieldEMail.sendKeys(login);
    }

    public void enterTextInPasswordField(String password) {
        fieldPassword.sendKeys(password);
    }

    public void clickLogInButton() {
        buttonLogin.click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
    }


    public void LogInFail() {
        assertTrue((messageError).isDisplayed());
    }

    public void reLogInAvailable() {
        assertTrue((buttonRelogin).isDisplayed());
    }
}
