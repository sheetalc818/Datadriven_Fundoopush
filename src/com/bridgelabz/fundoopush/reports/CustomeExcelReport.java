package com.bridgelabz.fundoopush.reports;

import org.automationtesting.excelreport.Xl;

public class CustomeExcelReport 
{
	public static void getCustomReport() {
		try {
			Xl.generateReport("Fundoopush_ExcelReport.xlsx" );
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
} 
		
	