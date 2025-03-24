package readandwriteexcel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class InsertingDataInEmptyCell {
	
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\kravm\\OneDrive\\Desktop\\Book1.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(fis);
		XSSFSheet workSheet = workBook.getSheet("Sheet1");
		
		//Modifying on existing cell
		workSheet.getRow(2).createCell(2).setCellValue("Bike");
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\kravm\\OneDrive\\Desktop\\Book1.xlsx");
		workBook.write(fos);
		
	}
}
