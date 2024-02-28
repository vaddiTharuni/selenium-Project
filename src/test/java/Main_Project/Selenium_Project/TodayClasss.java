package Main_Project.Selenium_Project;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TodayClasss {
@Test
	public void readExcel() throws InvalidFormatException, IOException {
		String path ="E:\\demo.xlsx";
		File file = new File(path);
		XSSFWorkbook workbook = new  XSSFWorkbook(file);
		XSSFSheet sheet= workbook.getSheet("Sheet1");
		
		for(int i=0;i<=sheet.getFirstRowNum();i++) {
			XSSFRow row =sheet.getRow(i);
			for(int j=0;j<row.getLastCellNum();j++) {
				XSSFCell cell= row.getCell(j);
				System.out.println(cell);
				System.out.println("l");
			}
			System.out.println();
		}
		
		
	}
}
