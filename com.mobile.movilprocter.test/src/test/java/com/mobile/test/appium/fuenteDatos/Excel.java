package com.mobile.test.appium.fuenteDatos;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFShapeFactory;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class Excel {

	
	public static String[][] leerExcel(String rutaArchivo) {
		String[][] lista = null;
		int i = 0;
		try {
			//TODO,excel xls formato 97
			FileInputStream archivo=new FileInputStream(rutaArchivo);
			HSSFWorkbook archivoExcel=new HSSFWorkbook(archivo);
			HSSFSheet hojaExcel=archivoExcel.getSheetAt(0);
			Iterator<Row>filas= hojaExcel.iterator();
			filas.next();
			lista=new String[hojaExcel.getLastRowNum()][];
			while(filas.hasNext()){
				Row filaActual=filas.next();
				Iterator<Cell> celdas=filaActual.cellIterator();
				lista[i]=new String[filaActual.getLastCellNum()];
				int j=0;
				while(celdas.hasNext()){
					Cell celdaActual=celdas.next();
					lista[i][j]=celdaActual.getStringCellValue();
					j++;
				}
				i++;
			}
			archivoExcel.close();
			archivo.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return lista;
	}
}
