package br.com.rsinet.hub_TDD.Utilitys;

import org.openqa.selenium.WebDriver;

public class MobileFactory {

	private static WebDriver Driver;

	public static WebDriver getDriver() {
		return Driver;
	}

	static void setWebDriver(WebDriver driver) {
		Driver = driver;
	}
}
