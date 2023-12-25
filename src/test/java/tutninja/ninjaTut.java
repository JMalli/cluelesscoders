package tutninja;

import java.time.Duration;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ninjaTut{
	
	public static void main(String[] args) {
	
      WebDriver driver = new ChromeDriver();
      
      driver.manage().window().maximize();
      
//      ChromeOptions chromeOptions = new ChromeOptions();
//	
//      chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.get("https://tutorialsninja.com/demo/index.php");
	
	//1. Launch the application http://tutorialsninja.com/demo/index.php
	//2. Select the currency in the left top corner to Euro
	//3. Try to order a canon EOS 5 D camera and collect the error message occurred due to a
	//bug in select option.
	//4. Move to the home screen, Click on iphone and go to details screen, change the quantity
	//to two then add to cart.
	
	WebElement send = driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/button"));
	send.click();
	
	WebElement csel = driver.findElement(By.name("EUR"));
	csel.click();
	WebElement canon = driver.findElement(By.xpath("//*[text()='Canon EOS 5D']"));
	canon.click();
	WebElement sel = driver.findElement(By.xpath("//*[@id='input-option226']"));
	sel.click();
	Select opt =new Select(sel);
	
	java.util.List<WebElement>  element = opt.getOptions();
	if(element.size()>1) {
		System.out.println("size is:"+element.size());
	}else {
		System.out.println("no options");
	}
	driver.navigate().back();WebElement ipn = driver.findElement(By.xpath("//*[text()='iPhone']"));
	ipn.click();
	WebElement phone = driver.findElement(By.xpath("//div[@id='product']/div/input"));
	phone.clear();
	phone.sendKeys("2");
	WebElement cart = driver.findElement(By.xpath("//*[text()='Add to Cart']"));
	cart.click();
	
	//5. Print the success message in the console
	WebElement success = driver.findElement(By.xpath("//*[@class='alert alert-success alert-dismissible']"));
	success.click();
	String s=success.getText();
	System.out.println("Print the Status:"+s);
	
	//6. Click on the cart icon (black color) in the right side top then click view cart
	WebElement addcart = driver.findElement(By.xpath("//*[@id=\"cart\"]/button"));
	 addcart.click();
	
	WebElement viewcart = driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]/strong/i"));
	viewcart.click();
	
	//7. Change the quantity of iphone to 3 and click update button
	 WebElement udcart = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/input"));
	 udcart.clear();
	 udcart.sendKeys("3");
	
	 //8. Print the Eco tax and VAT Amount in console and click Checkout button
 
	 WebElement ecotax = driver.findElement(By.xpath("//*[@class='col-sm-4 col-sm-offset-8']/table/tbody/tr[2]/td[2]"));
	 String et=success.getText();
	 System.out.println(" Eco tax:" +et);
	 
	 
	}
	 
}
//Part -1
//1. Launch the application http://tutorialsninja.com/demo/index.php
//2. Select the currency in the left top corner to Euro
//3. Try to order a canon EOS 5 D camera and collect the error message occurred due to a
//bug in select option.
//4. Move to the home screen, Click on iphone and go to details screen, change the quantity
//to two then add to cart.
//5. Print the success message in the console
//6. Click on the cart icon (black color) in the right side top then click view cart
//7. Change the quantity of iphone to 3 and click update button
//8. Print the Eco tax and VAT Amount in console and click Checkout button
//9. Print the error message and remove the product from the cart
//10. Move to the home screen and click on Mac book, check the default quantity is 1 and
//click add to cart then verify success message
//11. Click on the shopping cart link in the top and apply ABCD123 as coupon code to check,
//print error message
//12. Enter AXDFGH123 as gift certificate and perform apply to check, print error message
//13. Clear both textbox values and proceed to checkout
//14. Select register account option and enter all account and billing details, click continue
//15. Add comments, click continue and check the error message related to payment method
//16. Click on contact us hyperlink and submit a contact request and click continue
//Part - 2
//•Please watch this video to understand how web elements are declared and handled in the real time -
//https://www.youtube.com/watch?v=YUcM96xfhXU&t=2s
//  