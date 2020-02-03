package br.com.rsinet.hub_TDD.Utilitys;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Utility {

	public void scrollDown() {
		Dimension dimension = MobileFactory.getDriver().manage().window().getSize();

		Double scrollHeightStart = dimension.getHeight() * 0.5;
		int scrollStart = scrollHeightStart.intValue();

		Double scrollHeightEnd = dimension.getHeight() * 0.2;
		int scrollEnd = scrollHeightEnd.intValue();

		new TouchAction((PerformsTouchActions) MobileFactory.getDriver()).press(PointOption.point(0, scrollStart))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(0, scrollEnd))
				.release().perform();
	}

	public WebElement getItemViews() {
		return MobileFactory.getDriver().findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\\\"Home Page\\\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.TextView"));
	}

	public List<WebElement> getItemWebView() {
		return MobileFactory.getDriver().findElements(By.xpath(
				"//android.view.ViewGroup[@content-desc=\\\"Home Page\\\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.TextView\\r\\n"));
	}

	public void scrollTillWebView() throws InterruptedException {
		getItemViews().sendKeys("96Miguel.");

		while (getItemWebView().size() == 0) {
			scrollDown();
		}

		if (getItemWebView().size() > 0) {
			getItemWebView().get(0).sendKeys("96Miguel.");
		}
		Thread.sleep(4000);

	}
}
