package br.com.rsinet.hub_TDD.Testes;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import br.com.rsinet.hub_TDD.Report.Reports;
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
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.BROWSER_NAME, "");
		cap.setCapability("deviceName", "motorola one action");
		cap.setCapability("udid", "emulator-5554");
		cap.setCapability("platformVersion", "9");
		cap.setCapability("platformName", "Android");
		cap.setCapability("appPackage", "com.Advantage.aShopping");
		cap.setCapability("appActivity", "com.Advantage.aShopping.SplashActivity");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		Thread.sleep(2000);
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
