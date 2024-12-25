package Firstcry;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class accessories {
	
	String driverpath = "C:\\Users\\Samiksha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();

	@BeforeTest
		void navigate() {
		driver.get("https://firstcrystore.in/");
		driver .manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	
	@Test(priority = 1)
	void accessories() {
		WebElement A = driver.findElement(By.xpath("//div[@class='top-cotegories hover-product-list y-gap']"));
	    A.click();
	}
	
	@Test(priority = 2)
	void baby_net() {
		WebElement B = driver.findElement(By.xpath("//li[normalize-space()='Baby Bed With Net']"));
        B.click();
	}
	
	@Test(priority = 3)
	void add() throws InterruptedException {
		WebElement AD = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[2]/div[1]/a[1]/button[1]"));
        Thread.sleep(5000);
		AD.click();
        
	}
	
	@Test(priority = 4)
	void add_cart() {
		WebElement AC = driver.findElement(By.xpath("//button[@class=\"btn btn-primary px-3\"]"));
        AC.click();
	}
	
	@Test(priority = 5)
	void proceed() throws InterruptedException {
		WebElement P = driver.findElement(By.xpath("//a[@href=\"#/proceedtocheckout\"]"));
        P.click();
        Thread.sleep(2000);
	    driver.navigate().refresh();
	}
	
   @Test(priority = 6)
	void first_name() {
		WebElement FN = driver.findElement(By.xpath("//input[@name=\"firstName\"]"));
        FN.sendKeys("Samiksha");
	}
   
   @Test(priority = 7)
   void mail_id() {
		WebElement MI = driver.findElement(By.xpath("//input[@placeholder=\"example@email.com\"]"));
        MI.sendKeys("hello123@gmail.com");
    }
	
   @Test(priority = 8)
     void address() {
 		WebElement A = driver.findElement(By.xpath("(//input[@placeholder=\"123 Street\"])[1]"));
        A.sendKeys("Street no 3");
     }
   
   @Test(priority = 9)
   void city() {
		WebElement C = driver.findElement(By.xpath("(//input[@placeholder=\"New York\"])[1]"));
        C.sendKeys("Muzaffarpur");
   }
   
   @Test(priority = 10)
   void zip_code() {
		WebElement Z = driver.findElement(By.xpath("//input[@placeholder=\"123\"]"));
        Z.sendKeys("843113");   
   }
   
   @Test(priority = 11)
    void last_name() {
		WebElement L = driver.findElement(By.xpath("//input[@name=\"lastName\"]"));
        L.sendKeys("Mehta");
    }
   
   @Test(priority = 12)
   void mobile_no() {
		WebElement M = driver.findElement(By.xpath("//input[@placeholder=\"+123 456 789\"]"));
        M.sendKeys("9334582882");
   }
   
   @Test(priority = 13)
   void address_line() {
		WebElement AL = driver.findElement(By.xpath("//input[@name=\"addressLine2\"]"));
        AL.sendKeys("Near Central Bank of India");
   }
   
   @Test(priority = 14)
   void state() {
		WebElement S = driver.findElement(By.xpath("//input[@name=\"state\"]"));
        S.sendKeys("Bihar");
    }
  
   @Test(priority = 15)
   void cash_on_delivery() {
		WebElement CD = driver.findElement(By.xpath("//input[@class=\"custom-control-input\"]"));
        CD.click();
   }
   
   
   
   
	@Test(priority = -3)
	void account() {
		WebElement A = driver.findElement(By.xpath("//span[normalize-space()='Account']"));
        A.click();
	}
		
	@Test(priority = -2)
	void email() {
		WebElement E = driver.findElement(By.xpath("//input[@type=\"email\"]"));
        E.sendKeys("hello123@gmail.com");
	}
	
	@Test(priority = -1)
	void password() {
		WebElement P = driver.findElement(By.xpath("//input[@type=\"password\"]"));
        P.sendKeys("Manual@123");
	}
	
	@Test(priority = 0)
	void login() throws InterruptedException {
		WebElement L = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        L.click();
        Thread.sleep(2000);
        Alert o=driver.switchTo().alert();
        o.accept();
	
	}
}
