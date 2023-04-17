package com.example.definitions;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Alert;
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
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class sinup {  
  WebDriver driver; 

  @Given("^User launch the urll \"([^\"]*)\"$")  
  public void User_launch_the_url(String arg1) throws Exception {  
    // Write code here that turns the phrase above into concrete actions  
	System.setProperty("webdriver.chrome.driver","G:\\Afterssd\\Automationfiles\\Chrome\\chrome8\\chromedriver.exe");  
 	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();  
     driver.get("https://dev.portal.irisirp.com");
     driver.manage().window().maximize();    

  }  
  
  @Then("User clicked on signup link")
  public void user_clicked_on_signup_link() {

	  WebElement ele = driver.findElement(By.xpath("/html/body/app-root/app-login/div[2]/div/div[2]/div/div/div/form/div/div[7]/p/span/a"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", ele);
		Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
		
  
  } 

@When("User Not fills name")
public void user_not_fills_name() throws Exception {
	
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		
      	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rohitsavade6059@gmail.com");
		
		WebElement signn = driver.findElement(By.xpath("//button[@class='btn btn-dark px-5 py-2']"));
		JavascriptExecutor clk = (JavascriptExecutor)driver;
		clk.executeScript("arguments[0].click()", signn);
		Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
			
		
		WebElement a = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div//div[contains(text(),' Username is required ')]")));
		
		System.out.println(a.getText());
		
//		WebElement signn = driver.findElement(By.xpath("//button[@class='btn btn-dark px-5 py-2']"));
//		JavascriptExecutor clk = (JavascriptExecutor)driver;
//		clk.executeScript("arguments[0].click()", signn);
//		Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
//		//driver.findElement(By.xpath("//button[@class='btn btn-dark px-5 py-2']")).click();
//		String actualText  =   driver.findElement(By.xpath("//div[@class='ng-tns-c47-2 toast-message ng-star-inserted']")).getText();
//	  Assert.assertTrue(expectedText.equals(actualText));
	
		
	      
//Thread.sleep(3000);
//		
//		WebElement signn = driver.findElement(By.xpath("//button[@class='btn btn-dark px-5 py-2']"));
//		JavascriptExecutor clk = (JavascriptExecutor)driver;
//		clk.executeScript("arguments[0].click()", signn);
//		Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
//		

//		String expectedText ="Mandatory fields should not be empty or null. ";
//        String actualText  =   driver.findElement(By.xpath("//*[text()='Mandatory fields should not be empty or null. ']")).getText();
//      Assert.assertTrue(expectedText.equals(actualText));
//	  
      
//		Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(),'Mandatory fields should not be empty or null. ')]")).isDisplayed());
//
//		System.out.print("succuusss");
//      
//div[contains(text(),'Mandatory fields should not be empty or null. ')]
      
      
}  

@When("User Not Fills email")
public void user_not_fills_email() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	Thread.sleep(300);
	
	driver.navigate().refresh();

	driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Nilesh");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("");
	
	
	WebElement signn = driver.findElement(By.xpath("//button[@class='btn btn-dark px-5 py-2']"));
	JavascriptExecutor clk = (JavascriptExecutor)driver;
	clk.executeScript("arguments[0].click()", signn);
	Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
		
	 WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),' Email id / Mobile is required ')]")));
	  System.out.println(m.getText());
	
/*	
	WebElement signn = driver.findElement(By.xpath("//button[@class='btn btn-dark px-5 py-2']"));
	JavascriptExecutor clk = (JavascriptExecutor)driver;
	clk.executeScript("arguments[0].click()", signn);
	Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
	

	String expectedText = "Mandatory fields should not be empty or null";
      String actualText  =   driver.findElement(By.xpath("//div[text()='Mandatory fields should not be empty or null']")).getText();
  Assert.assertTrue(expectedText.equals(actualText));
	
  */
}

@When("User fill only name not email")
public void user_fill_only_name_not_email() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
  
	Thread.sleep(2000);
	driver.navigate().refresh();

	driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Nilesh");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("");
	
	WebElement signn = driver.findElement(By.xpath("//button[@class='btn btn-dark px-5 py-2']"));
	JavascriptExecutor clk = (JavascriptExecutor)driver;
	clk.executeScript("arguments[0].click()", signn);
	Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
		
	 WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div//div[contains(text(),' Email id / Mobile is required ')]")));
	  System.out.println(m.getText());
	
	
