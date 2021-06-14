package stepdefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_lol.AN;
import manager.PageFactoryManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import pages.*;

import java.util.concurrent.TimeUnit;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;
import static java.lang.Thread.sleep;
import static org.junit.Assert.*;

public class DefinitionSteps {

    private static final long DEFAULT_TIMEOUT = 60;
    WebDriver driver;
    HomePage homePage;
    SignInPage signInPage;
    SignUpPage signUpPage;
    MyAccountPage myAccountPage;
    PageFactoryManager pageFactoryManager;

    @Before
    public void testsSetUp() {
        chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        pageFactoryManager = new PageFactoryManager(driver);
    }

    @Given("User opens {string} page")
    public void openPage(final String url) {
        homePage = pageFactoryManager.getHomePage();
        homePage.openHomePage(url);
    }

    @And("User checks header visibility")
    public void checkHeaderVisibility() {
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        homePage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
        assertTrue(homePage.isHeaderVisible());
    }

    @And("User checks search field visibility")
    public void checkSearchFieldVisibility() {
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        assertTrue(homePage.isSearchFieldVisible());
    }

    @And("User checks footer visibility")
    public void checkFooterVisibility() {
        assertTrue(homePage.isFooterVisible());
    }

    @And("User checks cart visibility")
    public void checkCartVisibility() {
        assertTrue(homePage.isCartIconVisible());
    }

    @And("User checks 'my account' button visibility")
    public void checkMyAccountIconVisibility() {
        homePage.waitVisibilityOfElement(DEFAULT_TIMEOUT, homePage.getHeader());
        assertTrue(homePage.isMyAccountIconVisible());
    }

    @And("User hovers 'my account' button")
    public void hoverMyAccount() {
        homePage.hoverMyAccountIcon();
        homePage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
    }

    @And("User checks popped 'sign in' button visibility")
    public void checkSignInPopupVisibility(){
        homePage.waitVisibilityOfElement(DEFAULT_TIMEOUT, homePage.getSignInPopup());
        assertTrue(homePage.isSignInPopupVisible());
    }

    @And("User clicks popped 'sign in' button")
    public void clickSignInPopup() {
        homePage.clickSignInPopup();
    }

