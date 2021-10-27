package com.san.maven.mavensan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class san {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\00004551\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		String PageTitle = driver.getTitle();
		System.out.println("Page Title is:" + PageTitle);
		System.out.println("URL being launched is :" + driver.getCurrentUrl());
		driver.close();

	}

}
