package edu.jspiders.Arrays.NumberPrograms;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Sample {
	public static void main(String[] args) throws IOException {
		
		File file = new File("sample.pdf");
		
		FileWriter fw = new FileWriter(file);
		fw.write("hii vinay");
		fw.close();
		
		FileReader fr = new FileReader(file);
		int x;
		while((x=fr.read())!=-1) {
		
		char ch = (char)x;
		
		System.out.print(ch);
		}
		fr.close();
		
	}
}
