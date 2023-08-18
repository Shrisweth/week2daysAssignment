package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLeads {

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

		driver.findElement(By.xpath("//span[text()='Phone']")).click();

		driver.findElement(By.name("phoneNumber")).sendKeys("9876765456");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();

		Thread.sleep(3000);

//	WebElement leadID = driver.findElement(By.xpath((("//a[contains(text(),'102')])[1]"))));

		WebElement leadID = driver.findElement(By.xpath(
				"(//div[@class=\"x-panel-body xedit-grid\"]//descendant::table[@class=\"x-grid3-row-table\"]//a[@class=\"linktext\"])[19]"));
		String leadtext = leadID.getText();
//String leads = leadID.getAttribute("value");
		System.out.println(leadtext);

		leadID.click();

		driver.findElement(By.linkText("Delete")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();

		Thread.sleep(3000);

		WebElement verLead = driver.findElement(By.xpath("//input[@name ='id']"));
		verLead.sendKeys(leadtext);

		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();

		// doubt

		
		  WebElement empty = driver.findElement(By.xpath("//div[@class='x-panel-bbar']//descendant::div[contains(text(),'No records to display')]"));
		  
		  
		  String text = empty.getText(); System.out.println(text);
		  
		  if (empty.getText().contains("records")) {
		  
		  System.out.println("No records"); }else {
		  
		  System.out.println("Records"); }
		  
		  
		  
		  // driver.close();
	}

}
