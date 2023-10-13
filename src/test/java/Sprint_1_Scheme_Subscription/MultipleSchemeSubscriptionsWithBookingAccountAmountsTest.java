package Sprint_1_Scheme_Subscription;

import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.ExcelFileUtility;
import ObjectRepository.GoldPlusPlanPage;
import ObjectRepository.LandingPage;
import ObjectRepository.SchemesPage;

public class MultipleSchemeSubscriptionsWithBookingAccountAmountsTest extends BaseClass {

	@Test
	public void schemeSubscriptionWithBookingAccountAmount1000Rupees() throws Exception
	{

		  
	      ExcelFileUtility eUtil = new ExcelFileUtility();
		  String SelectAmount = eUtil.readDataFromExcel("Scheme",1,1);
		  String Months = eUtil.readDataFromExcel("Scheme",2,1);
		  String EnterTotalWalletAmount = eUtil.readDataFromExcel("Scheme",4,1);
		  String MobileNo = eUtil.readDataFromExcel("Scheme",5,1);
		  
		  System.out.println(SelectAmount+" Scheme Subscription Successful");
		  
		  LandingPage lPage = new LandingPage(driver);
	      lPage.clickOnSchemesLnk(driver);
		
	      SchemesPage sPage = new SchemesPage(driver);
		  sPage.subscribeAScheme();
		
	      GoldPlusPlanPage gPage = new GoldPlusPlanPage(driver);
	      gPage.goldPlusPlanPageBookingAccount1000(driver, SelectAmount, Months, EnterTotalWalletAmount);//we have to parameterize the below args
	}
	
	@Test
	public void schemeSubscriptionWithBookingAccountAmount1500Rupees() throws Exception	{

		  
	      ExcelFileUtility eUtil = new ExcelFileUtility();
		  String SelectAmount = eUtil.readDataFromExcel("Scheme",7,1);
		  String Months = eUtil.readDataFromExcel("Scheme",8,1);
		  String EnterTotalWalletAmount = eUtil.readDataFromExcel("Scheme",10,1);
		  
		  System.out.println(SelectAmount+" Scheme Subscription Successful");
		  
		  LandingPage lPage = new LandingPage(driver);
	      lPage.clickOnSchemesLnk(driver);
		
	      SchemesPage sPage = new SchemesPage(driver);
		  sPage.subscribeAScheme();
		
	      GoldPlusPlanPage gPage = new GoldPlusPlanPage(driver);
	      gPage.goldPlusPlanPageBookingAccount1500(driver, SelectAmount, Months, EnterTotalWalletAmount);//we have to parameterize the below args
	}
	
	@Test
	public void schemeSubscriptionWithBookingAccountAmount2000Rupees() throws Exception
	{

		  
	      ExcelFileUtility eUtil = new ExcelFileUtility();
		  String SelectAmount = eUtil.readDataFromExcel("Scheme",13,1);
		  String Months = eUtil.readDataFromExcel("Scheme",14,1);
		  String EnterTotalWalletAmount = eUtil.readDataFromExcel("Scheme",16,1);
		  
		  System.out.println(SelectAmount+" Scheme Subscription Successful");
		  
		  LandingPage lPage = new LandingPage(driver);
	      lPage.clickOnSchemesLnk(driver);
		
	      SchemesPage sPage = new SchemesPage(driver);
		  sPage.subscribeAScheme();
		
	      GoldPlusPlanPage gPage = new GoldPlusPlanPage(driver);
	      gPage.goldPlusPlanPageBookingAccount2000(driver, SelectAmount, Months, EnterTotalWalletAmount);//we have to parameterize the below args
	}
	
	
	//Here
	@Test
	public void schemeSubscriptionWithBookingAccountAmount2500Rupees() throws Exception
	{

		  
	      ExcelFileUtility eUtil = new ExcelFileUtility();
		  String SelectAmount = eUtil.readDataFromExcel("Scheme",19,1);
		  String Months = eUtil.readDataFromExcel("Scheme",20,1);
		  String EnterTotalWalletAmount = eUtil.readDataFromExcel("Scheme",22,1);
		  
		  System.out.println(SelectAmount+" Scheme Subscription Successful");
		  
		  LandingPage lPage = new LandingPage(driver);
	      lPage.clickOnSchemesLnk(driver);
		
	      SchemesPage sPage = new SchemesPage(driver);
		  sPage.subscribeAScheme();
		
	      GoldPlusPlanPage gPage = new GoldPlusPlanPage(driver);
	      gPage.goldPlusPlanPageBookingAccount2500(driver, SelectAmount, Months, EnterTotalWalletAmount);//we have to parameterize the below args
	}
	
