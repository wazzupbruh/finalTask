package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[contains(text(), 'Личный Кабинет')]")
    private WebElement myAccountLabel;

    @FindBy(xpath = "//a[@href='/my-account/']")
    private WebElement accountViewButton;

    @FindBy(xpath = "//h1[@data-auto-id='page-title']/span[contains(text(),'Мои заказы')]")
    private WebElement myOrdersLabel;

    @FindBy(xpath = "//a[@href='/my-account/orders']")
    private WebElement myOrdersButton;

    @FindBy(xpath = "//p[contains(text(),'внести любые изменения')]")
    private WebElement myInformationLabel;

    @FindBy(xpath = "//a[@href='/my-account/my-details']")
    private WebElement myInformationButton;

    @FindBy(xpath = "//p[contains(text(), 'изменить ваш пароль')]")
    private WebElement changePasswordLabel;

    @FindBy(xpath = "//a[@href='/my-account/change-password']")
    private WebElement changePasswordButton;

    @FindBy(xpath = "//p[contains(text(), 'нет сохраненного адреса')]")
    private WebElement addressBookLabel;

    @FindBy(xpath = "//a[@href='/my-account/addresses']")
    private WebElement addressBookButton;

    @FindBy(xpath = "//span[contains(text(),'Добавить способ оплаты')]")
    private WebElement paymentMethodsLabel;

    @FindBy(xpath = "//a[@href='/my-account/payment-methods']")
    private WebElement paymentMethodsButton;

    @FindBy(xpath = "//h2[contains(text(),'Содержание рассылки')]")
    private WebElement myContactsLabel;

    @FindBy(xpath = "//a[@href='/my-account/contact-preferences']")
    private WebElement myContactsButton;

    @FindBy(xpath = "//a[@href='/my-account/social-accounts']")
    private WebElement myProfilesButton;

    @FindBy(xpath = "//p[contains(text(),'учетных записей')]")
    private WebElement myProfilesLabel;

    @FindBy(xpath = "//a[@href='/my-account/gift-cards-and-vouchers']")
    private WebElement giftsAndVouchersButton;

    @FindBy(xpath = "//h2[contains(text(),'подарочных сертификатов')]")
    private WebElement giftsAndVouchersLabel;

    @FindBy(xpath = "//a[@href='https://www.asos.com/ru/customer-service/customer-care/help/?help=/app/home']")
    private WebElement customerServiceButton;

    @FindBy(xpath = "//a[@href='https://www.asos.com/ru/customer-service/customer-care/help/?help=/app/topiclanding/p/89']")
    private WebElement orderTrackerButton;

    @FindBy(xpath = "//a[@href='https://www.asos.com/ru/customer-service/customer-care/help/?help=/app/topiclanding/p/90&ctaref=my%20account']")
    private WebElement refundButton;

    @FindBy(xpath = "//a[@href='https://www.asos.com/ru/customer-service/customer-care/help/?help=/app/answers/detail/a_id/1757']")
    private WebElement needsNewLabelButton;

    @FindBy(xpath = "//a[@href='/my-account/logout']")
    private WebElement signOutButton;

    final String myAccountPageUrlPart = "/my-account";

    final String myContactsUrlPart = "/contact-preferences";

    final String customerServiceUrlPart = "/my-account/gift-cards-and-vouchers";

    final String giftsAndVouchersUrlPart = "/gift-cards-and-vouchers";

    final String paymentMethodsPartUrl = "/payment-methods";

    final String orderTrackerPartUrl = "/центр-поддержки/доставка/";

    final String refundPartUrl = "/центр-поддержки/вопросы-о-возвратах/";

    final String needsNewLabelPartUrl = "/центр-поддержки/вопросы-о-возвратах/условия-возврата-товаров-asos/";

    public String getMyAccountPageUrlPart() { return myAccountPageUrlPart; }

    public WebElement getMyAccountLabel() { return myAccountLabel; }

    public boolean isAccountViewButtonVisible(){ return myAccountLabel.isDisplayed(); }

    public boolean isWelcomeToYourAccountLabelVisible() { return myAccountLabel.isDisplayed(); }

    public boolean isMyOrdersButtonVisible() { return myOrdersButton.isDisplayed(); }

    public boolean isMyOrdersLabelVisible() { return myOrdersLabel.isDisplayed(); }

    public boolean isMyInformationButtonVisible() { return myInformationButton.isDisplayed(); }

    public boolean isMyInformationLabelVisible() { return myInformationLabel.isDisplayed(); }

    public boolean isChangePasswordButtonVisible() { return changePasswordButton.isDisplayed(); }

    public boolean isChangePasswordLabelVisible() { return changePasswordLabel.isDisplayed(); }

    public boolean isAddressBookButtonVisible() { return addressBookButton.isDisplayed(); }

    public boolean isAddressBookLabelVisible() { return addressBookLabel.isDisplayed(); }

    public boolean isPaymentMethodsButtonVisible() { return paymentMethodsButton.isDisplayed(); }

    public boolean isPaymentMethodsLabelVisible() { return paymentMethodsLabel.isDisplayed(); }

    public boolean isMyContactsButtonVisibile() { return myContactsButton.isDisplayed(); }

    public boolean isMyContactsLabelVisible() { return myContactsLabel.isDisplayed(); }

    public boolean isMyProfilesButtonVisibile() { return myProfilesButton.isDisplayed(); }

    public boolean isMyProfilesLabelVisible() { return myProfilesLabel.isDisplayed(); }

    public boolean isGiftsAndVouchersButtonVisible() { return giftsAndVouchersButton.isDisplayed(); }

    public boolean isGiftsAndVouchersLabelVisible() { return giftsAndVouchersLabel.isDisplayed(); }

    public boolean isCustomerServiceButtonVisible() { return customerServiceButton.isDisplayed(); }

    public boolean isOrderTrackerButtonVisible() { return orderTrackerButton.isDisplayed(); }

    public boolean isRefundButtonVisible() { return refundButton.isDisplayed(); }

    public boolean isNeedsNewLabelButtonVisible() { return needsNewLabelButton.isDisplayed(); }

    public boolean isSignOutButtonVisible() { return signOutButton.isDisplayed(); }

    public void clickAccountViewButton() { accountViewButton.click(); }

    public void clickMyOrdersButton() { myOrdersButton.click(); }

    public void clickMyInformationButton() { myInformationButton.click(); }

    public void clickChangePasswordButton() { changePasswordButton.click(); }

    public void clickAddressBookButton() { addressBookButton.click(); }

    public void clickPaymentMethodsButton() { paymentMethodsButton.click(); }

    public void clickMyAccountButton() { myContactsButton.click(); }

    public void clickMyProfilesButton() { myProfilesButton.click(); }

    public void clickGiftsAndVouchersButton() { giftsAndVouchersButton.click(); }

    public void clickCustomerServiceButton() { customerServiceButton.click(); }

    public void clickOrderTrackerButton() { orderTrackerButton.click(); }

    public void clickRefundButton() { refundButton.click(); }

    public void clickNeedsNewLabelButton() { needsNewLabelButton.click(); }

    public void clickSignOutButton() { signOutButton.click(); }

    public String getCustomerServiceUrlPart() { return customerServiceUrlPart; }

    public String getMyContactsUrlPart() { return myContactsUrlPart;}

    public String getGiftsAndVouchersUrlPart() { return giftsAndVouchersUrlPart; }

    public String getPaymentMethodsPartUrl() { return paymentMethodsPartUrl; }

    public String getOrderTrackerUrlPart() { return orderTrackerPartUrl; }

    public String getRefundPartUrl() { return refundPartUrl; }
}
