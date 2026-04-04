package com.testingacademy.tests.VWO;

import com.testingacademy.pages.POM.VWO.LoginPage;
import com.testingacademy.utils.PropertyReader;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestVWOLogin_01_Improved_POM {
    @Owner("Aditi")
    @Description("Verify invalid username and password")
    @Test
    public void test_negative_vwo_login() {
        PropertyReader PropertiesReader = null;
        WebDriver driver = new ChromeDriver();
        driver.get(PropertiesReader.readKey("url"));
        LoginPage loginPage = new LoginPage(driver);
        String error_msg = loginPage.loginToInvalidCreds(PropertiesReader.readKey("invalid_username"),PropertiesReader.readKey("invalid_password"));

    }
}
