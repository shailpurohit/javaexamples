package com.training.java.io;

import java.io.*;

public class FileWriterDemo {
	public static void main(String args[]) {
		try {
			File fl = new File("./src/com/training/java/io/myfile.txt");
			String str = "add data to file cbvfnbnxb hello";
			FileWriter fw = new FileWriter(fl);
			fw.write(str);
			fw.close();
			// fl.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
