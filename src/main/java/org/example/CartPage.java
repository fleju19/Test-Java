package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private
    WebDriver driver;

    private By backpackInCart = By.xpath("//div[text()='Sauce Labs Backpack']");
    private By boltTShirtInCart = By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']");
    private By onesieInCart = By.xpath("//div[text()='Sauce Labs Onesie']");
    private By bikeLightInCart = By.xpath("//div[text()='Sauce Labs Bike Light']");
    private By removeBackpackButton = By.id("remove-sauce-labs-backpack");
    private By removeBoltTShirtButton = By.id("remove-sauce-labs-bolt-t-shirt");
    private By checkoutButton = By.id("checkout");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isBackpackInCart() {
        return driver.findElements(backpackInCart).size() > 0;
    }

    public boolean isBoltTShirtInCart() {
        return driver.findElements(boltTShirtInCart).size() > 0;
    }

    public boolean isOnesieInCart() {
        return driver.findElements(onesieInCart).size() > 0;
    }

    public boolean isBikeLightInCart() {
        return driver.findElements(bikeLightInCart).size() > 0;
    }

    public void removeBackpackFromCart() {
        driver.findElement(removeBackpackButton).click();
    }

    public void removeBoltTShirtFromCart() {
        driver.findElement(removeBoltTShirtButton).click();
    }

    public void clickCheckout() {
        driver.findElement(checkoutButton).click();
    }

    public boolean isProductInCart(String productName) {
        By productLocator = By.xpath("//div[text()='" + productName + "']");
        return driver.findElements(productLocator).size() > 0;
    }
}
