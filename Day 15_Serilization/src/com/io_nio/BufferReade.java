package com.io_nio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReade {
    public static void main(String[] args) throws IOException {
    	FileReader fr= new FileReader("d://abc.txt");
    	BufferedReader br=new BufferedReader(fr);
    	
    	//it will read text line written in text file n terminate when it will "\n"
    	String line = br.readLine();
    	//System.out.println(line);
    	
    	while(line != null) {
    		System.out.println(line);//it will not stop...
    		line = br.readLine();
    	}
    	br.close();
	}
}
