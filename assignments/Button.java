package week2.day2.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Button {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://www.leafground.com/button.xhtml");
	driver.manage().window().maximize();
	
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	WebElement click = driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only mr-2 mb-2']"));
	click.click();
	System.out.println("The title is" + " "+ driver.getTitle());
	
	driver.navigate().back();
	
	Thread.sleep(3000);
	
	WebElement dis = driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-state-disabled']"));
	boolean enabled = dis.isEnabled();
	
System.out.println(enabled);
	
	
	
	WebElement submit = driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left mr-2']"));
	submit.click();
	//driver.navigate().back();
	//Thread.sleep(3000);
	//Point location = submit.getLocation();
//	System.out.println(location);
	
	
	
	WebElement save = driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left ui-button-secondary mr-2 mb-2']"));
	String cl = save.getCssValue("color");
	System.out.println(cl);
	
//	String asHex = Color.fromString(cl).asHex();
	//System.out.println(asHex);
	
	String asRgb = Color.fromString(cl).asRgb();
	System.out.println("The color is" +asRgb);
	
WebElement height = driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-right']"));	
System.out.println("The height is" +height.getRect().getDimension().getHeight());
	
WebElement width = driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-right']"));	
System.out.println("The width is" +width.getRect().getDimension().getHeight());
	
	WebElement colorChange = driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-button-raised ui-button-success mr-2 mb-2']"));
	String col = colorChange.getCssValue("background-color");
	System.out.println(col);
	
String hex = Color.fromString(col).asRgb();
	System.out.println(hex);
	
	
	if(hex==("#689F38")) {
		System.out.println("The color is same");
	}else {
		System.out.println("The color is different");
		
	}
	

List<WebElement> buttons = driver.findElements(By.xpath("//(//div[@class='layout-main-content']//descendant::div[@class='card'])[7]"));	
System.out.println(buttons);
	
	
	
	
	
	}
	
	
	
	
	
}
