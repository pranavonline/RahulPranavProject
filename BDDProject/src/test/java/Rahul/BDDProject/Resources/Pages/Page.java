package Rahul.BDDProject.Resources.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Rahul.BDDProject.Util.InitBrowser;

public class  Page {
	private WebDriver driver=InitBrowser.driver;

	public void navigateTo(String url) {
		driver.get(url);
	}
	
	public void setText(WebElement element,String text) {
		element.sendKeys(text);		
	}
	
	public void click(WebElement element) {
		element.click();
	}
	
	public String pageSource() {
		return driver.getPageSource();
	}
}
