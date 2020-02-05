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

import br.com.rsinet.hub_TDD.PageObject.BuscaPelaLupa;
import br.com.rsinet.hub_TDD.Report.Reports;
import br.com.rsinet.hub_TDD.Utilitys.DriverFactory;
import io.appium.java_client.android.AndroidDriver;

public class BuscaLupa {

	private static AndroidDriver<WebElement> driver;
	private static ExtentReports extent;
	private static ExtentTest logger;

	@BeforeTest
	public void IniciaReport() {

		extent = Reports.setExtent("BuscaLupa_Report");

	}

	@BeforeMethod
	public void beforeMethod() throws InterruptedException, MalformedURLException {
		driver = DriverFactory.AberturaAndroid();
	}

	@Test
	public void BuscaPelaLupa1() throws MalformedURLException, InterruptedException {

		logger = Reports.createTest("BuscaPelaLupa");
		BuscaPelaLupa.txt_pesquisa(driver).sendKeys("tablet");
		BuscaPelaLupa.btn_Lupa(driver).click();
		BuscaPelaLupa.tablet(driver).click();
		BuscaPelaLupa.AddCarrinho(driver).click();

	}

	@Test
	public void BuscaPelaLupa2() throws MalformedURLException, InterruptedException {

		logger = Reports.createTest("BuscaPelaLupaNegativo");
		BuscaPelaLupa.txt_pesquisa(driver).sendKeys("mesa");
		BuscaPelaLupa.btn_Lupa(driver).click();

	}

	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException {
		Reports.statusReported(logger, result, driver);
		Reports.quitExtent(extent);
		DriverFactory.fecharDriver();

	}

}
