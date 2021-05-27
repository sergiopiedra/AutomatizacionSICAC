package pruebasAutomatizadas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

@Test //HappyPath
public class testPersona {
	public void testPersona_demo() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://cacnandayure.com/");
		driver.manage().window().maximize();
		String email = "s.piedranavarro@gmail.com";
		String pwd = "12345678";

		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"gestion\"]/div/div[2]/div[1]/div/div/div[1]/div/a")).click();

		driver.findElement(By.id("email")).sendKeys(email);

		driver.findElement(By.id("password")).sendKeys(pwd);

		driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/div/form/div[3]/button")).click();

		driver.quit();
		Reporter.log("-Browser Session End-", true);
	}
}
