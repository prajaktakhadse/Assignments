//Write a program to read the content from the abc.txt file using BufferedReader.

package com.io_nio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter {
    public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("d://abc.txt");
		
		BufferedWriter bw = new BufferedWriter(fw);
		
	    //bw.write(050);
		
		bw.write("Buffer");
		//bw.newLine(); //inserting a new line
		bw.write("writer");
		bw.newLine();
		char ch[]={'a','b','c'};
		bw.write(ch);
		bw.flush();
		bw.close();
		System.out.println("done");
		
	}
}
