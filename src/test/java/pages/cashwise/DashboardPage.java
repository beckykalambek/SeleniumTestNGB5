package pages.cashwise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DashboardPage {
    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (css = "#panel1a-header")
    public WebElement salesButton;

    @FindBy (linkText = "Invoice")
    public WebElement invoiceButton;

    @FindBy (xpath = "//header[@class='css-1dqr069']")
    public WebElement invoiceText;

}
