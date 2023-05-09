package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginClass1 {
	WebDriver ldriver;

	public LoginClass1(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(how = How.XPATH, using = "//input[@name='userName']")
	public WebElement username;
	@FindBy(how = How.XPATH, using = "//input[@type='password']")
	public WebElement password;
	@FindBy(how = How.XPATH, using = "//input[@name='submit']")
	public WebElement submit;
}
