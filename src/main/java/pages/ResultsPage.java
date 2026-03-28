package pages;

import org.openqa.selenium.*;
import utils.WaitUtils;

public class ResultsPage {

    private WebDriver driver;

    private By resultsCountText = By.cssSelector(".srp-controls__count-heading span.BOLD");
    private By manualOption = By.xpath("//span[contains(text(),'Manual')]");

    public ResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public int getResultsCountFromHeader() {
        WaitUtils.waitForElement(driver, resultsCountText);
        String text = driver.findElement(resultsCountText).getText();
        text = text.replaceAll("[^0-9]", ""); // remove any non-numbers
        return Integer.parseInt(text);
    }

    public void applyManualFilter() {
        WaitUtils.waitForElement(driver, manualOption);
        WebElement manual = driver.findElement(manualOption);
        manual.click();
        System.out.println("Manual filter applied");
    }
}