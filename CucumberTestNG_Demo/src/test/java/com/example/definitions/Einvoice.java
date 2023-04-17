package com.example.definitions;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.core.backend.Options;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import java.io.IOException;

public class Einvoice {  
  WebDriver driver;  
  
@Given("^I launch the urrl")  
  public  void i_launch_the_urrl() throws IOException, Exception   {  
    // Write code here that turns the phrase above into concrete actions  

	//	WebDriverManager.chromedriver().setup();
  
	  System.setProperty("webdriver.chrome.driver","G:\\Afterssd\\Automationfiles\\Chrome\\chrome10\\chromedriver.exe");  
 driver = new ChromeDriver();  
//  ChromeOptions options = new ChromeOptions();
//  options.addArguments("--remote-allow-origins=*");
//  options.addArguments("start-maximized");
//  DesiredCapabilities cp =new DesiredCapabilities();
//  cp.setCapability(ChromeOptions.CAPABILITY, options);
//  options.merge(cp);
  
// ChromeOptions op = new ChromeOptions();
// op.addArguments("--remote-allow-origins=*");
// WebDriver driver = new ChromeDriver(op);
 // driver = new ChromeDriver(options);  

//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
  driver.manage().window().maximize(); 
  Thread.sleep(3000);
  driver.get("https://dev.portal.irisirp.com");
    

  }  
  @When("^I proviide \"([^\"]*)\" and \"([^\"]*)\"$")  
  public void i_proviide_and(String arg1, String arg2) throws Exception {  
    // Write code here that turns the phrase above into concrete actions  
	 
	  Thread.sleep(4000);
	  
	 // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));


		driver.navigate().refresh();
	  
	  
	  
	  Thread.sleep(2000);
	  
	 driver.findElement(By.xpath("//*[@id='exampleFormControlInput2']")).sendKeys(arg1);
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@id='exampleFormControlInput1']")).sendKeys(arg2);
  }  
  @Then("^I click on loginn button$")  
  public void i_click_on_loginn_button() throws Exception {  
    // Write code here that turns the phrase above into concrete actions  
	
	  driver.findElement(By.xpath("//button[@class='btn btn-dark px-5 py-2']")).click();  
	  Thread.sleep(15000);
  }  
   
  @Then("User clicked on generate einvoice")
  public void user_clicked_on_generate_einvoice() throws Exception {
     
	//   WebElement einvoice = driver.findElement(By.xpath("//*[@id='mySidenav']/ul[1]/li[2]/a"));
     // einvoice.click();
	  
      
      Thread.sleep(5000);
      
      
      WebElement mainMenu = driver.findElement(By.xpath("//*[@id='mySidenav']/ul[1]/li[2]/a"));

    //Instantiating Actions class
    Actions actions = new Actions(driver);

    //Hovering on main menu
    actions.moveToElement(mainMenu);

    // Locating the element from Sub Menu
    WebElement subMenu = driver.findElement(By.xpath("//*[@id='mySidenav']/ul[1]/li[2]/div/div/div/div/div[1]"));
  //*[@id='mySidenav']/ul[1]/li[2]/div/div/div/div/div[1]
    //To mouseover on sub menu
    actions.moveToElement(subMenu);

    //build()- used to compile all the actions into a single step 
    actions.click().build().perform();
      
       
	 // driver.findElement(By.xpath("//*[@id='mySidenav']/ul[1]/li[2]/div")).click();
	 
      Thread.sleep(2000);
  }  
  
  
  
  
  @When("User enter {int} digit Document number")
  public void user_enter_digit_document_number(Integer int1) throws Exception {
	  
	  Thread.sleep(7000);
	//  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     

	  String generatedNamestring = RandomStringUtils.randomAlphabetic(16);
	      String name =generatedNamestring;
	    Thread.sleep(8000);
	      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[2]/div/div[2]/div/div[2]/input")).sendKeys(name);
	    Thread.sleep(3000);
	      WebElement button1 = driver.findElement(By.xpath("//button[@id='btnNext']"));
		  System.out.println("Button is enabled  "  + button1.isEnabled());
		 
		 //WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
		     
		//	System.out.println(m.getText());
			Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[2]/div/div[2]/div/div[2]/input")).clear();
		  Thread.sleep(2000);
     }

  @Then("User enter More than {int} digit Document number")
  public void user_enter_more_than_digit_document_number(Integer int1) throws Exception {
	//  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
 
	  Thread.sleep(3000);
	  String generatedNamestring3 = RandomStringUtils.randomAlphabetic(18);
	  String name3 =generatedNamestring3;
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[2]/div/div[2]/div/div[2]/input")).sendKeys(name3);
     
	 //WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	    
		//System.out.println(m.getText());
	  
	  WebElement button3 = driver.findElement(By.xpath("//button[@id='btnNext']"));
		 System.out.println("Button is enabled  "  + button3.isEnabled());
		 
		  driver.findElement(By.xpath("//*[@id='btnNext']"));
		 Thread.sleep(3000);
		  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[2]/div/div[2]/div/div[2]/input")).clear();

  }

  @When("User enter One digit Document number")
  public void user_enter_one_digit_document_number() throws Exception {
	//  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
 
	  String generatedNamestring2 = RandomStringUtils.randomAlphabetic(1);
	  String name2 =generatedNamestring2;
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[2]/div/div[2]/div/div[2]/input")).sendKeys(name2);
     
	  
	//  WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
	//	System.out.println(m.getText());
	  
	  WebElement button2 = driver.findElement(By.xpath("//button[@id='btnNext']"));
      System.out.println("Button is enabled   "  + button2.isEnabled());
	  
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[2]/div/div[2]/div/div[2]/input")).clear();
	  Thread.sleep(3000);
	  
  }

  @Then("User enter No digit Document number")
  public void user_enter_no_digit_document_number() throws Exception {
	//  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
  
		 String generatedNamestring4 = RandomStringUtils.randomAlphabetic(0);
		  String name4 =generatedNamestring4;
		  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[2]/div/div[2]/div/div[2]/input")).sendKeys(name4);
		//  WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
		     
		//	System.out.println(m.getText());
		  
		  WebElement button4 = driver.findElement(By.xpath("//button[@id='btnNext']"));
	      System.out.println("Button is enabled   "  + button4.isEnabled());
	     driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[2]/div/div[2]/div/div[2]/input")).clear();
	  
	     Thread.sleep(3000);
	  
  }
  
  @When("User start with - in document number")
  public void user_start_with_in_document_number() throws Exception {
	 
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     

	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[2]/div/div[2]/div/div[2]/input")).sendKeys("-123456789");

	  WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	   System.out.println(m.getText());
	  
	  WebElement button4 = driver.findElement(By.xpath("//button[@id='btnNext']"));
      System.out.println("Button is enabled  "  + button4.isEnabled());
     driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[2]/div/div[2]/div/div[2]/input")).clear();
  
     Thread.sleep(3000);
  
  }

  @Then("User start with {int} in document number")
  public void user_start_with_in_document_number(Integer int1) throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     

	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[2]/div/div[2]/div/div[2]/input")).sendKeys("023155161");

  WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	   System.out.println(m.getText());
	  WebElement button4 = driver.findElement(By.xpath("//button[@id='btnNext']"));
      System.out.println("Button is enabled  "  + button4.isEnabled());
     driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[2]/div/div[2]/div/div[2]/input")).clear();
  
     Thread.sleep(4000);
  }

  @When("user start with \\/ in document number1")
  public void user_start_with_in_document_number1() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
 
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[2]/div/div[2]/div/div[2]/input")).sendKeys("/56478913326");

	  WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	   System.out.println(m.getText());
	  WebElement button4 = driver.findElement(By.xpath("//button[@id='btnNext']"));
      System.out.println("Button is enabled  "  + button4.isEnabled());
     driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[2]/div/div[2]/div/div[2]/input")).clear();
  
     
	  
  }

  @Then("user start with numbers in document number")
  public void user_start_with_numbers_in_document_number() throws Exception {
	//  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     

	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[2]/div/div[2]/div/div[2]/input")).sendKeys("456879213326");

	//  WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	//   System.out.println(m.getText());
	  WebElement button4 = driver.findElement(By.xpath("//button[@id='btnNext']"));
      System.out.println("Button is enabled  "  + button4.isEnabled());
     driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[2]/div/div[2]/div/div[2]/input")).clear();
  
     Thread.sleep(3000);
	  
	  
  }

  @When("user use positive case")
  public void user_use_positive_case() throws Exception {
     
  
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[2]/div/div[2]/div/div[2]/input")).sendKeys("B2B123");

	  WebElement button4 = driver.findElement(By.xpath("//button[@id='btnNext']"));
      System.out.println("Button is enabled  "  + button4.isEnabled());
     driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[2]/div/div[2]/div/div[2]/input")).clear();
  
     Thread.sleep(3000);
     
     WebElement pcase = driver.findElement(By.xpath("//button[@id='btnNext']"));
   		JavascriptExecutor clk = (JavascriptExecutor)driver;
   		clk.executeScript("arguments[0].click()", pcase);
   		Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
	  
  }
  
  @Then("user set Legal Name maximum")
  public void user_set_Legal_Name_maximum() throws Exception {
	 
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     

	  Thread.sleep(3000);
	  String generatedNamestring5 = RandomStringUtils.randomAlphabetic(100);
	  String name2 =generatedNamestring5;
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[3]/div/div[2]/input")).sendKeys(generatedNamestring5);
	 
	  WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	   System.out.println(m.getText());
	   
	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
     
	  System.out.println("Button is enabled  "  + button4.isEnabled());
    driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[3]/div/div[2]/input")).clear();
  
     Thread.sleep(3000);
	  
  }
  @When("user set Legal Name minimum")
  public void user_set_Legal_Name_minimum() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     

	  String generatedNamestring6 = RandomStringUtils.randomAlphabetic(2);
	  String name2 =generatedNamestring6;
	  Thread.sleep(2000);
	 driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[3]/div/div[2]/input")).sendKeys(generatedNamestring6);
	 WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	   System.out.println(m.getText());
	 
	  WebElement button5 = driver.findElement(By.xpath("//*[@id='btnNext']"));
      System.out.println("Button is enabled  "  + button5.isEnabled()); 
 	 driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[3]/div/div[2]/input")).clear();

 }
  
  @Then("user set numbers in legal name")
  public void user_set_numbers_in_legal_name() throws Exception {
	 // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
   
	
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[3]/div/div[2]/input")).sendKeys("2356481984");
	 
	//  WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	//   System.out.println(m.getText());
	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
      System.out.println("Button is enabled  "  + button4.isEnabled());
    driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[3]/div/div[2]/input")).clear();
  
     Thread.sleep(3000);
  }

  @Then("user not set any legal name put Blank")
  public void user_not_set_any_legal_name_put_blank() throws Exception {
	
	 // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     

	  
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[3]/div/div[2]/input")).sendKeys(" ");
	  
	 // WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	//   System.out.println(m.getText());
	
	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
      System.out.println("Button is enabled  "  + button4.isEnabled());
    driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[3]/div/div[2]/input")).clear();
  
     Thread.sleep(3000);
  }

  @When("user set Trade Name Maximum")
  public void user_set_trade_name_maximum() throws Exception {
     
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     

	    driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[4]/div/div[2]/input")).clear();

	  String generatedNamestring5 = RandomStringUtils.randomAlphabetic(100);
	  String name2 =generatedNamestring5;
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[4]/div/div[2]/input")).sendKeys(generatedNamestring5);
	
	  WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	   System.out.println(m.getText());
	   
	   
	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
      System.out.println("Button is enabled  "  + button4.isEnabled());
    driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[4]/div/div[2]/input")).clear();
  
     Thread.sleep(4000);
  }

  @Then("user set Trade Name Minimum")
  public void user_set_trade_name_minimum() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     

	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[4]/div/div[2]/input")).clear();

	  String generatedNamestring5 = RandomStringUtils.randomAlphabetic(2);
	  String name2 =generatedNamestring5;
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[4]/div/div[2]/input")).sendKeys(generatedNamestring5);
	  WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	   System.out.println(m.getText());
	   
	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
      System.out.println("Button is enabled  "  + button4.isEnabled());
    driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[4]/div/div[2]/input")).clear();
  
     Thread.sleep(4000);
	  
  }

  @Then("user set Trade Name numbers")
  public void user_set_trade_name_numbers() throws Exception {

//	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     

	  
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[4]/div/div[2]/input")).clear();

	  
	  
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[4]/div/div[2]/input")).sendKeys("12356465");
	
	 // WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	 //  System.out.println(m.getText());
	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
      System.out.println("Button is enabled  "  + button4.isEnabled());
    driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[4]/div/div[2]/input")).clear();
  
     Thread.sleep(2000);
	  
  }

  @When("user set Trade Name Blank")
  public void user_set_trade_name_blank() throws Exception {

	//  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     

	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[4]/div/div[2]/input")).clear();

	  
	  
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[4]/div/div[2]/input")).sendKeys("");
	 
	//  WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	//   System.out.println(m.getText());
	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
      System.out.println("Button is enabled  "  + button4.isEnabled());
    driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[4]/div/div[2]/input")).clear();
  
     Thread.sleep(3000);
  }

  @Then("user set Address1 Maximum")
  public void user_set_address1_maximum() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
 
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[5]/div/div[2]/input")).clear();

	  String generatedNamestring5 = RandomStringUtils.randomAlphabetic(100);
	  String name2 =generatedNamestring5;
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[5]/div/div[2]/input")).sendKeys(generatedNamestring5);
	 
	  WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	   System.out.println(m.getText());
	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
      System.out.println("Button is enabled  "  + button4.isEnabled());
    driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[5]/div/div[2]/input")).clear();
  
     Thread.sleep(4000);
	  
	  
  }

  @Then("user set Address1 Minimum")
  public void user_set_address1_minimum() throws Exception {

	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     

	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[5]/div/div[2]/input")).clear();

	  String generatedNamestring5 = RandomStringUtils.randomAlphabetic(1);
	  String name2 =generatedNamestring5;
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[5]/div/div[2]/input")).sendKeys(generatedNamestring5);
	  WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	   System.out.println(m.getText()); 
	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
      System.out.println("Button is enabled  "  + button4.isEnabled());
    driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[5]/div/div[2]/input")).clear();
  
     Thread.sleep(4000);
  }

  @Then("user set Address1 numbers")
  public void user_set_address1_numbers() throws Exception {
	//  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
      
driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[5]/div/div[2]/input")).clear();

	  
	  
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[5]/div/div[2]/input")).sendKeys("12356465");
	//  WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	//   System.out.println(m.getText());  
	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
      System.out.println("Button is enabled  "  + button4.isEnabled());
    driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[5]/div/div[2]/input")).clear();
  
     Thread.sleep(3000);
	  
  }

  @When("user set Address1 Blank")
  public void user_set_address1_blank() throws Exception {
	//  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     

          driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[5]/div/div[2]/input")).clear();

	   driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[5]/div/div[2]/input")).sendKeys("");
	 //  WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	 //  System.out.println(m.getText()); 
	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
      System.out.println("Button is enabled  "  + button4.isEnabled());
    driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[5]/div/div[2]/input")).clear();
  
     Thread.sleep(3000);
  }

  @Then("user set Address2 Maximum")
  public void user_set_address2_maximum() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
  
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[6]/div/div[2]/input")).clear();

	  String generatedNamestring5 = RandomStringUtils.randomAlphabetic(100);
	  String name2 =generatedNamestring5;
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[6]/div/div[2]/input")).sendKeys(generatedNamestring5);
	  WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	   System.out.println(m.getText());   
	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
      System.out.println("Button is enabled  "  + button4.isEnabled());
    driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[6]/div/div[2]/input")).clear();
  
     Thread.sleep(4000);
	  
	  
  }

  @Then("user set Address2 Minimum")
  public void user_set_address2_minimum() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
 
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[6]/div/div[2]/input")).clear();

	  String generatedNamestring5 = RandomStringUtils.randomAlphabetic(2);
	  String name2 =generatedNamestring5;
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[6]/div/div[2]/input")).sendKeys(generatedNamestring5);
	  WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	   System.out.println(m.getText()); 
	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
      System.out.println("Button is enabled  "  + button4.isEnabled());
    driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[6]/div/div[2]/input")).clear();
  
     Thread.sleep(4000);
	  
  }

  @Then("user set Address2 numbers")
  public void user_set_address2_numbers() throws Exception {
	//  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     

       driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[6]/div/div[2]/input")).clear();
 	  
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[6]/div/div[2]/input")).sendKeys("12356465");
	//  WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	//   System.out.println(m.getText()); 	  
	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
      System.out.println("Button is enabled  "  + button4.isEnabled());
    driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[6]/div/div[2]/input")).clear();
  
     Thread.sleep(2000); 
  }

  @When("user set Address2 Blank")
  public void user_set_address2_blank() throws Exception {
	//  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     

       driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[6]/div/div[2]/input")).clear();

	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[6]/div/div[2]/input")).sendKeys("");
	//  WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	//   System.out.println(m.getText());  
	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
      System.out.println("Button is enabled  "  + button4.isEnabled());
    driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[6]/div/div[2]/input")).clear();
  
     Thread.sleep(2000);
 	    
  }

  @Then("user set Location Maximum")
  public void user_set_location_maximum() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     

	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[7]/div/div[2]/input")).clear();

	  String generatedNamestring5 = RandomStringUtils.randomAlphabetic(100);
	  String name2 =generatedNamestring5;
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[7]/div/div[2]/input")).sendKeys(generatedNamestring5);
	  WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	   System.out.println(m.getText());  
	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
      System.out.println("Button is enabled  "  + button4.isEnabled());
    driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[7]/div/div[2]/input")).clear();
  
     Thread.sleep(4000);
	  
  }

  @Then("user set Location Minimum")
  public void user_set_location_minimum() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     

	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[7]/div/div[2]/input")).clear();

	  String generatedNamestring5 = RandomStringUtils.randomAlphabetic(2);
	  String name2 =generatedNamestring5;
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[7]/div/div[2]/input")).sendKeys(generatedNamestring5);
	  WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	   System.out.println(m.getText());  
	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
      System.out.println("Button is enabled  "  + button4.isEnabled());
    driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[7]/div/div[2]/input")).clear();
  
     Thread.sleep(4000);
	  
  }

  @Then("user set Location numbers")
  public void user_set_location_numbers() throws Exception {
	 // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     

driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[7]/div/div[2]/input")).clear();

	  
	  
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[7]/div/div[2]/input")).sendKeys("12356465");
	//  WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	//   System.out.println(m.getText());  
	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
      System.out.println("Button is enabled  "  + button4.isEnabled());
    driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[7]/div/div[2]/input")).clear();
  
     Thread.sleep(2000);
	  
	  
	  
  }

  @When("user set Location Blank")
  public void user_set_location_blank() throws Exception {
driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[7]/div/div[2]/input")).clear();

	  
	  
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[7]/div/div[2]/input")).sendKeys("");
	  
	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
      System.out.println("Button is enabled  "  + button4.isEnabled());
    driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[7]/div/div[2]/input")).clear();
  
     Thread.sleep(2000);
  }

  @Then("user set Pincode Maximum")
  public void user_set_pincode_maximum() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     

	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[8]/div/div[2]/input")).clear();
	  
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[8]/div/div[2]/input")).sendKeys("1234567");
	  WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	   System.out.println(m.getText());  
	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
      System.out.println("Button is enabled  "  + button4.isEnabled());
    driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[8]/div/div[2]/input")).clear();
  
     Thread.sleep(4000);
	  
  }

  @Then("user set Pincode Minimum")
  public void user_set_pincode_minimum() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     

driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[8]/div/div[2]/input")).clear();
	  
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[8]/div/div[2]/input")).sendKeys("1234");
	
	  WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	   System.out.println(m.getText());
	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
      System.out.println("Button is enabled  "  + button4.isEnabled());
    driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[8]/div/div[2]/input")).clear();
  
     Thread.sleep(4000);
  }

  @Then("user set Pincode aplhabets")
  public void user_set_pincode_aplhabets() throws Exception {
      
driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[8]/div/div[2]/input")).clear();
	  
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[8]/div/div[2]/input")).sendKeys("abcdg");
	  
	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
      System.out.println("Button is enabled  "  + button4.isEnabled());
    driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[8]/div/div[2]/input")).clear();
  
     Thread.sleep(2000);
  }

  @When("user set Pincode Blank")
  public void user_set_pincode_blank() throws Exception {
driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[8]/div/div[2]/input")).clear();
	  
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[8]/div/div[2]/input")).sendKeys("");
	  
	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
      System.out.println("Button is enabled  "  + button4.isEnabled());
    driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[8]/div/div[2]/input")).clear();
  
     Thread.sleep(2000);
  }
  
  
  @Then("user set Phone Maximum digit")
  public void user_set_phone_maximum_digit() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     

	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[10]/div/div[2]/input")).clear();
	  
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[10]/div/div[2]/input")).sendKeys("9188064817895");
	  
	  WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	   System.out.println(m.getText());
	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
      System.out.println("Button is enabled  "  + button4.isEnabled());
    driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[10]/div/div[2]/input")).clear();
  
     Thread.sleep(4000);
	  
	  
  }

  @When("user set Phone Minimum digit")
  public void user_set_phone_minimum_digit() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     

	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[10]/div/div[2]/input")).clear();
	  
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[10]/div/div[2]/input")).sendKeys("91345");
	  WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	   System.out.println(m.getText()); 
	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
      System.out.println("Button is enabled  "  + button4.isEnabled());
    driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[10]/div/div[2]/input")).clear();
  
     Thread.sleep(4000);
  }

  @Then("user set aplhabets in phone")
  public void user_set_aplhabets_in_phone() throws Exception {

	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[10]/div/div[2]/input")).clear();
	  
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[10]/div/div[2]/input")).sendKeys("abcdasij");
	  
	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
      System.out.println("Button is enabled " + button4.isEnabled());
    driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[10]/div/div[2]/input")).clear();
  
     Thread.sleep(2000);
  }

  @When("user set Phone number Blank")
  public void user_set_phone_number_blank() throws Exception {
      
	  
driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[10]/div/div[2]/input")).clear();
	  
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[10]/div/div[2]/input")).sendKeys(" ");
	  
	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
      System.out.println("Button is enabled " + button4.isEnabled());
    driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[10]/div/div[2]/input")).clear();
  
     Thread.sleep(2000);
     driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[10]/div/div[2]/input")).clear();

	  }
