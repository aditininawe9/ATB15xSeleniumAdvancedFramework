package com.testingacademy.tests.VWO;

import com.testingacademy.pages.POM.VWO.normalPOM.DashboardPage;
import com.testingacademy.pages.POM.VWO.normalPOM.FreetrialPage;
import com.testingacademy.pages.POM.VWO.normalPOM.LoginPage;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestVWOLogin_01_Normal_POM {
    //D river
    //L ocator
    //V erification

    @Owner("Aditi")
    @Description("Verify invalid email, paswrod, error message is shown")
    @Test

    public void test_negative_vwo_login() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        LoginPage loginPage = new LoginPage(driver);
        String error_msg = loginPage.loginToInvalidCreds("admin@gmail.com","admin@123");
        Assert.assertEquals(error_msg, error_msg);
        driver.quit();
    }

    @Owner("Aditi")
    @Description("Verify valid email, password, dashboard page is shown")
    @Test

    public void test_positive_vwo_login() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToValidCreds("cxh04@tempumail.cc", "ILoveDrive#08");
        DashboardPage dashboardPage = new DashboardPage(driver);
        String userNameLoggedIn = dashboardPage.loggedInUserName();
        driver.quit();
    }

    @Owner("Aditi")
    @Description("Verify free email login")
    @Test
    public void test_free_email_login() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://vwo.com/free-trial/?utm_medium=website&utm_source=login-page&utm_campaign=mof_eg_loginpage");
        FreetrialPage freetrialPage = new FreetrialPage(driver);
        freetrialPage.createAccount("dvkwbo7908@goldpaclk.store","Aditi","Soni","9393939393");
    }
}
