package com.pages;

	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import com.pages.MyAccountpage;
	import com.util.Utility;

import com.testbase.Webtestbase;
	public class MyAccountpage extends Webtestbase{
		
		@FindBy(xpath = "//h1[text()='My Account']")
	    WebElement accountTitle;

	    @FindBy(xpath = "//input[@id='inputbar']")
	    WebElement searchTextBox;

	    @FindBy(id = "btnTopSearch")
	    WebElement searchBtn;

	    @FindBy(xpath = "//div[@class='search-summary search-heading']")
	    WebElement searchTitle;

	    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/div/span/select")
	    WebElement dropDown;

	    @FindBy(xpath = "//*[@id=\"item_0_title_link\"]/div")
	    WebElement hover;

	    @FindBy(xpath = "//*[@id=\"page_wrapper\"]/footer/ul/li[2]/a")
	    WebElement facebookOption;
	    
		public MyAccountpage(){
	        PageFactory.initElements(driver, this);
	    }
		public String getTextOFMYAccountPage(){
	        return accountTitle.getText();
	    }
		public void search(){
	        searchTextBox.click();
	        searchTextBox.sendKeys("The Power of your subconscious Mind");
	        searchTextBox.sendKeys(Keys.ENTER);
	        searchBtn.click();
	    }
		
		public String getTextOfSearch()
		{
			return searchTitle.getText();
		}
		
		public void selectDropDown(String term,String value) {
			dropDown.click();
			Utility.selectValue(dropDown,term,value);
		}
		
		public void mouseHover() {
			// TODO Auto-generated method stub
			Utility.mouseHover(driver,hover);
			
		}
		
		public void scrollDownMethod() {
			// TODO Auto-generated method stub
			Utility.scrollDownByElement(driver,facebookOption);
			facebookOption.click();
		}
		
		public void verifyGetWindowhandle() throws InterruptedException {
			
					Utility.scrollDownByElement(driver,facebookOption);
					facebookOption.click();
					Utility.switchToWindows(driver);
		}
		
		public void getCookiesHandle() {
			// TODO Auto-generated method stub
			Utility.getCookies();
			}
		
		
	}
	