	@Test
	public void schemeSubscriptionWithBookingAccountAmount3000Rupees() throws Exception
	{

		  
	      ExcelFileUtility eUtil = new ExcelFileUtility();
		  String SelectAmount = eUtil.readDataFromExcel("Scheme",25,1);
		  String Months = eUtil.readDataFromExcel("Scheme",26,1);
          String EnterTotalWalletAmount = eUtil.readDataFromExcel("Scheme",28,1);
		  
		  System.out.println(SelectAmount+" Scheme Subscription Successful");
		  
		  LandingPage lPage = new LandingPage(driver);
	      lPage.clickOnSchemesLnk(driver);
		
	      SchemesPage sPage = new SchemesPage(driver);
		  sPage.subscribeAScheme();
		
	      GoldPlusPlanPage gPage = new GoldPlusPlanPage(driver);
	      gPage.goldPlusPlanPageBookingAccount3000(driver, SelectAmount, Months, EnterTotalWalletAmount);//we have to parameterize the below args
	}
	
	@Test
	public void schemeSubscriptionWithBookingAccountAmount3500Rupees() throws Exception
	{

		  
	      ExcelFileUtility eUtil = new ExcelFileUtility();
		  String SelectAmount = eUtil.readDataFromExcel("Scheme",1,4);
		  String Months = eUtil.readDataFromExcel("Scheme",2,4);
          String EnterTotalWalletAmount = eUtil.readDataFromExcel("Scheme",4,4);
		  
		  System.out.println(SelectAmount+" Scheme Subscription Successful");
		  
		  LandingPage lPage = new LandingPage(driver);
	      lPage.clickOnSchemesLnk(driver);
		
	      SchemesPage sPage = new SchemesPage(driver);
		  sPage.subscribeAScheme();
		
	      GoldPlusPlanPage gPage = new GoldPlusPlanPage(driver);
	      gPage.goldPlusPlanPageBookingAccount3500(driver, SelectAmount, Months, EnterTotalWalletAmount);//we have to parameterize the below args
	}
	
	@Test
	public void schemeSubscriptionWithBookingAccountAmount4000Rupees() throws Exception
	{

		  
	      ExcelFileUtility eUtil = new ExcelFileUtility();
		  String SelectAmount = eUtil.readDataFromExcel("Scheme",7,4);
		  String Months = eUtil.readDataFromExcel("Scheme",8,4);
          String EnterTotalWalletAmount = eUtil.readDataFromExcel("Scheme",10,4);
		  
		  System.out.println(SelectAmount+" Scheme Subscription Successful");
		  
		  LandingPage lPage = new LandingPage(driver);
	      lPage.clickOnSchemesLnk(driver);
		
	      SchemesPage sPage = new SchemesPage(driver);
		  sPage.subscribeAScheme();
		
	      GoldPlusPlanPage gPage = new GoldPlusPlanPage(driver);
	      gPage.goldPlusPlanPageBookingAccount4000(driver, SelectAmount, Months, EnterTotalWalletAmount);//we have to parameterize the below args
	}
	
	@Test
	public void schemeSubscriptionWithBookingAccountAmount4500Rupees() throws Exception
	{

		  
	      ExcelFileUtility eUtil = new ExcelFileUtility();
		  String SelectAmount = eUtil.readDataFromExcel("Scheme",13,4);
		  String Months = eUtil.readDataFromExcel("Scheme",14,4);
          String EnterTotalWalletAmount = eUtil.readDataFromExcel("Scheme",16,4);
		  
		  System.out.println(SelectAmount+" Scheme Subscription Successful");
		  
		  LandingPage lPage = new LandingPage(driver);
	      lPage.clickOnSchemesLnk(driver);
		
	      SchemesPage sPage = new SchemesPage(driver);
		  sPage.subscribeAScheme();
		
	      GoldPlusPlanPage gPage = new GoldPlusPlanPage(driver);
	      gPage.goldPlusPlanPageBookingAccount4500(driver, SelectAmount, Months, EnterTotalWalletAmount);//we have to parameterize the below args
	}
	
	@Test
	public void schemeSubscriptionWithBookingAccountAmount5000Rupees() throws Exception
	{

		  
	      ExcelFileUtility eUtil = new ExcelFileUtility();
		  String SelectAmount = eUtil.readDataFromExcel("Scheme",19,4);
		  String Months = eUtil.readDataFromExcel("Scheme",20,4);
          String EnterTotalWalletAmount = eUtil.readDataFromExcel("Scheme",22,4);
		  
		  System.out.println(SelectAmount+" Scheme Subscription Successful");
		  
		  LandingPage lPage = new LandingPage(driver);
	      lPage.clickOnSchemesLnk(driver);
		
	      SchemesPage sPage = new SchemesPage(driver);
		  sPage.subscribeAScheme();
		
	      GoldPlusPlanPage gPage = new GoldPlusPlanPage(driver);
	      gPage.goldPlusPlanPageBookingAccount1500(driver, SelectAmount, Months, EnterTotalWalletAmount);//we have to parameterize the below args
	}
	
