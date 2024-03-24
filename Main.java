package schoolmanagement;

//import java.util.Scanner;
import java.util.*;
public class Main {
//private static final boolean Object = false;

public static void main(String[] a) {
	int studentid=1,staffid=1;
	Teacher jothi=new Teacher(staffid++,"Jothi",40000,"DSA");
	Teacher arul=new Teacher(staffid++,"Arul",35000,"WEB");
	Teacher vimal=new Teacher(staffid++,"Vimal",30000,"Electical");
	
	List<Teacher> teacher=new ArrayList<>();
	teacher.add(jothi);
	teacher.add(arul);
	teacher.add(vimal);
	
	Student kalai=new Student(studentid++,"kalai",'A');
	Student navee=new Student(studentid++,"Navee",'A');
	Student dhanush=new Student(studentid++,"Dhanush",'A');
	Student deepika=new Student(studentid++,"Deepika",'A');
	Student moureesh=new Student(studentid++,"Moureesh",'A');
	Student jeeva=new Student(studentid++,"Jeeva",'A');
	
	List<Student> student =new ArrayList<>();
	student.add(kalai);
	student.add(navee);
	student.add(dhanush);
	student.add(deepika);
	student.add(moureesh);
	student.add(jeeva);
	
	School school =new School(teacher,student);
//	System.out.println(school.getTeachers());
	jothi.reciveSalary();
	arul.reciveSalary();
	vimal.reciveSalary();
	
	kalai.payFee(kalai.totalFee());
	kalai.payFee(5000);
	navee.payFee(12000);
	dhanush.payFee(10000);
	deepika.payFee(8000);
	moureesh.payFee(10000);
	jeeva.payFee(20000);
	deepika.payFee(7000);
	navee.payFee(8000);
	dhanush.payFee(10000);
	
	System.out.println("---------- Students payement Detail ---------");
	System.out.println();
	System.out.println("Kalai Fees paid: ₹"+kalai.feespaid());
	System.out.println("Navee Fees paid: ₹"+navee.feespaid());
	System.out.println("Dhanush Fees paid: ₹"+dhanush.feespaid());
	System.out.println("Deeika Fees paid: ₹"+deepika.feespaid());
	System.out.println("Moureesh Fees paid: ₹"+moureesh.feespaid());
	System.out.println("Jeeva Fees paid: ₹"+jeeva.feespaid());
	System.out.println();
	
	System.out.println("----------- Teachers Details ----------");
	System.out.println();
	System.out.println("Name: "+jothi.getName()+" Subject Handle: "+jothi.getSubject()+" Salary: ₹"+jothi.getSalary());
	System.out.println("Name: "+arul.getName()+" Subject Handle: "+arul.getSubject()+" Salary: ₹"+arul.getSalary());
	System.out.println("Name: "+vimal.getName()+" Subject Handle: "+vimal.getSubject()+" Salary: ₹"+vimal.getSalary());
	System.out.println();

	System.out.println("--------- School Deatils ------------");
	System.out.println();
	System.out.println("Teachers Details: "+school.getTeachers());
	System.out.println("Students Details: "+school.getStudents());
	System.out.println("Total money earned: "+school.getTotalMoneyEarned());
	System.out.println("Total money spent: "+school.getTotalMoneySpent());
	System.out.println("Profit: "+school.getProfit());
}
}
