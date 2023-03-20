package com.que2;



import java.util.LinkedHashSet;
//import java.util.Set;

public class Books {
		public static void main(String[] args) {
			LinkedHashSet<Library> stock = new LinkedHashSet<>();
			stock.add(new Library(1,"Marcel Proust","James Joyce"));
			stock.add(new Library(2,"One Hundred Years of Solitude","Gabriel Garcia Marquez"));
			stock.add(new Library(2,"One Hundred Years of Solitude","Gabriel Garcia Marquez"));//duplicate obj
			stock.add(new Library(3,"The Power of Your Subconscious Mind","Joseph Murphy"));
			stock.add(new Library(4,"The Psychology of Money ","Morgan Housel "));
			
			
			//System.out.println(stock);
			
			for(Library lib : stock) {
				System.out.println(lib);
			}
			
			
			
		}
}
