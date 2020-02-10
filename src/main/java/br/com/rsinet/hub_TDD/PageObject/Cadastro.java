package br.com.rsinet.hub_TDD.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.hub_TDD.Utilitys.AcoesdeTouch;
import io.appium.java_client.android.AndroidDriver;

public class Cadastro {

	private static WebDriverWait wait;
	private static AndroidDriver<WebElement> driver;
	private static WebElement element = null;

	public Cadastro(AndroidDriver<WebElement> driver) {

		this.driver = driver;
		wait = new WebDriverWait(driver, 10);
	}

	private WebElement btn_Menu(AndroidDriver<WebElement> driver) {

		return driver.findElement(By.id("com.Advantage.aShopping:id/imageViewMenu"));
	}

	private WebElement btn_MenuAfter(AndroidDriver<WebElement> driver) {
		element = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("com.Advantage.aShopping:id/imageViewMenu")));

		return element;
	}

	private WebElement btn_Login(AndroidDriver<WebElement> driver) {

		return driver.findElement(By.id("com.Advantage.aShopping:id/textViewMenuUser"));

	}

	private WebElement btn_criarConta(AndroidDriver<WebElement> driver) {

		return driver.findElement(By.id("com.Advantage.aShopping:id/textViewDontHaveAnAccount"));
	}

	private WebElement txt_Usuario(AndroidDriver<WebElement> driver) {

		return driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.EditText\r\n"));

	}

	private WebElement txt_Email(AndroidDriver<WebElement> driver) {

		return driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText"));
	}

	private WebElement txt_senha(AndroidDriver<WebElement> driver) {

		return driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.EditText"));

	}

	private WebElement txt_ConfSenha(AndroidDriver<WebElement> driver) {
		return driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText"));
	}

	private WebElement txt_PrimeiroNome(AndroidDriver<WebElement> driver) {

		return driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.EditText"));
	}

	private WebElement txt_UltimoNome(AndroidDriver<WebElement> driver) {

		return driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.EditText"));
	}

	private WebElement txt_Tel(AndroidDriver<WebElement> driver) {

		return driver.findElement(
				By.xpath("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextPhoneNumber']/child::*[1]"));
	}

	private WebElement txt_Estado(AndroidDriver<WebElement> driver) {

		return driver
				.findElement(By.xpath("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextState']/child::*[1]"));
	}

	private WebElement cmbx_Pais(AndroidDriver<WebElement> driver) {

		return driver.findElement(By.id("com.Advantage.aShopping:id/textViewCountries"));

	}

	private WebElement pais(AndroidDriver<WebElement> driver) {

		return driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[12]"));
	}

	private WebElement txt_Endereco(AndroidDriver<WebElement> driver) {

		return driver
				.findElement(By.xpath("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextStreet']/child::*[1]"));

	}

	private WebElement txt_Cidade(AndroidDriver<WebElement> driver) {

		return driver
				.findElement(By.xpath("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextCity']/child::*[1]"));

	}

	private WebElement txt_Cep(AndroidDriver<WebElement> driver) {

		return driver
				.findElement(By.xpath("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextZip']/child::*[1]"));

	}

	private WebElement btn_Confirma(AndroidDriver<WebElement> driver) {

		return driver.findElement(By.id("com.Advantage.aShopping:id/buttonRegister"));

	}

	public void apertarMenu() {
		btn_Menu(driver).click();
	}

	public void apertarLogin() {
		btn_Login(driver).click();
	}

	public void apertarCriarConta() {
		btn_criarConta(driver).click();
	}

	public void digitarUsuario(String usuario) {
		txt_Usuario(driver).click();
		txt_Usuario(driver).sendKeys(usuario);
	}

	public void digitarEmail(String email) {
		txt_Email(driver).click();
		txt_Email(driver).sendKeys(email);
	}

	public void digitarSenha(String senha) {
		txt_senha(driver).click();
		txt_senha(driver).sendKeys(senha);
	}

	public void confirmaSenha(String confiSenha) {
		txt_ConfSenha(driver).click();
		txt_ConfSenha(driver).sendKeys(confiSenha);
	}

	public void digitarNome(String nome) {
		txt_PrimeiroNome(driver).click();
		txt_PrimeiroNome(driver).sendKeys(nome);
	}

	public void digitarUltimoNome(String ultimoNome) {
		txt_UltimoNome(driver).click();
		txt_UltimoNome(driver).sendKeys(ultimoNome);
		AcoesdeTouch.scrollAndClick(driver, "ZIP");
	}

	public void digitarTelefone(String telefone) {
		txt_Tel(driver).click();
		txt_Tel(driver).sendKeys(telefone);
	}

	public void escolherPais() {
		cmbx_Pais(driver).click();
		AcoesdeTouch.scrollAndClick(driver, "BRAZIL");
	}

	public void digitarEstado(String estado) {
		txt_Estado(driver).click();
		txt_Estado(driver).sendKeys(estado);
	}

	public void digitarEndereco(String endereco) {
		txt_Endereco(driver).click();
		txt_Endereco(driver).sendKeys(endereco);
	}

	public void digitarCidade(String cidade) {
		txt_Cidade(driver).click();
		txt_Cidade(driver).sendKeys(cidade);
	}

	public void digitarCEP(String cep) {
		txt_Cep(driver).click();
		txt_Cep(driver).sendKeys(cep);
		AcoesdeTouch.scrollAndClick(driver, "REGISTER");
	}

	public void confirmaCadastro() {

		btn_Confirma(driver).click();
	}

	public void apertarMenuAposCadastro() {
		btn_MenuAfter(driver);
		btn_Menu(driver).click();

	}
}
