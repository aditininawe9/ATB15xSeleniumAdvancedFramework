package com.testingacademy.pages.POM.VWO;

import com.testingacademy.utils.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

    //vwo@gymzz.com
    WebDriver driver;
    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }
    private By userNameOnDashboard = By.xpath("//span[@data-qa=\"lufexuloga\"]");
    public String loggedInUserName() {
        WaitHelper.waitJVM(10000);
        driver.get("https://app.vwo.com/#/dashboard?accountId=1215638");
        WaitHelper.waitJVM(5000);
        return driver.findElement(userNameOnDashboard).getText();
    }

}
