import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
public class ActionsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	WebDriver driver = new FirefoxDriver();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.com/");

		Actions act=new Actions(driver);
	//	act.click();
		act.moveToElement(driver.findElement(By.cssSelector("a[data-nav-ref=\"nav_ya_signin\"]"))).build().perform();
	act.moveToElement(driver.findElement(By.cssSelector("input#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
act.moveToElement(driver.findElement(By.cssSelector("a#nav-link-accountList"))).contextClick().build().perform();


	}

}
