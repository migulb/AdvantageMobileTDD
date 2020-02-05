package br.com.rsinet.hub_TDD.Testes;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import br.com.rsinet.hub_TDD.Report.Reports;
import br.com.rsinet.hub_TDD.Utilitys.DriverFactory;
import io.appium.java_client.android.AndroidDriver;

public class PaginaInicial {

	private static AndroidDriver driver;
	private static ExtentReports extent;
	private static ExtentTest logger;

	@BeforeTest
	public void IniciaReport() {
		extent = Reports.setExtent("Cadastro_Report");

	}

	@BeforeMethod
	public void beforeMethod() throws InterruptedException, MalformedURLException {
		logger = Reports.createTest("TesteCadastroUsuario");
		driver = DriverFactory.AberturaAndroid();
	}

	@Test
	public void main() {
		WebElement prod = driver.findElement(By.id("com.Advantage.aShopping:id/textViewCategory"));
		prod.click();
		WebElement fone = driver.findElement(By.id("com.Advantage.aShopping:id/RelativeLayoutProductControl"));
		fone.click();
		WebElement cart = driver.findElement(By.id("com.Advantage.aShopping:id/buttonProductAddToCart"));
		cart.click();

	}

	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException {
		Reports.statusReported(logger, result, driver);
		Reports.quitExtent(extent);
	}
}
