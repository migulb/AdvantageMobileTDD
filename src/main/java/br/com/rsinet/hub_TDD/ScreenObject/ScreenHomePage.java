package br.com.rsinet.hub_TDD.ScreenObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class ScreenHomePage {

	private static AndroidDriver<WebElement> driver;

	public ScreenHomePage(AndroidDriver<WebElement> driver) {

		this.driver = driver;
	}

	private WebElement produto() {

		return driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.TextView"));
	}

	private WebElement fones() {
		return driver.findElement(By.xpath(
				"//android.widget.RelativeLayout[@content-desc=\"Headphones\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[3]/android.widget.ImageView"));
	}

	private WebElement btn_menu() {
		return driver.findElement(By.id("com.Advantage.aShopping:id/imageViewMenu"));
	}

	private WebElement btn_login() {
		return driver.findElement(By.id("com.Advantage.aShopping:id/textViewMenuUser"));
	}

	private WebElement txt_user() {
		return driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[3]/android.widget.EditText"));
	}

	private WebElement txt_senha() {
		return driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[4]/android.widget.EditText"));
	}

	private WebElement btn_logar() {
		return driver.findElement(By.id("com.Advantage.aShopping:id/buttonLogin"));
	}

	private WebElement quantidadeProd() {
		return driver.findElement(By.id("com.Advantage.aShopping:id/textViewProductQuantity"));
	}

	private WebElement txt_quantidade() {
		return driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText"));

	}

	private WebElement btn_Apply() {
		return driver.findElement(By.id("com.Advantage.aShopping:id/textViewApply"));
	}

	private WebElement btn_Cart() {
		return driver.findElement(By.id("com.Advantage.aShopping:id/buttonProductAddToCart"));
	}

	private WebElement btn_Carrinho() {
		return driver.findElement(By.id("com.Advantage.aShopping:id/imageViewCart"));
	}

	public void clicaProduto() {
		produto().click();
	}

	public void escolherFone() {
		fones().click();
	}

	public void clicarMenu() {
		btn_menu().click();
	}

	public void clicarLogin() {
		btn_login().click();
	}

	public void digitarLogin(String login) {
		txt_user().sendKeys(login);
	}

	public void digitarSenha(String senha) {
		txt_senha().sendKeys(senha);
	}

	public void clicarELogar() {
		btn_logar().click();
	}

	public void quantidade() {
		quantidadeProd().click();
	}

	public void digitarQuantidade(String num) throws InterruptedException {

		txt_quantidade().click();
		txt_quantidade().sendKeys(num);
	}

	public void clicaAplicar() {
		btn_Apply().click();
	}

	public void adicionaCarrinho() {
		btn_Cart().click();
	}

	public void entrarCarrinho() {
		btn_Carrinho().click();
	}

}
