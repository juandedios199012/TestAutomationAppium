package com.mobile.test.appium.entidades;


import org.testng.annotations.Test;

import com.mobile.test.appium.page.LoginPage;
import com.mobile.test.appium.page.NoPedidoPage;

public class NoPedidoTest extends BaseTest{

	@Test
	public void registrarNoPedido() {
		NoPedidoPage nopedidopage = new NoPedidoPage(driver);
		nopedidopage.clickCboSeleccionCliente();
		nopedidopage.clickUp();
		nopedidopage.clickTviTitulo();
		nopedidopage.clickActAgregar();
		nopedidopage.clickTviMotivo();
		nopedidopage.clickText1();
		nopedidopage.clickButton1();
		nopedidopage.clickActGrabar();
		
		//Assert.assertTrue(calc.validarResultado("5"), "El resultado no es el esperado");
	}
}
