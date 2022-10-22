import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClassPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\mohit\\\\Kachra\\\\automationTesting\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println(driver.getTitle());
		//driver.quit();
		driver.findElement(By.id("inputUsername")).sendKeys("Mohit");
		driver.findElement(By.name("inputPassword")).sendKeys("justhavingfun");
		driver.findElement(By.className("signInBtn")).click();
		//driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/button")).click();
		//driver.quit();
		
		

	}

}
