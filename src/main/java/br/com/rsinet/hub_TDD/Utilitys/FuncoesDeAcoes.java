package br.com.rsinet.hub_TDD.Utilitys;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class FuncoesDeAcoes {

	private static TouchAction actions;
	private static AndroidDriver<WebElement> driver;

	public FuncoesDeAcoes(AndroidDriver<WebElement> driver) {

		this.driver = driver;
		this.actions = new TouchAction(this.driver);
	}

	public static void arrastarTela() {
		int x = 490;
		int y = 453;

		actions.press(PointOption.point(475, 1561)).moveTo(PointOption.point(x, y)).release().perform();
	}

	public static void apertarProximo() {

		actions.tap(PointOption.point(998, 1713)).perform();
	}
}
