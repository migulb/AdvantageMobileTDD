package br.com.rsinet.hub_TDD.Utilitys;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class DriverFactory {

	private static AndroidDriver<WebElement> driver;
	private static DesiredCapabilities cap;

	public static AndroidDriver<WebElement> AberturaAndroid() throws MalformedURLException {
		if (driver == null) {
			cap = new DesiredCapabilities();
			cap.setCapability("deviceName", "motorola one action");
			cap.setCapability("udid", "emulator-5554");
			cap.setCapability("platformVersion", "9");
			cap.setCapability("platformName", "Android");
			cap.setCapability("appPackage", "com.Advantage.aShopping");
			cap.setCapability("appActivity", "com.Advantage.aShopping.SplashActivity");
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		}
		return driver;
	}

	public static void fecharDriver() {
		if (driver != null)
			driver.quit();
		driver = null;
	}
}
