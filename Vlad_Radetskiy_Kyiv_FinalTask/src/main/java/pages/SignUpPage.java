package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage extends BasePage{
    @FindBy(xpath = "//input[@class='qa-email-textbox']")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@class='qa-firstname-textbox']")
    private WebElement firstNameInput;

    @FindBy(xpath = "//input[@class='qa-lastname-textbox']")
    private WebElement lastNameInput;

    @FindBy(xpath = "//input[@class='qa-password-textbox']")
    private WebElement passwordInput;

    @FindBy(xpath = "//select[@name='BirthDay']")
    private WebElement birthDaySelect;

    @FindBy(xpath = "//select[@name='BirthMonth']")
    private WebElement birthMonthSelect;

    @FindBy(xpath = "//select[@name='BirthYear']")
    private WebElement birthYearSelect;

    @FindBy(xpath = "//input[contains(@class,'qa-submit')]")
    private WebElement signUpButton;


    @FindBy(xpath = "//div[contains(@id,'register-form')]")
    private WebElement signUpContainer;

    @FindBy(xpath = "//span[@id='Email-error']")
    private WebElement emailError;

    @FindBy(xpath = "//span[@id='FirstName-error']")
    private WebElement nameError;

    @FindBy(xpath = "//span[@id='LastName-error']")
    private WebElement surnameError;

    @FindBy(xpath = "//span[@id='Password-error']")
    private WebElement passwordError;

    @FindBy(xpath = "//span[@id='BirthDay-error']")
    private WebElement birthDayError;

    @FindBy(xpath = "//span[@id='BirthMonth-error']")
    private WebElement birthMonthError;

    @FindBy(xpath = "//span[@id='BirthYear-error']")
    private WebElement birthYearError;

    @FindBy(xpath = "//h2[@class='qa-contact-preferences']")
    private WebElement randomLabel;

    final String testEmail = "accForAutoTest";

    final String testFirstName = "Name";

    final String testLastName = "Surname";

    final String signUpPageUrlPart = "/identity/register";

    double randomEmailNumber = Math.round(Math.random()*1000000);

    String fakeEmailToRegister = "fakeEmail" + (int)randomEmailNumber + "@gmail.com";

    final String fakeFirstNameToRegister = "fakeName";

    final String fakeLastNameToRegister = "fakeSurname";

    final String fakePasswordToRegister = "fakePassword";

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public boolean isEmailInputVisible(){
        return emailInput.isDisplayed();
    }

    public boolean isFirstNameInputVisible(){
        return firstNameInput.isDisplayed();
    }

    public boolean isLastNameInputVisible(){
        return lastNameInput.isDisplayed();
    }

    public boolean isPasswordInputVisible(){
        return passwordInput.isDisplayed();
    }

    public boolean isBirthDaySelectVisible(){
        return birthDaySelect.isDisplayed();
    }

    public boolean isBirthMonthSelectVisible(){
        return birthMonthSelect.isDisplayed();
    }

    public boolean isBirthYearSelectVisible(){
        return birthYearSelect.isDisplayed();
    }

    public boolean isSignUpButtonVisible(){
        return signUpButton.isDisplayed();
    }

    public String getSignUpPageUrlPart(){
        return signUpPageUrlPart;
    }

    public void fillEmailField() { emailInput.sendKeys(fakeEmailToRegister); }

    public void fillFirstNameField() { firstNameInput.sendKeys(fakeFirstNameToRegister); }

    public void fillLastNameField() { lastNameInput.sendKeys(fakeLastNameToRegister); }

    public void fillPasswordField() { passwordInput.sendKeys(fakePasswordToRegister); }

    public boolean isSignUpContainerVisible(){ return signUpContainer.isDisplayed(); }

    public void pickDayOfBirthSelector() {
        Select select = new Select(birthDaySelect);
        waitForAjaxToComplete(10);
        select.selectByVisibleText("1");
        waitForAjaxToComplete(10);
        WebElement firstElement = select.getFirstSelectedOption();
    }

    public void pickMonthOfBirthSelector() {
        Select select = new Select(birthMonthSelect);
        select.selectByVisibleText("Январь");
        WebElement firstElement = select.getFirstSelectedOption();
    }

    public void pickYearOfBirthSelector() {
        Select select = new Select(birthYearSelect);
        select.selectByVisibleText("2002");
        WebElement firstElement = select.getFirstSelectedOption();
    }

    public void clickSignUpButton(){ signUpButton.click(); }

    public void clickEmailField() { emailInput.click(); }

    public void clickFirstNameField() { firstNameInput.click(); }

    public void clickLastNameField() { lastNameInput.click(); }

    public void clickPasswordField() { passwordInput.click(); }

    public void clickBirthDaySelector() { birthDaySelect.click(); }

    public void clickBirthMonthSelector() { birthMonthSelect.click(); }

    public void clickBirthYearSelector() { birthYearSelect.click(); }

    public void clickRandomLabel() { randomLabel.click(); }

    public boolean isWrongEmailWarningVisible() { return emailError.isDisplayed(); }

    public boolean isWrongFirstNameWarningVisible() { return nameError.isDisplayed(); }

    public boolean isWrongLastNameWarningVisible() { return surnameError.isDisplayed(); }

    public boolean isWrongPasswordWarningVisible() { return passwordError.isDisplayed(); }
}
