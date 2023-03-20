package com.que2;

import java.util.Comparator;
import java.util.Objects;

public class Members implements Comparator<Members> {
      private int memberId;
      private String memberName;
      private int membershipNo;
      private String membershipEndDate;

      
	public Members(int memberId, String memberName, int membershipNo, String membershipEndDate) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.membershipNo = membershipNo;
		this.membershipEndDate = membershipEndDate;
	}



	public Members() {
		super();
		// TODO Auto-generated constructor stub
	}


  //getter n setter method
	public int getMemberId() {
		return memberId;
	}



	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}



	public String getMemberName() {
		return memberName;
	}

	 
    public int getMembershipNo() {
		return membershipNo;
	}


	public void setMembershipNo(int membershipNo) {
		this.membershipNo = membershipNo;
	}


	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}



	public String getMembershipEndDate() {
		return membershipEndDate;
	}



	public void setMembershipEndDate(String membershipEndDate) {
		this.membershipEndDate = membershipEndDate;
	}
      
   //the format to return output
	@Override
	public String toString() {
		return "Membership Details:\n"
				+"Member Id : "+getMemberId()+"\n"+
				"Member Name: "+ getMemberName()+ "\n" +
				"Member Number: " + getMemberName()+"\n" +
				"Membership EndDate: "+getMembershipEndDate();
    }
	
	
	
	@Override
	public boolean equals(Object obj) {
		if(this== obj) {
			return true;
		}
		Members m = this;
		Members m1 = (Members)obj;
		
		return m.memberId == m1.memberId && m.membershipNo == m1.membershipNo && m.memberName.equals(m1.memberName)
				&& m.membershipEndDate.equals(m1.membershipEndDate);
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.memberId,this.membershipNo);
		
	}



	@Override
	public int compare(Members o1, Members o2) {
		// TODO Auto-generated method stub
		return 0;
	}



	
      
}
