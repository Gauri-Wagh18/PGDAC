package com.automation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class automationreg {
	public static WebDriver d;
  @Test
  public void login() {
	  d.findElement(By.xpath("//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[2]")).sendKeys("gauri");
	  d.findElement(By.xpath("//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[3]")).sendKeys("gauri18@mail.com");
	  d.findElement(By.xpath("//button[contains(text(),'Signup')]")).click();
	  d.findElement(By.xpath("//input[@id='id_gender2']"));
	  d.findElement(By.name("radiooptions")).click();
	  d.findElement(By.xpath("//input[@id='name']")).sendKeys("gauri");
	  d.findElement(By.xpath("//input[@id='email']")).sendKeys("gauri28@gmail.com");
	  d.findElement(By.xpath("//input[@id='company']")).sendKeys("amazon");
	  d.findElement(By.xpath("//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/p[4]")).sendKeys("nashik");
	  Select country=new Select(d.findElement(By.xpath("//select[@id='country']")));
	  country.selectByVisibleText("India");
	  d.findElement(By.xpath("//input[@id='city']")).sendKeys("nashik");
	  d.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("16541644");
	  d.findElement(By.xpath("//button[contains(text(),'Create Account')]")).click();
	  WebElement we8 = d.findElement(By.xpath("//button[contains(text(),'Create Account')]"));
      we8.sendKeys("gauriwagh");
      String v = we8.getAttribute("value");
      System.out.println("The user name is :" + v);

      WebElement we9 = d.findElement(By.xpath("//button[contains(text(),'Create Account')]"));
      we9.sendKeys("gauri123");
      String pwd = we9.getAttribute("value");
      System.out.println("The password is: " + pwd);
	  
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\seleniumdata1\\chromedriver-win32\\chromedriver.exe");

		d = new ChromeDriver();
		d.get("https://automationexercise.com/login");
		 d.manage().window().maximize();
		 System.out.println(d.getCurrentUrl());
  }

  @AfterTest
  public void afterTest() {
  }

}
