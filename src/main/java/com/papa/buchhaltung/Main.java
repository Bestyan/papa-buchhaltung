package com.papa.buchhaltung;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Main {

	/**
	 * Name der Excel Eingabe Datei, die Mamas "komprimierte", noch nicht
	 * aufgedr�selte Buchungss�tze enth�lt
	 */
	private static final String XLSX_NAME = "buchhaltung.xlsx";

	private static final String OUTPUT_NAME1 = "datei1.txt";
	private static final String OUTPUT_NAME2 = "datei2.txt";
	private static final String OUTPUT_NAME3 = "datei3.txt";
	private static final String OUTPUT_NAME4 = "datei4.txt";
	private static final String OUTPUT_NAME5 = "datei5.txt";
	private static final String OUTPUT_NAME6 = "datei6.txt";
	private static final String OUTPUT_NAME7 = "datei7.txt";
	private static final String OUTPUT_NAME8 = "datei8.txt";
	private static final String OUTPUT_NAME9 = "datei9.txt";
	private static final String OUTPUT_NAME10 = "datei10.txt";

	private static final String LOGGER_NAME = "logger";
	private static final String LOGFILE = "log.txt";
	
	private static final Logger logger = Logger.getLogger(LOGGER_NAME);

	public static void main(String[] args) {

		initLogger();
		datenVerarbeiten();
		
		logger.info("hi");

	}

	/**
	 * initialisiert den Logger
	 */
	private static void initLogger() {
		Logger logger = Logger.getLogger(LOGGER_NAME);
		
		try {
			
			FileHandler fileHandler = new FileHandler(LOGFILE);
			logger.addHandler(fileHandler);
			SimpleFormatter formatter = new SimpleFormatter();  
			fileHandler.setFormatter(formatter);
			
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}  

	}

	/**
	 * liest eine Excel-Datei (Name siehe XLSX_NAME) ein und verarbeitet ihren Inhalt
	 */
	private static void datenVerarbeiten() {
		
		try {
			// xlsx Arbeitsmappe �ffnen. Falls es sich um eine xls Datei handeln sollte,
			// HSSFWorkbook verwenden!
			Workbook arbeitsmappe = new XSSFWorkbook(Main.class.getResourceAsStream(XLSX_NAME));
			// Tabelle an erster Position
			Sheet tabelle = arbeitsmappe.getSheetAt(0);

			// Tabellendaten auswerten
		} catch (FileNotFoundException e) {

			// TODO ins logfile schreiben
			e.printStackTrace();

		} catch (IOException e) {

			// TODO ins logfile schreiben
			e.printStackTrace();

		}

	}

}
