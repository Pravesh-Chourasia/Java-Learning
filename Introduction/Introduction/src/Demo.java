import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create Driver Object
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chourasia_p\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*driver.get("http://google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		driver.get("http://yahho.com");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		driver.close();*/
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Have to learn this time without fail");
		//driver.findElement(By.id("pass")).sendKeys("I will do it this time for sure");
		driver.findElement(By.name("pass")).sendKeys("1235");
		driver.findElement(By.linkText("Forgotten password?")).click();
		

	}

}
