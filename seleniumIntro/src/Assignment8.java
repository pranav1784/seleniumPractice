import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("#autocomplete")).sendKeys("uni");
	
		driver.findElement(By.xpath("//ul[@id='ui-id-1']/li/div[contains(text(),\"USA\")]")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//input[@id='autocomplete']")).getAttribute("value"), "United States (USA)");

	}

}
