package com.testingacademy.pages.POM.VWO.normalPOM;

import com.testingacademy.utils.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.testingacademy.base.CommonToAllPage;

import static com.testingacademy.driver.DriverManager.getDriver;

public class LoginImprovedPOM extends CommonToAllPage {
    WebDriver driver;

    public LoginImprovedPOM(WebDriver driver) {
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
        enterInput(username, usr);
        enterInput(password, pwd);
        clickElement(submitBtn);

        WaitHelper.checkVisibility(getDriver(), error_message);
        String errorMsg = driver.findElement(error_message).getText();
        return errorMsg;
    }

    public void loginToValidCreds(String usr, String pwd) {
        openVWOUrl();
        enterInput(username, usr);
        enterInput(password, pwd);
        clickElement(submitBtn);

        WaitHelper.waitJVM(5000);
    }
}
