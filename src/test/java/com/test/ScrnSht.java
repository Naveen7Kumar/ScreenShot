package com.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrnSht {

	public static void main(String[] args) throws IOException {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver(option);

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		TakesScreenshot t = (TakesScreenshot) driver;
		File screenshot = t.getScreenshotAs(OutputType.FILE);
		File f = new File("F:\\Amazon\\Amazonscrnshot.jpeg");
		FileUtils.copyFile(screenshot, f);
	}

}
