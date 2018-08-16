package com.mobile.test.appium.page;


import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage {
	AndroidDriver<AndroidElement> driver;
	
	public LoginPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id="eteEmpresa")
	private MobileElement eteEmpresa;
	
	@AndroidFindBy(id="eteUsuario")
	private MobileElement eteUsuario;
	
	@AndroidFindBy(id="etePassword")
	private MobileElement etePassword;
	
	@AndroidFindBy(id="loginButIngresar")
	private MobileElement loginButIngresar;
		
	//Resultado Esperado
	@AndroidFindBy(id="action_bar_title")
	private MobileElement lblResultado;
	
	 public void ingresarEmpresa(String empresa){
	        WebDriverWait wait = new WebDriverWait(driver, 10);
	        wait.until(ExpectedConditions.visibilityOf(eteEmpresa));
	        eteEmpresa.sendKeys(empresa);
	 }
	
	 public void ingresarUsuario(String usuario){
	        WebDriverWait wait = new WebDriverWait(driver, 10);
	        wait.until(ExpectedConditions.visibilityOf(eteUsuario));
	        eteUsuario.sendKeys(usuario);
	 }
	 
	 public void ingresarPassword(String password){
	        WebDriverWait wait = new WebDriverWait(driver, 10);
	        wait.until(ExpectedConditions.visibilityOf(etePassword));
	        eteEmpresa.sendKeys(password);
	 }
	 
	 public void clickBotonIngresar(){
	        WebDriverWait wait = new WebDriverWait(driver, 10);
	        wait.until(ExpectedConditions.visibilityOf(loginButIngresar));
	        loginButIngresar.click();
	    }
	/*public boolean validarResultado(String num) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.textToBePresentInElement(lblResultado, num));
			return true;
		} catch (TimeoutException e) {
			return false;
		}
	}*/
}