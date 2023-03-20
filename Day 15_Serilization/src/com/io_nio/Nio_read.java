package com.io_nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Nio_read {
	public static void main(String[] args) throws IOException {
		Path p = Paths.get("d://abc1.txt");
		List<String> list= Files.readAllLines(p);
		//System.out.println(list);
		System.out.println("Reading from the file");
		for(String line:list) {
			System.out.println(line);
		}

	}
}
