package tests.signup;

import BasePackage.BaseTest;
import Pages.signup.createNewUser;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static BasePackage.BasePage.*;

public class createNewUserTest extends BaseTest {

    private static createNewUser createUser;

    @BeforeClass
    public void initialization() {
        createUser = new createNewUser();
    }


    @Test(priority = 1)
    public void changeWebSiteLanguage(){
        createUser.changeLanguage();
    }

    @Test(priority = 2)
    public void navigateToCustomerSignup(){
        createUser.clickOnAccountCustomerSignup();
    }

    @Test(priority = 3)
    public void fillSignupScreenData() {
        createUser.fillSignupPage(firstName,lastName,mobileNumber,mailAddress,Password);
        createUser.clickOnCaptchaTicBtn();
        createUser.clickOnSignupBtn();
    }
}