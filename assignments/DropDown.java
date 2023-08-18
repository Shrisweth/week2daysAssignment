package week2.day2.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/select.xhtml");
		
	driver.manage().window().maximize();
	
	WebElement AITool = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));	
	Select tool = new Select(AITool);
	tool.selectByIndex(3);
	Thread.sleep(3000);
	
	
//	 List<WebElement> country = driver.findElements(By.id("j_idt87:country_input"));

//for(WebElement count : country) {
	//if(count.getText().equals("USA"))
		
		//count.click();		
		
//}
	WebElement country = driver.findElement(By.xpath("//label[contains(text(),'Select Country')]"));
	country.click();
	
WebElement count = driver.findElement(By.xpath("(//ul[@class='ui-selectonemenu-items ui-selectonemenu-list ui-widget-content ui-widget ui-corner-all ui-helper-reset']//li)[5]"));
	count.click();
	
	Thread.sleep(3000);
	WebElement city = driver.findElement(By.xpath("//label[contains(text(),'Select City')]"));
	city.click();
	
WebElement cities = driver.findElement(By.xpath("(//ul[@class='ui-selectonemenu-items ui-selectonemenu-list ui-widget-content ui-widget ui-corner-all ui-helper-reset']//li[@class='ui-selectonemenu-item ui-selectonemenu-list-item ui-corner-all'])[4]"));
	if(cities.getText().contains("Denver")) {
		System.out.println("Cities are present");
	}else {
		System.out.println("No cites are present");
	}
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//button[@class='ui-autocomplete-dropdown ui-button ui-widget ui-state-default ui-corner-right ui-button-icon-only']")).click();
	
	Thread.sleep(3000);

	driver.findElement(By.xpath("(//ul[@class='ui-autocomplete-items ui-autocomplete-list ui-widget-content ui-widget ui-corner-all ui-helper-reset']//li)[1]")).click();
		
	driver.findElement(By.xpath("//label[contains(text(),'Select Language')]")).click();
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("(//ul[@class='ui-selectonemenu-items ui-selectonemenu-list ui-widget-content ui-widget ui-corner-all ui-helper-reset']//li)[7]")).click();
	Thread.sleep(3000);

	
	driver.findElement(By.xpath("//label[contains(text(),'Select Values')]")).click();
	Thread.sleep(3000);

	driver.findElement(By.xpath("(//ul[@class='ui-selectonemenu-items ui-selectonemenu-list ui-widget-content ui-widget ui-corner-all ui-helper-reset']//li)[19]")).click();
	
	
	
	
	
	
	
	
	
	
	
	}

}