//  @Then("user set email Maximum digit")
//  public void user_set_email_maximum_digit() throws Exception {
//    
//driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[11]/div/div[2]/input")).clear();
//	
//
//
////String generatedstring = RandomStringUtils.randomAlphabetic(1);
////String email = generatedstring+"@gmail.com";
// driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[11]/div/div[2]/input")).sendKeys("aswrtyisomnthsdhabanaamamamshdroksmahsthsnsleoskamaswrtyisomnthsdhabanaamamamshdroksmahsthsnsleoskam@gmail.com");
//	 
//	  
//	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
//      System.out.println("Button is enabled " + button4.isEnabled());
//    driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[11]/div/div[2]/input")).clear();
//  
//     Thread.sleep(2000);
//	  }
	  

  @When("user set email Minimum digit")
  public void user_set_email_minimum_digit() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     

	  String generatedstring = RandomStringUtils.randomAlphabetic(3);
	  String email = generatedstring+"@gmail.com";
	   driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[11]/div/div[2]/input")).sendKeys(email);
	  	 
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	   System.out.println(m.getText()); 
	  	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
	        System.out.println("Button is enabled " + button4.isEnabled());
	      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[11]/div/div[2]/input")).clear();
	    
	       Thread.sleep(4000);
  }

  @Then("user set email in aplhabets")
  public void user_set_email_in_aplhabets() throws Exception {
      
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[11]/div/div[2]/input")).sendKeys("Abcdssddsfe");
	  	 
  	  
  	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
        System.out.println("Button is enabled " + button4.isEnabled());
      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[11]/div/div[2]/input")).clear();
    
       Thread.sleep(2000);
	  
  }

  @When("user set email  Blank")
  public void user_set_email_blank() throws Exception {
     
 driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[11]/div/div[2]/input")).sendKeys("Abcdssddsfe");
	  	 
  	  
  	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
        System.out.println("Button is enabled " + button4.isEnabled());
      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[11]/div/div[2]/input")).clear();
    
       Thread.sleep(2000);
  }

  @Then("user set alphanumeric values in email")
  public void user_set_alphanumeric_values_in_email() throws Exception {

	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[11]/div/div[2]/input")).sendKeys("Abcd123456");
	  
	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
      System.out.println("Button is enabled " + button4.isEnabled());
    driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[11]/div/div[2]/input")).clear();
  
     Thread.sleep(2000);
     driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[11]/div/div[2]/input")).clear();

  }

  
  @Then("user set valid detail")
  public void user_set_valid_detail() throws Exception {

	  Thread.sleep(2000);
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[4]/div/div[2]/input")).clear();

	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[4]/div/div[2]/input")).sendKeys("Simply Shilp");
	  Thread.sleep(2000);

	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[3]/div/div[2]/input")).clear();
	  Thread.sleep(2000);

	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[3]/div/div[2]/input")).sendKeys("Shilpa Ashok Dhobale");
      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[5]/div/div[2]/input")).clear();
	  Thread.sleep(2000);

	  
      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[5]/div/div[2]/input")).sendKeys("D 404 Silicon Tower,.,Sector 30A, Plot 46");
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[6]/div/div[2]/input")).clear();
	  Thread.sleep(2000);

	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[6]/div/div[2]/input")).sendKeys("Thane,Vashi");
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[7]/div/div[2]/input")).clear();
	  Thread.sleep(2000);

	  
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[7]/div/div[2]/input")).sendKeys("Navi Mumbai");
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[8]/div/div[2]/input")).clear();
	  Thread.sleep(2000);


	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[8]/div/div[2]/input")).sendKeys("400705");
	
	  
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[10]/div/div[2]/input")).sendKeys("8806481789");

Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[11]/div/div[2]/input")).sendKeys("rohitsavade6059@gmail.com");
	  
	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
      System.out.println("Button is enabled " + button4.isEnabled());
	  
	  Thread.sleep(3000);
	  WebElement pcase = driver.findElement(By.xpath("//*[@id='btnNext']"));
 		JavascriptExecutor clk = (JavascriptExecutor)driver;
 		clk.executeScript("arguments[0].click()", pcase);
 		Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
  }
  
  @When("Recipient GSTIN added more than {int} digit Maximum")
  public void recipient_gstin_added_more_than_digit_maximum(Integer int1) throws Exception {
     
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     

	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[2]/div/div[2]/input")).sendKeys("02AGNLC3227C1Z001");

	  WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	   System.out.println(m.getText());
	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
      System.out.println("Button is enabled " + button4.isEnabled());
      Thread.sleep(4000);
	  
	  
  }
  @Then("Recipient GSTIN added less than {int} digit for Minimum")
  public void Recipient_GSTIN_added_less_than_digit_for_Minimum(Integer int1) throws Exception
  {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     

	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[2]/div/div[2]/input")).clear();

	 
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[2]/div/div[2]/input")).sendKeys("02AGNLC322Z1");

	  WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	   System.out.println(m.getText());
	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
      System.out.println("Button is enabled " + button4.isEnabled());
      Thread.sleep(4000);  
  }
  
  
  @When("User Not adding Recipient GSTIN means its Blank")
  public void user_not_adding_recipient_gstin_means_its_blank() throws Exception {
      
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[2]/div/div[2]/input")).clear();

	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[2]/div/div[2]/input")).sendKeys("");

	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
      System.out.println("Button is enabled " + button4.isEnabled());
      Thread.sleep(4000);
  }

  @Then("User added Cancelled GSTIN {string}")
  public void user_added_cancelled_gstin(String string) throws Exception {
      
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[2]/div/div[2]/input")).clear();

	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[2]/div/div[2]/input")).sendKeys("02AGNLC3227C1Z0");

	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
      System.out.println("Button is enabled " + button4.isEnabled());
      Thread.sleep(4000);
  }

  @When("user added Inactive GSTIN {string}")
  public void user_added_inactive_gstin(String string) throws Exception {
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[2]/div/div[2]/input")).clear();

	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[2]/div/div[2]/input")).sendKeys("34GSPMH0121G1ZI");

	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
      System.out.println("Button is enabled " + button4.isEnabled());
  }

  @Then("user added Provisional GSTIN {string}")
  public void user_added_provisional_gstin(String string) throws Exception {
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[2]/div/div[2]/input")).clear();

	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[2]/div/div[2]/input")).sendKeys("04GSPMH0121G1ZL");

	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
      System.out.println("Button is enabled " + button4.isEnabled());
  }

  @When("User added Suspended GSTIN {string}")
  public void user_added_suspended_gstin(String string) throws Exception {
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[2]/div/div[2]/input")).clear();

	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[2]/div/div[2]/input")).sendKeys("03GSPMH0121G1ZQ");

	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
      System.out.println("Button is enabled " + button4.isEnabled());
  }

  @Then("User added Composition GSTIN {string}")
  public void user_added_composition_gstin(String string) throws Exception {
  
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[2]/div/div[2]/input")).clear();

	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[2]/div/div[2]/input")).sendKeys("03AYPPS7110A1ZG");

	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
      System.out.println("Button is enabled " + button4.isEnabled());
  }

  @When("User added TDS GSTIN {string}")
  public void user_added_tds_gstin(String string) throws Exception  {
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[2]/div/div[2]/input")).clear();

	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[2]/div/div[2]/input")).sendKeys("36AGNLC3227C2DS");

	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
      System.out.println("Button is enabled " + button4.isEnabled());
  }

  @Then("User added TCS GSTIN {string}")
  public void user_added_tcs_gstin(String string) throws Exception {
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[2]/div/div[2]/input")).clear();

	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[2]/div/div[2]/input")).sendKeys("24AGNLC3227C1CK");

	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
      System.out.println("Button is enabled " + button4.isEnabled());
  }

  @When("User added NR GSTIN {string}")
  public void user_added_nr_gstin(String string) throws Exception {
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[2]/div/div[2]/input")).clear();

	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[2]/div/div[2]/input")).sendKeys("2923IND00017NRN");

	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
      System.out.println("Button is enabled " + button4.isEnabled());
  }

  @Then("User added gstn for SEZ Unit {string}")
  public void user_added_gstn_for_sez_unit(String string) throws Exception {
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[2]/div/div[2]/input")).clear();

	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[2]/div/div[2]/input")).sendKeys("33AGNLC3227C2Z0");

	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
      System.out.println("Button is enabled " + button4.isEnabled());
  }

  @When("User added gstn for SEZ Developer {string}")
  public void user_added_gstn_for_sez_developer(String string) throws Exception {
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[2]/div/div[2]/input")).clear();

	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[2]/div/div[2]/input")).sendKeys("33AGNLC3227C3ZJ");

	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
      System.out.println("Button is enabled " + button4.isEnabled());
  }

  @Then("User added gstn for ISD {string}")
  public void user_added_gstn_for_isd(String string) throws Exception {
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[2]/div/div[2]/input")).clear();

	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[2]/div/div[2]/input")).sendKeys("32AGNLC3227C3Z2");

	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
      System.out.println("Button is enabled " + button4.isEnabled());
  }

  @When("User added gstn for UIN {string}")
  public void user_added_gstn_for_uin(String string) throws Exception {
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[2]/div/div[2]/input")).clear();

	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[2]/div/div[2]/input")).sendKeys("2719UNO00061UN0");

	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
      System.out.println("Button is enabled " + button4.isEnabled());
  }

  @Then("User added gstn for UN Body {string}")
  public void user_added_gstn_for_un_body(String string) throws Exception {
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[2]/div/div[2]/input")).clear();

	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[2]/div/div[2]/input")).sendKeys("2919UNO00007UNL");

	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
      System.out.println("Button is enabled " + button4.isEnabled());
  }

  @When("User added gstn for Other notified person {string}")
  public void user_added_gstn_for_other_notified_person(String string) throws Exception {
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[2]/div/div[2]/input")).clear();

	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[2]/div/div[2]/input")).sendKeys("298IND00017ONB");

	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
      System.out.println("Button is enabled " + button4.isEnabled());
  }
  
  @Then("User added Legal Name Maximum character")
  public void user_added_legal_name_maximum_character() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[3]/div/div[2]/input")).clear();

	  String generatedstring = RandomStringUtils.randomAlphabetic(101);
	  String email = generatedstring;
	   driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[3]/div/div[2]/input")).sendKeys(email);
	  	 

	      WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
		     
			System.out.println(m.getText());
			
		
	  	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
	        System.out.println("Button is enabled " + button4.isEnabled());
	      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[3]/div/div[2]/input")).clear();
	    
			Thread.sleep(4000);
	  
	  
  }

  @When("User added Legal name Minimum character")
  public void user_added_legal_name_minimum_character() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[3]/div/div[2]/input")).clear();

	  String generatedstring = RandomStringUtils.randomAlphabetic(5);
	  String email = generatedstring;
	   driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[3]/div/div[2]/input")).sendKeys(email);
	  	 
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());
		
	  	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
	        System.out.println("Button is enabled " + button4.isEnabled());
	      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[3]/div/div[2]/input")).clear();
	    
	    
			
			Thread.sleep(4000);
  }

  @Then("User added Legal name alphanumeric values character")
  public void user_added_legal_name_alphanumeric_values_character() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[3]/div/div[2]/input")).clear();

	  
	   driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[3]/div/div[2]/input")).sendKeys("Asgsj156165");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());
	   
		
	  	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
	        System.out.println("Button is enabled " + button4.isEnabled());
	      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[3]/div/div[2]/input")).clear();
	    
	     
			Thread.sleep(3000);
  }

  @When("User added numbers in Legal name")
  public void user_added_numbers_in_legal_name() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[3]/div/div[2]/input")).clear();

	  
	   driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[3]/div/div[2]/input")).sendKeys("12345678921");
	  	 
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());
		
	  	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
	        System.out.println("Button is enabled " + button4.isEnabled());
	      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[3]/div/div[2]/input")).clear();
	    
	    
			
			Thread.sleep(3000);
			
  }

  @Then("User added in legal name Blank")
  public void user_added_in_legal_name_blank() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[3]/div/div[2]/input")).clear();

	  
	   driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[3]/div/div[2]/input")).sendKeys("");
	  
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());
	   
		
	  	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
	        System.out.println("Button is enabled " + button4.isEnabled());
	      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[3]/div/div[2]/input")).clear();
	    
	      
			Thread.sleep(3000);
			
  }

  @Then("user added Trade Name Maximum character")
  public void user_added_trade_name_maximum_character() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	  
      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[3]/div/div[2]/input")).clear();

      String generatedstring = RandomStringUtils.randomAlphabetic(101);
	  String email = generatedstring;
	   driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[3]/div/div[2]/input")).sendKeys(email);
	  	 
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());
		
		
	  	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
	        System.out.println("Button is enabled " + button4.isEnabled());
	      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[3]/div/div[2]/input")).clear();
	    
	     
			Thread.sleep(4000);
			
  }

  @When("user added Trade Name Minimum character")
  public void user_added_trade_name_minimum_character() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[4]/div/div[2]/input")).clear();
      String generatedstring = RandomStringUtils.randomAlphabetic(2);
	  String email = generatedstring;
	  
	   driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[4]/div/div[2]/input")).sendKeys(email);
	  	 
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());
		
	  	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
	        System.out.println("Button is enabled " + button4.isEnabled());
	      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[4]/div/div[2]/input")).clear();
	    
	     
			Thread.sleep(4000);
			
  }

  @Then("user added Trade Name alphanumeric values character")
  public void user_added_trade_name_alphanumeric_values_character() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[4]/div/div[2]/input")).clear();

	  
	   driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[4]/div/div[2]/input")).sendKeys("Abcd1234568");
	  	 
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());
		
		
	  	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
	        System.out.println("Button is enabled " + button4.isEnabled());
	      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[4]/div/div[2]/input")).clear();
	    
	      
			Thread.sleep(4000);
  }

  @When("user added Trade Name numbers character")
  public void user_added_trade_name_numbers_character() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[4]/div/div[2]/input")).clear();
      
      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[4]/div/div[2]/input")).sendKeys("12345689");
      WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());
	     WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
	        System.out.println("Button is enabled " + button4.isEnabled());
	      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[4]/div/div[2]/input")).clear();
	    
	    
			
			Thread.sleep(4000);
  }

  @Then("user added Trade Name Blank")
  public void user_added_trade_name_blank() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[4]/div/div[2]/input")).clear();

	  
	   driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[4]/div/div[2]/input")).sendKeys("");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());
	   
		
	  	  WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
	        System.out.println("Button is enabled " + button4.isEnabled());
	      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[4]/div/div[2]/input")).clear();
	    
	      
			
			Thread.sleep(4000);
  }

  @When("user added Maximum character in Address1")
  public void user_added_maximum_character_in_address1() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[6]/div/div[2]/input")).clear();
	  String generatedstring = RandomStringUtils.randomAlphabetic(101);
	  String email = generatedstring;
	  
	   driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[6]/div/div[2]/input")).sendKeys(email);
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());
	  	 
	   WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
	        System.out.println("Button is enabled " + button4.isEnabled());
	      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[6]/div/div[2]/input")).clear();
	    
	     
			
			Thread.sleep(4000);
  }

  @Then("user added Minimum character in Address1")
  public void user_added_minimum_character_in_address1() throws Exception {
      
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[6]/div/div[2]/input")).clear();
	  String generatedstring = RandomStringUtils.randomAlphabetic(2);
	  String email = generatedstring;
	  
	   driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[6]/div/div[2]/input")).sendKeys(email);
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());
	   WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
	        System.out.println("Button is enabled " + button4.isEnabled());
	      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[6]/div/div[2]/input")).clear();
	    
	      
			
			Thread.sleep(4000);
  }

  @Then("user added alphanumeric values character in Address1")
  public void user_added_alphanumeric_values_character_in_address1() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[6]/div/div[2]/input")).clear();
	//  String generatedstring = RandomStringUtils.randomAlphabetic(2);
	 // String email = generatedstring;
	  
	   driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[6]/div/div[2]/input")).sendKeys("Rohit12345");
	  	
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());
	   WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
	        System.out.println("Button is enabled " + button4.isEnabled());
	      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[6]/div/div[2]/input")).clear();
	    
	      
			
			Thread.sleep(4000);
  
  
  }

  @When("user added numbers in Address1")
  public void user_added_numbers_in_address1() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[6]/div/div[2]/input")).clear();
	//  String generatedstring = RandomStringUtils.randomAlphabetic(2);
	 // String email = generatedstring;
	  
	   driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[6]/div/div[2]/input")).sendKeys("123456789");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());
	  	 
	   WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
	        System.out.println("Button is enabled " + button4.isEnabled());
	      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[6]/div/div[2]/input")).clear();
	    
	    
			Thread.sleep(4000);
  }

  @Then("user added Blank in Address1")
  public void user_added_blank_in_address1() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[6]/div/div[2]/input")).clear();
	//  String generatedstring = RandomStringUtils.randomAlphabetic(2);
	 // String email = generatedstring;
	  
	   driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[6]/div/div[2]/input")).sendKeys("");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());
	  	 
	   WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
	        System.out.println("Button is enabled " + button4.isEnabled());
	      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[6]/div/div[2]/input")).clear();
	    
	     
			Thread.sleep(4000);
  }

  @When("user added Maximum character in Address2")
  public void user_added_maximum_character_in_address2() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[7]/div/div[2]/input")).clear();
	 String generatedstring = RandomStringUtils.randomAlphabetic(101);
	  String email = generatedstring;
	  
	   driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[7]/div/div[2]/input")).sendKeys(email);
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());
	   WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
	        System.out.println("Button is enabled " + button4.isEnabled());
	      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[7]/div/div[2]/input")).clear();
	    
	    
			Thread.sleep(4000);
  }

  @Then("user added Minimum character in Address2")
  public void user_added_minimum_character_in_address2() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[7]/div/div[2]/input")).clear();
	 String generatedstring = RandomStringUtils.randomAlphabetic(2);
	  String email = generatedstring;
	  
	   driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[7]/div/div[2]/input")).sendKeys(email);
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());
	   WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
	        System.out.println("Button is enabled " + button4.isEnabled());
	      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[7]/div/div[2]/input")).clear();
	    
			Thread.sleep(4000);
  }

  @Then("user added alphanumeric values character in Address2")
  public void user_added_alphanumeric_values_character_in_address2() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[7]/div/div[2]/input")).clear();
	// String generatedstring = RandomStringUtils.randomAlphabetic(2);
	 // String email = generatedstring;
	  
	   driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[7]/div/div[2]/input")).sendKeys("Abcd123456");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());
	   WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
	        System.out.println("Button is enabled " + button4.isEnabled());
	      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[7]/div/div[2]/input")).clear();
	    
	       
			Thread.sleep(4000);
  }

  @When("user added numbers in Address2")
  public void user_added_numbers_in_address2() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[7]/div/div[2]/input")).clear();
	// String generatedstring = RandomStringUtils.randomAlphabetic(2);
	 // String email = generatedstring;
	  
	   driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[7]/div/div[2]/input")).sendKeys("123456789");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());
	   WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
	        System.out.println("Button is enabled " + button4.isEnabled());
	      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[7]/div/div[2]/input")).clear();
	    
	     
			Thread.sleep(4000);
  }

  @Then("user added Blank in Address2")
  public void user_added_blank_in_address2() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[7]/div/div[2]/input")).clear();
	// String generatedstring = RandomStringUtils.randomAlphabetic(2);
	 // String email = generatedstring;
	  
	   driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[7]/div/div[2]/input")).sendKeys("");

	      WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
		     
			System.out.println(m.getText());	 
	   WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
	        System.out.println("Button is enabled " + button4.isEnabled());
	      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[7]/div/div[2]/input")).clear();
	    
			
			Thread.sleep(4000);
  }

  @When("user added Maximum character in Location")
  public void user_added_maximum_character_in_location() throws Exception {
	//  /html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[8]/div/div[2]/input
  
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[7]/div/div[2]/input")).clear();
	 String generatedstring = RandomStringUtils.randomAlphabetic(101);
	  String email = generatedstring;
	  
	   driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[7]/div/div[2]/input")).sendKeys(email);
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());	 
	   WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
	        System.out.println("Button is enabled " + button4.isEnabled());
	      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[7]/div/div[2]/input")).clear();
	    
	    
			Thread.sleep(4000);
  }

  @Then("user added Minimum character in Location")
  public void user_added_minimum_character_in_location() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[7]/div/div[2]/input")).clear();
	 String generatedstring = RandomStringUtils.randomAlphabetic(2);
	  String email = generatedstring;
	  
	   driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[7]/div/div[2]/input")).sendKeys(email);
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());
	   WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
	        System.out.println("Button is enabled " + button4.isEnabled());
	      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[7]/div/div[2]/input")).clear();
	    
	      
			Thread.sleep(4000);

  }

  @Then("user added alphanumeric values character in Location")
  public void user_added_alphanumeric_values_character_in_location() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[7]/div/div[2]/input")).clear();
	// String generatedstring = RandomStringUtils.randomAlphabetic(2);
	 // String email = generatedstring;
	  
	   driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[7]/div/div[2]/input")).sendKeys("Rohit1234568");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());
	   WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
	        System.out.println("Button is enabled " + button4.isEnabled());
	      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[7]/div/div[2]/input")).clear();
	    
	      
			Thread.sleep(4000);
  }

  @When("user added numbers in Location")
  public void user_added_numbers_in_location() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[7]/div/div[2]/input")).clear();
	// String generatedstring = RandomStringUtils.randomAlphabetic(2);
	 // String email = generatedstring;
	  
	   driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[7]/div/div[2]/input")).sendKeys("123456789124");
	  	 
	   WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
	        System.out.println("Button is enabled " + button4.isEnabled());
	      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[7]/div/div[2]/input")).clear();
	    
	      WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
		     
			System.out.println(m.getText());
			
			Thread.sleep(3000);
  }

  @Then("user added Blank in Location")
  public void user_added_blank_in_location() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[7]/div/div[2]/input")).clear();
	// String generatedstring = RandomStringUtils.randomAlphabetic(2);
	 // String email = generatedstring;
	  
	   driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[7]/div/div[2]/input")).sendKeys("");
	  	 
	   WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
	        System.out.println("Button is enabled " + button4.isEnabled());
	      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[7]/div/div[2]/input")).clear();
	    
	      WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
		     
			System.out.println(m.getText());
			
			Thread.sleep(3000);
  }

  @When("user added Maximum character in Pincode")
  public void user_added_maximum_character_in_pincode() throws Exception {
      
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[9]/div/div[2]/input")).clear();
	 String generatedstring = RandomStringUtils.randomAlphabetic(7);
	  String email = generatedstring;
	  
	   driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[9]/div/div[2]/input")).sendKeys("");
	  	 
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     	System.out.println(m.getText());
		
	   WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
	        System.out.println("Button is enabled " + button4.isEnabled());
	      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[9]/div/div[2]/input")).clear();
	    
			Thread.sleep(4000);
  }

  @Then("user added Minimum character in Pincode")
  public void user_added_minimum_character_in_pincode() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[9]/div/div[2]/input")).clear();
	 String generatedstring = RandomStringUtils.randomAlphabetic(5);
	  String email = generatedstring;
	  
	   driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[9]/div/div[2]/input")).sendKeys("");
	
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());
		
	   WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
	        System.out.println("Button is enabled " + button4.isEnabled());
	      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[9]/div/div[2]/input")).clear();
	    
	     
			
			Thread.sleep(4000);
  }

  @Then("user added alphanumeric values character in Pincode")
  public void user_added_alphanumeric_values_character_in_pincode() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[9]/div/div[2]/input")).clear();
	// String generatedstring = RandomStringUtils.randomAlphabetic(5);
	//  String email = generatedstring;
	  
	   driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[9]/div/div[2]/input")).sendKeys("Abcde123456");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());
	   WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
	        System.out.println("Button is enabled " + button4.isEnabled());
	      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[9]/div/div[2]/input")).clear();
	    
	    
			
			Thread.sleep(4000);
  }

  @When("user added numbers in Pincode")
  public void user_added_numbers_in_pincode() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[9]/div/div[2]/input")).clear();
	// String generatedstring = RandomStringUtils.randomAlphabetic(5);
	//  String email = generatedstring;
	  
	   driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[9]/div/div[2]/input")).sendKeys("123456");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());
	   WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
	        System.out.println("Button is enabled " + button4.isEnabled());
	      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[9]/div/div[2]/input")).clear();
	    
	      
			Thread.sleep(4000);
  }

  @Then("user added Blank in Pincode")
  public void user_added_blank_in_pincode() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[9]/div/div[2]/input")).clear();
	// String generatedstring = RandomStringUtils.randomAlphabetic(5);
	//  String email = generatedstring;
	  
	   driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[9]/div/div[2]/input")).sendKeys("");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());
	   WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
	        System.out.println("Button is enabled " + button4.isEnabled());
	      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[9]/div/div[2]/input")).clear();
	    
	      
			Thread.sleep(4000);
  }

  @When("user added Maximum character in Phone")
  public void user_added_maximum_character_in_phone() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[11]/div/div[2]/input")).clear();
	// String generatedstring = RandomStringUtils.randomAlphabetic(5);
	 // String email = generatedstring;
	  
	   driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[11]/div/div[2]/input")).sendKeys("9812345678987");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());
	   WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
	        System.out.println("Button is enabled " + button4.isEnabled());
	      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[11]/div/div[2]/input")).clear();
	    
	     
			
			Thread.sleep(4000);
  }

  @Then("user added Minimum character in Phone")
  public void user_added_minimum_character_in_phone() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[11]/div/div[2]/input")).clear();
	// String generatedstring = RandomStringUtils.randomAlphabetic(5);
	 // String email = generatedstring;
	  
	   driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[11]/div/div[2]/input")).sendKeys("12345");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());
	   WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
	        System.out.println("Button is enabled " + button4.isEnabled());
	      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[11]/div/div[2]/input")).clear();
	    
	     
			Thread.sleep(4000);
  }

  @Then("user added alphanumeric values character in Phone")
  public void user_added_alphanumeric_values_character_in_phone() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[11]/div/div[2]/input")).clear();
	// String generatedstring = RandomStringUtils.randomAlphabetic(5);
	 // String email = generatedstring;
	  
	   driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[11]/div/div[2]/input")).sendKeys("Abcd12345");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
				System.out.println(m.getText());
	   WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
	        System.out.println("Button is enabled " + button4.isEnabled());
	      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[11]/div/div[2]/input")).clear();
	    
	   
			
			Thread.sleep(4000);
  }

  @When("user added aplhabets in Phone")
  public void user_added_aplhabets_in_phone() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[11]/div/div[2]/input")).clear();
	// String generatedstring = RandomStringUtils.randomAlphabetic(5);
	 // String email = generatedstring;
	  
	   driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[11]/div/div[2]/input")).sendKeys("Abcdef");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());
	   WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
	        System.out.println("Button is enabled " + button4.isEnabled());
	      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[11]/div/div[2]/input")).clear();
	    
			Thread.sleep(4000);
  }

 

  @When("user added Maximum character in Email")
  public void user_added_maximum_character_in_email() throws Exception {
      
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[11]/div/div[2]/input")).clear();
	 String generatedstring = RandomStringUtils.randomAlphabetic(101);
	  String email = generatedstring;
	  
	   driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[11]/div/div[2]/input")).sendKeys(email);
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());
	   WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
	        System.out.println("Button is enabled " + button4.isEnabled());
	      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[11]/div/div[2]/input")).clear();
	    
	     
			Thread.sleep(4000);
  }

  @Then("user added Minimum character in Email")
  public void user_added_minimum_character_in_email() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[11]/div/div[2]/input")).clear();
	 String generatedstring = RandomStringUtils.randomAlphabetic(4);
	  String email = generatedstring;
	  
	   driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[11]/div/div[2]/input")).sendKeys(email);
	  	
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());
		
	   WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
	        System.out.println("Button is enabled " + button4.isEnabled());
	      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[11]/div/div[2]/input")).clear();
	    
	     
			Thread.sleep(4000);
	      
  }

  @Then("user added alphanumeric values character in Email")
  public void user_added_alphanumeric_values_character_in_email() throws Exception {
      
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[11]/div/div[2]/input")).clear();
	// String generatedstring = RandomStringUtils.randomAlphabetic(4);
	 // String email = generatedstring;
	  
	   driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[11]/div/div[2]/input")).sendKeys("Abcd1234");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());
	   WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
	        System.out.println("Button is enabled " + button4.isEnabled());
	      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[11]/div/div[2]/input")).clear();
	    
	     
			
			Thread.sleep(4000);
	  
  }

  @When("user added numbers in Email")
  public void user_added_numbers_in_email() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[11]/div/div[2]/input")).clear();
	// String generatedstring = RandomStringUtils.randomAlphabetic(4);
	 // String email = generatedstring;
	  
	   driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[11]/div/div[2]/input")).sendKeys("321456849");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());
	   WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
	        System.out.println("Button is enabled " + button4.isEnabled());
	      driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[11]/div/div[2]/input")).clear();
	    
	      
			Thread.sleep(4000);
  }

  @Then("Positive test case for Recipient Details")
  public void positive_test_case_for_recipient_details() throws Exception {
      
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[2]/div/div[2]/input")).clear();

	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[2]/div/div[2]/input")).sendKeys("27AAFCI5032C1ZZ");

	  
	  
	   driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[11]/div/div[2]/input")).sendKeys("8806481789");
	  	 
	  
      // driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[12]/div/div[2]/input")).click();
	    
	    //driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[1]/div/div[1]/h6")).click();
			
			Thread.sleep(3000);
	
			WebElement button4 = driver.findElement(By.xpath("//*[@id='btnNext']"));
      System.out.println("Button is enabled " + button4.isEnabled());
      
      Thread.sleep(2000);
      button4.click();
  }
	  
  @When("user added Maximum character in Sr No")
  public void user_added_maximum_character_in_sr_no() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[2]/div/div[2]/input")).clear();
	 String generatedstring = RandomStringUtils.randomNumeric(7);
	  String sr = generatedstring;
	  
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[2]/div/div[2]/input")).sendKeys(sr);
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());
	  	 
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[2]/div/div[2]/input")).clear();
	    
	     
			Thread.sleep(3000); 	  
	  
  }

  @Then("user added Minimum character in Sr No")
  public void user_added_minimum_character_in_sr_no() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[2]/div/div[2]/input")).clear();
	
	  
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[2]/div/div[2]/input")).sendKeys("");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());
	  	 
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[2]/div/div[2]/input")).clear();
	    
	      
			Thread.sleep(4000);
  }

  @Then("user added alphanumeric values character Sr No")
  public void user_added_alphanumeric_values_character_sr_no() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[2]/div/div[2]/input")).clear();
	
	  
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[2]/div/div[2]/input")).sendKeys("Abcd123457");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[2]/div/div[2]/input")).clear();
	    
	     
			Thread.sleep(3000);
  
  }@When("user added alphabets in Sr No")
  public void user_added_alphabets_in_sr_no() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[2]/div/div[2]/input")).clear();
	
	  
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[2]/div/div[2]/input")).sendKeys("Abcdefg");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[2]/div/div[2]/input")).clear();
	    
	    
			Thread.sleep(3000);

  
  }

  @Then("user added {int} in Sr No")
  public void user_added_in_sr_no(Integer int1) throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[2]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[2]/div/div[2]/input")).sendKeys("0");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[2]/div/div[2]/input")).clear();
	    
	    
			Thread.sleep(3000);
  }

  @When("user added decimal in Sr No")
  public void user_added_decimal_in_sr_no() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[2]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[2]/div/div[2]/input")).sendKeys("15.20");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[2]/div/div[2]/input")).clear();
	    
	      
			Thread.sleep(3000);
  }

  @When("user added Maximum character HSN")
  public void user_added_maximum_character_hsn() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[3]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[3]/div/div[2]/input")).sendKeys("123456789412");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[3]/div/div[2]/input")).clear();
	    
	     
			Thread.sleep(3000);
  }

  @Then("user added Minimum character in HSN")
  public void user_added_minimum_character_in_hsn() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[3]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[3]/div/div[2]/input")).sendKeys("123");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[3]/div/div[2]/input")).clear();
	    
	      
			Thread.sleep(3000);
  }

  @Then("user added alphanumeric values character HSN")
  public void user_added_alphanumeric_values_character_hsn() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[3]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[3]/div/div[2]/input")).sendKeys("Abc123456");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[3]/div/div[2]/input")).clear();
	    
	      
			Thread.sleep(3000);
  }

  @When("user added numbers in HSN")
  public void user_added_numbers_in_hsn() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[3]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[3]/div/div[2]/input")).sendKeys("880648");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());	 
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[3]/div/div[2]/input")).clear();
	    
	     
			Thread.sleep(3000);
  }

  @Then("user added {int} in HSN")
  public void user_added_in_hsn(Integer int1) throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[3]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[3]/div/div[2]/input")).sendKeys("0");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());	 
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[3]/div/div[2]/input")).clear();
	    
	     
			Thread.sleep(3000);
  }

  @When("user added decimal in HSN")
  public void user_added_decimal_in_hsn() throws Exception {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[3]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[3]/div/div[2]/input")).sendKeys("10.10");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText()); 
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[3]/div/div[2]/input")).clear();
	    
	     
			Thread.sleep(3000);
  }

