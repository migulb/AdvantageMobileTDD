package br.com.rsinet.hub_TDD.ScreenObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class BuscaPelaLupa {

	private static AndroidDriver<WebElement> driver;
	private static WebElement element = null;

	public BuscaPelaLupa(AndroidDriver<WebElement> driver) {
		this.driver = driver;
	}

	private WebElement btn_Lupa(AndroidDriver<WebElement> driver) {

		return driver.findElement(By.id("com.Advantage.aShopping:id/imageViewSearch"));

	}

	private WebElement txt_pesquisa(AndroidDriver<WebElement> driver) {

		return driver.findElement(By.id("com.Advantage.aShopping:id/editTextSearch"));

	}

	private WebElement tablet(AndroidDriver<WebElement> driver) {
		return driver.findElement(By.id("com.Advantage.aShopping:id/imageViewProduct"));

	}

	private WebElement AddCarrinho(AndroidDriver<WebElement> driver) {

		return driver.findElement(By.id("com.Advantage.aShopping:id/buttonProductAddToCart"));

	}

	public void clicaLupa() {
		btn_Lupa(driver).click();
	}

	public void digitaBusca(String busca) {
		txt_pesquisa(driver).sendKeys(busca);
	}

	public void clicaTablet() {
		tablet(driver).click();
	}

	public void AdicionaCarrinho() {
		AddCarrinho(driver).click();
	}

}
