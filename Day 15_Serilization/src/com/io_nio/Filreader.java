//Write a program to read the content of the file abc.txt using FileReader.

package com.io_nio;

import java.io.FileReader;
import java.io.IOException;

public class Filreader {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("d://abc.txt");
		int i= fr.read();
		while( i != -1) {
		System.out.print((char) i);
		i = fr.read();
		}
	}

}
