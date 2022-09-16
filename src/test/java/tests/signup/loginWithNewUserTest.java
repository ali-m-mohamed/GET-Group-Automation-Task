package tests.signup;

import BasePackage.BaseTest;
import Pages.signup.loginWithNewUser;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static BasePackage.BasePage.Password;
import static BasePackage.BasePage.mailAddress;


public class loginWithNewUserTest extends BaseTest {

    private loginWithNewUser loginUser;

    @BeforeClass
    public void initialization() {
        loginUser = new loginWithNewUser();
    }

    @Test(priority = 4)
    public void navigateToCustomerLogin(){
        loginUser.changeLanguage();
        loginUser.clickOnAccount();
        loginUser.clickOnCustomerLogin();
    }

    @Test(priority = 5)
    public void fillLoginScreenData(){
        loginUser.fillEmailAddress(mailAddress);
        loginUser.fillPassword(Password);
        loginUser.clickOnRememberMeCheckBox();
    }

    @Test(priority = 6)
    public void verifyCustomerLoginAttempt(){
        loginUser.clickOnLoginBtn();
    }

}
