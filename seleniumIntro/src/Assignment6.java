import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("learning");
		driver.findElement(By.xpath("//span[contains(text(),\"User\")]/following-sibling::input")).click();
		//driver.findElement(By.cssSelector("span:contains('User') input")).click();
		Wait w = new WebDriverWait(driver,Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button#okayBtn")));
		driver.findElement(By.cssSelector("button#okayBtn")).click();
		driver.findElement(By.cssSelector("*#terms")).click();
		driver.findElement(By.cssSelector("input#signInBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.card-footer button")));
		List<WebElement> addToCart=driver.findElements(By.cssSelector("div.card-footer button"));
		for(int i=0;i<addToCart.size();i++)
		{
			addToCart.get(i).click();
		}
		
	}

}
