package page;

import org.junit.Test;
import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class Script extends Config {
	
@Test
public void Login() throws InterruptedException{
//(new TouchAction(_driverANDROID)).press(PointOption.point(405, 646)).moveTo(PointOption.point(405, 462)).release().perform();
//	Thread.sleep(2000);
	MobileElement el1 = (MobileElement) _driverANDROID.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]");
	el1.sendKeys("louis.perso@yopmail.com");
	Thread.sleep(2000);
	MobileElement el2 = (MobileElement) _driverANDROID.findElementById("login-input-pswd");
	el2.sendKeys("azerty11");
	Thread.sleep(2000);
	MobileElement el3 = (MobileElement) _driverANDROID.findElementByAccessibilityId("Connexion ");
	el3.click();
	Thread.sleep(8000);
	MobileElement el4 = (MobileElement) _driverANDROID.findElementByAccessibilityId("1 ");
	el4.click();
	Thread.sleep(2000);
	MobileElement el5 = (MobileElement) _driverANDROID.findElementByAccessibilityId("Moins de 100km ");
	el5.click();
	Thread.sleep(2000);
	MobileElement el12 = (MobileElement) _driverANDROID.findElementById("search-form-btn-categorie-voiture");
	el12.click();
	Thread.sleep(2000);
	MobileElement el16 = (MobileElement) _driverANDROID.findElementByAccessibilityId("La baume");
	el16.click();
	Thread.sleep(4000);
	(new TouchAction(_driverANDROID)).press(PointOption.point(798, 643)).moveTo(PointOption.point(804, 414)).release().perform();
	Thread.sleep(2000);
	MobileElement el29 = (MobileElement) _driverANDROID.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[7]");
	el29.click();
	Thread.sleep(2000);
	(new TouchAction(_driverANDROID)).press(PointOption.point(798, 643)).moveTo(PointOption.point(804, 414)).release().perform();
	Thread.sleep(5000);
	//date de debut
	TouchAction touchAction78 = new TouchAction(_driverANDROID);
	touchAction78.tap(PointOption.point(842, 1355)).perform();
	Thread.sleep(2000);
	TouchAction touchAction90 = new TouchAction(_driverANDROID);
	touchAction90.tap(PointOption.point(767, 1568)).perform();
	Thread.sleep(2000);
	//date de fin
	TouchAction touchAction84 = new TouchAction(_driverANDROID);
	touchAction84.tap(PointOption.point(984, 1568)).perform();
	Thread.sleep(2000);
	TouchAction touchAction30 = new TouchAction(_driverANDROID);
	touchAction30.tap(PointOption.point(767, 1568)).perform();
	Thread.sleep(2000);
	MobileElement el17 = (MobileElement) _driverANDROID.findElementByAccessibilityId("Lancer la recherche ");
	el17.click();
	Thread.sleep(3000);
	MobileElement el49 = (MobileElement) _driverANDROID.findElementByAccessibilityId("Réserver ");
	el49.click();
	Thread.sleep(3000);
	(new TouchAction(_driverANDROID)).press(PointOption.point(888, 867)).moveTo(PointOption.point(897, 542)).release().perform();
	Thread.sleep(2000);
	//first tap
	TouchAction touchAction56 = new TouchAction(_driverANDROID);
	touchAction56.tap(PointOption.point(108, 1301)).perform();
	Thread.sleep(2000);
	//second tap
	TouchAction touchAction96 = new TouchAction(_driverANDROID);
	touchAction96.tap(PointOption.point(104, 1476)).perform();
	Thread.sleep(2000);
	//third tap
	TouchAction touchAction76 = new TouchAction(_driverANDROID);
	touchAction76.tap(PointOption.point(751, 1680)).perform();
	Thread.sleep(5000);
	(new TouchAction(_driverANDROID)).press(PointOption.point(888, 867)).moveTo(PointOption.point(897, 542)).release().perform();
	Thread.sleep(2000);
	TouchAction touchAction760 = new TouchAction(_driverANDROID);
	touchAction760.tap(PointOption.point(509, 1514)).perform();
	Thread.sleep(5000);
//TouchAction touchAction1 = new TouchAction(__driverANDROIDANDROID);
//touchAction1.tap(PointOption.point(273, 1396)).perform();
//MobileElement el2 = (MobileElement) __driverANDROIDANDROID.findElementById("login-input-pswd");
//el1.sendKeys("maher");
//TouchAction touchAction11 = new TouchAction(__driverANDROIDANDROID);
//touchAction11.tap(PointOption.point(530, 1614)).perform();
//Thread.sleep(2000);
////__driverANDROIDANDROID.findElement(By.id("login-input-pswd")).sendKeys("azert11");	

}

}
