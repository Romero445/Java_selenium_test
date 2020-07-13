package pages.login_test;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;


public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private final By menuKeys = By.xpath("//button[@class='gm-btn gm-btn--login']");
    private final By inputLogin = By.xpath("//input[@id='login-form-login']");
    private final By inputPassword = By.xpath("//input[@id='login-form-password']");
    private final By btnLogin = By.xpath("//button[@class='gm-btn gm-btn--login-form']");
    private final By userInfo = By.xpath("//div[@class='gm-user-info--line']");

    public LoginPage clickBtnL (){
        driver.findElement(menuKeys).click();
        return this;
    }
    public LoginPage enterLogin(String login) {
        driver.findElement(inputLogin).sendKeys(login);
        return this;
    }

    public LoginPage enterPassword(String password ){
        driver.findElement(inputPassword).sendKeys(password);
        return this;
    }

    public LoginPage pushLogin (){
        driver.findElement(btnLogin).click();
        return this;
    }

    public LoginPage userInfoPresent (String text){
        waitElementIsVisible(driver.findElement(userInfo));
        WebElement details = driver.findElement(userInfo);
        Assertions.assertEquals(text, details.getText());

        return this;
    }









}
