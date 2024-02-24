import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
public class SeleniumProject {

	public static void main(String[] args) {
				WebDriver driver=new ChromeDriver();
//				WebDriver driver=new FirefoxDriver();
				//WebDriver driver=new EdgeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.get("https://rahulshettyacademy.com/locatorspractice/");
				driver.findElement(By.id("inputUsername")).sendKeys("pranav");
				driver.findElement(By.name("inputPassword")).sendKeys("password");
				driver.findElement(By.className("signInBtn")).click();
				System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
				System.out.println(driver.getTitle());
				//driver.close();
	}

}
