package br.com.rsinet.hub_TDD.Testes;

import java.io.IOException;
import java.net.MalformedURLException;

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
import br.com.rsinet.hub_TDD.ScreenObject.BuscaPelaLupa;
import br.com.rsinet.hub_TDD.Utilitys.DriverFactory;
import io.appium.java_client.android.AndroidDriver;

public class BuscaLupa {

	private static AndroidDriver<WebElement> driver;
	private static ExtentReports extent;
	private static ExtentTest logger;
	private static BuscaPelaLupa busca;

	@BeforeTest
	public void IniciaReport() {

		extent = Reports.setExtent("BuscaLupa_Report");
	}

	@BeforeMethod
	public void inicializaTest() throws InterruptedException, MalformedURLException {
		driver = DriverFactory.AberturaAndroid();
		busca = new BuscaPelaLupa(driver);
	}

	@Test
	public void BuscaPelaLupa1() throws MalformedURLException, InterruptedException {

		logger = Reports.createTest("BuscaPelaLupa");
		busca.digitaBusca("HP ELITE X2 1011 G1");
		busca.clicaLupa();
		busca.clicaTablet();
		String tablet = driver.findElement(By.id("com.Advantage.aShopping:id/textViewProductName")).getText();
		Assert.assertTrue(tablet.contains("HP ELITE X2 1011 G1"));
	}

	@Test
	public void BuscaPelaLupa2() throws MalformedURLException, InterruptedException {

		logger = Reports.createTest("BuscaPelaLupaNegativo");
		busca.digitaBusca("mesa");
		busca.clicaLupa();
		String erro = driver.findElement(By.id("com.Advantage.aShopping:id/textViewNoProductsToShow")).getText();
		Assert.assertTrue(erro.contains("No results for \"mesa\""));

	}

	@AfterMethod
	public void finalizaTest(ITestResult result) throws IOException {
		Reports.statusReported(logger, result, driver);
		DriverFactory.fecharDriver();
	}

	@AfterTest
	public void finalizaReport() {
		Reports.quitExtent(extent);

	}

}
