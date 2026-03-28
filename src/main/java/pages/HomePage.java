package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WaitUtils;

public class HomePage {

    private WebDriver driver;

    private By searchBox = By.id("gh-ac");
    private By searchBtn = By.id("gh-search-btn");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Validate page loaded
    public boolean isHomePageLoaded() {
        return driver.findElement(searchBox).isDisplayed();
    }

    // Perform search
    public void search(String text) {
        WaitUtils.waitForElement(driver, searchBox);
        driver.findElement(searchBox).sendKeys(text);
        driver.findElement(searchBtn).click();
    }
}