package testngpackage1;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.testng.annotations.Test;

public class ExcelSheet_FetchNumeric 
{  
@Test
public void Fetchvalues() throws EncryptedDocumentException, IOException 
{
	FileInputStream f1=new FileInputStream("H:\\Users\\shaki\\eclipse-workspace\\SeliniumProject\\DataFetching\\ShakeeraSheet.xlsx");
    Workbook w1 = WorkbookFactory.create(f1);
    String UN= w1.getSheet("Login_details").getRow(2).getCell(0).getStringCellValue();
    System.out.println(UN);
    // To fecth the numeric values from excel sheet and to avoid exception
    String Pwd=NumberToTextConverter.toText(w1.getSheet("Login_details").getRow(2).getCell(1).getNumericCellValue());
    System.out.println(Pwd);   

}	
}
