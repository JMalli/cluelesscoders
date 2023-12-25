package zyx;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExlSheetHandling {
	public static void writeexlsheet()  {
		XSSFWorkbook wbook = new XSSFWorkbook();
		XSSFSheet wsheet = wbook.createSheet("sheet1");
		
		int rowNum=0;
				 
		            for(int i=1;i<=10;i++) {
					Row row = wsheet.createRow(rowNum++);
			
		int colNum=0;
					  
		               for(int j=1;j<=10;j++) {
						
						Cell cell=row.createCell(colNum++);
						
						cell.setCellValue("Row" +i+ "Column" +j);
					}
						
		
	}
	
	
	String path = System.getProperty("user.dir")+"/src/test/resources/TestData/Demo.xlsx";
	   File Exlfile=new File(path);
	   FileOutputStream Fos=null;
	
		try {
			 Fos = new FileOutputStream(Exlfile);
			 try {
				wbook.write(Fos);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 try {
				wbook.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			try {
				Fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
public static void main(String[]args)throws IOException{
	 writeexlsheet();
}

}
