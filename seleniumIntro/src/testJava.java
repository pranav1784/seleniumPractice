import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class testJava {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
//		WebDriver driver=new FirefoxDriver();
		//WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.id("inputUsername")).sendKeys("pranav");

		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");

		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(1000);
		String result=driver.findElement(By.tagName("p")).getText();
		System.out.println("this is: "+result);
		Assert.assertEquals(result,"You are successfully logged in.");
		

	}

}
