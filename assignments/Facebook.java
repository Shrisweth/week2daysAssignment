package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		//adding implicit waits	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
	
driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("abc");
		
//		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("bcd");


driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("xyz");

driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("87657654345");

driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("qwerty");
	
	WebElement bday = driver.findElement(By.name("birthday_day"));
	
	Select date = new Select(bday);
	
	date.selectByIndex(21);
		
	WebElement bdaymon = driver.findElement(By.name("birthday_month"));
	
	Select month = new Select(bdaymon);
	
	month.selectByVisibleText("Dec");
	
	WebElement bdayear = driver.findElement(By.name("birthday_year"));

	Select year = new Select(bdayear);
	
	year.selectByVisibleText("2022");
	
	driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
	
	Thread.sleep(2000);

	driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
	}

}
