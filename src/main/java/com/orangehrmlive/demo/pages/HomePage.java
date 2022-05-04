package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
By loginpanelText=By.xpath("//div[@id='logInPanelHeading']");
By usernameField=By.xpath("//input[@id='txtUsername']");
By passwordField=By.xpath("//input[@id='txtPassword']");
By loginButton=By.xpath("//input[@id='btnLogin']");

public String logInPanelText(){
    return getTextFromElement(loginpanelText);
}
public void enterUserName(String username){
    sendTextToElement(usernameField,username);
}
public void enterPassWord(String password){
    sendTextToElement(passwordField,password);
}
public void clickOnLogInButton(){
    clickOnElement(loginButton);
}





}