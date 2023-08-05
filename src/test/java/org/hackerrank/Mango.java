package org.hackerrank;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.baseclass.Base2;
import org.testng.annotations.Test;

public class Mango extends Base2 {

	@Test(enabled=false)
	private void tc1() throws IOException {

		File f = new File("E:\\eclipse_workspace\\MvnProject\\ExcelSheets\\BB.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet s = w.getSheet("Sh1");
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row row = s.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				int cellType = cell.getCellType();
				String value = "";
				if (cellType == 1) {
					value = cell.getStringCellValue();
				} else if (DateUtil.isCellDateFormatted(cell)) {
					Date d = cell.getDateCellValue();
					SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yyyy");
					value = sim.format(d);
				} else {
					double n = cell.getNumericCellValue();
					long l= (long)n;
					 value = String.valueOf(l);
				}
				System.out.println(value);
			}
		}
	}
	@Test
	private void tc2() throws IOException {
		
		readExcelAndCreateNewSheet("E:\\Java Interview\\data.xlsx", "Sh4");
		
		createParticularRow(0);
		createParticularCell(0, "Name");
		createParticularCell(1, "PhNo");
		createParticularRow(1);
		createParticularCell(0, "logesh");
		createParticularCell(1, "9629930060");
		writeOutputFile();
	}
	
}
