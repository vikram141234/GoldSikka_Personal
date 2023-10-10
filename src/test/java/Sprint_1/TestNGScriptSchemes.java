package Sprint_1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import GenericUtility.SchemesSubscriptionBaseClass;
import ObjectRepository.GoldPlusPlanPage;
import ObjectRepository.LandingPage;
import ObjectRepository.SchemesPage;

public class TestNGScriptSchemes extends SchemesSubscriptionBaseClass{

	@Test
	public void schemeSubscription() throws Exception
	{
		  LandingPage lPage = new LandingPage(driver);
	      lPage.clickOnSchemesLnk(driver);
		
	      SchemesPage sPage = new SchemesPage(driver);
		  sPage.subscribeAScheme();
		
	      GoldPlusPlanPage gPage = new GoldPlusPlanPage(driver);
	      gPage.goldPlusPlanPage(driver);//we have to parameterize the below args
	}
}
