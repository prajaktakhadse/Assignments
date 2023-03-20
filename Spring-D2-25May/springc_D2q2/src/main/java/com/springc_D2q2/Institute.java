package com.springc_D2q2;
//step2:
import java.util.List;

public class Institute {
	
	private List<Students> studentlist;

	
	
	public List<Students> getStudentlist() {
		return studentlist;
	}

	public void setStudentlist(List<Students> studentlist) {
		this.studentlist = studentlist;
	}

	public void Start() {
		System.out.println("This is for init-Starting");
	}
	
	public void end() {
		System.out.println("This is for destroy(end of spring)");
	}
	
    
}
