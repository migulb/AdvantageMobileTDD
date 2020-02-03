package br.com.rsinet.hub_TDD.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class Cadastro {
	private static WebElement element = null;

	public static WebElement btn_Menu(AndroidDriver<WebElement> driver) {

		element = driver.findElement(By.id("com.Advantage.aShopping:id/imageViewMenu"));

		return element;
	}

	public static WebElement btn_Login(AndroidDriver<WebElement> driver) {

		element = driver.findElement(By.id("com.Advantage.aShopping:id/textViewMenuUser"));

		return element;
	}

	public static WebElement btn_criarConta(AndroidDriver<WebElement> driver) {

		element = driver.findElement(By.id("com.Advantage.aShopping:id/textViewDontHaveAnAccount"));

		return element;
	}

	public static WebElement txt_Usuario(AndroidDriver<WebElement> driver) {

		element = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.EditText\r\n"));

		return element;

	}

	public static WebElement txt_Email(AndroidDriver<WebElement> driver) {

		element = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText"));

		return element;
	}

	public static WebElement txt_senha(AndroidDriver<WebElement> driver) {

		element = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.EditText"));

		return element;
	}

	public static WebElement txt_ConfSenha(AndroidDriver<WebElement> driver) {
		element = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText"));

		return element;
	}

	public static WebElement txt_PrimeiroNome(AndroidDriver<WebElement> driver) {

		element = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.EditText"));

		return element;
	}

	public static WebElement txt_UltimoNome(AndroidDriver<WebElement> driver) {

		element = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.EditText"));

		return element;
	}

	public static WebElement txt_Tel(AndroidDriver<WebElement> driver) {

		element = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText"));

		return element;
	}

	public static WebElement txt_Estado(AndroidDriver<WebElement> driver) {

		element = driver
				.findElement(By.xpath("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextState']/child::*[1]"));

		return element;
	}

	public static WebElement cmbx_Pais(AndroidDriver<WebElement> driver) {

		element = driver.findElement(By.id("com.Advantage.aShopping:id/textViewCountries"));
		return element;

	}

	public static WebElement brasil(AndroidDriver<WebElement> driver) {

		element = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[12]"));

		return element;
	}

	public static WebElement txt_Endereco(AndroidDriver<WebElement> driver) {

		element = driver
				.findElement(By.xpath("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextStreet']/child::*[1]"));

		return element;
	}

	public static WebElement txt_Cidade(AndroidDriver<WebElement> driver) {

		element = driver
				.findElement(By.xpath("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextCity']/child::*[1]"));

		return element;
	}

	public static WebElement txt_Cep(AndroidDriver<WebElement> driver) {

		element = driver
				.findElement(By.xpath("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextZip']/child::*[1]"));

		return element;

	}

	public static WebElement btn_Confirma(AndroidDriver<WebElement> driver) {

		element = driver.findElement(By.id("com.Advantage.aShopping:id/buttonRegister"));

		return element;
	}
}
