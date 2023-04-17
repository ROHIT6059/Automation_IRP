package com.example.definitions;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class IRPAddGSTN {  
  WebDriver driver;  
  @Given("^I launch the url \"([^\"]*)\"$")  
  public void i_launch_the_url(String arg1) throws Exception {  
    // Write code here that turns the phrase above into concrete actions  
	System.setProperty("webdriver.chrome.driver","G:\\Afterssd\\Automationfiles\\Chrome\\chrome8\\chromedriver.exe");  
 
	
	WebDriverManager.chromedriver().setup();
	
	
	driver = new ChromeDriver();  
    
  driver.get("https://dev.portal.irisirp.com");
  driver.manage().window().maximize();    

  }  
  @When("^I provide \"([^\"]*)\" and \"([^\"]*)\"$")  
  public void i_provide_and(String arg1, String arg2) throws Exception {  
    // Write code here that turns the phrase above into concrete actions  
	 driver.findElement(By.xpath("//input[@placeholder='Email Id / Mobile']")).sendKeys(arg1);
  driver.findElement(By.xpath("//input[@class='form-control ng-untouched ng-pristine ng-invalid']")).sendKeys(arg2);
  }  
  @Then("^I click on login button$")  
  public void i_click_on_login_button() throws Exception {  
    // Write code here that turns the phrase above into concrete actions  
	  
	  

	  driver.findElement(By.xpath("//button[@class='btn btn-dark px-5 py-2']")).click();  
	  Thread.sleep(9000);

	
  }  
  
  
     @Then("^User see the AddGSTN page$") 
 public void  User_see_the_AddGSTN_page() throws Exception{
    	 
    	 Thread.sleep(3000);
    	 
    	 
//WebElement gs =  driver.findElement(By.xpath(("//body[1]/app-root[1]/app-header[1]/div[1]/div[1]/app-taxpayer-home-dashboard[1]/app-no-gstin-screen[1]/div[1]/div[1]/button[1]")));
driver.navigate().refresh();
 
WebElement addgstin = driver.findElement(By.xpath("//body[1]/app-root[1]/app-header[1]/div[1]/div[1]/app-taxpayer-home-dashboard[1]/app-no-gstin-screen[1]/div[1]/div[1]/button[1]"));


Thread.sleep(1000);

addgstin.click();

//gs.click();
  
  } 
     
     
     
     
     
     @When("user enter GSTN for SEZ Unit {string}")
     public void user_enter_gstn_for_sez_unit(String string1) {

    	 driver.navigate().refresh();
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    	 
    	 WebElement gstin =  driver.findElement(By.xpath("//input[@name='gstin']"));
  	 gstin.sendKeys(string1);
    	 
  	WebElement sez = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
    
	System.out.println(sez.getText());
     }
     
     @Then("enter GSTN for ISD  {string}")
     public void enter_gstn_for_isd(String string2) {
    	 driver.navigate().refresh();
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    	 
    	 WebElement gstin =  driver.findElement(By.xpath("//input[@name='gstin']"));
  	 gstin.sendKeys(string2);
    	 
  	WebElement isd = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
    
	System.out.println(isd.getText());
     }

     @When("enter GSTN for UIN {string}")
     public void enter_gstn_for_uin(String string3) {
    	 driver.navigate().refresh(); 
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    	 
    	 WebElement gstin =  driver.findElement(By.xpath("//input[@name='gstin']"));
  	 gstin.sendKeys(string3);
    	 
  	WebElement uin = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
    
	System.out.println(uin.getText());
    	 
    	 
     }

     @Then("enter GSTN for UN Body {string}")
     public void enter_gstn_for_un_body(String string4) {
    	 driver.navigate().refresh();
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    	 
    	 WebElement gstin =  driver.findElement(By.xpath("//input[@name='gstin']"));
  	 gstin.sendKeys(string4);
    	 
  	WebElement un = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
    
	System.out.println(un.getText());
     }

     @When("enter GSTN for Other notified person {string}")
     public void enter_gstn_for_other_notified_person(String string5) {
    	 driver.navigate().refresh();  
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    	 
    	 WebElement gstin =  driver.findElement(By.xpath("//input[@name='gstin']"));
  	 gstin.sendKeys(string5);
    	 
  	WebElement np = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
    
	System.out.println(np.getText());
    	 
    	 
     }

     @Then("enter GSTN for Composition {string}")
     public void enter_gstn_for_composition(String string6) {
    	 driver.navigate().refresh();
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    	 
    	 WebElement gstin =  driver.findElement(By.xpath("//input[@name='gstin']"));
  	 gstin.sendKeys(string6);
    	 
  	WebElement compo = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
    
	System.out.println(compo.getText());
     }
     
     

//@When("enter GSTN for TCS {string}")
//public void enter_gstn_for_tcs(String string7) throws Exception {
//	driver.navigate().refresh();
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//
//	    	 
//	    	 WebElement gstin =  driver.findElement(By.xpath("//input[@name='gstin']"));
//	  	 gstin.sendKeys(string7);
//	  	 
//	  	WebElement tcsok = driver.findElement(By.xpath("/html/body/modal-container/div[2]/div/div[2]/button[1]"));
//	JavascriptExecutor valid = (JavascriptExecutor)driver;
//	
//	Thread.sleep(3000);
//	valid.executeScript("arguments[0].click()", tcsok);
//	Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
//	  	//WebElement tcs = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
//		//System.out.println(tcs.getText());
//}

@Then("enter GSTN for TDS {string}")
public void enter_gstn_for_tds(String string8) {
	driver.navigate().refresh();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	    	 
	    	 WebElement gstin =  driver.findElement(By.xpath("//input[@name='gstin']"));
	  	 gstin.sendKeys(string8);
	    	 
	  	WebElement tds = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	    
		System.out.println(tds.getText());
}

@When("enter GSTN for NRI {string}")
public void enter_gstn_for_nri(String string9) {
	driver.navigate().refresh();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	    	 
	    	 WebElement gstin =  driver.findElement(By.xpath("//input[@name='gstin']"));
	  	 gstin.sendKeys(string9);
	    	 
	  	WebElement nri = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	    
		System.out.println(nri.getText());
}

@Then("enter GSTN for Regular {string}")
public void enter_gstn_for_regular(String stringReg) {
	driver.navigate().refresh();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	    	 
	    	 WebElement gstin =  driver.findElement(By.xpath("//input[@name='gstin']"));
	  	 gstin.sendKeys(stringReg);
	    	 
	  	WebElement regular = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	    
		System.out.println(regular.getText());
}

@When("enter GSTN for SEZ Developer {string}")
public void enter_gstn_for_sez_developer(String sezdev) {
	driver.navigate().refresh();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	    	 
	    	 WebElement gstin =  driver.findElement(By.xpath("//input[@name='gstin']"));
	  	 gstin.sendKeys(sezdev);
	    	 
	  	WebElement regular = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	    
		System.out.println(regular.getText());
}

@Then("adding the GSTN for Inactive {string}")
public void adding_the_gstn_for_inactive(String Inactive) {
	driver.navigate().refresh();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	    	 
	    	 WebElement gstin =  driver.findElement(By.xpath("//input[@name='gstin']"));
	  	 gstin.sendKeys(Inactive);
	    	 
	  	WebElement regular = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	    
		System.out.println(regular.getText());
}

@When("Adding the GSTN for Suspended {string}")
public void adding_the_gstn_for_suspended(String suspend) throws Exception {
   
	driver.navigate().refresh();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	    	 
	    	 WebElement gstin =  driver.findElement(By.xpath("//input[@name='gstin']"));
	  	 gstin.sendKeys(suspend);
	  	
	  	  Thread.sleep(2000);
	  	 WebElement ele = driver.findElement(By.xpath("//button[@class='btn btn_primary_theme font-size-16']"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", ele);
		Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
	  	 
	  	 
	    	 
	  	WebElement sus = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	    
		System.out.println(sus.getText());
}

@Then("GSTN adding for Provisional {string}")
public void gstn_adding_for_provisional(String provisional) throws Exception {
   
	driver.navigate().refresh();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	    	 
	    	 WebElement gstin =  driver.findElement(By.xpath("//input[@name='gstin']"));
	  	 gstin.sendKeys(provisional);
	  	
	  	  Thread.sleep(2000);
	  	 WebElement ele = driver.findElement(By.xpath("//button[@class='btn btn_primary_theme font-size-16']"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", ele);
		Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
	  	 
	  	 WebElement prov = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	    
		System.out.println(prov.getText());
	
}

@When("adding GSTN for Cancelled {string}")
public void adding_gstn_for_cancelled(String cancell) throws Exception {
	driver.navigate().refresh();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	    	 
	    	 WebElement gstin =  driver.findElement(By.xpath("//input[@name='gstin']"));
	  	 gstin.sendKeys(cancell);
	  	
	  	  Thread.sleep(2000);
	  	 WebElement ele = driver.findElement(By.xpath("//button[@class='btn btn_primary_theme font-size-16']"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", ele);
		Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
	  	 
	  	 
	    	 
	  	WebElement can = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	    
		System.out.println(can.getText());
}

@When("adding a Invalid GSTIN {string}")
public void adding_a_invalid_gstin(String invalid) {
	driver.navigate().refresh();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	    	 
	    	 WebElement gstin =  driver.findElement(By.xpath("//input[@name='gstin']"));
	  	 gstin.sendKeys(invalid);
	    	 
	  	WebElement inva = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	    
		System.out.println(inva.getText());
}
     
//@Then("adding the GSTN for Positive response {string}")
//public void adding_the_gstn_for_positive_response(String positiveres) throws Exception {
//   
//	driver.navigate().refresh();
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//
//	    	 
//	    	 WebElement gstin =  driver.findElement(By.xpath("//input[@name='gstin']"));
//	  	 gstin.sendKeys(positiveres);
//	  	
//	  	  Thread.sleep(2000);
//	  	 WebElement ele = driver.findElement(By.xpath("//button[@class='btn btn_primary_theme font-size-16']"));
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("arguments[0].click()", ele);
//		Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
//	  	 
//	  	 
//	    	 
//	//  	WebElement regular = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
//	    
////		System.out.println(regular.getText());
//
//}
     
@When("verify valid email and valid mobile {string} and {string}")
public void verify_valid_email_and_valid_mobile(String vemail, String vmobile) throws Exception { 

	driver.navigate().refresh();
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	

	 WebElement gstin =  driver.findElement(By.xpath("//input[@name='gstin']"));
 	  gstin.sendKeys("24GSPMH0121G1Z9");
 	 
 	 Thread.sleep(3000);
 	WebElement button = driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-gstin-registration/div[2]/div[3]/div[2]/button"));
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click()", button);
		Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());

	Thread.sleep(3000);	
  driver.findElement(By.xpath("//input[@name='gstinEmail']")).sendKeys(vemail);
 
  driver.findElement(By.xpath("//input[@name='gstinMobile']")).sendKeys(vmobile);
  
	WebElement otp = driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-gstin-verification/div[2]/div[4]/form/div/div[3]/button"));
	JavascriptExecutor sendotp = (JavascriptExecutor)driver;
	sendotp.executeScript("arguments[0].click()", otp);
	Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
	
	
	WebElement otpscussessful = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
    
	System.out.println(otpscussessful.getText());

}

@Then("verify Registered user emailid and mobile {string} and {string}")
public void verify_Registered_user_emailid_and_mobile(String Registeremail, String Registermobile) throws Exception{
	driver.navigate().refresh();
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	Thread.sleep(3000);	
	  driver.findElement(By.xpath("//input[@name='gstinEmail']")).sendKeys(Registeremail);
	 
	  driver.findElement(By.xpath("//input[@name='gstinMobile']")).sendKeys(Registermobile);
	  
	  WebElement otp = driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-gstin-verification/div[2]/div[4]/form/div/div[3]/button"));
		JavascriptExecutor sendotp = (JavascriptExecutor)driver;
		sendotp.executeScript("arguments[0].click()", otp);
		Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
		
		
		WebElement otpscussessful = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	    
		System.out.println(otpscussessful.getText());
}     

@When("UnRegistered user emailid and mobile {string} and {string}")
public void UnRegistered_user_emailid_and_mobile(String UnRegisteremail, String UnRegistermobile) throws Exception{
	driver.navigate().refresh();
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	Thread.sleep(3000);	
	  driver.findElement(By.xpath("//input[@name='gstinEmail']")).sendKeys(UnRegisteremail);
	 
	  driver.findElement(By.xpath("//input[@name='gstinMobile']")).sendKeys(UnRegistermobile);
	  
	  WebElement otp = driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-gstin-verification/div[2]/div[4]/form/div/div[3]/button"));
		JavascriptExecutor sendotp = (JavascriptExecutor)driver;
		sendotp.executeScript("arguments[0].click()", otp);
		Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
		
		
		WebElement otpscussessful = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	    
		System.out.println(otpscussessful.getText());
} 


@Then("User  entering non valid email and non valid mobile {string} {string}")
public void user_entering_non_valid_email_and_non_valid_mobile(String nonvalidemail, String nonvalidmobile) throws Exception  {
   
	
	driver.navigate().refresh();
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	Thread.sleep(3000);	
	  driver.findElement(By.xpath("//input[@name='gstinEmail']")).sendKeys(nonvalidemail);
	 
	  driver.findElement(By.xpath("//input[@name='gstinMobile']")).sendKeys(nonvalidmobile);
	  
	  WebElement otp = driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-gstin-verification/div[2]/div[4]/form/div/div[3]/button"));
		JavascriptExecutor sendotp = (JavascriptExecutor)driver;
		sendotp.executeScript("arguments[0].click()", otp);
		Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
		
		WebElement nvemail = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div//div[contains(text(),' Please enter valid email address')]")));
	 System.out.println(nvemail.getText());
		
	 WebElement nvmobile = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div//div[contains(text(),' Please enter valid Mobile No')]")));

	 System.out.println(nvmobile.getText());
			
} 

@When("User enter only email not mobile {string}")
public void user_enter_only_email_not_mobile(String validemail) throws Exception {
	driver.navigate().refresh();
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	Thread.sleep(3000);	
	  driver.findElement(By.xpath("//input[@name='gstinEmail']")).sendKeys(validemail);
	  
	  WebElement otp = driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-gstin-verification/div[2]/div[4]/form/div/div[3]/button"));
		JavascriptExecutor sendotp = (JavascriptExecutor)driver;
		sendotp.executeScript("arguments[0].click()", otp);
		Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
		
		WebElement validmobile = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div//div[contains(text(),' Mobile No required')]")));

		 System.out.println(validmobile.getText());
		
}

@When("User enter only mobile not email {string}")
public void user_enter_only_mobile_not_email(String validmobile) throws Exception {
	driver.navigate().refresh();
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	Thread.sleep(3000);	
	  driver.findElement(By.xpath("//input[@name='gstinMobile']")).sendKeys(validmobile);
	  
	  WebElement otp = driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-gstin-verification/div[2]/div[4]/form/div/div[3]/button"));
		JavascriptExecutor sendotp = (JavascriptExecutor)driver;
		sendotp.executeScript("arguments[0].click()", otp);
		Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
		
		WebElement validemail= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div//div[contains(text(),' Email id required')]")));
 System.out.println(validemail.getText());
		
}

@Then("User enter invalid OTP {string}")
public void user_enter_invalid_otp(String invalidotp) throws Exception {
	
	driver.navigate().refresh();
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	Thread.sleep(3000);	
	  driver.findElement(By.xpath("//input[@name='gstinEmail']")).sendKeys("rohitsavade6059@gmail.com");
	 
	  driver.findElement(By.xpath("//input[@name='gstinMobile']")).sendKeys("8806481789");
	  
	  WebElement otp = driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-gstin-verification/div[2]/div[4]/form/div/div[3]/button"));
		JavascriptExecutor sendotp = (JavascriptExecutor)driver;
		sendotp.executeScript("arguments[0].click()", otp);
		Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
		
		
		WebElement otpscussessful = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	    
		System.out.println(otpscussessful.getText());
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//input[@name='otp']")).sendKeys(invalidotp);
		
		WebElement ele = driver.findElement(By.xpath("//button[@class='btn btn_primary_theme font-size-16 ms-5']"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", ele);
		Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
		
        WebElement incorrectotp = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	    
		System.out.println(incorrectotp.getText());
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='otp']")).clear();
		
		driver.findElement(By.xpath("//input[@name='otp']")).sendKeys("676767");
		
		
		WebElement savenext = driver.findElement(By.xpath("//button[@class='btn btn_primary_theme font-size-16 ms-5']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", savenext);
		Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
		
		 WebElement correctotp = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
		    
			System.out.println(correctotp.getText());
    
}

@When("User use correct valid Set IRP Username and password that time checking button is enbaled or disabled")
public void user_use_correct_valid_set_irp_username_and_password_that_time_checking_button_is_enbaled_or_disabled() throws Exception {
    
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@name='irpUserName']")).sendKeys("Unique name");
	  Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@name='irpPassword']")).sendKeys("12345678");
	
	Thread.sleep(3000);
	 WebElement button1 = driver.findElement(By.xpath("//button[@class=('btn btn_primary_theme font-size-16 ms-5')]"));
	 System.out.println("Button is enabled"+ button1.isEnabled());
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@name='irpPassword']")).clear();
	 driver.findElement(By.xpath("//input[@name='irpPassword']")).sendKeys("Abcd@1234");
	 Thread.sleep(3000);
	 WebElement button2 = driver.findElement(By.xpath("//button[@class=('btn btn_primary_theme font-size-16 ms-5')]"));
	 System.out.println("Button is enabled"+ button2.isEnabled());
	 
	 Thread.sleep(3000);
		WebElement elec = driver.findElement(By.xpath("//button[@class='btn btn_primary_theme font-size-16 ms-5']"));
		JavascriptExecutor jsee = (JavascriptExecutor)driver;
		jsee.executeScript("arguments[0].click()", elec);
		Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
	 
}


@Then("User choose Intermediary integration method")
public void user_choose_intermediary_integration_method() throws Exception {

	Thread.sleep(3000);
	WebElement ele = driver.findElement(By.xpath("//input[@value='INTERMEDIARY']"));
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click()", ele);
	Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
  JavascriptExecutor jsd = (JavascriptExecutor) driver;
  jsd.executeScript("window.scrollBy(0,1000)");
  
  
  Thread.sleep(3000);
	WebElement drp = driver.findElement(By.xpath("//span[@class='dropdown-multiselect__caret']"));
	JavascriptExecutor dwn= (JavascriptExecutor)driver;
	dwn.executeScript("arguments[0].click()", drp);
	Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
	
	Thread.sleep(5000);
	
	WebElement all = driver.findElement(By.xpath("//input[@aria-label='multiselect-select-all']"));
	JavascriptExecutor alldown = (JavascriptExecutor)driver;
	alldown.executeScript("arguments[0].click()", all);
	Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
	
	Thread.sleep(2000);
	WebElement button3 = driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-gstin-api-registration/div[2]/div[4]/div[3]/button"));
	 System.out.println("Button is enabled"+ button3.isEnabled());
	 
	 
	 Thread.sleep(5000);
	 WebElement drpnone = driver.findElement(By.xpath("//input[@aria-label='multiselect-select-all']"));
		JavascriptExecutor nulldwn = (JavascriptExecutor)driver;
		nulldwn.executeScript("arguments[0].click()", drpnone);
		Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
	 
	 WebElement button4 = driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-gstin-api-registration/div[2]/div[4]/div[3]/button"));
		 System.out.println("Button is enabled"+ button4.isEnabled());
	
		 
	
}







//@Then("I clicked on save&next button3")
//public void i_clicked_on_save_next_button3() throws InterruptedException {
//  
//	Thread.sleep(3000);
//	WebElement ele = driver.findElement(By.xpath("//button[@class='btn btn_primary_theme font-size-16 ms-5']"));
//	JavascriptExecutor jse = (JavascriptExecutor)driver;
//	jse.executeScript("arguments[0].click()", ele);
//	Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
//	      
//}
//
//
//@Then("I choose Intermediary integration method")
//public void i_choose_intermediary_integration_method()  throws InterruptedException {
//  
//	Thread.sleep(3000);
//	driver.navigate().refresh();
//	Thread.sleep(2000);
//	WebElement ele = driver.findElement(By.xpath("//input[@value='INTERMEDIARY']"));
//	JavascriptExecutor jse = (JavascriptExecutor)driver;
//	jse.executeScript("arguments[0].click()", ele);
//	Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
//  JavascriptExecutor jsd = (JavascriptExecutor) driver;
//  jsd.executeScript("window.scrollBy(0,1000)");
//
//    
//}
//
//@Then("I clicked on dropdown and choose all")
//public void i_clicked_on_dropdown_and_choose_all() throws InterruptedException {
//  
//	Thread.sleep(3000);
//	WebElement ele = driver.findElement(By.xpath("//span[@class='dropdown-multiselect__caret']"));
//	JavascriptExecutor jse = (JavascriptExecutor)driver;
//	jse.executeScript("arguments[0].click()", ele);
//	Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
//	   
// 	Thread.sleep(5000);
//	
//	WebElement drop = driver.findElement(By.xpath("//input[@aria-label='multiselect-select-all']"));
//	JavascriptExecutor down = (JavascriptExecutor)driver;
//	down.executeScript("arguments[0].click()", drop);
//	Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
//	 
//
//}
//	@Then("I clicked on  save&next button4")
//	public void i_clicked_on_save_next_button4() {
//		WebElement drop = driver.findElement(By.xpath("//button[@type='submit']"));
//		JavascriptExecutor down = (JavascriptExecutor)driver;
//		down.executeScript("arguments[0].click()", drop);
//		Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
//		  
//	}
//
//	@Then("I choose all the checkboxes")
//	public void i_choose_all_the_checkboxes() throws InterruptedException {
//	  
//		Thread.sleep(3000);
//		
//		WebElement check1 = driver.findElement(By.xpath("//input[@id='consent1']"));
//		JavascriptExecutor checked1 = (JavascriptExecutor)driver;
//		checked1.executeScript("arguments[0].click()", check1);
//		Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
//
//		Thread.sleep(3000);
//	  
//		
//		WebElement check2 = driver.findElement(By.xpath("//input[@id='consent2']"));
//		JavascriptExecutor checked2 = (JavascriptExecutor)driver;
//		checked2.executeScript("arguments[0].click()", check2);
//		Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
//		  
//		Thread.sleep(3000);
//
//		
//		WebElement check3 = driver.findElement(By.xpath("//input[@id='consent3']"));
//		JavascriptExecutor checked3 = (JavascriptExecutor)driver;
//		checked3.executeScript("arguments[0].click()", check3);
//		Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
//		  
//		Thread.sleep(3000);
//		
//		  
//		}
//	





//@Then("User enter valid OTP {string}")
//public void user_enter_valid_otp(String string) {
//    
//	
//	driver.findElement(By.xpath("//input[@name='otp']")).clear();
//	
//	
//}

}

// WebElement a = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div//div[contains(text(),' Please enter valid email address')])]")));

// System.out.println(a.getText());


//div//div[contains(text(),' Please enter valid email address')]




     
     
//     @Then("I enter GSTIN number {string}")
//     public void i_enter_gstin_number(String string1)  {
//
//    	 WebElement gstin =  driver.findElement(By.xpath("//input[@name='gstin']"));
//    	 gstin.sendKeys(string1);
//    	 
//     }

     
     
     
     
     
     
     
     
     
     
     
     
//@Then("^I clicked on save and next button1$")
//public void i_clicked_on_save_and_next_button1() throws Exception {
//    
//	Thread.sleep(2000);
//
//		
//	WebElement ele = driver.findElement(By.xpath("//button[@class='btn btn_primary_theme font-size-16']"));
//	JavascriptExecutor jse = (JavascriptExecutor)driver;
//	jse.executeScript("arguments[0].click()", ele);
//	Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
//	 
//	
//} 
//@Then("I enter {string} and {string}")
//public void i_enter_and(String string2, String string3) throws InterruptedException {
//	
//Thread.sleep(2000);
//  driver.findElement(By.xpath("//input[@name='gstinEmail']")).sendKeys(string2);
//  Thread.sleep(2000);
//  driver.findElement(By.xpath("//input[@name='gstinMobile']")).sendKeys(string3);
//	
//}
//
//@Then("I clicked on send OTP button")
//public void i_clicked_on_send_otp_button() throws InterruptedException {
//	
//	Thread.sleep(3000);
//	
//	WebElement otp = driver.findElement(By.xpath("//button[@class='btn btn_primary_theme font-size-16']"));
//	JavascriptExecutor jse = (JavascriptExecutor)driver;
//	jse.executeScript("arguments[0].click()", otp);
//	Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
//    
//	
//}	
//
//@Then("I enter OTP {string}")
//public void i_enter_otp(String string4) throws InterruptedException {
//
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//input[@name='otp']")).sendKeys(string4);
//
//} 
//@Then("I clicked on save&next button2")
//public void i_clicked_on_save_next_button2() throws InterruptedException {
//    	 
//   	 Thread.sleep(3000);
//WebElement ele = driver.findElement(By.xpath("//button[@class='btn btn_primary_theme font-size-16 ms-5']"));
//JavascriptExecutor jse = (JavascriptExecutor)driver;
//jse.executeScript("arguments[0].click()", ele);
//Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
//      
//} 
// 
//@Then("I enter IRP {string} and {string}")
//public void i_enter_irp_and(String string5, String string6) throws InterruptedException {
//Thread.sleep(3000);
//	driver.navigate().refresh();
//	Thread.sleep(3000);
//	 driver.findElement(By.xpath("//input[@name='irpUserName']")).sendKeys(string5);
//	  Thread.sleep(2000);
//	 driver.findElement(By.xpath("//input[@name='irpPassword']")).sendKeys(string6);
//		
//	}
//
//
////button[@class='btn btn_primary_theme font-size-16 ms-5']
//
//@Then("I clicked on save&next button3")
//public void i_clicked_on_save_next_button3() throws InterruptedException {
//    
//	Thread.sleep(3000);
//	WebElement ele = driver.findElement(By.xpath("//button[@class='btn btn_primary_theme font-size-16 ms-5']"));
//	JavascriptExecutor jse = (JavascriptExecutor)driver;
//	jse.executeScript("arguments[0].click()", ele);
//	Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
//	      
//}
//
//
//@Then("I choose Intermediary integration method")
//public void i_choose_intermediary_integration_method()  throws InterruptedException {
//    
//	Thread.sleep(3000);
//	driver.navigate().refresh();
//	Thread.sleep(2000);
//	WebElement ele = driver.findElement(By.xpath("//input[@value='INTERMEDIARY']"));
//	JavascriptExecutor jse = (JavascriptExecutor)driver;
//	jse.executeScript("arguments[0].click()", ele);
//	Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
//    JavascriptExecutor jsd = (JavascriptExecutor) driver;
//    jsd.executeScript("window.scrollBy(0,1000)");
//
//      
//}
//
//@Then("I clicked on dropdown and choose all")
//public void i_clicked_on_dropdown_and_choose_all() throws InterruptedException {
//    
//	Thread.sleep(3000);
//	WebElement ele = driver.findElement(By.xpath("//span[@class='dropdown-multiselect__caret']"));
//	JavascriptExecutor jse = (JavascriptExecutor)driver;
//	jse.executeScript("arguments[0].click()", ele);
//	Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
//	   
//   	Thread.sleep(5000);
//	
//	WebElement drop = driver.findElement(By.xpath("//input[@aria-label='multiselect-select-all']"));
//	JavascriptExecutor down = (JavascriptExecutor)driver;
//	down.executeScript("arguments[0].click()", drop);
//	Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
//	 
//
//}
//	@Then("I clicked on  save&next button4")
//	public void i_clicked_on_save_next_button4() {
//		WebElement drop = driver.findElement(By.xpath("//button[@type='submit']"));
//		JavascriptExecutor down = (JavascriptExecutor)driver;
//		down.executeScript("arguments[0].click()", drop);
//		Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
//		  
//	}
//
//	@Then("I choose all the checkboxes")
//	public void i_choose_all_the_checkboxes() throws InterruptedException {
//	  
//		Thread.sleep(3000);
//		
//		WebElement check1 = driver.findElement(By.xpath("//input[@id='consent1']"));
//		JavascriptExecutor checked1 = (JavascriptExecutor)driver;
//		checked1.executeScript("arguments[0].click()", check1);
//		Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
//
//		Thread.sleep(3000);
//	  
//		
//		WebElement check2 = driver.findElement(By.xpath("//input[@id='consent2']"));
//		JavascriptExecutor checked2 = (JavascriptExecutor)driver;
//		checked2.executeScript("arguments[0].click()", check2);
//		Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
//		  
//		Thread.sleep(3000);
//
//		
//		WebElement check3 = driver.findElement(By.xpath("//input[@id='consent3']"));
//		JavascriptExecutor checked3 = (JavascriptExecutor)driver;
//		checked3.executeScript("arguments[0].click()", check3);
//		Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
//		  
//		Thread.sleep(3000);
//		
//		  
//		}
//	
//	
//	
//	//button[@type='button']
//
//	@Then("I click on sendotp")
//	public void i_click_on_sendotp() throws InterruptedException {
//		
//		Thread.sleep(3000);
//
//		WebElement otp = driver.findElement(By.xpath("//button[@type='button']"));
//		JavascriptExecutor send = (JavascriptExecutor)driver;
//		send.executeScript("arguments[0].click()", otp);
//		Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
//		  	
//	}
//	
//    @Then("clicked on final save")
//	public void clicked_on_final_save() {
//		
//		
//	}
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//
//	
//	
//	
//	
//	
//	
	
	
	
	
	
/*


@Then("I Choose Direct API integration method")
public void i_choose_direct_api_integration_method() throws InterruptedException {
    
	Thread.sleep(5000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.xpath("//input[@value='DIRECT']"));
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click()", ele);
	Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
	      
	*/




