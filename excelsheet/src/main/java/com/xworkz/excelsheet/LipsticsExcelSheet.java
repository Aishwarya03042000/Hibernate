package com.xworkz.excelsheet;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LipsticsExcelSheet {

	public static void main(String[] args) throws Exception {

		XSSFWorkbook workbook = new XSSFWorkbook();

		XSSFSheet spreadsheet = workbook.createSheet(" Lipstics Sheet ");

		XSSFRow row;

		Map<String, Object[]> lipsticInfo = new TreeMap<String, Object[]>();
		lipsticInfo.put("1", new Object[] { "Id", "Brand", "Shade", "ShadeNo", "Price" });

		lipsticInfo.put("2", new Object[] { "1", "Mac", "Nude", "321", "1050" });

		lipsticInfo.put("3", new Object[] { "2", "Loreal Paris", "Rouge", "103", "850" });

		lipsticInfo.put("4", new Object[] { "3", "Lakme", "Pink", "651", "800" });

		lipsticInfo.put("5", new Object[] { "4", "Nykaa", "Bright Red", "45", "600" });

		lipsticInfo.put("6", new Object[] { "5", "Swiss Beauty", "Mulberry", "91", "300" });

		Set<String> keyid = lipsticInfo.keySet();
		int rowid = 0;

		for (String key : keyid) {
			row = spreadsheet.createRow(rowid++);
			Object[] objectArr = lipsticInfo.get(key);
			int cellid = 0;

			for (Object obj : objectArr) {
				Cell cell = row.createCell(cellid++);
				cell.setCellValue((String) obj);
			}
		}

		FileOutputStream out = new FileOutputStream(new File("D:\\hibernate\\lipsticks.xlsx"));

		workbook.write(out);
		out.close();
		System.out.println("Writesheet.xlsx written successfully");
	}

}