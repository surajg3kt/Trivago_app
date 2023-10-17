package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Login 
{
	public static WebDriver driver;
	
	@Given("Open the trivago app")
	public void Open_the_app() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	 driver= new ChromeDriver();
	 Thread.sleep(2000);
	driver.manage().window().maximize();
	driver.get("https://www.trivago.in/");
	
	}
	
	@When("user enter location")
	public void user_enter_location() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement loc_name = driver.findElement(By.xpath("//*[@data-testid='search-form-destination']"));
		loc_name.sendKeys("Bengaluru",Keys.ENTER);
	}
	
	@Then ("location should be accepted")
	public void location_should_be_accepted()
	{
		
	}
	
	
	
	@When("user click on dates textfield")
	public void user_click_on_dates_textfield() throws InterruptedException 
	{
		Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[text()='Check in']")).click();
	}

	@Then("Calender should be displayed")
	public void calender_should_be_displayed() 
	{
	    
	}
    
	@When("user select one date")
	public void user_select_one_date()
	{
	    driver.findElement(By.xpath("//*[@datetime='2023-08-16']")).click();
	}

	@Then("Selected date should displayed")
	public void selected_date_should_displayed() 
	{
	   
	}
}
