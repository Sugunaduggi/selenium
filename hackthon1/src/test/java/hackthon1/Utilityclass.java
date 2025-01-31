package hackthon1;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.Arrays;

public class Utilityclass {
	public static String[] getData() {
		String[] data = new String[3];
	    XSSFWorkbook workbook;
	    try {
	        File file = new File("testdata/nbook.xlsx");
	        FileInputStream fis = new FileInputStream(file);
	        workbook = new XSSFWorkbook(fis);
	        XSSFSheet sheet = workbook.getSheetAt(0);
	    //  Print out the entire row for debugging purposes
	        System.out.println("Row data: ");
	        for (Cell cell : sheet.getRow(1)) {
	            System.out.print("[" + cell.toString().trim() + "] ");
	        }
	        System.out.println();
	        data[0] = sheet.getRow(1).getCell(0).toString().trim();
	        data[1] = sheet.getRow(1).getCell(1).toString().trim();
	        data[2] = sheet.getRow(1).getCell(2).toString().trim();
	        
	        //System.out.println("Excel Data: " + Arrays.toString(data));
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return data;
    }
}