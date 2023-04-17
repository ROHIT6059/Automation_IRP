package com.example.definitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Log {  
  WebDriver driver;  
  @Given("^I launch thee url \"([^\"]*)\"$")  
  public void i_launch_thee_url(String arg1) throws Exception {  
    // Write code here that turns the phrase above into concrete actions  
	System.setProperty("webdriver.chrome.driver","G:\\Afterssd\\Automationfiles\\Chrome\\chrome8\\chromedriver.exe");  
 
	
	WebDriverManager.chromedriver().setup();
	
	
	driver = new ChromeDriver();  
    
  driver.get("https://dev.portal.irisirp.com");
  driver.manage().window().maximize();    

  } 

  @When("user filled a wrong password")
  public void user_filled_a_wrong_password() throws InterruptedException  {
      
	  driver.navigate().refresh();
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));


	  driver.findElement(By.xpath("//input[@id='exampleFormControlInput2']")).sendKeys("samaira.tolani@irisbusiness.com");
	  
	  driver.findElement(By.xpath("//input[@id='exampleFormControlInput1']")).sendKeys("Abcd@");
	  
	  //Thread.sleep(500);
	  
	 // driver.findElement(By.xpath("//button[@class='btn btn-dark px-5 py-2']")).click();
	  
	  
	  
	  WebElement signn = driver.findElement(By.xpath("//button[@class='btn btn-dark px-5 py-2']"));
		JavascriptExecutor clk = (JavascriptExecutor)driver;
		clk.executeScript("arguments[0].click()", signn);
		Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
	  
	  
	  
    //   Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(),'Invalid password added. In case you have forgot password, kindly reset your Password using Forgot Password')]")).isDisplayed());
     //  driver.findElement(By.xpath("//input[@placeholder='Email Id / Mobile']")).sendKeys("samaira.tolani@irisbusiness.com");
	  
	  WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	  System.out.println(m.getText());
	  
	  
	//  driver.findElement(By.xpath("//input[@class='form-control ng-untouched ng-pristine ng-invalid']")).sendKeys("Abcd@1234");
    
	//  driver.findElement(By.xpath("//button[@class='btn btn-dark px-5 py-2']")).click();

	  
  }
  

@When("User fill only email")
public void user_fill_only_email() {
	
	driver.navigate().refresh();
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));


	  driver.findElement(By.xpath("//input[@id='exampleFormControlInput2']")).sendKeys("samaira.tolani@irisbusiness.com");
	  
	 // driver.findElement(By.xpath("//input[@id='exampleFormControlInput1']")).sendKeys("Abcd@");
	  
	  
	  
	  WebElement signn = driver.findElement(By.xpath("//button[@class='btn btn-dark px-5 py-2']"));
		JavascriptExecutor clk = (JavascriptExecutor)driver;
		clk.executeScript("arguments[0].click()", signn);
		Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
	  
	  
	//  driver.findElement(By.xpath("//button[@class='btn btn-dark px-5 py-2']")).click();
	  
  //   Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(),'Invalid password added. In case you have forgot password, kindly reset your Password using Forgot Password')]")).isDisplayed());
   //  driver.findElement(By.xpath("//input[@placeholder='Email Id / Mobile']")).sendKeys("samaira.tolani@irisbusiness.com");
	  
	  WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div//div[contains(text(),' Password is required ')]")));
	  System.out.println(m.getText());
    
	
	
}

@Then("User fill only password")
public void user_fill_only_password() {
	driver.navigate().refresh();
    
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));


	  //driver.findElement(By.xpath("//input[@id='exampleFormControlInput2']")).sendKeys("samaira.tolani@irisbusiness.com");
	  
	  driver.findElement(By.xpath("//input[@id='exampleFormControlInput1']")).sendKeys("Abcd@1234");
	  
	  
	  WebElement signn = driver.findElement(By.xpath("//button[@class='btn btn-dark px-5 py-2']"));
		JavascriptExecutor clk = (JavascriptExecutor)driver;
		clk.executeScript("arguments[0].click()", signn);
		Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
	 // driver.findElement(By.xpath("//button[@class='btn btn-dark px-5 py-2']")).click();
	  
  //   Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(),'Invalid password added. In case you have forgot password, kindly reset your Password using Forgot Password')]")).isDisplayed());
   //  driver.findElement(By.xpath("//input[@placeholder='Email Id / Mobile']")).sendKeys("samaira.tolani@irisbusiness.com");
	  
	  WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div//div[contains(text(),' Email id / Mobile is required')]")));
	  System.out.println(m.getText());
	
	
}

@When("User fill correct email but wrong password")
public void user_fill_correct_email_but_wrong_password() {
    
	driver.navigate().refresh();
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));


	  driver.findElement(By.xpath("//input[@id='exampleFormControlInput2']")).sendKeys("samaira.tolani@irisbusiness.com");
	  
	  driver.findElement(By.xpath("//input[@id='exampleFormControlInput1']")).sendKeys("Abcd@566888");
	  
	  
	  WebElement signn = driver.findElement(By.xpath("//button[@class='btn btn-dark px-5 py-2']"));
		JavascriptExecutor clk = (JavascriptExecutor)driver;
		clk.executeScript("arguments[0].click()", signn);
		Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());	  
  //   Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(),'Invalid password added. In case you have forgot password, kindly reset your Password using Forgot Password')]")).isDisplayed());
   //  driver.findElement(By.xpath("//input[@placeholder='Email Id / Mobile']")).sendKeys("samaira.tolani@irisbusiness.com");
	  
	  WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	  System.out.println(m.getText());
	
	
	
	
}