	@Test
	public void schemeSubscriptionWithBookingAccountAmount5500Rupees() throws Exception
	{

		  
	      ExcelFileUtility eUtil = new ExcelFileUtility();
		  String SelectAmount = eUtil.readDataFromExcel("Scheme",25,4);
		  String Months = eUtil.readDataFromExcel("Scheme",26,4);
          String EnterTotalWalletAmount = eUtil.readDataFromExcel("Scheme",28,4);
		  
		  System.out.println(SelectAmount+" Scheme Subscription Successful");
		  
		  LandingPage lPage = new LandingPage(driver);
	      lPage.clickOnSchemesLnk(driver);
		
	      SchemesPage sPage = new SchemesPage(driver);
		  sPage.subscribeAScheme();
		
	      GoldPlusPlanPage gPage = new GoldPlusPlanPage(driver);
	      gPage.goldPlusPlanPageBookingAccount1500(driver, SelectAmount, Months, EnterTotalWalletAmount);//we have to parameterize the below args
	}
	
	@Test
	public void schemeSubscriptionWithBookingAccountAmount6000Rupees() throws Exception
	{

		  
	      ExcelFileUtility eUtil = new ExcelFileUtility();
		  String SelectAmount = eUtil.readDataFromExcel("Scheme",1,7);
		  String Months = eUtil.readDataFromExcel("Scheme",2,7);
          String EnterTotalWalletAmount = eUtil.readDataFromExcel("Scheme",4,7);
		  
		  System.out.println(SelectAmount+" Scheme Subscription Successful");
		  
		  LandingPage lPage = new LandingPage(driver);
	      lPage.clickOnSchemesLnk(driver);
		
	      SchemesPage sPage = new SchemesPage(driver);
		  sPage.subscribeAScheme();
		
	      GoldPlusPlanPage gPage = new GoldPlusPlanPage(driver);
	      gPage.goldPlusPlanPageBookingAccount1500(driver, SelectAmount, Months, EnterTotalWalletAmount);//we have to parameterize the below args
	}
	
	@Test
	public void schemeSubscriptionWithBookingAccountAmount6500Rupees() throws Exception
	{

		  
	      ExcelFileUtility eUtil = new ExcelFileUtility();
		  String SelectAmount = eUtil.readDataFromExcel("Scheme",7,7);
		  String Months = eUtil.readDataFromExcel("Scheme",8,7);
          String EnterTotalWalletAmount = eUtil.readDataFromExcel("Scheme",10,7);
		  
		  System.out.println(SelectAmount+" Scheme Subscription Successful");
		  
		  LandingPage lPage = new LandingPage(driver);
	      lPage.clickOnSchemesLnk(driver);
		
	      SchemesPage sPage = new SchemesPage(driver);
		  sPage.subscribeAScheme();
		
	      GoldPlusPlanPage gPage = new GoldPlusPlanPage(driver);
	      gPage.goldPlusPlanPageBookingAccount1500(driver, SelectAmount, Months, EnterTotalWalletAmount);//we have to parameterize the below args
	}
	
	@Test
	public void schemeSubscriptionWithBookingAccountAmount7000Rupees() throws Exception
	{

		  
	      ExcelFileUtility eUtil = new ExcelFileUtility();
		  String SelectAmount = eUtil.readDataFromExcel("Scheme",13,7);
		  String Months = eUtil.readDataFromExcel("Scheme",14,7);
          String EnterTotalWalletAmount = eUtil.readDataFromExcel("Scheme",16,7);
		  
		  System.out.println(SelectAmount+" Scheme Subscription Successful");
		  
		  LandingPage lPage = new LandingPage(driver);
	      lPage.clickOnSchemesLnk(driver);
		
	      SchemesPage sPage = new SchemesPage(driver);
		  sPage.subscribeAScheme();
		
	      GoldPlusPlanPage gPage = new GoldPlusPlanPage(driver);
	      gPage.goldPlusPlanPageBookingAccount1500(driver, SelectAmount, Months, EnterTotalWalletAmount);//we have to parameterize the below args
	}
	
