package br.com.rsinet.hub_TDD.Testes;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import br.com.rsinet.hub_TDD.Report.Reports;
import br.com.rsinet.hub_TDD.ScreenObject.Cadastro;
import br.com.rsinet.hub_TDD.Utilitys.AcoesdeTouch;
import br.com.rsinet.hub_TDD.Utilitys.DriverFactory;
import br.com.rsinet.hub_TDD.Utilitys.MassaDados;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class TestCadastro {

	private static AndroidDriver<WebElement> driver;
	private static ExtentReports extent;
	private static ExtentTest logger;
	private static AcoesdeTouch funt;
	private static TouchAction actions;
	private static MassaDados dados;
	private static Cadastro cad;

	@BeforeTest
	public void IniciaReport() {

		extent = Reports.setExtent("TestGeral");
	}

	@BeforeMethod
	public void beforeMethod() throws Exception {
		driver = DriverFactory.AberturaAndroid();
		funt = new AcoesdeTouch(driver);
		dados = new MassaDados(driver);
		actions = new TouchAction(driver);
		cad = new Cadastro(driver);
	}

	@Test
	public void Cadastro1() throws Exception {
		logger = Reports.createTest("TesteSucessoCadastroUsuario");

		cad.apertarMenu();
		cad.apertarLogin();
		cad.apertarCriarConta();
		cad.digitarUsuario(dados.usuario());
		cad.digitarEmail(dados.email());
		cad.digitarSenha(dados.senha());
		cad.confirmaSenha(dados.ConfirmaSenha());
		cad.digitarNome(dados.PrimeiroNome());
		cad.digitarUltimoNome(dados.UltimoNome());

		cad.digitarTelefone(dados.Telefone());

		cad.escolherPais();

		cad.digitarEstado(dados.Estado());

		cad.digitarEndereco(dados.Endereco());
		cad.digitarCidade(dados.Cidade());
		cad.digitarCEP(dados.CEP());

		cad.apertarMenuAposCadastro();

		String cadastro = driver.findElement(By.id("com.Advantage.aShopping:id/textViewMenuUser")).getText();

		Assert.assertTrue(cadastro.contains(dados.usuario()));

	}

	@Test
	public void Cadastro2() throws Exception {
		logger = Reports.createTest("TesteNegativoCadastroUsuario");

		cad.apertarMenu();
		cad.apertarLogin();
		cad.apertarCriarConta();
		cad.digitarUsuario(dados.usuario());
		cad.digitarEmail(dados.email());
		cad.digitarSenha(dados.senha());
		cad.confirmaSenha(dados.ConfirmaSenha());
		cad.digitarNome(dados.PrimeiroNome());
		cad.digitarUltimoNome(dados.UltimoNome());

		AcoesdeTouch.scrollAndClick(driver, "ZIP");
		cad.digitarTelefone(dados.Telefone());

		cad.escolherPais();

		cad.digitarEstado(dados.Estado());

		cad.digitarEndereco(dados.Endereco());
		cad.digitarCidade(dados.Cidade());
		cad.digitarCEP(dados.CEP());

		cad.apertarMenuAposCadastro();
		String login = driver.findElement(By.id("com.Advantage.aShopping:id/textViewMenuUser")).getText();
		Assert.assertTrue(login.contains("LOGIN"));
	}

	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException {
		Reports.statusReported(logger, result, driver);
		DriverFactory.fecharDriver();
	}

	@AfterTest
	public void finalizaReport() {
		Reports.quitExtent(extent);

	}
}
