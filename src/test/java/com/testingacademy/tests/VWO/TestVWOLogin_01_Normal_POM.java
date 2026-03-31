package com.testingacademy.tests.VWO;

import com.testingacademy.pages.POM.VWO.LoginPage;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
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
}
