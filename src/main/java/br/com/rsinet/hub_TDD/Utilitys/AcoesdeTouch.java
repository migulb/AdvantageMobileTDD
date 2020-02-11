package br.com.rsinet.hub_TDD.Utilitys;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class AcoesdeTouch {

	private static TouchAction actions;
	private static AndroidDriver<WebElement> driver;

	public AcoesdeTouch(AndroidDriver<WebElement> driver) {

		this.driver = driver;
		this.actions = new TouchAction(this.driver);
	}

	public static void arrastarTela() {
		int x = 490;
		int y = 453;

		actions.press(PointOption.point(475, 1561)).moveTo(PointOption.point(x, y)).release().perform();
	}

	public static void apertarProximo() {

		actions.press(PointOption.point(487, 1564)).moveTo(PointOption.point(502, 420)).release().perform();
	}

	public static void Scroll() {
		actions.press(PointOption.point(405, 1031)).moveTo(PointOption.point(426, 335)).release().perform();
	}

	public static void scrollAndClick(AndroidDriver driver, String visibleText) {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ visibleText + "\").instance(0))")
				.click();
	}

	public AcoesdeTouch scrollar(double inicio, double fim) throws MalformedURLException {

		Dimension size = DriverFactory.AberturaAndroid().manage().window().getSize();

		int x = size.width / 2;
		int start_y = (int) (size.height * inicio);
		int end_y = (int) (size.height * fim);
		(new TouchAction(DriverFactory.AberturaAndroid())).press(PointOption.point(x, start_y))
				.waitAction((WaitOptions.waitOptions(Duration.ofMillis(500))))//
				.moveTo(PointOption.point(x, end_y))//
				.release().perform();
		return this;

	}
}
