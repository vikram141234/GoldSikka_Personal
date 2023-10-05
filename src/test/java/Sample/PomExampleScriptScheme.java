package Sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import GenericUtility.Baseclass;
import GenericUtility.WebDriverUtility;
import ObjectRepository.DashboardPage;
import ObjectRepository.GoldPlusPlanPage;
import ObjectRepository.LandingPage;
import ObjectRepository.SchemesPage;
import ObjectRepository.Schemes_GoldplusplanPage;

public class PomExampleScriptScheme extends Baseclass {

	@Test
	public void createScheme() throws Exception  {
	
	LandingPage lanp = new LandingPage(driver);
	lanp.clickOnSchemesLnk(driver);
	
	SchemesPage sPage = new SchemesPage(driver);
	sPage.subscribeAScheme();
	
    GoldPlusPlanPage gPage = new GoldPlusPlanPage(driver);
    gPage.goldPlusPlanPage(driver);
	
    
    
	
	}
	
}


