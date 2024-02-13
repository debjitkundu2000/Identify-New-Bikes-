package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import TestBase.BaseClass;
import Utilities.Screenshots;
import pageobjects.HomePage;

public class TC001_HomePage extends BaseClass {
	//variable of HomePage
	public HomePage hp;
	
	//titleValidation()--> validating the title only
	@Test(priority=1,groups= {"master","regression"})
	void titleValidation() throws IOException {
		hp = new HomePage(driver); //object of homePages
		hp.titleValidation();
		log.info("---title is validated---");
	}
	
	//clickOnUsedCars()--> hovering on usedcars and clicking on chennai city and it is dependent on test1() 
	@Test(priority=2, dependsOnMethods= {"titleValidation"},groups= {"master","regression"})
	void clickOnUsedCars() throws IOException, InterruptedException {
		hp = new HomePage(driver); //object of homePage
		hp.clickingOnCityForUsedCars();
		log.info("---clicked on chennai city---");
	}
	
	//clickOnUpcomingBikes()--> hovering on newbikes option and clickig on upcoming bikes option
	@Test(priority=5,groups= {"master","regression"})
	void clickOnUpcomingBikes() throws IOException {
		hp = new HomePage(driver);
		hp.clickingOnUpcomingBikes();
		log.info("---clicked on upcoming bikes---");
	}
	
	//clickOnLoginSignUp()--> clicking on login/signup, then clickign on google to provide invalid mail and capture the error message
	@Test(priority=9,groups= {"master","sanity"})
	void clickOnLoginSignUp() throws IOException, InterruptedException {
		hp = new HomePage(driver); //object of homePage
		hp.login();
		hp.captureErrorMessage();
		log.info("---clickied on login and captured the error message too---");
	}
}
