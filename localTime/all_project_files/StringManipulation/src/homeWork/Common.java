package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Common {
	
	ChromeDriver dr;
	
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/mdmolla/Downloads/chromedriver");
	 dr=new ChromeDriver ();
		
	}
	public void mywait() {
		
	}
	
	public void getWebSite(String url) {
		dr.get(url);
	}
	public void veriFyLogoDisplayed(By by) {
		boolean a=dr.findElement(by).isDisplayed();
		System.out.println("Logo is Displayed : "+a);
	}
	
	public void myClick(By by) {
		dr.findElement(by).click();
		
	}
	public void Mytype(WebElement ele,String value ) {
		
		ele.sendKeys(value);
	}
	public void selectByVisibleText(By by,String value) {
		new Select(dr.findElement(by)).selectByVisibleText(value);}

}
