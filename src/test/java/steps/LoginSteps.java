package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps 
{
	public RemoteWebDriver driver;
	
	
	@Given("Launch the browser")
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aishwarya\\Desktop\\PatternObjectModel\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@And("Load the URl")
	public void loadUrl()
	{
		driver.get("https://leafltaps.com/opentaps");
	}
	
	@And("Maximize the window")
	public void MaximizeWindow()
	{
		driver.manage().window().maximize();
	}
	
	@And("Set the implicit wait")
	public void implicitWait()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@And("Enter the UserName as DemoSalesManager")
	public void UserName()
	{
		driver.findElementById("username").sendKeys("DemoSalesManager");
	}
	@And("Enter the Password as crmsfa")
	public void Password()
	{
		driver.findElementById("password").sendKeys("crmsfa");
	}
	@When("Click on the login button")
	public void loginButton()
	{
		driver.findElementByClassName("decorativeSubmit").click();
	}
	@Then("Login should be successfully")
	public void VerifyLogin()
	{
		System.out.println("Logged in successfully");
	}
}
