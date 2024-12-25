package Firstcry;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class login {
	String driverpath = "C:\\Users\\Samiksha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();

	@BeforeTest
	void navigate() {
		driver.get("https://firstcrystore.in/");
		driver .manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	
	@Test(priority = 1)
	void account() {
		WebElement A = driver.findElement(By.xpath("//span[normalize-space()='Account']"));
        A.click();
	}
	
	@Test(priority = 2)
	void login_email() {
		WebElement E = driver.findElement(By.xpath("//input[@name='email']"));
        E.sendKeys("hello123@gmail.com");
        
	}
	
	@Test(priority = 3)
	void login_password() {
		WebElement P = driver.findElement(By.xpath("//input[@name='password']"));
        P.sendKeys("Manual@123");
	}
	
	@Test(priority = 4)
	void signin() throws InterruptedException {
		WebElement S = driver.findElement(By.xpath("//button[@type='submit']"));
        S.click();
        Thread.sleep(5000);
        Alert o=driver.switchTo().alert();
        o.accept();
	}

	
}
