package com.testingacademy.pages.POM.VWO;

import com.testingacademy.utils.WaitHelper;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Page Class
    //Page Locator
    private By username = By.id("login-username");
    private By password = By.id("login-password");
    private By submitBtn = By.id("js-login-btn");
    private By error_message = By.id("js-notification-box-msg");

    //Page Actions
    public String loginToInvalidCreds(String usr, String pwd) {
        driver.findElement(username).sendKeys(usr);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(submitBtn).click();

        WaitHelper.checkVisibility(driver, error_message);
        String errorMsg = driver.findElement(error_message).getText();
        return errorMsg;
    }

    public void loginToValidCreds(String usr, String pwd) {
        driver.findElement(username).sendKeys(usr);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(submitBtn).click();
    }
}
