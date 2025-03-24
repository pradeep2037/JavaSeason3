package readandwriteexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelBasics {
	public static void main(String[] args) throws IOException {
	FileInputStream fis = new FileInputStream("C:\\Users\\kravm\\OneDrive\\Desktop\\Book1.xlsx");
	XSSFWorkbook workBook = new XSSFWorkbook(fis);
	XSSFSheet workSheet = workBook.getSheet("Sheet1");
//	=====================================================================================================================
	int lastRowNumber = workSheet.getLastRowNum();       //It will give Index of last row. It will count space also. Index starts from zero
	System.out.println("Last Row : "+lastRowNumber);
	
	
	
	int noOfRows = workSheet.getPhysicalNumberOfRows();  //To Count How Many Rows. It will count only if data has it will not count empty rows Index starts from 1
	System.out.println("No Of Rows : " +noOfRows);
//	=====================================================================================================================
	
	XSSFRow row = workSheet.getRow(0);
	short lastCellNumber = row.getLastCellNum();      //Index starts frpm 1. It will give Index of Last cell.
	System.out.println("Last Cell : "+lastCellNumber);
	
	int noOfCells = row.getPhysicalNumberOfCells();	 //It will not count space count only if the data is present.
	System.out.println(noOfCells);
	
	XSSFCell cell = row.getCell(0);  //start from 0
	System.out.println(cell);
	System.out.println(	cell.getCellType());	
	}
}
