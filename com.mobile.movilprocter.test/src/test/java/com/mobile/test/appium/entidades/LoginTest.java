package com.mobile.test.appium.entidades;

import org.testng.annotations.Test;

import com.mobile.test.appium.page.LoginPage;

public class LoginTest extends BaseTest{
	
	@Test
	public void LoginApp() {
		LoginPage login = new LoginPage(driver);
		login.ingresarEmpresa("digalimenta");
		login.ingresarUsuario("02a05");
		login.ingresarUsuario("1234");
		//Assert.assertTrue(calc.validarResultado("5"), "El resultado no es el esperado");
	}

}
