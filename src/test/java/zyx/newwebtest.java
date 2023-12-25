package zyx;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newwebtest {
	
	public static void main(String[] args) {

		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com");
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
	}

}
