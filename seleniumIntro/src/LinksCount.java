import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.*;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
public class LinksCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footer=driver.findElement(By.cssSelector("div[id='gf-BIG']"));
		System.out.println(footer.findElements(By.tagName("a")).size());
	WebElement column=footer.findElement(By.cssSelector("tbody tr td:nth-child(1) ul:nth-child(1)"));
	System.out.println(column.findElements(By.tagName("a")).size());
	for(int i=1;i<column.findElements(By.tagName("a")).size();i++)
	{
		String clickOnLinks=Keys.chord(Keys.CONTROL,Keys.ENTER);
		//Sendkeys is used below because its main use is to pass keyboard arguments whenever we are typing then also keyboard 
		//is used.
		column.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinks);
	}	
		Set<String> window=driver.getWindowHandles();
		Iterator<String> it=window.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

		}

}
