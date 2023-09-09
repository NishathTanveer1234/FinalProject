package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testbase.Webtestbase;


public class Loginpage extends Webtestbase
{
	@FindBy(xpath = "//*[@id=\"user-name\"]")
	WebElement username;
	
	//@FindBy(xpath = "//*[@id=\"inputEmail\"]")
    //WebElement emailtextbox;
	
	
    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement passwordTextBox;
    
    //@FindBy(xpath = "//*[@id=\"recaptcha-anchor\"]/div[1]")
    //WebElement box;
    
    @FindBy(xpath = "//*[@id=\"login-button\"]")
    WebElement loginbtn;

    public Loginpage(){
    	//used for creating webelements
        PageFactory.initElements(driver, this);
    }
//sending the username and passwrord to the login
    public void login(String email, String password) throws InterruptedException{
    	
    	username.sendKeys(email);
        passwordTextBox.sendKeys(password);
       
        loginbtn.click();
    }

}
	
