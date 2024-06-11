package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class InventoryPage {private WebDriver driver;

    private By backpack = By.id("add-to-cart-sauce-labs-backpack");
    private By boltTShirt = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    private By onesie = By.id("add-to-cart-sauce-labs-onesie");
    private By bikeLight = By.id("add-to-cart-sauce-labs-bike-light");
    private By cartButton = By.className("shopping_cart_link");
    private By sortDropdown = By.className("product_sort_container");


    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addBackpackToCart() {
        driver.findElement(backpack).click();
    }

    public void addBoltTShirtToCart() {
        driver.findElement(boltTShirt).click();
    }

    public void addOnesieToCart() {
        driver.findElement(onesie).click();
    }

    public void addBikeLightToCart() {
        driver.findElement(bikeLight).click();
    }

    public void goToCart() {
        driver.findElement(cartButton).click();
    }
    public void sortProductsBy(String option) {
        Select dropdown = new Select(driver.findElement(sortDropdown));
        dropdown.selectByVisibleText(option);
    }
    public void addFirstProductToCart() {
        List<WebElement> addToCartButtons = driver.findElements(By.cssSelector(".inventory_item .btn_inventory"));
        addToCartButtons.get(0).click();
    }
    public void addLastProductToCart() {
        List<WebElement> addToCartButtons = driver.findElements(By.cssSelector(".inventory_item .btn_inventory"));
        addToCartButtons.get(addToCartButtons.size() - 1).click();
    }
    public String getFirstProductName() {
        List<WebElement> productNames = driver.findElements(By.className("inventory_item_name"));
        return productNames.get(0).getText();
    }

    public String getLastProductName() {
        List<WebElement> productNames = driver.findElements(By.className("inventory_item_name"));
        return productNames.get(productNames.size() - 1).getText();
    }

    public String getFirstProductPrice() {
        List<WebElement> productPrices = driver.findElements(By.className("inventory_item_price"));
        return productPrices.get(0).getText();
    }




}
