package com.neotech.review12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo1 {

	public static void main(String[] args)  {

		String projectPath = System.getProperty("user.dir");
		String filePath = projectPath + "/extra/demo.properties";
		
		try {
			FileInputStream fis = new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("Du musst noch 3 Sonntage gucken");
		}
		
		System.out.println("Happy Coding!!!");
	}

}
