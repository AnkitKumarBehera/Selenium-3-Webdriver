package webDriverExamples;

import java.io.FileInputStream;
import jxl.Sheet;
import jxl.Workbook;

public class Excel {
	public static void main(String[] args)throws Exception {
		FileInputStream f1=new FileInputStream("D:\\selenium software\\ReadExcel.xls");
		Workbook w1=Workbook.getWorkbook(f1);
		Sheet s1=w1.getSheet(0);
		int rowcount=s1.getRows();

		System.out.println(rowcount);
for(int i=1; i<rowcount; i++)  {
		String EmpId=s1.getCell(0,i).getContents();
		String EmpName=s1.getCell(1,i).getContents();
		String EmpEmail=s1.getCell(2,i).getContents();
		String EmpNo=s1.getCell(3,i).getContents();
System.out.println(EmpId);
System.out.println(EmpName);
System.out.println(EmpEmail);
System.out.println(EmpNo);
		// TODO Auto-generated method stub

	}
	}
}
