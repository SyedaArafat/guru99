package Library;

import static TestCases.TestCase1.driver;

import PageObjects.LoginClass1;

public class TestCaseLibrary1 {
	public static void loginwebsite(String name, String pwd) throws InterruptedException {

		LoginClass1 lg = new LoginClass1(driver);

		System.out.println("print anything");
		Thread.sleep(2000);
		lg.username.sendKeys(name);
		lg.password.sendKeys(pwd);

		String titel = driver.getTitle();
		System.out.println(titel);
		Thread.sleep(1000);
		lg.submit.click();
		String titel2 = driver.getTitle();
		if (titel.equals(titel2)) {

			lg.submit.click();
		} else {
			System.out.println("user is already in the system");
		}

	}
}
