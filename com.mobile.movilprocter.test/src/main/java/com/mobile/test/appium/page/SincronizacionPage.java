package com.mobile.test.appium.page;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SincronizacionPage {
AndroidDriver<AndroidElement> driver;
	
	public SincronizacionPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id="ibuSincronizacion")
	private MobileElement ibuSincronizacion;
	
	@AndroidFindBy(id="up")
	private MobileElement up;
	
	@AndroidFindBy(id="tviTitulo")
	private MobileElement tviTitulo;
	
	@AndroidFindBy(id="lblResultado")
	private MobileElement lblResultado;
	
	public void clickIbuSincronizacion() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(ibuSincronizacion));
			ibuSincronizacion.click();
		} catch (TimeoutException e) {
            throw(e);
		}
	}

	public void clickUp() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(up));
			up.click();
		} catch (TimeoutException e) {
            throw(e);
		}
	}
	public void clicktviTitulo() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(tviTitulo));
			tviTitulo.click();
		} catch (TimeoutException e) {
            throw(e);
		}
	}
	
	public boolean validarResultado(String resultado) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 180);
			wait.until(ExpectedConditions.textToBePresentInElement(lblResultado, resultado));
			return true;
		} catch (TimeoutException e) {
			return false;
		}
	}
}
