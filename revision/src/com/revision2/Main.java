package com.revision2;

public class Main {
	public static void main(String[] args) {
		Person newStudent = generatePerson(new Student());
		Person newTeacher = generatePerson(new Instructor());
		System.out.println(newStudent);
		System.out.println(newTeacher);
		}

	private static Person generatePerson(Person person) {
		// TODO Auto-generated method stub
		Address ad = new Address();
		ad.setCity("Chennai");
		ad.setState("TN");
		ad.setPinCode("600001");
		
		if(person instanceof Student) {
			((Student) person).setStudentId(1);
			((Student) person).setCourseFee(300000);
			((Student) person).setCourseEnrolled("JA111");
			person.setAddress(ad);
		}
		else if(person instanceof Instructor) {
			((Instructor) person).setInstructorId(456);
			((Instructor) person).setSalary(45612);
			person.setAddress(ad);
		}
		return person;
	}

}
