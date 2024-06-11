package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class AlertExample {
    public AlertExample(WebDriver driver) {
    }

    public void handleAlert(WebDriver driver) {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}

