import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("label[for='benz'] input")).click();
		String name=driver.findElement(By.cssSelector("label[for='benz']")).getText();
		WebElement dropdown=driver.findElement(By.cssSelector("#dropdown-class-example"));
		Select select = new Select(dropdown);
		select.selectByVisibleText(name);
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.id("alertbtn")).click();
		String alertTxt=driver.switchTo().alert().getText();
		if(alertTxt.contains(name))
		Assert.assertTrue(true);
		else
			Assert.assertTrue(false,"String didn't matched");
		driver.switchTo().alert().accept();

	}

}
