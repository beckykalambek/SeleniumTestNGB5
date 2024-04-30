package tests.cashwiseTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.cashwise.DashboardPage;
import pages.cashwise.LoginPage;
import utilities.Config;
import utilities.Driver;

public class InvoiceTest {
    LoginPage loginPage = new LoginPage();
    WebDriver driver = Driver.getDriver();
    DashboardPage dashboardPage = new DashboardPage();

    @Test
    public void login() {
        driver.get(Config.getProperty("cashwise"));
        loginPage.loginToCashwise(Config.getProperty("cashwiseUsername"), Config.getProperty("cashwisePassword"));
    }

    @Test
    public void salesFieldVerification() {
        Assert.assertTrue(dashboardPage.salesButton.isDisplayed(), "element is not found");
    }

    @Test
    public void verifyUserSeesInvoiceSection() {
        dashboardPage.salesButton.click();
        Assert.assertTrue(dashboardPage.invoiceButton.isDisplayed(), "invoice button is not found");
    }

    @Test
    public void userIsOnInvoicePage() throws InterruptedException {
        dashboardPage.salesButton.click();
        dashboardPage.invoiceButton.click();
        Assert.assertTrue(dashboardPage.invoiceText.isDisplayed(), "page is not found");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}




//When User clicks to the “Sales”
//
//Then Verify that user sees menu with “Clients”, “Product Services” and “Invoice”
//
//When User navigates to the "Invoices" section
//
//Verify User is on the “Invoice” page