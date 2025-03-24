package readandwriteexcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelFile {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\kravm\\OneDrive\\Desktop\\Book1.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(fis);
		XSSFSheet workSheet = workBook.getSheet("Sheet1");
		
		
		for(int i=0;i<=workSheet.getLastRowNum();i++) {
			if(workSheet.getRow(i)!=null) {
				XSSFRow row = workSheet.getRow(i);
				for(int j=0;j<row.getLastCellNum();j++) {
					if(row.getCell(j)!=null) {
						XSSFCell cell = row.getCell(j);
						if(cell.getCellType()==CellType.STRING) {
							System.out.println(cell+" is a string ");
						}
						else if(cell.getCellType()==CellType.NUMERIC)
						{
							System.out.println(cell+" is a Number ");
						}
						else if(cell.getCellType()==CellType.BOOLEAN) {
							System.out.println(cell+" is a Boolean ");
						}
					}
				}
			}
		}
	}
}
