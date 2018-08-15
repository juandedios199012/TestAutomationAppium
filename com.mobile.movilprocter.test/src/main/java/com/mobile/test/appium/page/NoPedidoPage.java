package com.mobile.test.appium.page;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class NoPedidoPage {

	AndroidDriver<AndroidElement> driver;
	
	public NoPedidoPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id="cboSeleccionCliente")
	private MobileElement cboSeleccionCliente;
	
	@AndroidFindBy(id="up")
	private MobileElement up;
	
	@AndroidFindBy(id="tviTitulo")
	private MobileElement tviTitulo;
	
	@AndroidFindBy(id="actAgregar")
	private MobileElement actAgregar;
	
	@AndroidFindBy(id="tviMotivo")
	private MobileElement tviMotivo;
	
	@AndroidFindBy(id="text1")
	private MobileElement text1;
	
	@AndroidFindBy(id="button1")
	private MobileElement button1;
	
	@AndroidFindBy(id="actGrabar")
	private MobileElement actGrabar;

	public void clickCboSeleccionCliente() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(cboSeleccionCliente));
			cboSeleccionCliente.click();
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

	public void clickTviTitulo() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(tviTitulo));
			tviTitulo.click();
		} catch (TimeoutException e) {
            throw(e);
		}
	}

	public void clickActAgregar() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(actAgregar));
			actAgregar.click();
		} catch (TimeoutException e) {
            throw(e);
		}
	}

	public void clickTviMotivo() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(tviMotivo));
			tviMotivo.click();
		} catch (TimeoutException e) {
            throw(e);
		}
	}
	public void clickText1() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(text1));
			text1.click();
		} catch (TimeoutException e) {
            throw(e);
		}
	}

	public void clickButton1() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(button1));
			button1.click();
		} catch (TimeoutException e) {
            throw(e);
		}
	}

	public void clickActGrabar() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(actGrabar));
			actGrabar.click();
		} catch (TimeoutException e) {
            throw(e);
		}
	}
	
}
