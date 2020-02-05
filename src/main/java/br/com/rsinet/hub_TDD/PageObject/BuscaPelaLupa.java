package br.com.rsinet.hub_TDD.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class BuscaPelaLupa {

	private static WebElement element = null;

	public static WebElement btn_Lupa(AndroidDriver<WebElement> driver) {

		element = driver.findElement(By.id("com.Advantage.aShopping:id/imageViewSearch"));

		return element;
	}

	public static WebElement txt_pesquisa(AndroidDriver<WebElement> driver) {

		element = driver.findElement(By.id("com.Advantage.aShopping:id/editTextSearch"));

		return element;
	}

	public static WebElement tablet(AndroidDriver<WebElement> driver) {

		element = driver.findElement(By.xpath(
				"//android.widget.RelativeLayout[@content-desc=\"Search\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[2]/android.widget.ImageView"));

		return element;
	}

	public static WebElement AddCarrinho(AndroidDriver<WebElement> driver) {

		element = driver.findElement(By.id("com.Advantage.aShopping:id/buttonProductAddToCart"));

		return element;
	}

}
