package DataDriven;

import Lib.ReadwriteExcel;

public class ReadfromLib {

	public static void main(String[] args) {
	
	ReadwriteExcel excel=new ReadwriteExcel("C:\\selenium\\read.xlsx");
	
	System.out.println(excel.getData(0, 1, 1));
	
		
	}

}
