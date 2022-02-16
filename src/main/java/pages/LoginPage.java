package pages;

import WebLocators.LoginPageElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    public WebDriver driver;

    private By usernameField = By.xpath(LoginPageElement.usernameField);
    private By passField = By.xpath(LoginPageElement.passwordField);
    private By LoginButton = By.xpath(LoginPageElement.LoginButton);

    public void enterUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(passField).sendKeys(password);
    }

    public void clickOnLoginButton(){
        driver.findElement(LoginButton).click();

    }
}
