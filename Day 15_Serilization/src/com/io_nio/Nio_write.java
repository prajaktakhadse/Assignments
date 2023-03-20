package com.io_nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class Nio_write {
      public static void main(String[] args) throws IOException {
		Path p = Paths.get("d://abc1.txt");//create the file n give the path
		
		String msg = "Welcome to JAVA \r\n";//text inside the txt file
		
		//writing a normal string
		Files.write(p, msg.getBytes());
		
		List<String> list= Arrays.asList("delhi","mumbai","kolkata","chennai");
         //write the list of string
		//Files.write(p,list);
		
		
		//In append mode
		Files.write(p, list ,StandardOpenOption.APPEND);
		System.out.println("done...");

	}
}
