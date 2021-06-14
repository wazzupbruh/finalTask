package manager;

import org.openqa.selenium.WebDriver;
import pages.*;

public class PageFactoryManager {

    WebDriver driver;

    public PageFactoryManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage() {
        return new HomePage(driver);
    }

    public SignInPage getSignInPage() { return new SignInPage(driver); }

    public SignUpPage getSignUpPage() { return new SignUpPage(driver); }

    public MyAccountPage getMyAccountPage() { return new MyAccountPage(driver); }

}