//	JavascriptExecutor jsd = (JavascriptExecutor) driver;
//    jsd.executeScript("window.scrollBy(0,1000)");
//    WebElement sign = driver.findElement(By.xpath("//button[@class='btn btn-dark px-5 py-2']"));
//	JavascriptExecutor sig = (JavascriptExecutor)driver;
//	sig.executeScript("arguments[0].click()", sign);
//	Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
//
//
//Thread.sleep(2000);
//
//String expectedText = "---------------";
//  String actualText  =   driver.findElement(By.xpath(" ")).getText();
//  Assert.assertTrue(expectedText.equals(actualText));
	
	
	
}

@When("User fill only email not name")
public void user_fill_only_email_not_name() throws Exception {
   
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	driver.navigate().refresh();
   Thread.sleep(300);
	driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rohitsavade6059@gmail.com");
	
	WebElement signn = driver.findElement(By.xpath("//button[@class='btn btn-dark px-5 py-2']"));
	JavascriptExecutor clk = (JavascriptExecutor)driver;
	clk.executeScript("arguments[0].click()", signn);
	Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
		

	WebElement a = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div//div[contains(text(),' Username is required ')]")));
	
	System.out.println(a.getText());
	
//	JavascriptExecutor jsd = (JavascriptExecutor) driver;
//    jsd.executeScript("window.scrollBy(0,1000)");
//    WebElement sign = driver.findElement(By.xpath("//button[@class='btn btn-dark px-5 py-2']"));
//	JavascriptExecutor sig = (JavascriptExecutor)driver;
//	sig.executeScript("arguments[0].click()", sign);
//	Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
//
//
//Thread.sleep(2000);
//
//String expectedText = "";
//  String actualText  =   driver.findElement(By.xpath("")).getText();
//  Assert.assertTrue(expectedText.equals(actualText));
	
	
	
}
    
        
  @When("User fill wrong emailformat")
  public void User_fill_wrong_emailformat() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		driver.navigate().refresh();

		 
		  driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("justin");
		  
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rohit");

			
			
			
			WebElement signn = driver.findElement(By.xpath("//button[@class='btn btn-dark px-5 py-2']"));
			JavascriptExecutor clk = (JavascriptExecutor)driver;
			clk.executeScript("arguments[0].click()", signn);
			Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
			
			
			
			
			WebElement a = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div//div[contains(text(),' Please enter valid email address or phone number ')]")));

			System.out.println(a.getText());
	