	@Test
	public void schemeSubscriptionWithBookingAccountAmount7500Rupees() throws Exception
	{

		  
	      ExcelFileUtility eUtil = new ExcelFileUtility();
		  String SelectAmount = eUtil.readDataFromExcel("Scheme",19,7);
		  String Months = eUtil.readDataFromExcel("Scheme",20,7);
          String EnterTotalWalletAmount = eUtil.readDataFromExcel("Scheme",22,7);
		  
		  System.out.println(SelectAmount+" Scheme Subscription Successful");
		  
		  LandingPage lPage = new LandingPage(driver);
	      lPage.clickOnSchemesLnk(driver);
		
	      SchemesPage sPage = new SchemesPage(driver);
		  sPage.subscribeAScheme();
		
	      GoldPlusPlanPage gPage = new GoldPlusPlanPage(driver);
	      gPage.goldPlusPlanPageBookingAccount1500(driver, SelectAmount, Months, EnterTotalWalletAmount);//we have to parameterize the below args
	}
	
	@Test
	public void schemeSubscriptionWithBookingAccountAmount8000Rupees() throws Exception
	{

		  
	      ExcelFileUtility eUtil = new ExcelFileUtility();
		  String SelectAmount = eUtil.readDataFromExcel("Scheme",25,7);
		  String Months = eUtil.readDataFromExcel("Scheme",26,7);
          String EnterTotalWalletAmount = eUtil.readDataFromExcel("Scheme",28,7);
		  
		  System.out.println(SelectAmount+" Scheme Subscription Successful");
		  
		  LandingPage lPage = new LandingPage(driver);
	      lPage.clickOnSchemesLnk(driver);
		
	      SchemesPage sPage = new SchemesPage(driver);
		  sPage.subscribeAScheme();
		
	      GoldPlusPlanPage gPage = new GoldPlusPlanPage(driver);
	      gPage.goldPlusPlanPageBookingAccount1500(driver, SelectAmount, Months, EnterTotalWalletAmount);//we have to parameterize the below args
	}
	
	@Test
	public void schemeSubscriptionWithBookingAccountAmount8500Rupees() throws Exception
	{

		  
	      ExcelFileUtility eUtil = new ExcelFileUtility();
		  String SelectAmount = eUtil.readDataFromExcel("Scheme",1,10);
		  String Months = eUtil.readDataFromExcel("Scheme",2,10);
          String EnterTotalWalletAmount = eUtil.readDataFromExcel("Scheme",4,10);
		  
		  System.out.println(SelectAmount+" Scheme Subscription Successful");
		  
		  LandingPage lPage = new LandingPage(driver);
	      lPage.clickOnSchemesLnk(driver);
		
	      SchemesPage sPage = new SchemesPage(driver);
		  sPage.subscribeAScheme();
		
	      GoldPlusPlanPage gPage = new GoldPlusPlanPage(driver);
	      gPage.goldPlusPlanPageBookingAccount1500(driver, SelectAmount, Months, EnterTotalWalletAmount);//we have to parameterize the below args
	}
	
	@Test
	public void schemeSubscriptionWithBookingAccountAmount9000Rupees() throws Exception
	{

		  
	      ExcelFileUtility eUtil = new ExcelFileUtility();
		  String SelectAmount = eUtil.readDataFromExcel("Scheme",7,10);
		  String Months = eUtil.readDataFromExcel("Scheme",8,10);
          String EnterTotalWalletAmount = eUtil.readDataFromExcel("Scheme",10,10);
		  
		  System.out.println(SelectAmount+" Scheme Subscription Successful");
		  
		  LandingPage lPage = new LandingPage(driver);
	      lPage.clickOnSchemesLnk(driver);
		
	      SchemesPage sPage = new SchemesPage(driver);
		  sPage.subscribeAScheme();
		
	      GoldPlusPlanPage gPage = new GoldPlusPlanPage(driver);
	      gPage.goldPlusPlanPageBookingAccount1500(driver, SelectAmount, Months, EnterTotalWalletAmount);//we have to parameterize the below args
	}
	
	@Test
	public void schemeSubscriptionWithBookingAccountAmount9500Rupees() throws Exception
	{

		  
	      ExcelFileUtility eUtil = new ExcelFileUtility();
		  String SelectAmount = eUtil.readDataFromExcel("Scheme",13,10);
		  String Months = eUtil.readDataFromExcel("Scheme",14,10);
          String EnterTotalWalletAmount = eUtil.readDataFromExcel("Scheme",16,10);
		  
		  System.out.println(SelectAmount+" Scheme Subscription Successful");
		  
		  LandingPage lPage = new LandingPage(driver);
	      lPage.clickOnSchemesLnk(driver);
		
	      SchemesPage sPage = new SchemesPage(driver);
		  sPage.subscribeAScheme();
		
	      GoldPlusPlanPage gPage = new GoldPlusPlanPage(driver);
	      gPage.goldPlusPlanPageBookingAccount1500(driver, SelectAmount, Months, EnterTotalWalletAmount);//we have to parameterize the below args
}
}