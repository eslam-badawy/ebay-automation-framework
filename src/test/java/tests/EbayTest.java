package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.ResultsPage;
import utils.JsonReader;
import org.testng.annotations.Listeners;
import utils.TestListener;

@Listeners(TestListener.class)
public class EbayTest extends BaseTest {

    @Test
    public void testEbayFlow() {

        String searchText = JsonReader.getData().get("searchText").asText();
        HomePage home = new HomePage(driver);
        // Validate home page landing
        Assert.assertTrue(home.isHomePageLoaded(), "Home page not loaded");

        // Search
        home.search(searchText);

        ResultsPage results = new ResultsPage(driver);
        // Header count
        int count = results.getResultsCountFromHeader();

        // Validate results
        Assert.assertTrue(count > 0, "No results found");

        // Print result
        System.out.println("Results count: " + count);

        // Apply filter
        results.applyManualFilter();
    }
}