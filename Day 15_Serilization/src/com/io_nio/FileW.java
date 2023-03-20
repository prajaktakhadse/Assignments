package com.io_nio;

import java.io.FileWriter;
import java.io.IOException;

public class FileW {
    

	public static void main(String[] args)throws IOException {
		FileWriter fw = new FileWriter("d://abc.txt");
		fw.write(500);//d will be added
		fw.write("\r\n");
		fw.write("welcome\r\n to");
		fw.write("\r\n");
		fw.write("india");
		fw.write("\r\n");
		char ch[]={'a','b','c'};
		fw.write(ch);
		fw.flush();
		fw.close();
		System.out.println("done");
		}

	}

