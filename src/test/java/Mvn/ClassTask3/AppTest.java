package Mvn.ClassTask3;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class AppTest 
{
	WebDriver dr;

	@BeforeMethod
	public void setup() {
		dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.get("https://petstore.octoperf.com/actions/Catalog.action");
	}

	@Test
	public void validLogin() {
		dr.findElement(By.linkText("Sign In")).click();
		dr.findElement(By.name("username")).sendKeys("j2ee");
		dr.findElement(By.name("password")).clear();
		dr.findElement(By.name("password")).sendKeys("j2ee");
		dr.findElement(By.name("signon")).click();
	}
	
	
	@AfterMethod
	public void close() {
		dr.close();
	}
}