@When("User fill wrong email and wrong password")
public void user_fill_wrong_email_and_wrong_password() {
   
	driver.navigate().refresh();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));


	  driver.findElement(By.xpath("//input[@id='exampleFormControlInput2']")).sendKeys("samaira.tolani@");
	  
	  WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div//div[contains(text(),' Please enter valid email address or phone number')]")));
	  System.out.println(m.getText());
	  
	  driver.findElement(By.xpath("//input[@id='exampleFormControlInput1']")).sendKeys("Abcd@");
	  
	
	  WebElement signn = driver.findElement(By.xpath("//button[@class='btn btn-dark px-5 py-2']"));
		JavascriptExecutor clk = (JavascriptExecutor)driver;
		clk.executeScript("arguments[0].click()", signn);
		Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());	  
  //   Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(),'Invalid password added. In case you have forgot password, kindly reset your Password using Forgot Password')]")).isDisplayed());
   //  driver.findElement(By.xpath("//input[@placeholder='Email Id / Mobile']")).sendKeys("samaira.tolani@irisbusiness.com");
	  
//	  WebElement mb = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
//	  System.out.println(mb.getText());
	
	
}

@Then("User fill wrong email but correct password")
public void user_fill_wrong_email_but_correct_password() {
	driver.navigate().refresh();
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));


	  driver.findElement(By.xpath("//input[@id='exampleFormControlInput2']")).sendKeys("sam@irisbusiness.com");
	 
	  
	  driver.findElement(By.xpath("//input[@id='exampleFormControlInput1']")).sendKeys("Abcd@1234");
	  
	  
	  WebElement signn = driver.findElement(By.xpath("//button[@class='btn btn-dark px-5 py-2']"));
		JavascriptExecutor clk = (JavascriptExecutor)driver;
		clk.executeScript("arguments[0].click()", signn);
		Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
	  
	  
	//  driver.findElement(By.xpath("//button[@class='btn btn-dark px-5 py-2']")).click();
	  
  //   Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(),'Invalid password added. In case you have forgot password, kindly reset your Password using Forgot Password')]")).isDisplayed());
   //  driver.findElement(By.xpath("//input[@placeholder='Email Id / Mobile']")).sendKeys("samaira.tolani@irisbusiness.com");
	  
	  WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	  System.out.println(m.getText());
	
	
	
}

@Then("User fill correct email and password")
public void user_fill_correct_email_and_password() {
   
	driver.navigate().refresh();

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));


	  driver.findElement(By.xpath("//input[@id='exampleFormControlInput2']")).sendKeys("samaira@irisbusiness.com");
	  
	  driver.findElement(By.xpath("//input[@id='exampleFormControlInput1']")).sendKeys("Abcd@1234");
	  
	  
	  
	  WebElement signn = driver.findElement(By.xpath("//button[@class='btn btn-dark px-5 py-2']"));
		JavascriptExecutor clk = (JavascriptExecutor)driver;
		clk.executeScript("arguments[0].click()", signn);
		Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
	  
	//  driver.findElement(By.xpath("//button[@class='btn btn-dark px-5 py-2']")).click();
	  
//   Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(),'Invalid password added. In case you have forgot password, kindly reset your Password using Forgot Password')]")).isDisplayed());
 //  driver.findElement(By.xpath("//input[@placeholder='Email Id / Mobile']")).sendKeys("samaira.tolani@irisbusiness.com");
	  
	  WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	  System.out.println(m.getText());
	
	
	driver.close();
	
}
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
//  @And("^User clicked on login button$") 
//  public void User_clicked_on_login_button() throws Exception {
//
//	  driver.findElement(By.xpath("//button[@class='btn btn-dark px-5 py-2']")).click();
//	  
//	  
//	  Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(),'Invalid password added. In case you have forgot password, kindly reset your Password using Forgot Password')]")).isDisplayed());
//
//	
//	  System.out.println("hiiiiiiiiii");
//  }
  
//  @Then("it gives error like is not registered with IRISIRP kindly sign up to register yourself")
//  public void it_gives_error_like_is_not_registered_with_irisirp_kindly_sign_up_to_register_yourself() throws Exception {
//      
//	  String expectedText = "Rohit is not registered with IRISIRP kindly sign up to register yourself";
//      String actualText  =   driver.findElement(By.xpath("")).getText();
//      Assert.assertTrue(expectedText.equals(actualText));
//      
//	Thread.sleep(1000);
	  // }
//@When("User fills a Correct data")
//public void user_fills_a_correct_data() {
//    
//	driver.navigate().refresh();
//	
//	 driver.findElement(By.xpath("//input[@placeholder='Email Id / Mobile']")).sendKeys("Rohitsavade6059@gmail.com");
//	  driver.findElement(By.xpath("//input[@class='form-control ng-untouched ng-pristine ng-invalid']")).sendKeys("Abc@1");
//
//	  
//	  
//	  
	  	  
}

//@And("User clicked on button")
//public void user_clicked_on_button() throws Exception {
//	 driver.findElement(By.xpath("//button[@class='btn btn-dark px-5 py-2']")).click();
//	 
//	 
//}
//
//@Then("it gives a message")
//public void it_gives_a_message() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}
//
//  
//  
//  
//  
//  }

  
  
  


