package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.LoginPage;
import pages.PIMPage;
import utilities.Driver;
import utilities.SeleniumUtils;

public class PIMTest {
    LoginPage loginPage = new LoginPage();
    PIMPage pimPage = new PIMPage();
    WebDriver driver = Driver.getDriver();
    CommonPage commonPage = new CommonPage();

    @BeforeMethod
    public void login (){

        loginPage.login("Admin", "admin123");
    }
    @Test
    public void verifyAdminCanCreateEmployee (){
        commonPage.pimTab.click();
        pimPage.addEmployee();

        String expectedName = pimPage.fName + " " + pimPage.lName;

        SeleniumUtils.verifyTextInElement(driver, 20, pimPage.firstName, expectedName);

        commonPage.pimTab.click();

        WebElement empIdInTable = driver.findElement(By.xpath("//div[text()='" + pimPage.employeeId1 + "']"));

        SeleniumUtils.verifyTextInElement(driver,20, pimPage.fullNameText, expectedName);
        commonPage.pimTab.click();
        WebElement firstNameInTable = driver.findElement(By.xpath("//div[text()='" + pimPage.employeeId1 + "']/..//following-sibling::div[1]"));
        WebElement lastnameInTable = driver.findElement(By.xpath("//div[text()='" + pimPage.employeeId1 + "']/..//following-sibling::div[2]"));
        WebElement empIDInTable = driver.findElement(By.xpath("//div[text()='" + pimPage.employeeId1 + "']"));
        SeleniumUtils.verifyTextInElement(driver,20,empIDInTable,pimPage.employeeId1);
        SeleniumUtils.verifyTextInElement(driver,20,firstNameInTable,pimPage.fName);
        SeleniumUtils.verifyTextInElement(driver,20,lastnameInTable,pimPage.lName);
    }
}
//SeleniumUtils.verifyTextInElement(driver,20, pimPage.fullNameText, expectedName);
//commonPage.pimTab.click();
//WebElement firstNameInTable = driver.findElement(By.xpath("//div[text()='" + pimPage.empId + "']/..//following-sibling::div[1]"));
//WebElement lastnameInTable = driver.findElement(By.xpath("//div[text()='" + pimPage.empId + "']/..//following-sibling::div[2]"));
//WebElement empIDInTable = driver.findElement(By.xpath("//div[text()='" + pimPage.empId + "']"));
//SeleniumUtils.verifyTextInElement(driver,20,empIDInTable,pimPage.empId);
//SeleniumUtils.verifyTextInElement(driver,20,firstNameInTable,pimPage.fName);
//SeleniumUtils.verifyTextInElement(driver,20,lastnameInTable,pimPage.lName);