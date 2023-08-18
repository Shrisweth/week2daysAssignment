package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLeads {
	
public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
				
		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("demoSalesManager");

		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		Thread.sleep(3000);

		
		
driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("shri");

Thread.sleep(3000);

		
driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();

Thread.sleep(3000);

WebElement row = driver.findElement(By.xpath("(//div[@class='x-grid3-viewport']//descendant::table[@class='x-grid3-row-table']//a[@class='linktext'])[21]"));
			row.click();
		
		System.out.println("The title is"   +driver.getTitle());		
		
		driver.findElement(By.linkText("Edit")).click();
		
	WebElement compName = driver.findElement(By.id("updateLeadForm_companyName"));	
	compName.clear();
compName.sendKeys("Amazon");
String att = compName.getAttribute("value");

System.out.println(att);

driver.findElement(By.className("smallSubmit")).click();
	
WebElement text = driver.findElement(By.xpath("//span[contains(text(),'Amazon')]"));	
	
	String text2 = text.getText();
	
	System.out.println("The company name is changed to"   +text2);
	
	if(att == text2) {
		System.out.println("The company name is changed");
	}else {
		System.out.println("The company name is not changed");
	
	//driver.close();
	
	
	
	}
	
	
	
	
		
}

}
