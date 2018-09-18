package com.training.java.io;

import java.io.*;

@SuppressWarnings("serial")
class Studentinfo implements Serializable {
	String name;
	int rid;
	String contact;
	//transient int salary;

	Studentinfo(String n, int r, String c) {
		this.name = n;
		this.rid = r;
		this.contact = c;

	}
}

class SerializationDemo {
	public static void main(String[] args) {
		try {
			Studentinfo si = new Studentinfo("Snehal", 104, "1233444");
			FileOutputStream fos = new FileOutputStream("./src/com/training/java/io/student.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(si);
			System.out.println("hello");

			// Reading the object from a file
			FileInputStream file = new FileInputStream("./src/com/training/java/io/student.ser");
			ObjectInputStream in = new ObjectInputStream(file);

			// Method for deserialization of object
			si = (Studentinfo) in.readObject();

			in.close();
			file.close();

			System.out.println("Object has been deserialized ");
			System.out.println("name = " + si.name);
			System.out.println("rid = " + si.rid);
			System.out.println("contact = " + si.contact);
			oos.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