    @And("User gets redirected to 'sign in' page")
    public void checkThatSignInUrlEqualsExpected() {
        signInPage = pageFactoryManager.getSignInPage();
        signInPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, signInPage.getEmailField());
        assertTrue(driver.getCurrentUrl().contains(signInPage.getSignInPageUrlPart()));
    }

    @And("User checks email field visibility on 'sign in' page")
    public void checkEmailFieldOnSignInPageVisibility() {
        assertTrue(signInPage.isEmailFieldVisible());
    }

    @And("User checks password field visibility on 'sign in' page")
    public void checkPasswordFieldOnSignInPageVisibility() {
        assertTrue(signInPage.isPasswordFieldVisible());
    }

    @And("User checks 'sign in' button visibility on 'sign in' page")
    public void checkSignInButtonVisibility() {
        assertTrue(signInPage.isSignInButtonVisible());
    }

    @And("User enters email in appropriate field on 'sign in' page")
    public void fillEmailFieldOnSignInPage() {
        signInPage.fillEmailField();
    }

    @And("User enters password in appropriate field on 'sign in' page")
    public void fillPasswordFieldOnSignInPage() {
        signInPage.fillPasswordField();
    }

    @And("User clicks 'sign in' button on 'sign in' page")
    public void clickSignInButton() {
        signInPage.clickSignInButton();
        signInPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        signInPage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
    }

    @And("User gets redirected to home page")
    public void redirectedToMainPage() {
        homePage.waitVisibilityOfElement(DEFAULT_TIMEOUT, homePage.getHeader());
        assertTrue(driver.getCurrentUrl().contains(homePage.getHomePageUrlPart()));
    }

    @And("User checks 'sign out' button visibility")
    public void checkSignOutPopupVisibility(){
        homePage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
        homePage.waitVisibilityOfElement(DEFAULT_TIMEOUT, homePage.getSignOutPopup());
        assertTrue(homePage.isSignOutPopupVisible());
    }

    @And("User clicks 'sign out' button")
    public void clickSignOutPopup() {
        homePage.clickSignOutPopup();
    }

    @And("User checks popped 'sign up' button visibility")
    public void checkSignUpButtonVisibility() {
        homePage.waitVisibilityOfElement(DEFAULT_TIMEOUT, homePage.getSignUpPopup());
        assertTrue(homePage.isSignUpPopupVisible());
    }

    @And("User clicks popped 'sign up' button")
    public void clickSignUpPopup() {
        homePage.clickSignUpPopup();
    }

    @And("User gets redirected to 'sign up' page")
    public void checkThatSignUpUrlEqualsExpected() {
        signUpPage = pageFactoryManager.getSignUpPage();
        assertTrue(driver.getCurrentUrl().contains(signUpPage.getSignUpPageUrlPart()));
    }

    @And("User checks email field visibility on 'sign up' page")
    public void checkEmailFieldOnSignUpPageVisibility() { assertTrue(signUpPage.isEmailInputVisible()); }

    @And("User checks first name field visibility on 'sign up' page")
    public void checkFirstNameFieldVisibility() {
        assertTrue(signUpPage.isFirstNameInputVisible());
    }

    @And("User checks last name field visibility on 'sign up' page")
    public void checkLastNameFieldVisibility() {
        assertTrue(signUpPage.isLastNameInputVisible());
    }

    @And("User checks password field visibility on 'sign up' page")
    public void checkPasswordFieldOnSignUpPageVisibility() { assertTrue(signUpPage.isPasswordInputVisible()); }

    @And("User checks birthday select visibility on 'sign up' page")
    public void checkBirthDaySelectVisibility() {
        assertTrue(signUpPage.isBirthDaySelectVisible());
    }

    @And("User checks birth month select visibility on 'sign up' page")
    public void checkBirthMonthSelectVisibility() {
        assertTrue(signUpPage.isBirthMonthSelectVisible());
    }

    @And("User checks birth year select visibility on 'sign up' page")
    public void checkBirthYearSelectVisibility() {
        assertTrue(signUpPage.isBirthYearSelectVisible());
    }

    @And("User checks 'sign up' button visibility on 'sign up' page")
    public void checkSignUpButtonOnSignUpPageVisibility() {
        assertTrue(signUpPage.isSignUpButtonVisible());
    }

    @And("User enters email in appropriate field on 'sign up' page")
    public void fillEmailFieldOnSignUpPageField(){ signUpPage.fillEmailField();}

    @And("User enters first name in appropriate field on 'sign up' page")
    public void fillFirstNameFieldOnSignUpPageField(){ signUpPage.fillFirstNameField();}

    @And("User enters last name in appropriate field on 'sign up' page")
    public void fillLastNameFieldOnSignUpPageField(){ signUpPage.fillLastNameField();}

    @And("User enters password in appropriate field on 'sign up' page")
    public void fillPasswordFieldOnSignUpPageField(){ signUpPage.fillPasswordField();}

    @And("User picks day of birth in appropriate selector on 'sign up' page")
    public void pickDayOfBirthOnSignUpPageSelector() {
        signUpPage.pickDayOfBirthSelector();
    }

    @And("User picks month of birth in appropriate selector on 'sign up' page")
    public void pickMonthOfBirthOnSignUpPageSelector(){
        signUpPage.pickMonthOfBirthSelector();
    }

    @And("User picks year of birth in appropriate selector on 'sign up' page")
    public void pickYearOfBirthOnSignUpPageSelector(){
        signUpPage.pickYearOfBirthSelector();
    }

    @And("User clicks 'sign up' button on 'sign up' page")
    public void clickSignUpButton(){
        signUpPage.clickSignUpButton();
    }

    @And("User returns to main page")
    public void returnToMainPage() {
        homePage.waitVisibilityOfElement(DEFAULT_TIMEOUT, homePage.getHeader());
        assertTrue(driver.getCurrentUrl().contains(homePage.getHomePageUrlPart()));
    }

    @And("User checks sign in container visibility")
    public void checkSignInContainerVisibility(){
        signInPage = pageFactoryManager.getSignInPage();
        signInPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        signInPage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
        assertTrue(signInPage.isSignInContainerVisible());
    }

    @And("User enters email without '@' symbol")
    public void enterEmailWithoutAtSign(){
        signInPage.fillEmailFieldWithoutAtSign();
    }

    @And("User enters email with multiple '@' symbols")
    public void enterEmailWithMultipleAtSigns(){
        signInPage.fillEmailFieldWithMultipleAtSigns();
    }

    @And("User gets 'wrong-email' warning")
    public void checkWrongEmailWarning(){
        signInPage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
        assertTrue(signInPage.isWrongEmailWarningVisible());
    }

    @And("User clears email field")
    public void clearEmailField(){
        signInPage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
        signInPage.getEmailField().clear();
    }

    @And("User gets 'empty-password-field' warning")
    public void checkEmptyPasswordWarning(){
        signInPage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
        assertTrue(signInPage.isEmptyPasswordWarningVisible());
    }

    @And("User enters correct password")
    public void fillPasswordField(){
        signInPage.getPasswordField().clear();
        signInPage.fillPasswordField();
    }

    @And("User enters correct email")
    public void fillEmailField(){
        signInPage.getEmailField().clear();
        signInPage.fillEmailField();
    }

    @And("User sees disappearance of 'wrong-email' warning")
    public void checkWrongEmailWarningDisappearance(){
        signInPage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
        assertFalse(signInPage.isEmptyPasswordWarningVisible());
    }

    @And("User checks sign up container visibility")
    public void checkSignUpContainerVisibility(){
        signUpPage = pageFactoryManager.getSignUpPage();
        signUpPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        signUpPage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
        assertTrue(signUpPage.isSignUpContainerVisible());
    }

    @And("User clicks email field and leaves it empty")
    public void clickEmailField(){ signUpPage.clickEmailField(); }

    @And("User clicks first name field and leaves it empty")
    public void clickFirstNameField(){ signUpPage.clickFirstNameField(); }

    @And("User clicks last name field and leaves it empty")
    public void clickLastNameField(){ signUpPage.clickLastNameField(); }

    @And("User clicks password field and leaves it empty")
    public void clickPasswordField(){ signUpPage.clickPasswordField(); }

    @And("User clicks birthday selector and chooses nothing")
    public void clickBirthDaySelector(){ signUpPage.clickBirthDaySelector(); }

    @And("User clicks month of birth selector and chooses nothing")
    public void clickBirthMonthSelector(){ signUpPage.clickBirthMonthSelector(); }

    @And("User clicks year of birth selector and chooses nothing")
    public void clickBirthYearSelector(){ signUpPage.clickBirthYearSelector(); }

    @And("User clicks random label")
    public void clickRandomLabel(){ signUpPage.clickRandomLabel(); }

    @And("User sees 'wrong-birthday' warning")
    public void checkWrongBirthDayWarningVisibility(){
        signUpPage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
        assertTrue(signUpPage.isBirthDaySelectVisible());
    }

    @And("User sees 'wrong-birth-month' warning")
    public void checkWrongBirthMonthWarningVisibility(){
        signUpPage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
        assertTrue(signUpPage.isBirthMonthSelectVisible());
    }

    @And("User sees 'wrong-birth-year' warning")
    public void checkWrongBirthYearWarningVisibility(){
        signUpPage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
        assertTrue(signUpPage.isBirthYearSelectVisible());
    }


    @And("User sees 'wrong-email' warning")
    public void checkWrongEmailWarningVisibility(){
        signUpPage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
        assertTrue(signUpPage.isWrongEmailWarningVisible());
    }

    @And("User sees 'wrong-first-name' warning")
    public void checkWrongFirstNameWarningVisibility(){
        signUpPage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
        assertTrue(signUpPage.isWrongFirstNameWarningVisible());
    }

    @And("User sees 'wrong-last-name' warning")
    public void checkWrongLastNameWarningVisibility(){
        signUpPage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
        assertTrue(signUpPage.isWrongLastNameWarningVisible());
    }

    @And("User sees 'wrong-password' warning")
    public void checkWrongPasswordWarningVisibility(){
        signUpPage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
        assertTrue(signUpPage.isWrongPasswordWarningVisible());
    }

    @And("User checks popped 'my account' link visibility")
    public void checkMyAccountLinkPoppedVisibility(){
        homePage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
        homePage.waitVisibilityOfElement(DEFAULT_TIMEOUT, homePage.getMyAccountLink());
        assertTrue(homePage.isMyAccountLinkPoppedVisible());
    }

    @And("User clicks popped 'my account' link")
    public void clickMyAccountLinkPopped(){
        homePage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
        homePage.clickMyAccountLinkPopped();
    }

    @And("User gets redirected to 'my account' page")
    public void checkThatMyAccountUrlEqualsExpected() {
        myAccountPage = pageFactoryManager.getMyAccountPage();
        myAccountPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, myAccountPage.getMyAccountLabel());
        assertTrue(driver.getCurrentUrl().contains(myAccountPage.getMyAccountPageUrlPart()));
    }

    @And("User checks 'account view' button visibility")
    public void checkAccountViewButtonVisibility(){ assertTrue(myAccountPage.isAccountViewButtonVisible()); }

    @And("User clicks 'account view' button")
    public void clickAccountViewButton() { myAccountPage.clickAccountViewButton(); }

    @And("User sees label on 'welcome to your account' page")
    public void checkWelcomeToYourAccountLabelVisibility() { assertTrue(myAccountPage.isWelcomeToYourAccountLabelVisible()); }

    @And("User checks 'my orders' label visibility")
    public void checkMyOrdersButtonVisibility() { assertTrue(myAccountPage.isMyOrdersButtonVisible()); }

    @And("User clicks 'my orders' button")
    public void clickMyOrdersButton() { myAccountPage.clickMyOrdersButton(); }

    @And("User sees label on 'my orders' page")
    public void checkMyOrdersLabelVisibility() { assertTrue(myAccountPage.isMyOrdersLabelVisible()); }

    @And("User checks 'my information' button visibility")
    public void checkMyInformationButtonVisibility() { assertTrue(myAccountPage.isMyInformationButtonVisible()); }

    @And("User clicks 'my information' button")
    public void clickMyInformationButton() { myAccountPage.clickMyInformationButton(); }

    @And("User sees label on 'my information' page")
    public void checkMyInformationLabelVisibility() { assertTrue(myAccountPage.isMyInformationLabelVisible()); }

    @And("User checks 'change password' button visibility")
    public void checkChangePasswordButtonVisibility() { assertTrue(myAccountPage.isChangePasswordButtonVisible()); }

    @And("User clicks 'change password' button")
    public void clickChangePasswordButton() { myAccountPage.clickChangePasswordButton(); }

    @And("User sees label on 'change password' button")
    public void checkChangePasswordLabelVisibility() { assertTrue(myAccountPage.isChangePasswordLabelVisible()); }

    @And("User checks 'address book' button visibility")
    public void checkAddressBookButtonVisibility() { assertTrue(myAccountPage.isAddressBookButtonVisible()); }

    @And("User clicks 'address book' button")
    public void clickAddressBookButton() { myAccountPage.clickAddressBookButton(); }

    @And("User sees label on 'address book' page")
    public void checkAddressBookLabelVisible() {}

    @And("User checks 'my payment methods' button visibility")
    public void checkPaymentMethodsButtonVisible() { assertTrue(myAccountPage.isPaymentMethodsButtonVisible()); }

    @And("User clicks 'my payment methods' button")
    public void clickPaymentMethodsButton() { myAccountPage.clickPaymentMethodsButton(); }

    @And("User sees label on 'my payment methods' page")
    public void checkPaymentMethodsLabelVisible() { assertTrue(driver.getCurrentUrl().contains(myAccountPage.getPaymentMethodsPartUrl())); }

    @And("User checks 'my contacts' button visibility")
    public void checkMyContactsButtonVisibile() { assertTrue(myAccountPage.isMyContactsButtonVisibile()); }

    @And("User clicks 'my contacts' button")
    public void clickMyContactsButton() { myAccountPage.clickMyAccountButton(); }

    @And("User sees label on 'my contacts' page")
    public void checkMyContactsLabelVisible() { assertTrue(driver.getCurrentUrl().contains(myAccountPage.getMyContactsUrlPart())); }

    @And("User checks 'my profiles in social networks' button visibility")
    public void checkMyProfilesButtonVisible() { assertTrue(myAccountPage.isMyProfilesButtonVisibile()); }

    @And("User clicks 'my profiles in social networks' button")
    public void clickMyProfilesButton() { myAccountPage.clickMyProfilesButton(); }

    @And("User sees label on 'my profiles in social networks' page")
    public void checkMyProfilesLabelVisible() { assertTrue(myAccountPage.isMyProfilesLabelVisible()); }

    @And("User checks 'my gifts and vouchers' button visibility")
    public void checkGiftsAndVouchersButtonVisibility() { assertTrue(myAccountPage.isGiftsAndVouchersButtonVisible()); }

    @And("User clicks 'my gifts and vouchers' button")
    public void clickGiftsAndVouchersButton() { myAccountPage.clickGiftsAndVouchersButton(); }

    @And("User sees label on 'my gifts and vouchers' page")
    public void checkGiftsAndVouchersLabelVisibility() { }

    @And("User checks 'customer service' button visibility")
    public void checkCustomerServiceButtonVisibility() { assertTrue(myAccountPage.isCustomerServiceButtonVisible()); }

    @And("User clicks 'customer service' button")
    public void clickCustomerServiceButton() { myAccountPage.clickCustomerServiceButton(); }

    @And("User gets redirected to 'customer service' page")
    public void checkDoesUrlEqualsExpected() { assertTrue(driver.getCurrentUrl().contains(myAccountPage.getCustomerServiceUrlPart()));}

    @And("User returns to previous page")
    public void returnToPreviousPage() { driver.navigate().back();}

    @And("User checks 'order tracker' button visibility")
    public void checkOrderTrackerButtonVisibility() { assertTrue(myAccountPage.isOrderTrackerButtonVisible()); }

    @And("User clicks 'order tracker' button")
    public void clickOrderTrackerButton() { myAccountPage.clickOrderTrackerButton(); }

    @And("User sees label on 'order tracker' page")
    public void checkOrderTrackerLabelVisibility() { }

    @And("User checks 'refund' button visibility")
    public void checkRefundButtonVisibility() { assertTrue(myAccountPage.isRefundButtonVisible());}

    @And("User clicks 'refund' button")
    public void clickRefundButton() { myAccountPage.clickRefundButton(); }

    @And("User sees label on 'refund' page")
    public void checkRefundLabelVisibility() { }

    @And("User checks 'needs new label' button visibility")
    public void checkNeedsNewLabelButtonVisibility() { assertTrue(myAccountPage.isNeedsNewLabelButtonVisible());}

    @And("User clicks 'needs new label' button")
    public void clickNeedsNewLabelButton() { myAccountPage.clickNeedsNewLabelButton(); }

    @And("User sees label on 'needs new label' page")
    public void checkNeedsNewLabelLabelVisibility() { }

    @And("User checks 'sign out' button visibility on 'my account' page")
    public void checkSignOutButtonVisibility() { myAccountPage.isSignOutButtonVisible(); }

    @And("User clicks 'sign out' button on 'my account' page")
    public void clickSignOutButton() { myAccountPage.clickSignOutButton(); }

    @After
    public void tearDown() { driver.close(); }

}
