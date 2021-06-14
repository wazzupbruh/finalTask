package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//div[@id='chrome-header']")
    private WebElement header;

    @FindBy(xpath = "//footer")
    private WebElement footer;

    @FindBy(xpath = "//a[@data-testid='miniBagIcon']")
    private WebElement cartIcon;

    @FindBy(xpath = "//button[@data-testid='country-selector-btn']")
    private WebElement languageButton;

    @FindBy(xpath = "//button[@data-testid='myAccountIcon']")
    private WebElement myAccountIcon;

    @FindBy(xpath = "//a[@data-testid='signin-link']")
    private WebElement signInPopup;

    @FindBy(xpath = "//a[@data-testid='signup-link']")
    private WebElement signUpPopup;

    @FindBy(xpath = "//button[@data-testid='signout-link']")
    private WebElement signOutPopup;

    @FindBy(xpath = "//a[@data-testid='myaccount-link']")
    private WebElement myAccountLink;

    @FindBy(xpath = "//input[@data-testid='search-input']")
    private WebElement searchField;

    @FindBy(xpath = "//button[@data-testid='search-button-inline']")
    private WebElement searchButton;

    final String homePageUrlPart = "/ru/men/";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openHomePage(String url) {
        driver.get(url);
    }

    public boolean isHeaderVisible() { return header.isDisplayed(); }

    public boolean isFooterVisible() {
        return footer.isDisplayed();
    }

    public boolean isSearchFieldVisible() { return searchField.isDisplayed(); }

    public boolean isCartIconVisible() {
        return cartIcon.isDisplayed();
    }

    public WebElement getSignInPopup() { return signInPopup; }

    public WebElement getSignUpPopup() { return signUpPopup;}

    public WebElement getSignOutPopup() { return signOutPopup; }

    public void clickSignInPopup() { signInPopup.click(); }

    public void clickSignUpPopup() { signUpPopup.click(); }

    public void clickSignOutPopup() { signOutPopup.click(); }

    public void clickMyAccountLinkPopped() { myAccountLink.click(); }

    public void hoverMyAccountIcon()
    {
        Actions action = new Actions(driver);
        action.moveToElement(myAccountIcon).perform();
    }

    public String getHomePageUrlPart(){ return homePageUrlPart; }

    public WebElement getHeader() { return header; }

    public WebElement getMyAccountLink() { return myAccountLink; }

    public boolean isMyAccountIconVisible(){ return myAccountIcon.isDisplayed(); }

    public boolean isSignInPopupVisible(){ return signInPopup.isDisplayed(); }

    public boolean isSignUpPopupVisible() { return signUpPopup.isDisplayed(); }

    public boolean isSignOutPopupVisible() { return signOutPopup.isDisplayed(); }

    public boolean isMyAccountLinkPoppedVisible() { return myAccountLink.isDisplayed(); }

}
