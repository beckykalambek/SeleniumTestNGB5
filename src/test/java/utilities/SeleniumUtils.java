package utilities;


import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class SeleniumUtils {
    /**
     * This method clicks on the given element, switch to the newly opened tab and prints its url
     * @param driver - is used to open new application
     * @param element - is clicked to open new tab
     */
    public static void switchToNewTab (WebDriver driver, WebElement element){
        String mainWindow = driver.getWindowHandle();

        element.click();

        for (String windowHandle : driver.getWindowHandles()){
            if (!windowHandle.equals(mainWindow)){
                driver.switchTo().window(windowHandle);
            }
        }
        System.out.println("Currently, the driver is on: " + driver.getCurrentUrl());
    }


    /**
     * This method waits for element to be clickable
     * before clicking on it
     * @param driver - is used to open new application
     * @param element - is clicked to open new tab
     */
    public static void click (WebDriver driver, WebElement element){
        FluentWait wait = new FluentWait(driver)
                .ignoring(ElementClickInterceptedException.class)
                .withTimeout(Duration.ofSeconds(30));

        wait.until(ExpectedConditions.elementToBeClickable(element));

        element.click();
    }

    /**
     * This method accepts alert, if alert is not there it ignores the exception
     * @param driver
     */
    public static void acceptAlert (WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.alertIsPresent());
        try {
            driver.switchTo().alert().accept();
        }catch (NoAlertPresentException e){
            System.out.println("Alert does not exist!");
            e.printStackTrace();
        }
    }

    /**
     * This method dismisses alert, if alert is not there it ignores the exception
     * @param driver
     */
    public static void dismissAlert (WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.alertIsPresent());
        try {
            driver.switchTo().alert().dismiss();
        }catch (NoAlertPresentException e){
            System.out.println("Alert does not exist!");
            e.printStackTrace();
        }
    }


    public static boolean isElementPresent (WebDriver driver, By locator) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

        try {
            driver.findElement(locator);
            return true;
        }catch (NoSuchElementException e) {
            return false;
        }
    }


    public static void clickWithRetries (WebDriver driver, By locator, int retries) throws InterruptedException {
        int numOfTrials = 0;
        while (numOfTrials < retries)
       try { WebElement element = driver.findElement(locator);
        element.click();
        return;
    }
       catch (StaleElementReferenceException e){
           numOfTrials++;
           waitForSeconds(1);  //
       }catch (NoSuchElementException e){
           System.out.println("wrong locator!");
           e.printStackTrace();
           return;
       }
    }

       public static void waitForSeconds (int numberOfSeconds){
        try {
            Thread.sleep(numberOfSeconds * 1000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
       }

    /**
     * This methods waits the text to appear in the element
     * then verifies if it matches with expected text
     * @param driver takes to the page
     * @param numOfSecs to wait for
     * @param element to verify
     * @param expectedText to verify
     */
       public static void verifyTextInElement(WebDriver driver, int numOfSecs, WebElement element, String expectedText){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(numOfSecs));
        wait.until(ExpectedConditions.textToBePresentInElement(element,expectedText));

           Assert.assertEquals(expectedText, element.getText());
       }

       public static void clearAndSendKeys (WebDriver driver, WebElement element, String textToSend){
           Actions actions = new Actions(driver);

           actions.keyDown(element, Keys.COMMAND).sendKeys("a");
           actions.keyUp(element, Keys.COMMAND);
           actions.keyDown(element, Keys.BACK_SPACE);
           actions.keyUp(element, Keys.COMMAND);


       }
}