@Then("user added Maximum length Product Description")
public void user_added_maximum_length_product_description() throws Exception {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	
	
	
	driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[4]/div/div[2]/input")).clear();
	
	 String plenth = RandomStringUtils.randomAlphabetic(301);
	  
	 driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[4]/div/div[2]/input")).sendKeys(plenth);
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[4]/div/div[2]/input")).clear();
	    
	    
			Thread.sleep(3000);
	//*[@id="collapseBasic"]/div/div/div[4]/div/div[2]/input
}

@When("user added Minimum length Product Description")
public void user_added_minimum_length_product_description() throws Exception {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[4]/div/div[2]/input")).clear();
	
	  
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[4]/div/div[2]/input")).sendKeys("1");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText()); 
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[4]/div/div[2]/input")).clear();
	    
	     
			Thread.sleep(3000);
}

@Then("user added alphanumeric values  Product Description")
public void user_added_alphanumeric_values_product_description() throws Exception {
   
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[4]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[4]/div/div[2]/input")).sendKeys("Abcd1234");
	   	 
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[4]/div/div[2]/input")).clear();
	    
	     
			Thread.sleep(3000);
}

@When("user added aplhabets Product Description")
public void user_added_aplhabets_product_description() throws Exception {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[4]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[4]/div/div[2]/input")).sendKeys("Abcdefg");
	     	 
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[4]/div/div[2]/input")).clear();
	    
	     
			Thread.sleep(3000);
}

