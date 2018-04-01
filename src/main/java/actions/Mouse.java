package actions;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {


		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElementByXPath("//button[text()='✕']").click();
			WebElement ele = driver.findElementByXPath("//span[text()='Electronics']");
			WebElement apple = driver.findElementByXPath("//span[text()='Apple']");
			Actions builder = new Actions(driver);
			builder.moveToElement(ele).perform();
			
				Thread.sleep(2000);
		
			builder.click(apple).perform();
		}

	}


