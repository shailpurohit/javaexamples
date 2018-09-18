package com.training.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputOutputStreamReaderDemo {

	private static final String FILENAME = "./src/com/training/java/io/myfile.txt";

	public static void main(String[] args) {

		InputStream inputStream;
		Reader inputStreamReader;
		try {
			inputStream = new FileInputStream(FILENAME);
			inputStreamReader = new InputStreamReader(inputStream);
			int data = inputStreamReader.read();
			while(data != -1){
			    char theChar = (char) data;
			    data = inputStreamReader.read();
			}
			inputStreamReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