//		  try {   
//		
//		String generatedstring = RandomStringUtils.randomAlphabetic(10);
//		  String email = generatedstring;
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(generatedstring);
//	} catch (Exception e) 
//		
//	  {
//		WebElement tr = driver.findElement(By.xpath("/html/body/app-root/app-signup/div[2]/div/div[2]/div/div/form/div/div[5]/div"));
//		JavascriptExecutor sig = (JavascriptExecutor)driver;
//		sig.executeScript("arguments[0]", tr);
//		Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
//	 
	//  }
	}
	
  
  
  @Then("User fill name and correct email format but that are already exist")
  public void user_fill_name_and_correct_email_format_but_that_are_already_exist() {
		driver.navigate().refresh();

	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	  driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("adharsh");
	  
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rohitsavade6059@gmail.com");
		
		
		WebElement signn = driver.findElement(By.xpath("//button[@class='btn btn-dark px-5 py-2']"));
		JavascriptExecutor clk = (JavascriptExecutor)driver;
		clk.executeScript("arguments[0].click()", signn);
		Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
		

		WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());
	  }
  
  
  
  
  @Then("User fill name and correct email but new User and they not mark on checkbox")
  public void user_fill_name_and_correct_email_but_new_user_and_they_not_mark_on_checkbox() {
     
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	  
	  WebElement ele = driver.findElement(By.xpath("/html/body/app-root/app-login/div[2]/div/div[2]/div/div/div/form/div/div[7]/p/span/a"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", ele);
		Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
	  
	  
	  driver.navigate().refresh();

	 // driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("prakash");
	  
		
		String generatedNamestring = RandomStringUtils.randomAlphabetic(7);
       	  String name =generatedNamestring;
	  driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(generatedNamestring);
		
		
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rohitsavade@gmail.com");
	  String generatedstring = RandomStringUtils.randomAlphabetic(10);
	  String email = generatedstring+"@gmail.com";
	   driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
	   
	    
	   WebElement signn = driver.findElement(By.xpath("//span[@class='checkmark']"));
		JavascriptExecutor clk = (JavascriptExecutor)driver;
		clk.executeScript("arguments[0].click()", signn);
		Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
	   
	  
	     WebElement correct = driver.findElement(By.xpath("//button[@class='btn btn-dark px-5 py-2']"));
		JavascriptExecutor chk = (JavascriptExecutor)driver;
		chk.executeScript("arguments[0].click()", correct);
		Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
	  
		WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());
	   
  }
  
  
  
  
  @Then("User fill name and correct email but new User")
  public void user_fill_name_and_correct_email_but_new_user() {
	
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	  
//	  WebElement ele = driver.findElement(By.xpath("/html/body/app-root/app-login/div[2]/div/div[2]/div/div/div/form/div/div[7]/p/span/a"));
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("arguments[0].click()", ele);
//		Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
//	  
	  
	  driver.navigate().refresh();

	 // driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("prakash");
	  
		
		String generatedNamestring = RandomStringUtils.randomAlphabetic(7);
       	  String name =generatedNamestring;
	  driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(generatedNamestring);
		
		
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rohitsavade@gmail.com");
	  String generatedstring = RandomStringUtils.randomAlphabetic(10);
	  String email = generatedstring+"@gmail.com";
	   driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
	   
	   
	   WebElement signn = driver.findElement(By.xpath("//button[@class='btn btn-dark px-5 py-2']"));
		JavascriptExecutor clk = (JavascriptExecutor)driver;
		clk.executeScript("arguments[0].click()", signn);
		Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
	  
		WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());
	   
	  
		driver.close();
  }
  
  
  
