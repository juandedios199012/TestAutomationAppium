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

public class Login {
	AndroidDriver<AndroidElement> driver;
	
	public Login(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id="loginLogoUniflex")
	private MobileElement loginLogoUniflex;
	
	@AndroidFindBy(id="Octeto3")
	private MobileElement editTextOcteto3;
	
	@AndroidFindBy(id="Octeto4")
	private MobileElement editTextOcteto4;
	
	@AndroidFindBy(id="eteEmpresa")
	private MobileElement editTextEmpresa;
	
	@AndroidFindBy(id="eteUsuario")
	private MobileElement editTextUsuario;
	
	@AndroidFindBy(id="etePassword")
	private MobileElement editTextPassword;
	
	@AndroidFindBy(id="btnAceptar")
	private MobileElement btnAceptar;
	
	@AndroidFindBy(id="loginButIngresar")
	private MobileElement btnIngresa;
		
	//Resultado Esperado
	@AndroidFindBy(id="action_bar_title")
	private MobileElement lblResultado;
	
	public void IngresarLogin() {
		loginLogoUniflex.click();
		loginLogoUniflex.click();
		loginLogoUniflex.click();
		loginLogoUniflex.click();
		loginLogoUniflex.click();
		loginLogoUniflex.click();
		loginLogoUniflex.click();
		loginLogoUniflex.click();
		loginLogoUniflex.click();
		loginLogoUniflex.click();
		editTextOcteto3.sendKeys("0");
		editTextOcteto4.sendKeys("31");
		btnAceptar.click();
		editTextEmpresa.sendKeys("SFA");
		editTextUsuario.sendKeys("R1101");
		editTextPassword.sendKeys("123");
		btnIngresa.click();
	}
	public boolean validarResultado(String num) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.textToBePresentInElement(lblResultado, num));
			return true;
		} catch (TimeoutException e) {
			return false;
		}
	}
}