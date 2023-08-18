package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AcmeTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
						
				driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		
				
					driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
					driver.findElement(By.xpath("(//input[@class='form-control '])[2]")).sendKeys("leaf@12");
		
				
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();		
				
				System.out.println(driver.getTitle());
				
				driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();	
				
				Thread.sleep(2000);
			
				driver.close();
	}
	
	
	

}
