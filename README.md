# eBay Automation Framework

## Tech Stack

* Java
* Selenium
* TestNG
* Maven
* Extent Reports

## Features

* Page Object Model (POM)
* JSON Test Data
* Explicit Waits
* Screenshot on Failure
* Extent Reporting

## How to Run

```bash
mvn clean test
```

## Test Flow

This automation test simulates a real user searching for a car on eBay and applying filters.

### Steps:

1. Launch Chrome browser using WebDriverManager
2. Navigate to https://www.ebay.com/
3. Validate that the home page is loaded successfully
4. Read test data (`searchText`) from external JSON file
5. Enter the search keyword (e.g., "mazda mx-5") in the search box
6. Click on the search button
7. Wait for search results page to load
8. Validate that search results are displayed
9. Extract the results count from the page header (e.g., "48 results for mazda mx-5")
10. Print/log the results count in the console
11. Scroll to filters section
12. Apply filter: Transmission → Manual (if available)
13. Generate Extent Report after execution
14. Close the browser

## Reporting

* Extent HTML Report is generated under:

```
reports/ExtentReport.html
```