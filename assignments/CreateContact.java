package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {
	
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
		
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Shriswethaa");
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("Arunachalam");
		driver.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']")).sendKeys("shri");	
		driver.findElement(By.xpath("//input[@id='createContactForm_lastNameLocal']")).sendKeys("Swethaa");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Description");
		
	driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("Chem");
	
	driver.findElement(By.id("createContactForm_primaryPhoneNumber")).sendKeys("978653452");

	driver.findElement(By.xpath("//input[@name='primaryEmail']")).sendKeys("xyz@gmail.com");
	
	
	WebElement StateProvince = driver.findElement(By.xpath("//Select[@name='generalStateProvinceGeoId']"));
		
		
		Select state = new Select(StateProvince);
		state.selectByVisibleText("New York");
		
		WebElement clickCreate = driver.findElement(By.name("submitButton"));
		String button = clickCreate.getAttribute("value");
		System.out.println(button);
		clickCreate.click();
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		driver.findElement(By.xpath("//textarea[@name='description']")).clear();
		driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("Important");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println("The tile of the page is"      +driver.getTitle());
		
		Thread.sleep(2000);
		driver.close();
		

	}

}
