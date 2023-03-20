package com.que3;

public class HistoryStudent extends Student{
	
	public HistoryStudent(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}
	int historyMarks;
    int civicsMarks;
	static int noOfStudents;
	
	
	public HistoryStudent(String name, String address, int historyMarks, int civicsMarks) {
		super(name, address);
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
	}


	@Override
	void getPercentage() {
		// TODO Auto-generated method stub
		int total = ((  civicsMarks +  historyMarks)/200)*100;
	    System.out.println(total);
	}

}
