package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage{
    @FindBy(xpath = "//input[contains(@class,'qa-email-textbox')]")
    private WebElement emailField;

    @FindBy(xpath = "//input[contains(@class,'qa-password-textbox')]")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@id='signin']")
    private WebElement signInButton;

    @FindBy(xpath = "//input[@value='Я НЕ РОБОТ']")
    private WebElement antiRobotButton;

    @FindBy(xpath = "//div[contains(@class,'signin-container')]")
    private WebElement signInContainer;

    @FindBy(xpath = "//span[@id='EmailAddress-error']")
    private WebElement wrongEmailWarning;

    @FindBy(xpath = "//span[@id='Password-error']")
    private WebElement emptyPasswordWarning;

    @FindBy(xpath = "//li[@id='loginErrorMessage']")
    private WebElement wrongEmailOrPassWarning;

    final String signInPageUrlPart = "/identity/login";

    final String testAccountEmail = "accForAutoTest@gmail.com";

    final String testAccountPassword = "accforautotest";

    final String emailWithoutAtSign = "accForAutoTestgmail.com";

    final String emailWithMultipleAtSigns= "accForAutoTest@@gmail.com";

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void openSignInPage(String url) {
        driver.get(url);
    }

    public boolean isEmailFieldVisible() {
        return emailField.isDisplayed();
    }

    public boolean isPasswordFieldVisible() { return passwordField.isDisplayed(); }

    public WebElement getEmailField(){ return emailField; }

    public String getSignInPageUrlPart(){ return signInPageUrlPart;}

    public void fillEmailField(){
        emailField.clear();
        emailField.sendKeys(testAccountEmail);
    }

    public void fillEmailFieldWithoutAtSign(){
        emailField.clear();
        emailField.sendKeys(emailWithoutAtSign);
    }

    public void fillEmailFieldWithMultipleAtSigns(){
        emailField.clear();
        emailField.sendKeys(emailWithMultipleAtSigns);
    }

    public void fillPasswordField(){
        passwordField.clear();
        passwordField.sendKeys(testAccountPassword);
    }

    public boolean isSignInButtonVisible(){ return signInButton.isDisplayed(); }

    public boolean isSignInContainerVisible(){ return signInContainer.isDisplayed(); }

    public void clickSignInButton(){ signInButton.click(); }

    public boolean isWrongEmailWarningVisible(){ return wrongEmailWarning.isDisplayed(); }

    public boolean isEmptyPasswordWarningVisible() { return emptyPasswordWarning.isDisplayed(); }

    public WebElement getPasswordField() { return passwordField; }

    /*
    public boolean isAntiRobotButtonVisible() { return antiRobotButton.isDisplayed(); }

    public void clickAntiRobotButton(){ antiRobotButton.click(); }
     */

}
