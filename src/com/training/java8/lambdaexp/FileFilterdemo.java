package com.training.java8.lambdaexp;

import java.io.File;
import java.io.FileFilter;

public class FileFilterdemo {
	public static void main(String[] args) {
		/*
		 * FileFilter filefilter=new FileFilter() { //Anonymous class
		 * 
		 * @Override public boolean accept(File pathname) {
		 * 
		 * return pathname.getName().endsWith(".java"); } };
		 */

		FileFilter filefilter = (File pathname) -> pathname.getName().endsWith(".java");

		File dir = new File("/home/cybage/Turn/codebase/workspace/training/JavaExamples/src/com/cybage/training/java/day4");

		File[] f = dir.listFiles(filefilter);

		for (File f1 : f) {
			System.out.println("Files: " + f1);
		}
	}
}
