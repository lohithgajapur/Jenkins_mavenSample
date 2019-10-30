package com.MavenTry.com.SampleMav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class FirstTestTry {
	
	@Test
	public void try1() {
		System.out.println("in test started");
		System.setProperty("webdriver.chrome.driver","G:\\Java_Software_Latest_version\\2.4 chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

}
