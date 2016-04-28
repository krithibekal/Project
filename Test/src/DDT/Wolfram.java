package DDT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class Wolfram 
{
	@Test
	public void loginToWolfram()
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://user.wolfram.com/oauth/authorize/cloud?oauth_token=ceb4485ef6d08f52c3e611c92b624da50572275e7&oauth_callback=https%3A%2F%2Fdevelop.wolframcloud.com%2Fapp%2Fj_spring_oauth_security_check%3Fproductname%3DWolfram%20Development%20Platform%26learnabout%3Dhttp%3A%2F%2Fwww.wolfram.com%2Fdevelopment-platform%26preview%3Dfalse%26logo%3Dwolfram_development_platform%26targetUrl%3Dhttps%3A%2F%2Fdevelop.wolframcloud.com%2Fapp");
		((WebElement) 
	    driver.findElements(By.xpath("/html/body/div[5]/div[1]/div[2]/form/input[1]"))).sendKeys("krithibekal16@gmail.com");
	   ((WebElement) 
	    driver.findElements(By.id("password"))).sendKeys("Amma$25appa");
		driver.findElement(By.xpath("/html/body/div[5]/div[1]/div[2]/form/div[2]/div ")).click();
	}

}