@Then("user added numbers in Product Description")
public void user_added_numbers_in_product_description() throws Exception {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[4]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[4]/div/div[2]/input")).sendKeys("12345678");
	   	 
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[4]/div/div[2]/input")).clear();
	    
	     
			Thread.sleep(3000);
}
@Then("user added Maximum length Quantity")
public void user_added_maximum_length_quantity() throws Exception {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[5]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[5]/div/div[2]/input")).sendKeys("999999999999.999");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText()); 
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[5]/div/div[2]/input")).clear();
	    
	     
			Thread.sleep(3000);
}

@When("user added Minimum length Quantity")
public void user_added_minimum_length_quantity() throws Exception {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[5]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[5]/div/div[2]/input")).sendKeys("-1");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
				System.out.println(m.getText()); 	 
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[5]/div/div[2]/input")).clear();
	    
	   
			Thread.sleep(3000);
	
}

@Then("user added alphanumeric values Quantity")
public void user_added_alphanumeric_values_quantity() throws Exception {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[5]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[5]/div/div[2]/input")).sendKeys("Abcd1234");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
				System.out.println(m.getText());  	 
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[5]/div/div[2]/input")).clear();
	    
	   
			Thread.sleep(3000);
}

@When("user added aplhabets Quantity")
public void user_added_aplhabets_quantity() throws Exception {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[5]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[5]/div/div[2]/input")).sendKeys("Abcdefg");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText()); 
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[5]/div/div[2]/input")).clear();
	    
	      
			Thread.sleep(3000);
}

