package com.testingacademy.pages.POM.VWO;

import com.testingacademy.utils.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FreetrialPage {
    WebDriver driver;
    public FreetrialPage(WebDriver driver) {
        this.driver = driver;
    }

    private By cookies = By.id("onetrust-accept-btn-handler");
    private By inputEmail = By.name("email");
    private By checkbox = By.name("gdpr_consent_checkbox");
    private By freeTrialButton = By.xpath("//button[@data-qa=\"page-su-submit\"]");
    private By firstName = By.name("first_name");
    private By lastName = By.name("last_name");
    private By phNumber = By.name("phone");
    private By createAccount = By.xpath("//button[@data-qa=\"page-su-submit\"]");

    public void createAccount(String email, String fName, String lName, String pNum) {
        WaitHelper.checkVisibility(driver, cookies, 5);
        driver.findElement(cookies).click();

        driver.findElement(inputEmail).sendKeys(email);
        driver.findElement(checkbox).click();

        WaitHelper.checkClickable(driver, freeTrialButton, 10);
        driver.findElement(freeTrialButton).click();

        WaitHelper.checkClickable(driver, firstName, 15);

        driver.findElement(firstName).sendKeys(fName);
        driver.findElement(lastName).sendKeys(lName);
        driver.findElement(phNumber).sendKeys(pNum);
//        WebElement btn = driver.findElement(createAccount);
    }
}