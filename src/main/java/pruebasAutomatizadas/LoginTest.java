package pruebasAutomatizadas;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

	WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void setup() {
		driver.get("https://cacnandayure.com/");
		driver.manage().window().maximize();
	}

	// @Test //HappyPath
	public void testLoginTrue() throws InterruptedException {
		String email = "s.piedranavarro@gmail.com";
		String pwd = "12345678";

		driver.findElement(By.xpath("/html/body/header/div[2]/div[1]/div/div[2]/div[2]/a")).click();

		driver.findElement(By.id("email")).sendKeys(email);

		driver.findElement(By.id("password")).sendKeys(pwd);

		driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/div/form/div[3]/button")).click();

		assertTrue(driver.getCurrentUrl().contentEquals("https://cacnandayure.com/inicio"));

		driver.quit();
		Reporter.log("-Browser Session End-", true);
	}

	@Test // NoHappyPath
	public void testLoginFalse() throws InterruptedException {
		String email = "admin@admin.com";
		String pwd = "66754575";

		driver.findElement(By.xpath("/html/body/header/div[2]/div[1]/div/div[2]/div[2]/a")).click();

		driver.findElement(By.id("email")).sendKeys(email);

		driver.findElement(By.id("password")).sendKeys(pwd);

		driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/div/form/div[3]/button")).click();

		assertTrue(driver.getCurrentUrl().contentEquals("https://cacnandayure.com/inicio"));

		driver.quit();
		Reporter.log("-Browser Session End-", true);
	}
}