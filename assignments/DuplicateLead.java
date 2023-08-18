package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {
	
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

driver.findElement(By.xpath("//span[text()='Email']")).click();

driver.findElement(By.name("emailAddress")).sendKeys("xyz@gmail.com");
Thread.sleep(3000);


driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();

Thread.sleep(3000);

WebElement name = driver.findElement(By.xpath("(//div[@class='x-panel-bwrap ']//descendant::table[@class='x-grid3-row-table']//a[@class='linktext'])[39]"));
String nameText = name.getText();
System.out.println(nameText);
name.click();


driver.findElement(By.linkText("Duplicate Lead")).click();
System.out.println(" verifying the title as"     +driver.getTitle());

driver.findElement(By.className("smallSubmit")).click();


WebElement duplicateName = driver.findElement(By.xpath("//span[text()='shri']"));
String dupName = duplicateName.getText();
System.out.println(dupName);

if(nameText.equals(dupName)){

System.out.println("the values are duplicated");
}
else {
	System.out.println("The values are not duplicated");
	
}
}

	
}
	
	
