package pages.cashwise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//button[@class='MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButtonBase-root css-1wgjx4y']")
    public WebElement signInButtonFirst;
    @FindBy (id = "email_input_text")
    public WebElement username;

    @FindBy (id = "password_input_text")
    public WebElement password;

    @FindBy (xpath = "//button[@class='MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-fullWidth MuiButtonBase-root css-hl90zr']")
    public WebElement signinButtonSecond;


    public void loginToCashwise (String userName, String pwd){
        signInButtonFirst.click();
        username.sendKeys(userName);
        password.sendKeys(pwd);
        signinButtonSecond.click();
    }

}