@Then("user added numbers in Quantity")
public void user_added_numbers_in_quantity() throws Exception {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[5]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[5]/div/div[2]/input")).sendKeys("12345");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[5]/div/div[2]/input")).clear();
	    
	     
			Thread.sleep(3000);
}

@Then("user added Maximum length Free Quantity")
public void user_added_maximum_length_free_quantity() throws Exception {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[6]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[6]/div/div[2]/input")).sendKeys("999999999999.999");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText()); 	 
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[6]/div/div[2]/input")).clear();
	    
	    
			Thread.sleep(3000);
}

@When("user added Minimum length Free Quantity")
public void user_added_minimum_length_free_quantity() throws Exception {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[6]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[6]/div/div[2]/input")).sendKeys("-1");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText()); 	 
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[6]/div/div[2]/input")).clear();
	    
	      
			Thread.sleep(3000);
}

@Then("user added alphanumeric Free Quantity")
public void user_added_alphanumeric_free_quantity() throws Exception {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[6]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[6]/div/div[2]/input")).sendKeys("Abcd1234");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText()); 
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[6]/div/div[2]/input")).clear();
	    
	      
			Thread.sleep(3000);
}

@When("user added aplhabets Free Quantity")
public void user_added_aplhabets_free_quantity() throws Exception {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[6]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[6]/div/div[2]/input")).sendKeys("Abcde");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText()); 
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[6]/div/div[2]/input")).clear();
	    
	     
			Thread.sleep(3000);
}

