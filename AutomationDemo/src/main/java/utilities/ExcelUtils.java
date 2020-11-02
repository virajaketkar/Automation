package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import executionstatus.EmployeeErr;

import environment.EnvironmentData;

public class ExcelUtils {
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	private static XSSFRow Row;

	// This method is to set the File path and to open the Excel file, Pass Excel
	// Path and Sheetname as Arguments to this method
	public static void setExcelFile(File Path, String SheetName) throws Exception {
		try {
			// Open the Excel file
			FileInputStream ExcelFile = new FileInputStream(Path);
			// Access the required test data sheet
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(SheetName);
			Log.info("Excel sheet opened");
		} catch (Exception e) {
			throw (e);
		}
	}

	// This method is to read the test data from the Excel cell, in this we are
	// passing parameters as Row num and Col num
	public static String getCellData(int RowNum, int ColNum) throws Exception {
		try {
			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
			String CellData = Cell.getStringCellValue();
			return CellData;
		} catch (Exception e) {
			return "";
		}
	}

	// This method is to write in the Excel cell, Row num and Col num are the
	// parameters
	public static void setCellData(String Result, int RowNum, int ColNum) throws Exception {
		try {
			Row = ExcelWSheet.getRow(RowNum);
			Cell = Row.getCell(ColNum, MissingCellPolicy.RETURN_BLANK_AS_NULL);
			if (Cell == null) {
				Cell = Row.createCell(ColNum);
				Cell.setCellValue(Result);
			} else {
				Cell.setCellValue(Result);
			}
			// Constant variables Test Data path and Test Data file name
			FileOutputStream fileOut = new FileOutputStream(Constant.Path_TestData + Constant.File_TestData);
			ExcelWBook.write(fileOut);
			fileOut.flush();
			fileOut.close();
		} catch (Exception e) {
			throw (e);
		}
	}

	public static int getRowContains(String sTestCaseName, int colNum) throws Exception {
		int i;
		try {
			int rowCount = ExcelUtils.getRowUsed();
			for (i = 0; i < rowCount; i++) {
				if (ExcelUtils.getCellData(i, colNum).equalsIgnoreCase(sTestCaseName)) {
					break;
				}
			}
			return i;
		} catch (Exception e) {
			Log.error("Class ExcelUtil | Method getRowContains | Exception desc : " + e.getMessage());
			throw (e);
		}
	}

	public static int getRowUsed() throws Exception {
		try {
			int RowCount = ExcelWSheet.getLastRowNum();
			Log.info("Total number of Row used return as < " + RowCount + " >.");
			return RowCount;
		} catch (Exception e) {
			Log.error("Class ExcelUtil | Method getRowUsed | Exception desc : " + e.getMessage());
			System.out.println(e.getMessage());
			throw (e);
		}

	}
	
	public static Object[][] getExcelData(String file) throws Exception {
		Workbook workbook = WorkbookFactory.create(new File(file));
		Sheet sheet = workbook.getSheetAt(0);
		
		// Create a DataFormatter to format and get each cell's value as String
        DataFormatter dataFormatter = new DataFormatter();
        
        Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
        for(int i = 0; i < sheet.getLastRowNum(); i++) {
        	for(int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
        		if(!dataFormatter.formatCellValue(sheet.getRow(i + 1).getCell(k)).isEmpty()) {
        			data[i][k] = dataFormatter.formatCellValue(sheet.getRow(i + 1).getCell(k));
        		}
        	}
        }
        return data;
	}
	
