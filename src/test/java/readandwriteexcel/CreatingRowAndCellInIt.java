package readandwriteexcel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


//creating new row and new cell
public class CreatingRowAndCellInIt {
	
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\kravm\\OneDrive\\Desktop\\Book1.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(fis);
		XSSFSheet workSheet = workBook.getSheet("Sheet1");	
//		=====================================================================================================================
		workSheet.createRow(3).createCell(0).setCellValue("dominar");
		

		FileOutputStream fos = new FileOutputStream("C:\\Users\\kravm\\OneDrive\\Desktop\\Book1.xlsx");
		workBook.write(fos);

	}
}
