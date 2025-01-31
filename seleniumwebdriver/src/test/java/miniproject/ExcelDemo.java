package miniproject;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo {
    

	public String[] getData() {
        String[] data = new String[3];
        XSSFWorkbook workbook;
        try {
        	File file  = new File("C:\\Users\\2372547\\eclipse-workspace\\seleniumwebdriver\\testdata\\test_data.xlsx");
            FileInputStream fis = new FileInputStream(file);
            workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheetAt(0);
            data[0] = sheet.getRow(1).getCell(0).toString();
            data[1] = sheet.getRow(1).getCell(1).toString();
            data[2] = sheet.getRow(1).getCell(2).toString();
            
            System.out.println(data[2]);

            // test.pass("Data fetched successfully from Excel: URL - " + data[0] +
            // ", Homepage - " + data[1] +
            // ", Child Title - " + data[2]);

        } catch (Exception e) {
            // test.fail("Failed to fetch data from Excel: " + e.getMessage());
            e.printStackTrace();
        }
        return data;
    }
}