package page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

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

    @FindBy(xpath = "(//div/a)[3]")
    private WebElement messageError;
    //Можно тоже придраться так как привязываться к тексту не самый лучший вариант при условии того, что страница имеет разные языки

    @FindBy(xpath = "//button[@id='loginbutton']")
    private WebElement buttonRelogin;

    @FindBy(xpath = "//div[contains(text(),'Веденный вами электронный адрес или номер мобильного телефона не связан ни с одним аккаунтом.')]")
    private List<WebElement> textError;

    public void enterTextInEMailfield(String login) {
        fieldEMail.sendKeys(login);
    }

    public void enterTextInPasswordField(String password) {
        fieldPassword.sendKeys(password);
    }

    public void clickLogInButton() {
        buttonLogin.click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div/a)[3]")));
    }


    public void LogInFail() {
        assertTrue((messageError).isDisplayed());
        assertTrue("Text not found!", textError.size() > 0);
    }

    public void reLogInAvailable() {
        assertTrue((buttonRelogin).isDisplayed());
    }
}
