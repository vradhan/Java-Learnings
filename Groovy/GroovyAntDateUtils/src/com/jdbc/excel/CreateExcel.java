package com.jdbc.excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateExcel {
	
	 private static final String FILE_NAME = "C:/vishnu/MyFirstExcel.xlsx";
	 
	 public static void createExcelSheet(){
		 try{
		 XSSFWorkbook workBook = new XSSFWorkbook();
		 XSSFSheet workSheet = workBook.createSheet("Car Names");
		 Object [][] vehicles = {
				 {"Manufacturer","VehicleName", "HatchBack", "Price"},
				 {"Maruti Suzuki","Swift","VDI",700000},
				 {"Hyndai","Grand i10","ASTA",700000},
				 {"Ford","Figo","TITANIUM",650000}
		 };
		 
		 int rowNum = 0;
		 
		 for(Object [] cars : vehicles){
			 Row row = workSheet.createRow(rowNum++);
	         int colNum = 0;
	         for(Object car : cars){
	        	 Cell cell = row.createCell(colNum++);
	        	 if(car instanceof String){
	        		 cell.setCellValue((String)car);
	        	 }
	        	 else if(car instanceof Integer){
	        		 cell.setCellValue((Integer)car);
	        	 }
	         }
		 }
		 FileOutputStream fos = new FileOutputStream(FILE_NAME);
		 workBook.write(fos);
		 workBook.close();
		 
	 }
		 catch(FileNotFoundException fe){
			 fe.printStackTrace();
		 }
		 catch(IOException ie){
			 ie.printStackTrace();
		 }
		 
	 }
	 
	 public static void main(String a[]){
		 createExcelSheet();
	 }
	

}
