package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This is a generic class for data driven testing
 * @author Sanjana
 *
 */

public class FileLib {
	/**
	 *  This is a generic method for reading data from property file
	 * @param Key
	 * @return string
	 * @throws IOException
	 */
	public String getPropertyData(String Key) throws IOException
	{
		FileInputStream fis= new FileInputStream("./data/commondata.property");
		Properties p= new Properties();
		
		p.load(fis);
		String data = p.getProperty(Key);
	    return data;
	}
	
	/**
	 * This is a generic method for reading data from Excel file
	 * @param sheetName
	 * @param row
	 * @param cell
	 * @return
	 * @throws IOException 
	 * @throws EncryptedDocumentException 
	 */


public String getExcelData(String sheetName, int row, int cell) throws EncryptedDocumentException, IOException
{
	FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
	Workbook wb= WorkbookFactory.create(fis);
	String data = wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
	return data;
}


/**
 * This is a generic method for writting data to the Excel file
 * @param sheetName
 * @param row
 * @param cell
 * @param data
 * @throws EncryptedDocumentException
 * @throws IOException
 */
public void setExcelData(String sheetName, int row, int cell, String data) throws EncryptedDocumentException, IOException
{
	FileInputStream fis= new FileInputStream("./data/testscript.xlsx");
			Workbook wb= WorkbookFactory.create(fis);
	 wb.getSheet(sheetName).getRow(row).getCell(cell).setCellValue(data);
	 
	 FileOutputStream fout= new FileOutputStream("./data/testscript.xlsx");
	 wb.write(fout);
	 wb.close();
}
	
}

