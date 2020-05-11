package homeWork;

import org.openqa.selenium.By;

public class SmokeTest {
	
	public static void main(String[] args) {
		Common b=new Common();
		b.openBrowser();
		b.getWebSite("https://www.target.com/");
		b.veriFyLogoDisplayed(By.xpath("//a[@id='home']"));
		b.myClick(By.xpath("//input[@id='search']"));
		b.Mytype(b.dr.findElement(By.id("search")), "kids scooters");
		b.myClick(By.xpath("//button[@type='submit']"));
		//b.myClick(By.xpath("//a[contains(text(),'Micro Kickboard Mini Scooter - Pink')]"));
		b.selectByVisibleText(By.xpath("//a[contains(text(),'Micro Kickboard Mini Scooter - Pink')]"), "2");
		
	}
	
}