@Then("user added numbers in Free Quantity")
public void user_added_numbers_in_free_quantity() throws Exception {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[6]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[6]/div/div[2]/input")).sendKeys("12345");
	 
	   
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[6]/div/div[2]/input")).clear();
	    
	     
			Thread.sleep(3000);
}

@Then("user added Maximum length  Unit Price")
public void user_added_maximum_length_unit_price() throws Exception {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[8]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[8]/div/div[2]/input")).sendKeys("999999999999.999");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[8]/div/div[2]/input")).clear();
	    
	     
			Thread.sleep(3000);
}

@When("user added Minimum length  Unit Price")
public void user_added_minimum_length_unit_price() throws Exception {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[8]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[8]/div/div[2]/input")).sendKeys("-1");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[8]/div/div[2]/input")).clear();
	    
	    
			Thread.sleep(3000);
}

@Then("user added alphanumeric  Unit Price")
public void user_added_alphanumeric_unit_price() throws Exception {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[8]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[8]/div/div[2]/input")).sendKeys("Abcd1234");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[8]/div/div[2]/input")).clear();
	    
	      
			Thread.sleep(3000);
}

@When("user added aplhabets  Unit Price")
public void user_added_aplhabets_unit_price() throws Exception {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[8]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[8]/div/div[2]/input")).sendKeys("Abcdef");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText()); 
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[8]/div/div[2]/input")).clear();
	    
	    
			Thread.sleep(3000);
}

@Then("user added numbers in  Unit Price")
public void user_added_numbers_in_unit_price() throws Exception {
    
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[8]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[8]/div/div[2]/input")).sendKeys("12345");
	 	 
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[8]/div/div[2]/input")).clear();
	    
	     
			Thread.sleep(3000);
}
//
//@Then("user added Maximum length  Gross Amt")
//public void user_added_maximum_length_gross_amt() throws Exception {
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
//	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[8]/div/div[2]/input")).clear();
//	
//	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[8]/div/div[2]/input")).sendKeys("12345");
//	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
//	     
//		System.out.println(m.getText());  	 
//	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[8]/div/div[2]/input")).clear();
//	    
//	     
//			Thread.sleep(3000);
//}
//
//@When("user added Minimum length  Gross Amt")
//public void user_added_minimum_length_gross_amt() throws Exception {
//	
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
//	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[8]/div/div[2]/input")).clear();
//	
//	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[8]/div/div[2]/input")).sendKeys("12345");
//	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
//	     
//		System.out.println(m.getText());  	 
//	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[8]/div/div[2]/input")).clear();
//	    
//	     
//			Thread.sleep(3000);
//	
//}
//
////@Then("user added alphanumeric Gross Amt")
////public void user_added_alphanumeric_gross_amt() {
////    // Write code here that turns the phrase above into concrete actions
////    throw new io.cucumber.java.PendingException();
////}
////
////@When("user added aplhabets  Gross Amt")
////public void user_added_aplhabets_gross_amt() {
////    // Write code here that turns the phrase above into concrete actions
////    throw new io.cucumber.java.PendingException();
////}
////
////@Then("user added numbers in  Gross Amt")
////public void user_added_numbers_in_gross_amt() {
////    // Write code here that turns the phrase above into concrete actions
////    throw new io.cucumber.java.PendingException();
////}

@Then("user added Maximum length Discount")
public void user_added_maximum_length_discount() throws Exception {
   
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[10]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[10]/div/div[2]/input")).sendKeys("9999999999999.99");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());  	 
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[10]/div/div[2]/input")).clear();
	    
	     
			Thread.sleep(3000);
	
	
}

@When("user added Minimum length Discount")
public void user_added_minimum_length_discount() throws Exception {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[10]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[10]/div/div[2]/input")).sendKeys("-1");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());  	 
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[10]/div/div[2]/input")).clear();
	    
	     
			Thread.sleep(3000);
}

@Then("user added alphanumeric Discount")
public void user_added_alphanumeric_discount() throws Exception {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[10]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[10]/div/div[2]/input")).sendKeys("Abcd12345");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());  	 
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[10]/div/div[2]/input")).clear();
	    
	     
			Thread.sleep(3000);
}

@When("user added aplhabets Discount")
public void user_added_aplhabets_discount() throws Exception {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[10]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[10]/div/div[2]/input")).sendKeys("Abcde");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	     
		System.out.println(m.getText());  	 
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[10]/div/div[2]/input")).clear();
	    
	     
			Thread.sleep(3000);
}


@Then("user added Maximum length Pre tax value")
public void user_added_maximum_length_pre_tax_value() throws Exception {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[11]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[11]/div/div[2]/input")).sendKeys("999999999999999.99");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
 	 
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[11]/div/div[2]/input")).clear();
	    
	     
			Thread.sleep(3000);
}

@When("user added Minimum length Pre tax value")
public void user_added_minimum_length_pre_tax_value() throws Exception {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[11]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[11]/div/div[2]/input")).sendKeys("-1");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
 	 
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[11]/div/div[2]/input")).clear();
	    
	     
			Thread.sleep(3000);
}

@Then("user added alphanumeric Pre tax value")
public void user_added_alphanumeric_pre_tax_value() throws Exception {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[11]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[11]/div/div[2]/input")).sendKeys("Abcd1234");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
  	 
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[11]/div/div[2]/input")).clear();
	    
	     
			Thread.sleep(3000);
}

@When("user added aplhabets Pre tax value")
public void user_added_aplhabets_pre_tax_value() throws Exception {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[11]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[11]/div/div[2]/input")).sendKeys("Abcdef");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
   	 
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[11]/div/div[2]/input")).clear();
	    
	     
			Thread.sleep(3000);
}

//@Then("user added numbers in Pre tax value")
//public void user_added_numbers_in_pre_tax_value() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}
//
//@Then("user added Maximum length Taxable Value")
//public void user_added_maximum_length_taxable_value() throws Exception {
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
//	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[11]/div/div[2]/input")).clear();
//	
//	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[11]/div/div[2]/input")).sendKeys("99999999999999.99");
//	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
// 	 
//	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[11]/div/div[2]/input")).clear();
//	    
//	     
//			Thread.sleep(3000);
//}
//
//@When("user added Minimum length Taxable Value")
//public void user_added_minimum_length_taxable_value() throws Exception {
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
//	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[11]/div/div[2]/input")).clear();
//	
//	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[11]/div/div[2]/input")).sendKeys("-1");
//	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
//	 
//	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[11]/div/div[2]/input")).clear();
//	    
//	     
//			Thread.sleep(3000);
//}
//
//@Then("user added alphanumeric Taxable Value")
//public void user_added_alphanumeric_taxable_value() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}
//
//@When("user added aplhabets Taxable Value")
//public void user_added_aplhabets_taxable_value() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}
//
//@Then("user added numbers in Taxable Value")
//public void user_added_numbers_in_taxable_value() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}

@Then("user added Maximum length Cess Rate")
public void user_added_maximum_length_cess_rate() throws Exception {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[17]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[17]/div/div[2]/input")).sendKeys("1234");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	 
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[17]/div/div[2]/input")).clear();
	    
	     
			Thread.sleep(3000);
	
}

@When("user added Minimum length Cess Rate")
public void user_added_minimum_length_cess_rate() throws Exception {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[17]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[17]/div/div[2]/input")).sendKeys("-1");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	 
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[17]/div/div[2]/input")).clear();
	    
	     
			Thread.sleep(3000);
}

@Then("user added alphanumeric Cess Rate")
public void user_added_alphanumeric_cess_rate() throws Exception {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[17]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[17]/div/div[2]/input")).sendKeys("Abcd1234");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	 
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[17]/div/div[2]/input")).clear();
	    
	     
			Thread.sleep(3000);
}

@When("user added aplhabets Cess Rate")
public void user_added_aplhabets_cess_rate() throws Exception {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[17]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[17]/div/div[2]/input")).sendKeys("Abcde");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	 
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[17]/div/div[2]/input")).clear();
	    
	     
			Thread.sleep(3000);
}

@Then("user added numbers in Cess Rate")
public void user_added_numbers_in_cess_rate() throws Exception {
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[17]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[17]/div/div[2]/input")).sendKeys("12");
	 
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[17]/div/div[2]/input")).clear();
	    
	     
			Thread.sleep(3000);
}

@Then("user added Maximum length State Cess Rate")
public void user_added_maximum_length_state_cess_rate() throws Exception {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[19]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[19]/div/div[2]/input")).sendKeys("1234");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	 
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[19]/div/div[2]/input")).clear();
	    
	     
			Thread.sleep(3000);
	
}

@When("user added Minimum length State Cess Rate")
public void user_added_minimum_length_state_cess_rate() throws Exception {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[19]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[19]/div/div[2]/input")).sendKeys("-1");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	 
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[19]/div/div[2]/input")).clear();
	    
	     
			Thread.sleep(3000);
}

@Then("user added alphanumeric State Cess Rate")
public void user_added_alphanumeric_state_cess_rate() throws Exception {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[19]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[19]/div/div[2]/input")).sendKeys("Abcd12345");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	 
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[19]/div/div[2]/input")).clear();
	    
	     
			Thread.sleep(3000);
}