	public static void createExcelFromArray(String file, List<String> stringArray) throws Exception {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Data sheet");

		int rowNum = 0;

		while(rowNum < stringArray.size()) {
			XSSFRow row = sheet.createRow(rowNum);
			XSSFCell cell = row.createCell(0);
			cell.setCellValue(stringArray.get(rowNum));
			rowNum++;
		}

		try {
			FileOutputStream outputStream = new FileOutputStream(file);
			workbook.write(outputStream);
			workbook.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static List<String> createArrayFromExcel(String file) throws Exception {
		Workbook workbook = WorkbookFactory.create(new File(file));
		Sheet sheet = workbook.getSheetAt(0);

		List<String> dataArray = new ArrayList<String>();

		for(int i = 0; i < sheet.getLastRowNum(); i++) {
			for(int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				dataArray.add(sheet.getRow(i + 1).getCell(k).toString());
			}
		}
		return dataArray;
	}
	
	public static void createExcelFromObjectArray(String file, List<Object> objectArray) throws Exception {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Data sheet");

		int rowNum = 0;

		while(rowNum < objectArray.size()) {
			XSSFRow row = sheet.createRow(rowNum);
			if(objectArray.get(0) instanceof EmployeeErr) {
				XSSFCell cell1 = row.createCell(0);
				XSSFCell cell2 = row.createCell(1);
				XSSFCell cell3 = row.createCell(2);
				XSSFCell cell4 = row.createCell(3);
				XSSFCell cell5 = row.createCell(4);
				cell1.setCellValue(((EmployeeErr) objectArray.get(rowNum)).getEmployeeID());
				cell2.setCellValue(((EmployeeErr) objectArray.get(rowNum)).getCompany());
				cell3.setCellValue(((EmployeeErr) objectArray.get(rowNum)).getPayGroup());
				cell4.setCellValue(((EmployeeErr) objectArray.get(rowNum)).getPayPeriodEndDate());
				cell5.setCellValue(((EmployeeErr) objectArray.get(rowNum)).getPayrunErrorMessage());
				rowNum++;
			} else {
				// Add other object type here
			}
		}

		try {
			FileOutputStream outputStream = new FileOutputStream(file);
			workbook.write(outputStream);
			workbook.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Map<String, EnvironmentData> createEnvironmentDataFromExcel(String file) throws Exception {
		Map<String, EnvironmentData> envMap = new HashMap<String, EnvironmentData>();
		Workbook workbook = WorkbookFactory.create(new File(file));
		Sheet sheet = workbook.getSheetAt(0);

		for(int i = 0; i < sheet.getLastRowNum(); i++) {
			String key = null;
			EnvironmentData env = new EnvironmentData();
			for(int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				String colValue = sheet.getRow(i + 1).getCell(k).toString();
				switch (k) {
					case 0: 
						env.setEnvName(colValue);
						key = colValue;
						break;
					case 1:
						env.setAppUrl(colValue);
						break;
					case 2: 
						env.setQueryUrl(colValue);
						break;
					case 3:
						env.setReportUrl(colValue);
						break;
					case 4:
						env.setDownloadFolder(colValue);
						break;	
					default: 
						break;
				}
			}
			envMap.put(key, env);
		}
		return envMap;
	}
	
	public static void setCellData(String file, int size, int rowNum, int colNum) throws Exception {
		
		try {
			FileInputStream fis = new FileInputStream(file);
			Workbook workbook = WorkbookFactory.create(fis);
			Sheet sheet = workbook.getSheetAt(0);
			
			XSSFRow row = (XSSFRow) sheet.getRow(rowNum);
			XSSFCell cell = row.getCell(colNum);
			if (cell == null) {
				cell = row.createCell(colNum);
			}
			cell.setCellValue(size);
		
			FileOutputStream fos = new FileOutputStream(file);
			workbook.write(fos);
			workbook.close();
			fos.close();
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String getCellData(String file, int rowNum, int colNum) throws Exception {
		
		try {
			Workbook workbook = WorkbookFactory.create(new File(file));
			Sheet sheet = workbook.getSheetAt(0);
			XSSFRow row = (XSSFRow) sheet.getRow(rowNum);
			XSSFCell cell = row.getCell(colNum);

			String cellData = cell.getRawValue();
			
			return cellData;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
@SuppressWarnings("static-access")
public static List<String> getAllRowsBasedOnColumn(File Path,String SheetName, int colNum) throws Exception {
		
		try {
			FileInputStream ExcelFile = new FileInputStream(Path);
			ExcelWBook= new XSSFWorkbook(ExcelFile);
			Sheet sheet = ExcelWBook.getSheet(SheetName);
			
			int lastRowNUm=sheet.getLastRowNum();
			lastRowNUm=lastRowNUm-1;
			List<String> allRowsDataForColNum = new ArrayList<String>();
			for(int i=1;i<lastRowNUm;i++)
			{
				Cell cell=sheet.getRow(i).getCell(colNum);
				
				if (cell==null ) 
				{
					//System.out.println(cell);
					  continue;
				}
				
				/*
				 * if(cell.getCellType() == Cell.CELL_TYPE_BLANK || cell.equals("null")) {
				 * continue; }
				 */
				
				if(cell.getCellType() == Cell.CELL_TYPE_STRING)
				{
					String cellData=cell.getStringCellValue();
					//System.out.println(cellData);
					if(cellData.contains("JHALAS") ||cellData.contains("ABRAHAMP") || cellData.isEmpty())
					{
						continue;
					}
					else
					{
						allRowsDataForColNum.add(cellData);
					}
					
				}
				 
				
			}
			
			return allRowsDataForColNum;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}