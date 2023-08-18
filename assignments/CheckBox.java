package week2.day2.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/checkbox.xhtml");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
	
		Thread.sleep(3000);
		
		List<WebElement> checkboxes = driver.findElements(By.id("j_idt87:basic"));



for(int i=0;i<checkboxes.size();i++) {
	if(checkboxes.get(i).isDisplayed() && checkboxes.get(i).isEnabled()) {
		
		System.out.println("Checkboxes displaying at index : "+ i +" clicking on it now");
		checkboxes.get(i).click();
	}
	
	Thread.sleep(3000);


	WebElement state = driver.findElement(By.id("j_idt87:ajaxTriState"));
	state.click();
	if(state.isEnabled()) {
		System.out.println("State is enabled");
	}else {
		System.out.println("state is disabled");
	}	
		Thread.sleep(3000);
	
		WebElement state2 = driver.findElement(By.id("j_idt87:ajaxTriState"));
		state.click();
		if(state2.isEnabled()) {
			System.out.println("State is changed to next");
		}else {
			System.out.println("state is disabled");
				
		}	
		
WebElement toggle = driver.findElement(By.id("j_idt87:j_idt100"));		
		toggle.click();
		if(toggle.isEnabled()) {
			System.out.println("Toggle is turned on");
		}else {
			System.out.println("Toggle is turned off");
		}
		
		WebElement boxDis = driver.findElement(By.id("j_idt87:j_idt102"));
	//	boolean en = boxDis.isEnabled();
		if (boxDis.isEnabled()) {
			System.out.println("enabled");
		}else {
			System.out.println("disbaled");
		}
		
		Thread.sleep(3000);
	
	
	driver.findElement(By.xpath("//ul[@class='ui-selectcheckboxmenu-multiple-container ui-widget ui-inputfield ui-state-default ui-corner-all']")).click();	
		
	List<WebElement> multiple = driver.findElements(By.xpath("//div[@class='ui-selectcheckboxmenu-items-wrapper']//label"));
		
			for(int j=0;j<multiple.size();j++) {
				if(checkboxes.get(j).isDisplayed() && checkboxes.get(j).isEnabled()) {
					
					System.out.println("Checkboxes displaying at index : "+ j +" clicking on it now");
					checkboxes.get(i).click();
	
			
			
			
			
		}
		
		
		
			}		
		
		
		
}



	}
	
}
