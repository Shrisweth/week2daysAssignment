package week2.day2.assignments;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Input {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		
		WebElement name = driver.findElement(By.xpath("(//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all'])[1]"));
	
	name.sendKeys("Shri");
	
	WebElement city = driver.findElement(By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all city ui-state-filled']"));
	city.sendKeys("India");
	System.out.println("Chennai"    +city);
	
	WebElement disabled = driver.findElement(By.xpath("//input[@placeholder='Disabled']"));
	boolean status = disabled.isEnabled();
	System.out.println("If the text box is diabled then print"     +status);
	

	
	
WebElement  clear = driver.findElement(By.xpath("//input[@value='Can you clear me, please?']"));
	String attribute = clear.getAttribute("value");
	System.out.println(attribute);
	clear.clear();

	WebElement retrieve = driver.findElement(By.xpath("(//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all ui-state-filled'])[2]"));
	String attribute2 = retrieve.getAttribute("value");
	System.out.println(attribute2);
	
	WebElement email = driver.findElement(By.xpath("//input[@placeholder='Your email and tab']"));
	email.sendKeys("xyz@gmail.com");
	email.sendKeys(Keys.TAB);

WebElement about = driver.findElement(By.xpath("//textarea[@placeholder='About yourself']"));	
	
about.sendKeys("Shriswethaa");
Thread.sleep(3000);



WebElement Enter = driver.findElement(By.xpath("//div[@class='col-12 mb-2 lg:col-8']//descendant::input"));
Enter.sendKeys(Keys.ENTER);
	//rb.keyPress(KeyEvent.VK_ENTER);
	//rb.keyRelease(KeyEvent.VK_ENTER);

Thread.sleep(3000);

	
WebElement text = driver.findElement(By.xpath("//span[(text()='Age is mandatory')]"));
	
	if (text.getText().contains("Age")) {
		
		System.out.println("Error is present");
	}else {
		System.out.println("No Error is present");
	}
	
	Thread.sleep(3000);
	
	WebElement label = driver.findElement(By.xpath("//span[@class='ui-float-label']"));
	label.click();
	Point location = label.getLocation();
	System.out.println(location);
	Thread.sleep(3000);
		
	WebElement chooseName = driver.findElement(By.xpath("//input[@placeholder='Search']"));
//	chooseName.click();
	chooseName.sendKeys("shri");
chooseName.sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	
	
//WebElement names = driver.findElement(By.xpath("//div[@class='col-12 md:col-6'][2]//descendant::div[@class='ui-autocomplete ui-autocomplete-multiple']"));
//Thread.sleep(3000);
//WebElement selname = driver.findElement(By.xpath("(//ul[@class='ui-autocomplete-items ui-autocomplete-list ui-widget-content ui-widget ui-corner-all ui-helper-reset']//li)[3]"));


	String yr = "2024";
	String month = "1/31/2024";
	String date = "31";
	
	driver.findElement(By.xpath("//input[@class='ui-inputfield ui-widget ui-state-default ui-corner-all']")).click();
	Thread.sleep(3000);
//	driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
	//Thread.sleep(3000);
	
	for(int i = 0; i<5; i++) {
		driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
		Thread.sleep(3000);
	}
	
		WebElement datee = driver.findElement(By.xpath("//div[@class='ui-datepicker-calendar-container']//a[contains(text(),"+date+")]"));
		datee.click();
		Thread.sleep(3000);
		
		{
if(datee.equals(month)){
	System.out.println("The dates are same");
}else {
		System.out.println("The dates are different");
	}
	
Thread.sleep(3000);
WebElement spin = driver.findElement(By.xpath("//input[@class='ui-spinner-input ui-inputfield ui-state-default ui-corner-all']"));
spin.sendKeys("5");
System.out.println(spin.getText());
WebElement click = driver.findElement(By.xpath("//a[@class='ui-spinner-button ui-spinner-up ui-corner-tr ui-button ui-widget ui-state-default ui-button-text-only']"));
click.click();

if(spin.equals(click)) {
	System.out.println("the value has not changed");
}else {
	System.out.println("The value has changed");
}

		Thread.sleep(3000);
 WebElement slideKeys = driver.findElement(By.xpath("//input[@name='j_idt106:slider']"));
slideKeys.sendKeys("23");
		WebElement slider = driver.findElement(By.xpath("//div[@class='ui-slider ui-corner-all ui-slider-horizontal ui-widget ui-widget-content']"));
	Point location2 = slider.getLocation();
	System.out.println(location2);
	
	}
		WebElement key = driver.findElement(By.xpath("//input[@name='j_idt106:j_idt122']"));
	key.click();
	Thread.sleep(3000);
	
	WebElement keyBoard = driver.findElement(By.xpath("//div[@class='ui-widget ui-widget-content ui-corner-all ui-shadow keypad-popup ui-input-overlay']//button[contains(text(),'Shift')]"));
	if(keyBoard.getText().contains("Shift")) {
		System.out.println("Confirm keyBoard");
		
	}else {
		System.out.println("No KeyBoard present");
	}
	
	}
	
	

	
	
	
	
}	


