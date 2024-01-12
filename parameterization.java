package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class parameterization {
	public static WebDriver d;
	@Parameters({"us","pw"})
  @Test
  public void login(String us,String pw) throws Exception {
	  d.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys(us);
		
		
		d.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys(pw);
		 d.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).click();
		 Thread.sleep(5000);
		}
	@Parameters({"us1","pw1"})
	  @Test
	  public void validlog(String us1,String pw1) {
		  d.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys(us1);
			
			
			d.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys(pw1);
			 d.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).click();
			}
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\seleniumdata1\\chromedriver-win32\\chromedriver.exe");

		d = new ChromeDriver();
		d.get("https://demo.guru99.com/v4/");
		 d.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	 
		
		
		
  }

}
