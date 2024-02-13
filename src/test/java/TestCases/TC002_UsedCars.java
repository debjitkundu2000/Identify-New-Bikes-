package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageobjects.UsedCarsPage;

public class TC002_UsedCars extends TC001_HomePage {
	//variable of usedCarsPage
	public UsedCarsPage up;
	
	//popularModels()--> priting the popular models in console and writing the name of models in excel
	@Test(priority=3,groups= {"master","regression"})
	void popularModels() throws IOException, InterruptedException {
		up = new UsedCarsPage(driver); //object of usedcarspage
		up.displayPopularModels();
		log.info("---popular models are displayed---");
	}
	
	//returnHomePage()--> returing to homepage
	@Test(priority=4, dependsOnMethods= {"popularModels"},groups= {"master","regression"})
	void returnHomePage1() throws IOException {
		up = new UsedCarsPage(driver);  //object of usedcarspage
		up.returnToHomePage();
		log.info("---returned homepage sucessfully---");
	}

}
