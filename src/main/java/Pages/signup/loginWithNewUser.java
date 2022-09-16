package Pages.signup;

import BasePackage.BasePage;
import Utilities.ObjectRepositoryJsonParser;
import Utilities.TimeUtils;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class loginWithNewUser extends BasePage {

    SoftAssert softAssert = new SoftAssert();

    public void changeLanguage() {

        //Click on Language Menu
        WebElement pickLanguage = ObjectRepositoryJsonParser.getObjectLocator("$.signup.changeLanguage");
        softAssert.assertTrue(pickLanguage.isDisplayed(),"Pick Language button not displayed");
        elementClick(pickLanguage);
        TimeUtils.mediumWait();

        //Click on English Language
        WebElement englishLanguage = ObjectRepositoryJsonParser.getObjectLocator("$.signup.englishLanguage");
        elementClick(englishLanguage);
        TimeUtils.mediumWait();
    }

    public void clickOnAccount(){
        //Click on Account
        WebElement accountBtn = ObjectRepositoryJsonParser.getObjectLocator("$.signup.account");
        softAssert.assertTrue(accountBtn.isDisplayed(),"Account button not displayed");
        elementClick(accountBtn);
    }

    public void clickOnCustomerLogin(){
        //Click On Customer Sign up
        WebElement customerLogin = ObjectRepositoryJsonParser.getObjectLocator("$.login.customerLogin");
        softAssert.assertTrue(customerLogin.isDisplayed(),"Customer Login button not displayed");
        elementClick(customerLogin);
    }

    public void fillEmailAddress(String mail){
        WebElement emailAddress = ObjectRepositoryJsonParser.getObjectLocator("$.login.mailAddress");
        softAssert.assertTrue(emailAddress.isDisplayed(),"Email Address textbox not displayed");
        elementClear(emailAddress);
        elementClick(emailAddress);
        setTextElementText(emailAddress,mail);
    }

    public void fillPassword(String password){
        WebElement Password = ObjectRepositoryJsonParser.getObjectLocator("$.login.userPassword");
        softAssert.assertTrue(Password.isDisplayed(),"Password textbox not displayed");
        elementClear(Password);
        elementClick(Password);
        setTextElementText(Password,password);
    }

    public void clickOnRememberMeCheckBox(){
        WebElement rememberMeCheckBox = ObjectRepositoryJsonParser.getObjectLocator("$.login.rememberMe");
        elementClick(rememberMeCheckBox);
    }

    public void clickOnLoginBtn(){
        WebElement loginBtn = ObjectRepositoryJsonParser.getObjectLocator("$.login.loginBtn");
        softAssert.assertTrue(loginBtn.isDisplayed(),"Login button not displayed");
        elementClick(loginBtn);
    }
}
