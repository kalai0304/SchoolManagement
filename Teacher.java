package schoolmanagement;
//import java.util.*;
public class Teacher {
	private int id;
	private String name;
	private int salary;
	private String subjectTaken;
	
	public Teacher(int id,String name,int salary,String subjectTaken) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.subjectTaken=subjectTaken;
	}
//	
//	private List<Object> list=new ArrayList<>();
//	public List<Object> getDetails(){
//		list.add("Teacher Id: "+this.id);
//		list.add("Teacher Name: "+this.name);
//		list.add("Teacher Salary: "+this.salary);
//		list.add("Teacher Sub_Taken: "+this.subjectTaken);
//		return list;
//	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void addSalary(int sal) {
		salary+=sal;
		School.addMoneySpent(sal);
	}
	public void reciveSalary() {
		School.addMoneySpent(salary);

	}
	public int getSalary() {
		return salary;
	}
	public String getSubject() {
		return subjectTaken;
	}
	
	@Override
	public String toString() {
		return "[Name of the Teacher: "+name
				+"-Total salary earned so far ₹"
				+salary
				+"-SubjectTaken "+subjectTaken+"]";
	}
	
}
