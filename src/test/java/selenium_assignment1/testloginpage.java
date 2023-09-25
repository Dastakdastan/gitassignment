package selenium_assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testloginpage {
	
	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", "./webdrivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login.php");
		WebElement username=driver.findElement(By.id("j_username"));
		WebElement password=driver.findElement(By.name("j_password"));
		WebElement login=driver.findElement(By.name("Submit"));
		username.sendKeys("reshmadasmohapatra15@gmail.com");
		password.sendKeys("Reshm771995");
		login.click();
		String actualUrl="http://1.2.2.185.8:8080/";
		String expectedUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);
	}

}
