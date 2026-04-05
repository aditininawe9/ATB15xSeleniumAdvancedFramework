package com.testingacademy.base;
import com.testingacademy.utils.PropertiesReader;
import org.openqa.selenium.By;

import static com.testingacademy.driver.DriverManager.getDriver;

public class CommonToAllPage {
    public void openVWOUrl() {
        getDriver().get(PropertiesReader.readKey("url"));
    }
    public void clickElement(By by) {
        getDriver().findElement(by).click();
    }
    public void enterInput(By by, String key) {
        getDriver().findElement(by).sendKeys(key);
    }
}
