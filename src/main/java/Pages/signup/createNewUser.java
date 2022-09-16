package Pages.signup;

import BasePackage.BasePage;
import Utilities.ObjectRepositoryJsonParser;
import Utilities.TimeUtils;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import static Utilities.JSUtils.clickElementByJS;

public class createNewUser extends BasePage {
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
        softAssert.assertAll();
    }

    public void clickOnAccountCustomerSignup(){
        //Click on Signup Button
        WebElement accountBtn = ObjectRepositoryJsonParser.getObjectLocator("$.signup.account");
        softAssert.assertTrue(accountBtn.isDisplayed(),"Account button not displayed");
        elementClick(accountBtn);

        //Click On Customer Sign up
        WebElement customerSignup = ObjectRepositoryJsonParser.getObjectLocator("$.signup.customerSignup");
        softAssert.assertTrue(customerSignup.isDisplayed(),"Customer SignUp button not displayed");
        elementClick(customerSignup);
        softAssert.assertAll();
    }

    public void fillSignupPage(String firstname , String lastname, String mobile, String mail , String password){

        //Check Success text and cart count
        WebElement fillFirstName = ObjectRepositoryJsonParser.getObjectLocator("$.signup.firstName");
        softAssert.assertTrue(fillFirstName.isDisplayed(),"First Name textbox not displayed");
        elementClear(fillFirstName);
        elementClick(fillFirstName);
        setTextElementText(fillFirstName,firstname);

        WebElement fillLastName = ObjectRepositoryJsonParser.getObjectLocator("$.signup.lastName");
        softAssert.assertTrue(fillLastName.isDisplayed(),"Last Name textbox not displayed");
        elementClear(fillLastName);
        elementClick(fillLastName);
        setTextElementText(fillLastName,lastname);

        WebElement fillPhoneNumber = ObjectRepositoryJsonParser.getObjectLocator("$.signup.phoneNumber");
        softAssert.assertTrue(fillPhoneNumber.isDisplayed(),"Phone Number textbox not displayed");
        elementClear(fillPhoneNumber);
        elementClick(fillPhoneNumber);
        setTextElementText(fillPhoneNumber,mobile);

        WebElement fillMailAddress = ObjectRepositoryJsonParser.getObjectLocator("$.signup.mailAddress");
        softAssert.assertTrue(fillMailAddress.isDisplayed(),"Email Address textbox not displayed");
        elementClear(fillMailAddress);
        elementClick(fillMailAddress);
        setTextElementText(fillMailAddress,mail);

        WebElement fillPassword = ObjectRepositoryJsonParser.getObjectLocator("$.signup.password");
        softAssert.assertTrue(fillPassword.isDisplayed(),"Password textbox not displayed");
        elementClear(fillPassword);
        elementClick(fillPassword);
        setTextElementText(fillPassword,password);

        softAssert.assertAll();
    }

    public void clickOnCaptchaTicBtn(){
        //Click on Captcha
        WebElement captchaCheckBox = ObjectRepositoryJsonParser.getObjectLocator("$.signup.capthaCheckBox");
        elementClick(captchaCheckBox);
        clickElementByJS(captchaCheckBox);
    }
    public void clickOnSignupBtn(){
        //Click on Signup Button
        WebElement signupBtn = ObjectRepositoryJsonParser.getObjectLocator("$.signup.signupBtn");
        softAssert.assertTrue(signupBtn.isDisplayed(),"SignUp button not displayed");
        elementClick(signupBtn);

        softAssert.assertAll();
    }
}