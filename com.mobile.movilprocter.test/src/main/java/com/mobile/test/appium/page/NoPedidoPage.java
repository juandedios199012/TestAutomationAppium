package com.mobile.test.appium.page;

import org.openqa.selenium.support.PageFactory;

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
	
	
	
	
}
