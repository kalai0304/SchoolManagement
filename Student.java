package schoolmanagement;
//import java.util.*;
public class Student {
	private int id;
	private String name;
	private char grade;
	private int feesPaid;
	private int pendingFee;
	private int totalFees;
	public Student(int id,String name,char grade) {
		this.id=id;
		this.name=name;
		this.grade=grade;
		this.feesPaid=0;
		this.pendingFee=0;
		this.totalFees=25000;
	}
	public void payFee(int fees) {
		if(fees<=0) {
			System.out.println("Incorect payment method :(");
		}else {
		if(feesPaid==totalFees) {
			System.out.println(name+" you are trying to pay :₹"+fees);
			System.out.println("You have paid all the fee you don't need to pay anymore, Thank you :)");
		}
		if(feesPaid<totalFees) {
			if((feesPaid+fees) >totalFees) {
				System.out.println("You have to pay ₹"+(totalFees-feesPaid)+" only you have paid ₹"+(feesPaid+fees - totalFees)+" more money");
			}else {				
				feesPaid+=fees;
				School.addMoneyEarned(fees);
			}
		}
		pendingFee=totalFees-feesPaid;
		}
//		return feesPaid;
	}
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setGrade(char grade) {
		this.grade=grade;
	}
	
	public char getGrade() {
		return grade;
	}
	
	public int feespaid() {
		return feesPaid;
	}
	
	public int pendingFees() {
		pendingFee=totalFees-feesPaid;
		return pendingFee;
	}
	
	public int totalFee() {
		return totalFees;
	}
	@Override
	public String toString() {
		return "[Student's name: "+name
				+"-Grade "+grade
				+" -Total fees paid so far ₹"+feesPaid
				+"-Pending fees ₹"+pendingFee;
	}

}
