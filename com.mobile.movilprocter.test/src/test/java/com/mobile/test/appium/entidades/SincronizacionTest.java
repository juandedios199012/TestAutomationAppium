package com.mobile.test.appium.entidades;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.mobile.test.appium.page.SincronizacionPage;

public class SincronizacionTest extends BaseTest {

	@Test
	public void sincronizar() {
		SincronizacionPage sincronizacionPage = new SincronizacionPage(driver);
		sincronizacionPage.clickIbuSincronizacion();
		sincronizacionPage.clickUp();
		sincronizacionPage.clicktviTitulo();
		
		Assert.assertTrue(sincronizacionPage.validarResultado("Sincronización exitosa."), "El resultado no es el esperado");
	}
}
