package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PvrCinemas {

	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.pvrcinemas.com");
		
		driver.manage().window().maximize();
		
		WebElement movielib = driver.findElement(By.xpath("//div[@class='header-extra-links-item header-extra-links-item-selected']//a[contains(text(),'Movie Calendar ')]"));
		movielib.click();
				
	WebElement city = driver.findElement(By.xpath("//div[@class='form-element location-element']"));	
	city.click();
	
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//div[@class='row thumbholder ng-star-inserted']//descendant::span[text()='Chennai']")).click();
	
	driver.findElement(By.xpath("(//div[@class='p-dropdown p-component'])[1]")).click();
	
	
	driver.findElement(By.xpath("(//ul[@class='p-dropdown-items ng-star-inserted']//li)[4]")).click();
	
	driver.findElement(By.xpath("(//div[@class='p-dropdown p-component'])[2]")).click();
	
	driver.findElement(By.xpath("(//ul[@class='p-dropdown-items ng-star-inserted']//li)[3]")).click();
	
	
		
	}
	
	
	
	
	
	
	
	
}
