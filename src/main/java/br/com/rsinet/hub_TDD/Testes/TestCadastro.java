package br.com.rsinet.hub_TDD.Testes;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import br.com.rsinet.hub_TDD.PageObject.Cadastro;
import br.com.rsinet.hub_TDD.Report.Reports;
import br.com.rsinet.hub_TDD.Utilitys.DriverFactory;
import br.com.rsinet.hub_TDD.Utilitys.FuncoesDeAcoes;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class TestCadastro {

	private static AndroidDriver<WebElement> driver;
	private static ExtentReports extent;
	private static ExtentTest logger;
	private static FuncoesDeAcoes funt;
	private static TouchAction actions;

	@BeforeTest
	public void IniciaReport() {

		extent = Reports.setExtent("Cadastro_Report");

	}

	@BeforeMethod
	public void beforeMethod() throws InterruptedException, MalformedURLException {
		logger = Reports.createTest("TesteCadastroUsuario");
		driver = DriverFactory.AberturaAndroid();
		funt = new FuncoesDeAcoes(driver);
		actions = new TouchAction(driver);
	}

	@Test
	public void main() throws MalformedURLException, InterruptedException {

		Cadastro.btn_Menu(driver).click();
		Cadastro.btn_Login(driver).click();
		Cadastro.btn_criarConta(driver).click();
		Cadastro.txt_Usuario(driver).click();
		Cadastro.txt_Usuario(driver).sendKeys("TesteUser212");
		Cadastro.txt_Email(driver).click();
		Cadastro.txt_Email(driver).sendKeys("miguel@email.com");
		funt.apertarProximo();

		Cadastro.txt_senha(driver).click();
		Cadastro.txt_senha(driver).sendKeys("96Miguel.");
		driver.hideKeyboard();

		Cadastro.txt_ConfSenha(driver).click();
		Cadastro.txt_ConfSenha(driver).sendKeys("96Miguel.");
		driver.hideKeyboard();

		Cadastro.txt_PrimeiroNome(driver).click();
		Cadastro.txt_PrimeiroNome(driver).sendKeys("Miguel");

		Cadastro.txt_UltimoNome(driver).click();
		Cadastro.txt_UltimoNome(driver).sendKeys("Bruno");
		funt.apertarProximo();

		Cadastro.txt_Tel(driver).sendKeys("11999999999");
		funt.apertarProximo();

		Cadastro.cmbx_Pais(driver).click();
		funt.arrastarTela();
		funt.arrastarTela();

		Cadastro.brasil(driver).click();
		Cadastro.txt_Estado(driver).click();
		Cadastro.txt_Estado(driver).sendKeys("São Paulo");
		funt.apertarProximo();
		driver.hideKeyboard();

		Cadastro.txt_Endereco(driver).click();
		Cadastro.txt_Endereco(driver).sendKeys("Rua Tal de Tal");
		funt.apertarProximo();

		Cadastro.txt_Cidade(driver).click();
		Cadastro.txt_Cidade(driver).sendKeys("Taboão da Serra");

		Cadastro.txt_Cep(driver).click();
		Cadastro.txt_Cep(driver).sendKeys("097654320");
		driver.hideKeyboard();

		Thread.sleep(3000);
		actions.press(PointOption.point(484, 1606)).moveTo(PointOption.point(496, 487)).release().perform();
		Cadastro.btn_Confirma(driver);

	}

	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException {
		Reports.statusReported(logger, result, driver);
		Reports.quitExtent(extent);
		// driver.quit();
	}
}
