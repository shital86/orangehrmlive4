package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInPageTest extends TestBase {
    HomePage homePage = new HomePage();

    @Test
    public void logInPage() {
        String expectedMsg = "LOGIN Panel";
        String actualMesg = homePage.logInPanelText();
        Assert.assertEquals(expectedMsg, actualMesg, "LogIn Page not displayed");
        homePage.enterUserName("Admin");
        homePage.enterPassWord("admin123");
        homePage.clickOnLogInButton();


    }

}
