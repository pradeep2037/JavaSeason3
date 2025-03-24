package readandwriteexcel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ModifyingCell {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\kravm\\OneDrive\\Desktop\\Book1.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(fis);
		XSSFSheet workSheet = workBook.getSheet("Sheet1");

//		====================================================================================================

		// Modifying Particular Cell
		XSSFRow row = workSheet.getRow(2);
		XSSFCell cell = row.getCell(0);
		cell.setCellValue("Infosys");
		
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\kravm\\OneDrive\\Desktop\\Book1.xlsx");
		workBook.write(fos);

	}
}
