package com.testingacademy.tests.VWO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestVWOInvalidLogin_Without_POM {

    public void test_vwo_login() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();

        WebElement emailInputBox = driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("admin@admin.com");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin@1234");

        WebElement submitBtn = driver.findElement(By.id("js-login-btn"));
        submitBtn.click();

        WebElement error_message = driver.findElement(By.className("notification-box-description"));
        error_message.getText();


        WebElement Start_a_free_trial = driver.findElement(By.linkText("Start a free trial"));
        Start_a_free_trial.click();

    }
}
