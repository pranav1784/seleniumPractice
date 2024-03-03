import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
public class calendarIsEnabledValidation {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		System.out.println(driver.findElement(By.cssSelector("div[id='Div1']")).isEnabled());
		
		System.out.println(driver.findElement(By.cssSelector("div[id='Div1']")).getAttribute("Style"));
		driver.findElement(By.cssSelector("div[id='Div1']")).click();
		if(driver.findElement(By.cssSelector("div[id='Div1']")).getAttribute("Style").contains("opacity: 1"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}

	}

}
