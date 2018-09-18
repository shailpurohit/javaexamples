package com.training.java.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderDemo {
	public static void main(String args[]) {
		try {
			File fl = new File("./src/com/training/java/io/myfile.txt");
			BufferedReader br = new BufferedReader(new FileReader(fl));
			String str;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
			br.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		FileReader fr;
		int i;
		try {
			fr = new FileReader(
					"./src/com/training/java/io/myfile.txt");
			while ((i = fr.read()) != -1)
				System.out.print((char) i);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			 
		
		Scanner sc;
		try {
			File file = new File("./src/com/training/java/io/myfile.txt");
			sc = new Scanner(file);
			System.out.println("/n");
			while (sc.hasNextLine())
				System.out.println(sc.nextLine());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

	}
}
