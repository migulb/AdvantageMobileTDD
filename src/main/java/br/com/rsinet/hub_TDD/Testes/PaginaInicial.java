package br.com.rsinet.hub_TDD.Testes;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import br.com.rsinet.hub_TDD.PageObject.PaginaInicialPage;
import br.com.rsinet.hub_TDD.Report.Reports;
import br.com.rsinet.hub_TDD.Utilitys.DriverFactory;
import br.com.rsinet.hub_TDD.Utilitys.MassaDados;
import io.appium.java_client.android.AndroidDriver;

public class PaginaInicial {

	private static AndroidDriver driver;
	private static ExtentReports extent;
	private static ExtentTest logger;
	private static PaginaInicialPage prod;
	private static MassaDados dados;

	@BeforeTest
	public void IniciaReport() {
		extent = Reports.setExtent("BuscaHome");

	}

	@BeforeMethod
	public void beforeMethod() throws Exception {
		driver = DriverFactory.AberturaAndroid();
		dados = new MassaDados(driver);
		prod = new PaginaInicialPage(driver);
	}

	@Test
	public void PaginaInicial1() {
		logger = Reports.createTest("TestHomePage");
		prod.clicaProduto();
		prod.escolherFone();

		String prods = driver.findElement(By.id("com.Advantage.aShopping:id/textViewProductName")).getText();
		Assert.assertTrue(prods.contains("HP H2310 IN-EAR"));
	}

	@Test
	public void PaginaInicial2() throws Exception {
		logger = Reports.createTest("TestHomePageNegativo");
		prod.clicarMenu();
		prod.clicarLogin();
		prod.digitarLogin(dados.usuario());
		prod.digitarSenha(dados.senha());
		prod.clicarELogar();
		prod.clicaProduto();
		prod.escolherFone();
		prod.quantidade();
		prod.digitarQuantidade(dados.falhaBuscaHome());
		prod.clicaAplicar();
		prod.adicionaCarrinho();
		prod.entrarCarrinho();

		String descr = driver.findElement(By.id("com.Advantage.aShopping:id/textViewCartQuantity")).getText();
		Assert.assertNotEquals(descr, dados.falhaBuscaHome());

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
