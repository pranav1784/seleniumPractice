import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment7 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println("Number of Rows: "+driver.findElements(By.cssSelector("table[name='courses'] tr ")).size());
		System.out.println("Number of Columns: "+driver.findElements(By.cssSelector("table[name='courses'] tr th")).size());
		for(int i=0;i<driver.findElements(By.cssSelector("table[name='courses'] tr:nth-child(3) td")).size();i++)
		{
			System.out.println("Column " +i+": "+driver.findElements(By.cssSelector("table[name='courses'] tr:nth-child(3) td")).get(i).getText());
		}
		driver.quit();
	}

}
