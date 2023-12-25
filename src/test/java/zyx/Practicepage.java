package zyx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicepage {
    public static WebDriver driver;
    String URL = "https://juice-shop.herokuapp.com/#/register";
    
    By dismisbtn = By.xpath("//button//span[text()='Dismiss']");
    By emailid = By.id("emailControl");
    By passwordTxt = By.id("passwordControl");
	By confirmPassword = By.id("repeatPasswordControl");
	By secQnBox = By.xpath("//div[@id='mat-select-value-1']/span");
	By secQn = By.xpath("//span[text()=' Your eldest siblings middle name? ']");
	By secQnAns = By.id("securityAnswerControl");
	public void register() {
	
		//WebDriver driver=new ChromeDriver();
		driver = new ChromeDriver();
		driver.get(URL);
		driver.findElement(dismisbtn).click();
		
		driver.findElement(emailid).sendKeys("Malli@gmail.com");
		driver.findElement(passwordTxt).sendKeys("Pitchuka@123");
		driver.findElement(confirmPassword).sendKeys("Malli.1234");
		driver.findElement(secQnBox).click();
		driver.findElement(secQn).click();
		driver.findElement(secQnAns).sendKeys("Pitchuka");
		
	}
public static void main(String[] args) {
		
	Practicepage obj = new Practicepage();
		obj.register();
	}
	
}
