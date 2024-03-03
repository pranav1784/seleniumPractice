import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
//import org.openqa.selenium.firefox.FirefoxDriver;
public class SeleniumProject {

	public static void main(String[] args) throws InterruptedException {
				WebDriver driver=new ChromeDriver();
//				WebDriver driver=new FirefoxDriver();
				//WebDriver driver=new EdgeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

				String pass= getPassword(driver);
				
				driver.get("https://rahulshettyacademy.com/locatorspractice/");

//				driver.findElement(By.id("inputUsername")).sendKeys("rahul");
//
//				driver.findElement(By.name("inputPassword")).sendKeys("hello123");
//
//				driver.findElement(By.className("signInBtn")).click();
//
//				System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

//				driver.findElement(By.linkText("Forgot your password?")).click();

//				Thread.sleep(1000);//
				

				driver.findElement(By.cssSelector("#inputUsername")).sendKeys("pranav");

				driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(pass);

				driver.findElement(By.id("chkboxOne")).click();

				driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
				Thread.sleep(1000);
				String result=driver.findElement(By.tagName("p")).getText();
				System.out.println("this is: "+result);
				Assert.assertEquals(result,"You are successfully logged in.");
				
				driver.findElement(By.xpath("//*[text()='Log Out']")).click();
				driver.close();
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");

		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");

		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();

		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");

		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253");

		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

		String passwordText=driver.findElement(By.cssSelector("form p")).getText();
		String[] passwordArray=passwordText.split("'");
		return passwordArray[1].split("'")[0];
	}

}
