package Sprint_1_Scheme_Subscription;

import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.ExcelFileUtility;
import ObjectRepository.GoldPlusPlanPage;
import ObjectRepository.LandingPage;
import ObjectRepository.SchemesPage;

public class MultipleSchemesSubscriptionWithNetBankingAllBanksDiffAmountTest extends BaseClass{

	@Test
	public void schemeSubscriptionNetBankingHdfc1000Rupees() throws Exception
	{
		  
	      ExcelFileUtility eUtil = new ExcelFileUtility();
		  String SelectAmount = eUtil.readDataFromExcel("Scheme",1,1);
		  String Months = eUtil.readDataFromExcel("Scheme",2,1);
		  String EnterAmount = eUtil.readDataFromExcel("Scheme",3,1);
		  String MobileNumber = eUtil.readDataFromExcel("Scheme",5,1);
		  
		  System.out.println(SelectAmount+" Scheme Subscription Successful");
		  
		  LandingPage lPage = new LandingPage(driver);
	      lPage.clickOnSchemesLnk(driver);
		
	      SchemesPage sPage = new SchemesPage(driver);
		  sPage.subscribeAScheme();
		
	      GoldPlusPlanPage gPage = new GoldPlusPlanPage(driver);
	      gPage.goldPlusPlanPageHdfc1000(driver, SelectAmount, Months, EnterAmount , MobileNumber);//we have to parameterize the below args
	      
	      
	}
	
	@Test
	public void schemeSubscriptionNetBankingIcici1500Rupees() throws Exception
	{

		  
	      ExcelFileUtility eUtil = new ExcelFileUtility();
		  String SelectAmount = eUtil.readDataFromExcel("Scheme",7,1);
		  String Months = eUtil.readDataFromExcel("Scheme",8,1);
		  String EnterAmount = eUtil.readDataFromExcel("Scheme",9,1);
		  String MobileNumber = eUtil.readDataFromExcel("Scheme",11,1);
		  
		  LandingPage lPage = new LandingPage(driver);
	      lPage.clickOnSchemesLnk(driver);
		
	      SchemesPage sPage = new SchemesPage(driver);
		  sPage.subscribeAScheme();
		
	      GoldPlusPlanPage gPage = new GoldPlusPlanPage(driver);
	      gPage.goldPlusPlanPageIcici1500(driver, SelectAmount, Months, EnterAmount , MobileNumber);//we have to parameterize the below args
	}
	
	
	
	@Test
	public void schemeSubscriptionNetBankingAxis2000Rupees() throws Exception
	{

		  
	      ExcelFileUtility eUtil = new ExcelFileUtility();
		  String SelectAmount = eUtil.readDataFromExcel("Scheme",13,1);
		  String Months = eUtil.readDataFromExcel("Scheme",14,1);
		  String EnterAmount = eUtil.readDataFromExcel("Scheme",15,1);
		  String MobileNumber = eUtil.readDataFromExcel("Scheme",17,1);
		  
		  System.out.println(SelectAmount+" Scheme Subscription Successful");
		  
		  LandingPage lPage = new LandingPage(driver);
	      lPage.clickOnSchemesLnk(driver);
		
	      SchemesPage sPage = new SchemesPage(driver);
		  sPage.subscribeAScheme();
		
	      GoldPlusPlanPage gPage = new GoldPlusPlanPage(driver);
	      gPage.goldPlusPlanPageAxis2000(driver, SelectAmount, Months, EnterAmount , MobileNumber);//we have to parameterize the below args
	}
	
	@Test
	public void schemeSubscriptionNetBankingKotak2500Rupees() throws Exception
	{

		  
	      ExcelFileUtility eUtil = new ExcelFileUtility();
		  String SelectAmount = eUtil.readDataFromExcel("Scheme",19,1);
		  String Months = eUtil.readDataFromExcel("Scheme",20,1);
		  String EnterAmount = eUtil.readDataFromExcel("Scheme",21,1);
		  String MobileNumber = eUtil.readDataFromExcel("Scheme",23,1);
		  
		  System.out.println(SelectAmount+" Scheme Subscription Successful");
		  
		  LandingPage lPage = new LandingPage(driver);
	      lPage.clickOnSchemesLnk(driver);
		
	      SchemesPage sPage = new SchemesPage(driver);
		  sPage.subscribeAScheme();
		
	      GoldPlusPlanPage gPage = new GoldPlusPlanPage(driver);
	      gPage.goldPlusPlanPageKotak2500(driver, SelectAmount, Months, EnterAmount , MobileNumber);//we have to parameterize the below args
	}
	
	@Test
	public void schemeSubscriptionNetBankingYes3000Rupees() throws Exception
	{

		  
	      ExcelFileUtility eUtil = new ExcelFileUtility();
		  String SelectAmount = eUtil.readDataFromExcel("Scheme",25,1);
		  String Months = eUtil.readDataFromExcel("Scheme",26,1);
		  String EnterAmount = eUtil.readDataFromExcel("Scheme",27,1);
		  String MobileNumber = eUtil.readDataFromExcel("Scheme",29,1);
		  
		  System.out.println(SelectAmount+" Scheme Subscription Successful");
		  
		  LandingPage lPage = new LandingPage(driver);
	      lPage.clickOnSchemesLnk(driver);
		
	      SchemesPage sPage = new SchemesPage(driver);
		  sPage.subscribeAScheme();
		
	      GoldPlusPlanPage gPage = new GoldPlusPlanPage(driver);
	      gPage.goldPlusPlanPageYes3000(driver, SelectAmount, Months, EnterAmount , MobileNumber);//we have to parameterize the below args
	}
	
	@Test
	public void schemeSubscriptionNetBankingBOB3500Rupees() throws Exception
	{

		  
	      ExcelFileUtility eUtil = new ExcelFileUtility();
		  String SelectAmount = eUtil.readDataFromExcel("Scheme",1,4);
		  String Months = eUtil.readDataFromExcel("Scheme",2,4);
		  String EnterAmount = eUtil.readDataFromExcel("Scheme",3,4);
		  String MobileNumber = eUtil.readDataFromExcel("Scheme",5,4);
		  
		  System.out.println(SelectAmount+" Scheme Subscription Successful");
		  
		  LandingPage lPage = new LandingPage(driver);
	      lPage.clickOnSchemesLnk(driver);
		
	      SchemesPage sPage = new SchemesPage(driver);
		  sPage.subscribeAScheme();
		
	      GoldPlusPlanPage gPage = new GoldPlusPlanPage(driver);
	      gPage.goldPlusPlanPageBOB3500(driver, SelectAmount, Months, EnterAmount , MobileNumber);//we have to parameterize the below args
	}
	
		
	
	
}