@When("user added aplhabets State Cess Rate")
public void user_added_aplhabets_state_cess_rate() throws Exception {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[19]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[19]/div/div[2]/input")).sendKeys("Abcdef");
	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
	 
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[19]/div/div[2]/input")).clear();
	    
	     
			Thread.sleep(3000);
}

@Then("user added numbers in State Cess Rate")
public void user_added_numbers_in_state_cess_rate() throws Exception {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[19]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[19]/div/div[2]/input")).sendKeys("11");

	   
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[19]/div/div[2]/input")).clear();
	    
	     
			Thread.sleep(3000);
}


@Then("user added Maximum length Cess Non Ad Value")
public void user_added_maximum_length_cess_non_ad_value() throws Exception {
    
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[21]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[21]/div/div[2]/input")).sendKeys("9999999999999.99");

	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));
 
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[21]/div/div[2]/input")).clear();
	    
	     
			Thread.sleep(3000);
	
}

@When("user added Minimum length Cess Non Ad Value")
public void user_added_minimum_length_cess_non_ad_value() throws Exception {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[21]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[21]/div/div[2]/input")).sendKeys("-1");

	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));

	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[21]/div/div[2]/input")).clear();
	    
	     
			Thread.sleep(3000);
}

@Then("user added alphanumeric Cess Non Ad Value")
public void user_added_alphanumeric_cess_non_ad_value() throws Exception {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[21]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[21]/div/div[2]/input")).sendKeys("Avd1234");

	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));

	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[21]/div/div[2]/input")).clear();
	    
	     
			Thread.sleep(3000);
}

@When("user added aplhabets Cess Non Ad Value")
public void user_added_aplhabets_cess_non_ad_value() throws Exception {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[21]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[21]/div/div[2]/input")).sendKeys("Abcde");

	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));

	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[21]/div/div[2]/input")).clear();
	    
	   Thread.sleep(3000);
}

@Then("user added numbers in Cess Non Ad Value")
public void user_added_numbers_in_cess_non_ad_value() throws Exception {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[21]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[21]/div/div[2]/input")).sendKeys("12345");


	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[21]/div/div[2]/input")).clear();
	    
	   Thread.sleep(3000);
}

@Then("user added Maximum length State Cess Non Ad Value")
public void user_added_maximum_length_state_cess_non_ad_value() throws Exception {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[22]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[22]/div/div[2]/input")).sendKeys("9999999999999.99");

	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));

	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[22]/div/div[2]/input")).clear();
	    
	   Thread.sleep(3000);
}

@When("user added Minimum length State Cess Non Ad Value")
public void user_added_minimum_length_state_cess_non_ad_value() throws Exception {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[22]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[22]/div/div[2]/input")).sendKeys("-1");

	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));

	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[22]/div/div[2]/input")).clear();
	    
	   Thread.sleep(3000);
}

@Then("user added alphanumeric State Cess Non Ad Value")
public void user_added_alphanumeric_state_cess_non_ad_value() throws Exception {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[22]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[22]/div/div[2]/input")).sendKeys("Abcd1234");

	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));

	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[22]/div/div[2]/input")).clear();
	    
	   Thread.sleep(3000);
}

@When("user added aplhabets State Cess Non Ad Value")
public void user_added_aplhabets_state_cess_non_ad_value() throws Exception {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[22]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[22]/div/div[2]/input")).sendKeys("Abcde");

	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));

	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[22]/div/div[2]/input")).clear();
	    
	   Thread.sleep(3000);
}

@Then("user added numbers in State Cess Non Ad Value")
public void user_added_numbers_in_state_cess_non_ad_value() throws Exception {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[22]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[22]/div/div[2]/input")).sendKeys("1234");


	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[22]/div/div[2]/input")).clear();
	    
	   Thread.sleep(3000);
}

@Then("user added Maximum length Other Charges")
public void user_added_maximum_length_other_charges() throws Exception {
    
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[23]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[23]/div/div[2]/input")).sendKeys("99999999999999.99");

	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));


	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[23]/div/div[2]/input")).clear();
	    
	   Thread.sleep(3000);
}

@When("user added Minimum length Other Charges")
public void user_added_minimum_length_other_charges() throws Exception {
	  
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
		  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[23]/div/div[2]/input")).clear();
		
		   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[23]/div/div[2]/input")).sendKeys("-1");

		   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));


		   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[23]/div/div[2]/input")).clear();
		    
		   Thread.sleep(3000);
}

@Then("user added alphanumeric Other Charges")
public void user_added_alphanumeric_other_charges() throws Exception {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[23]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[23]/div/div[2]/input")).sendKeys("Abcd1234");

	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));


	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[23]/div/div[2]/input")).clear();
	    
	   Thread.sleep(3000);
}

@When("user added aplhabets Other Charges")
public void user_added_aplhabets_other_charges() throws Exception {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[23]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[23]/div/div[2]/input")).sendKeys("Abcd");

	   WebElement m = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#toast-container")));


	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[23]/div/div[2]/input")).clear();
	    
	   Thread.sleep(3000);
}

@Then("user added numbers in Other Charges")
public void user_added_numbers_in_other_charges() throws Exception {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[23]/div/div[2]/input")).clear();
	
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[23]/div/div[2]/input")).sendKeys("15");



	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[23]/div/div[2]/input")).clear();
	    
	   Thread.sleep(3000);
}

@Then("added positive test case for item details")
public void added_positive_test_case_for_item_details() throws Exception {
	
	
	 driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[2]/div/div[2]/input")).clear();
	 
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[2]/div/div[2]/input")).sendKeys("123");
	    
	  Thread.sleep(100);
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[3]/div/div[2]/input")).clear();
		
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[3]/div/div[2]/input")).sendKeys("252510");
	 
	   Thread.sleep(5000);
	   
	   WebElement mainMenu = driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[7]/div/div[2]/ng-select/div/div/div[3]/input"));

	    //Instantiating Actions class
	    Actions actions = new Actions(driver);

	    //Hovering on main menu
	    actions.moveToElement(mainMenu);

	    // Locating the element from Sub Menu
	    WebElement subMenu = driver.findElement(By.xpath("//*[@id='ac97da65c384-0']/span"));
	  //*[@id='mySidenav']/ul[1]/li[2]/div/div/div/div/div[1]
	    //To mouseover on sub menu
	    actions.moveToElement(subMenu);

	    //build()- used to compile all the actions into a single step 
	    actions.click().build().perform();
	   
//	   Select dropdown = new Select(driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[7]/div/div[2]/ng-select/div/div/div[2]/input")));
//	   Thread.sleep(1000);
//	   dropdown.selectByVisibleText("BAGS");
//	   
//	   Thread.sleep(2000);
//
//	   Select gstrate = new Select(driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[13]/div/div[2]/ng-select/div/div/div[2]")));
//	   Thread.sleep(1000);
//	   gstrate.selectByVisibleText("1");
	   
	Thread.sleep(500);
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[4]/div/div[2]/input")).clear();
		  
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[4]/div/div[2]/input")).sendKeys("Automation checking and testing");
		
	   Thread.sleep(500);
	   
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[5]/div/div[2]/input")).clear();
		
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[5]/div/div[2]/input")).sendKeys("100");
	   	
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[6]/div/div[2]/input")).clear();
		
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[6]/div/div[2]/input")).sendKeys("40");
	
Thread.sleep(100);
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[8]/div/div[2]/input")).clear();
		
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[8]/div/div[2]/input")).sendKeys("200");
	  
	   Thread.sleep(500);
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[10]/div/div[2]/input")).clear();
		
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[10]/div/div[2]/input")).sendKeys("10");
	  
	   Thread.sleep(1000);
	  
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[11]/div/div[2]/input")).sendKeys("15");
	 	 
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[11]/div/div[2]/input")).clear();
	  
	   Thread.sleep(500);
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[17]/div/div[2]/input")).clear();
		
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[17]/div/div[2]/input")).sendKeys("50");
	 
	   Thread.sleep(1000);
	   
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[19]/div/div[2]/input")).clear();
		
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[19]/div/div[2]/input")).sendKeys("25");
	 
	   Thread.sleep(1000);
	   
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[21]/div/div[2]/input")).clear();
		
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[21]/div/div[2]/input")).sendKeys("30");
	  Thread.sleep(500);
	  
	  driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[22]/div/div[2]/input")).clear();
		
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[22]/div/div[2]/input")).sendKeys("20");

	   Thread.sleep(500);
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[23]/div/div[2]/input")).clear();
		
	   driver.findElement(By.xpath("//*[@id='collapseBasic']/div/div/div[23]/div/div[2]/input")).sendKeys("35");

Thread.sleep(2000);
	   WebElement signn = driver.findElement(By.xpath("//*[@id='btnNext']"));
	 		JavascriptExecutor clk = (JavascriptExecutor)driver;
	 		clk.executeScript("arguments[0].click()", signn);
	 		Assert.assertTrue(ExpectedConditions.titleContains("IRIS-IRP").apply(driver).booleanValue());
	 	
	   
	   
	   
  }
}
  
  
  
  
//  @When("User enter Document No and checking maximum, minimum and pattern condition")
//  public void user_enter_document_no_and_checking_maximum_minimum_and_pattern_condition() throws Exception {
//
//	
		  

//		  
//		  String generatedNamestring3 = RandomStringUtils.randomAlphabetic(18);
//		  String name3 =generatedNamestring3;
//		  driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/app-invoice/div[2]/div/div/app-generate-invoice/div/div[3]/form/div[1]/div[2]/div/div[2]/div/div[2]/input")).sendKeys(generatedNamestring3);
//	      WebElement button3 = driver.findElement(By.xpath("//button[@id='btnNext']"));
//			 System.out.println("Button is enabled"+ button3.isEnabled());
//			 
//			  driver.findElement(By.xpath("//*[@id='btnNext']")).clear();
//			 Thread.sleep(2000); 
//			 
//	
//  WebElement einvoice = driver.findElement(By.xpath("//*[@id='mySidenav']/ul[1]/li[2]/a"));
//
//
//  Thread.sleep(1000);
//
//  einvoice.click();
  
//*[@id='mySidenav']/ul[1]/li[2]/div



