package com.training.java.io;

import java.io.*;

public class BufferedInputOutputStreamDemo {
	public static void main(String args[]) {
		try {
			FileOutputStream fout = new FileOutputStream("./src/com/training/java/io/abc.txt");
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			String s = "Hello welcome to io for buffer write";
			byte b[] = s.getBytes();// converting string into byte array
			fout.write(b);
			bout.flush();
			fout.close();
			System.out.println("success...");
			FileInputStream fin = new FileInputStream("./src/com/training/java/io/abc.txt");
			BufferedInputStream bin = new BufferedInputStream(fin);
			int i;
			while ((i = bin.read()) != -1) {
				System.out.println((char) i);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
