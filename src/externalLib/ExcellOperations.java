package externalLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellOperations {
	static XSSFWorkbook xcellWorkbook;
	static XSSFSheet xcellSheet;
	static XSSFRow xcellRow;
	static XSSFCell xcellCol;
	
	public static void setFilePath(String path,String sheetName) throws IOException
	{
		FileInputStream fis = new FileInputStream(path);
		xcellWorkbook = new XSSFWorkbook(fis);
		xcellSheet = xcellWorkbook.getSheet(sheetName);
	}
	
	public static int getMaxRows()
	{
		int maxRows = xcellSheet.getLastRowNum();
		return(maxRows);
	}
	
	public static String getCellValue(int row,int col)
	
	{
		xcellRow = xcellSheet.getRow(row);
		xcellCol = xcellRow.getCell(col);
		String cellValue = xcellCol.getStringCellValue();
		return(cellValue);
	}

}
