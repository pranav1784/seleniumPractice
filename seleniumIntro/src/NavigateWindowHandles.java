import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.*;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class NavigateWindowHandles {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
	driver.findElement(By.cssSelector("a[class='blinkingText']")).click();
	Set<String> str=driver.getWindowHandles();
	Iterator<String> it=str.iterator();
	String parent=it.next();
	String child=it.next();
	driver.switchTo().window(child);
	System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
	driver.switchTo().window(parent);
	System.out.println(driver.getTitle());

	}

}
