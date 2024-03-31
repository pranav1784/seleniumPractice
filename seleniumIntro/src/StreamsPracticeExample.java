import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
public class StreamsPracticeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("#search-field")).sendKeys("Beans");
		List<WebElement> vegetables=driver.findElements(By.xpath("//tr/td[1]"));
		List<WebElement> filteredList=vegetables.stream().filter(s->s.getText().contains("Beans")).collect(Collectors.toList());
		Assert.assertEquals(vegetables, filteredList);
		
		

	}

}
