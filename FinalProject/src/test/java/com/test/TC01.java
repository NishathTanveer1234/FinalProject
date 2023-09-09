package com.test;

import com.pages.Homepage;
import com.pages.Loginpage;
import com.testbase.Webtestbase;

//import Pages.MyAccountpage;
import com.pages.MyAccountpage;
import org.testng.annotations.*;
import org.testng.asserts.*;


public class TC01 extends Webtestbase{

	Loginpage loginPage;
	Homepage homePage;
	MyAccountpage myAccountpage;
		//loading the config file
		public TC01() {
			super();		
		}
		
		@BeforeMethod
		public void BeforeMethod() {
			initialization();
			loginPage=new Loginpage();
			homePage=new Homepage();
			myAccountpage=new MyAccountpage();
		}
		
		@Test
		public void VerifyLogin() throws InterruptedException {
			//In Selenium, Asserts are validations or checkpoints for an application.
			SoftAssert softAssert = new SoftAssert();
			//homePage.userSearchClick();
		  loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
		   //softAssert.assertEquals(myAccountPage.getTextOFMYAccountPage()
		 softAssert.assertAll();
		     //System.out.println("Verify");
		}  
	
@Test
public void verifyMouseHover() throws InterruptedException{
     SoftAssert softAssert = new SoftAssert();
     loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
     Thread.sleep(7000);
     myAccountpage.mouseHover();
     softAssert.assertAll();
 }


@Test
 public void verifyScrollDown() throws InterruptedException{
     SoftAssert softAssert = new SoftAssert();
     loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
     Thread.sleep(7000);
     myAccountpage.scrollDownMethod();
     softAssert.assertAll();
 }

@Test
public void verifyGetWindowhandle() throws InterruptedException {
	SoftAssert softAssert = new SoftAssert();
    loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
    Thread.sleep(7000);
     myAccountpage.verifyGetWindowhandle();
     softAssert.assertAll();     //goeseto nextpage
}


@Test
public void verifyCookieHandle() throws InterruptedException {
	SoftAssert softAssert = new SoftAssert();
    loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
    Thread.sleep(7000);
     myAccountpage.getCookiesHandle();
     softAssert.assertAll();		//bugscler
}

@Test
		public void selectDropDown() throws InterruptedException {
			SoftAssert softAssert = new SoftAssert();
		    loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
		    Thread.sleep(10000);
		     myAccountpage.selectDropDown("Name(A to Z)","Price(low to high)");
		     softAssert.assertAll();
}

@AfterMethod
public void AfterMethod() {
	driver.close();
}
}