//  @Then("User received OTP Successfully")
//public void user_received_otp_successfully() throws Exception {
//
//	  
//	  String expectedText = "Please enter valid email address or phone number";
//    String actualText  =   driver.findElement(By.xpath("/html/body/app-root/app-signup/div[2]/div/div[2]/div/div/form/div/div[5]/div")).getText();
//  Assert.assertTrue(expectedText.equals(actualText));
//  
//	Thread.sleep(300);
//}

  
}
  
  
  
  
  
  
  
  
//	@Then("checking Actual and expected error")
//	public void checking_actual_and_expected_error() throws Exception {
//	    
//	
////		JavascriptExecutor jsd = (JavascriptExecutor) driver;
////		    jsd.executeScript("window.scrollBy(0,1000)");
//		    WebElement sign = driver.findElement(By.xpath("//button[@class='btn btn-dark px-5 py-2']"));
//			JavascriptExecutor sig = (JavascriptExecutor)driver;
//			sig.executeScript("arguments[0].click()", sign);
//			Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
//		
//		
//		Thread.sleep(200);
//		
//		String expectedText = "Please enter valid email address or phone number";
//	      String actualText  =   driver.findElement(By.xpath("/html/body/app-root/app-signup/div[2]/div/div[2]/div/div/form/div/div[5]/div")).getText();
//	      Assert.assertTrue(expectedText.equals(actualText));
//	      
//		Thread.sleep(300);
//	
//	driver.navigate().refresh();
//	
//	}
//	
//  @Then("User pass Correct Random name and email")
//  public void User_pass_Correct_random_name_and_email() throws Exception {  
//
//	  Thread.sleep(3000);
//
//	  try {
//	  String generatedNamestring = RandomStringUtils.randomAlphabetic(7);
//	  String name =generatedNamestring;
//	  driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(generatedNamestring);
//	  } catch (Exception  e) {
//		  System.out.println(e.getMessage());
//		 // i_pass_random_name_and_random_email();
//	} 
//	  
//	  try {
//	  
//	  String generatedstring = RandomStringUtils.randomAlphabetic(10);
//	  String email = generatedstring+"@gmail.com";
//	  
//  driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
//	  }catch (Exception e) {
//		System.out.println(e.getMessage());
//	//	i_pass_random_name_and_random_email();
//	}
//	  }
//
//  
//  @When("User cliked on SIGNUP button")
//  public void User_cliked_on_signup_button() throws InterruptedException {
//     
//	  Thread.sleep(200);
////	  JavascriptExecutor jsd = (JavascriptExecutor) driver;
////	    jsd.executeScript("window.scrollBy(0,1000)");
//	    Thread.sleep(300);
//	 try {
//	    
//	  WebElement sign = driver.findElement(By.xpath("//button[@class='btn btn-dark px-5 py-2']"));
//		JavascriptExecutor sig = (JavascriptExecutor)driver;
//		sig.executeScript("arguments[0].click()", sign);
//		Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
//	 }catch (Exception e) {
//		System.out.println("Button not clickable");
//	}
//  } 
//  
//  
//  @Then("User received OTP Successfully")
//  public void user_received_otp_successfully() throws Exception {
//      
//	  
////	  String expectedText = "Please enter valid email address or phone number";
////      String actualText  =   driver.findElement(By.xpath("/html/body/app-root/app-signup/div[2]/div/div[2]/div/div/form/div/div[5]/div")).getText();
////      Assert.assertTrue(expectedText.equals(actualText));
////      
//	Thread.sleep(300);
//  }
//  @When("User use wrong OTP")
//  public void user_use_wrong_otp() throws Exception {
//	   
//	  driver.findElement(By.xpath("//input[@id='otp']")).sendKeys("13221313231");
//	  
//	  driver.findElement(By.xpath("//button[@type='submit']")).click();	  
//	  
//	 // Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(),' Invalid Email OTP ')]")).isDisplayed());
//	  
//	  Thread.sleep(500);
//	  
//	  
//  }
//
//  @Then("it gives message to user")
//  public void it_gives_message_to_user() {
//	  
//     
//	  
//  }
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
//}
//  /*
//  
//// // @When("I enter OTP for validation")
//// // public void i_enter_otp_for_validation() throws InterruptedException {
////	//input[@id='otp']
////	  
////	  
////	/*  WebElement otp = driver.findElement(By.xpath("//input[@id='otp']"));
////		JavascriptExecutor valid = (JavascriptExecutor)driver;
////		valid.executeScript("arguments[0].click()", otp);
////		Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
////	*/  
//////	  Thread.sleep(10000);
//////	  
//////	  
//////	  
//////	  WebElement validation = driver.findElement(By.xpath("//button[@class='btn btn-dark px-5 py-2']"));
//////		JavascriptExecutor button = (JavascriptExecutor)driver;
//////		button.executeScript("arguments[0].click()", validation);
//////		Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
//////	   
////	  
////	  
////	  
////	//button[@class='btn btn-dark px-5 py-2']
////	  
////  
////  //}
////    
////  @Then("I set new password {string} and {string}")
////  public void i_set_new_password_and(String arg3, String arg4) throws InterruptedException {
////
////	  Thread.sleep(3000);
////	  driver.navigate().refresh();
////	  driver.findElement(By.xpath("/html/body/app-root/app-set-password-signup/div/div/div[2]/div/div/form/div/div[2]/div/div/input")).sendKeys(arg3);
////  driver.findElement(By.xpath("/html/body/app-root/app-set-password-signup/div/div/div[2]/div/div/form/div/div[3]/div/div/input")).sendKeys(arg4);
////  } 
////  
////  
////  @Then("I clicked on set password button")
////  public void i_clicked_on_set_password_button() {
////
////	//  /html/body/app-root/app-set-password-signup/div/div/div[2]/div/div/form/div/div[4]/button  
//// 
////	  WebElement set = driver.findElement(By.xpath("/html/body/app-root/app-set-password-signup/div/div/div[2]/div/div/form/div/div[4]/button"));
////		JavascriptExecutor passw = (JavascriptExecutor)driver;
////		passw.executeScript("arguments[0].click()", set);
////		Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
////
////  
////  }
////  
////  */
//  
//  
  
  
  
  
  
  
