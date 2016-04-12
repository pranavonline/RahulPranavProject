package Rahul.BDDProject.Resources.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage extends Page {
	@FindBy(id="lst-ib") private WebElement googleTextbox;
	@FindBy(name="btnG") private WebElement googleSearchButton;
	
	public void setText(String text) {
		setText(googleTextbox,text);
	}
	
	public void click() {
		click(googleSearchButton);
	}
}
