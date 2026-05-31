package com.tsd.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.tsd.constant.FrameworkConstant;

public final class ExcelUtils {

	private ExcelUtils() {

	}

	public static List<Map<String, String>> getExcelDetails(String sheetname) {

		Map<String, String> map;
		List<Map<String, String>> list = null;

		try (FileInputStream fis = new FileInputStream(FrameworkConstant.getExcelFile());XSSFWorkbook wb = new XSSFWorkbook(fis)) {

			XSSFSheet sheet = wb.getSheet(sheetname);
			DataFormatter format = new DataFormatter();

			int lastrownum = sheet.getLastRowNum();
			int columnnum = sheet.getRow(0).getLastCellNum();

			list = new ArrayList<>();

			for (int i = 1; i <= lastrownum; i++) {
				map = new HashMap<>();
				for (int j = 0; j < columnnum; j++) {
					String key = format.formatCellValue(sheet.getRow(0).getCell(j));
					String value = format.formatCellValue(sheet.getRow(i).getCell(j));
					map.put(key, value);
				}
				list.add(map);

			}

		} catch (IOException e) {
			e.printStackTrace();
		} 
		return list;
	}
}