package TestCases;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pageobjects.UpcomingBikes;
//@Listeners(Utilities.ExtentReportManager.class)
public class TC003_UpcomingBikePage extends TC002_UsedCars {
	//variable of upcomingbikes
	public UpcomingBikes up;
	
	//selectingManufacture()--> clickig on honda from manufacturer dropdown
	@Test(priority=6,groups= {"master","regression"})
	void selectingManufacture() throws IOException, InterruptedException {
		up=new UpcomingBikes(driver); //object of upcomingbikes
		up.filtermanufacturer();
		log.info("---clickign on honda from dropdown is done---");
	}
	
	//displayBikeDetails()--> scrolling to view more and displaying the bike details
	@Test(priority=7,groups= {"master","regression"})
	void displayBikeDetails() throws IOException, InterruptedException {
		up=new UpcomingBikes(driver); //object of upcomingbikes
		up.scrollToViewMore();
		up.displaybikedetails();
		log.info("---details are shown successfully---");
	}
	
	//returnHomePage()--> returing to homepage
	@Test(priority=8, dependsOnMethods= {"displayBikeDetails"},groups= {"master","regression"})
	void returnHomePage2() throws IOException {
		up=new UpcomingBikes(driver); //object of upcomingbikes
		up.returntohomepage();
		log.info("---returned homepage successfully---");
	}


}
