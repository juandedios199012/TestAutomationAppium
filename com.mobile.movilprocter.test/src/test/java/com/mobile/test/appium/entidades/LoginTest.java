package com.mobile.test.appium.entidades;

import org.testng.annotations.Test;

import com.mobile.test.appium.page.LoginPage;

public class LoginTest extends BaseTest{
	
	@Test
	public void LoginApp() {
		LoginPage login = new LoginPage(driver);
		login.ingresarEmpresa("company");
		login.ingresarUsuario("user");
		login.ingresarUsuario("123");
		//Assert.assertTrue(calc.validarResultado("5"), "El resultado no es el esperado");
	}

}
