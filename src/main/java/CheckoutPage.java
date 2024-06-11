import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {    private WebDriver driver;

    private By firstNameField = By.id("first-name");
    private By lastNameField = By.id("last-name");
    private By postalCodeField = By.id("postal-code");
    private By continueButton = By.id("continue");
    private By finishButton = By.id("finish");
    private By orderComplete = By.className("complete-header");
    private By  errorMessage = By.cssSelector(".error-message-container.error");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterFirstName(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void enterPostalCode(String postalCode) {
        driver.findElement(postalCodeField).sendKeys(postalCode);
    }

    public void clickContinue() {
        driver.findElement(continueButton).click();
    }

    public void clickFinish() {
        driver.findElement(finishButton).click();
    }

    public boolean isOrderComplete() {
        return driver.findElements(orderComplete).size() > 0;
    }
    public boolean isErrorMessage(){
        return driver.findElements(errorMessage).size()>0;
    }
}
