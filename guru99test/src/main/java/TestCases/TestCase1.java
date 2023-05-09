package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Library.TestCaseLibrary1;

public class TestCase1 {
	public static WebDriver driver;

	@BeforeClass(description = "aaaaa")

	public void openwebpage() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Owner\\eclipse-workspace\\aaaaaaa\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		
		}
	@Test (priority = 1)
    public void test1() throws Exception {
	  //TestCase1Library tc = new TestCase1Library();
		//tc.loginwebsite();
	System.out.println("calling library funtion");
	TestCaseLibrary1.loginwebsite("syeda","22222");
	
	
}

}
