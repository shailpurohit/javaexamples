package com.training.java.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputOutputStreamDemo {
	public static void main(String[] args) throws IOException {

		DataOutputStream dos = new DataOutputStream(new FileOutputStream("./src/com/training/java/io/MyData1.txt"));

		dos.writeInt(1);
		dos.writeFloat(2.2f);
		dos.writeUTF("hi");// Unicode Transformation Format

		@SuppressWarnings("resource")
		DataInputStream dis = new DataInputStream(new FileInputStream("./src/com/training/java/io/MyData1.txt"));

		System.out.println(dis.readInt());
		System.out.println(dis.readFloat());
		System.out.println(dis.readUTF());
	}

}
