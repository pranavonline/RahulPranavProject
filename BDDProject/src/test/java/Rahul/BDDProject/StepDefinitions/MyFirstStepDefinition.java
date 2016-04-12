package Rahul.BDDProject.StepDefinitions;

import org.openqa.selenium.support.PageFactory;

import com.sun.jna.platform.win32.WinUser.MSG;

import Rahul.BDDProject.Resources.Pages.GooglePage;
import Rahul.BDDProject.Util.InitBrowser;
import Rahul.BDDProject.Util.Util;
import cucumber.api.java.en.*;

public class MyFirstStepDefinition {
	GooglePage googlePage = PageFactory.initElements(InitBrowser.driver, GooglePage.class);
	
	@Given("^I am on \"([^\"]*)\" page$")
	public void navigateTo(String url) {
		//Util.getProperties("username");
		googlePage.navigateTo(url);
	}
	
	@When("^I search for \"([^\"]*)\" keyword$")
	public void i_search_for_keyword(String text) throws Throwable {
		googlePage.setText(text);
		googlePage.click();
	}
	
	@Then("^I landed to search result page for \"([^\"]*)\" keyword$")
	public void i_landed_to_search_result_page_for_keyword(String arg1) throws Throwable {
	    System.out.println("Then statement");
	    boolean flag = googlePage.pageSource().contains(arg1);
	    System.out.println(flag);
	}
}
