package com.demo.SBDataJPADemo;

import com.demo.SBDataJPADemo.entities.Student;
import com.demo.SBDataJPADemo.services.StudentServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SbDataJpaDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context =  SpringApplication.run(SbDataJpaDemoApplication.class, args);
		StudentServiceImpl stdService =  context.getBean(StudentServiceImpl.class);

		//--------------------Insertion-----------------------------------
//		Student stdObj = new Student();
//		stdObj.setName("Thor Odin");
//		stdObj.setMarks(81.69f);
//		stdObj.setRollno(107);
//		boolean status =  stdService.addStudentDetails(stdObj);
//		if(status){
//			System.out.println("Student added successfully.");
//		}
//		else{
//			System.out.println("Cannot add Student due to error.");
//		}


		//--------------------Select All----------------------
//		List<Student> list = stdService.getAllStudentDetails();
//		for(Student s : list){
//			System.out.println("Name : "+s.getName());
//			System.out.println("Roll Num : "+s.getRollno());
//			System.out.println("------------------------------------------");
//		}


		//----------------------Select by Id----------------------
//		Scanner sc = new Scanner(System.in);
//		long id;
//		System.out.print("Enter the id to search : ");
//		id = sc.nextLong();
//		Student sobj = stdService.getStudentById(id);
//		if(sobj != null){
//			System.out.println("Name : "+sobj.getName());
//			System.out.println("Roll Num : "+sobj.getRollno());
//		}
//		else{
//			System.out.println("Cannot find Student!!!");
//		}


		//---------------------Update----------------------------------
//		Scanner sc = new Scanner(System.in);
//		long id;
//		System.out.print("Enter the id to change marks : ");
//		id = sc.nextLong();
//		boolean status = stdService.updateStudentDetails(id,93.5f);
//		if(status){
//			System.out.println("Marks updated successfully!!!");
//		}
//		else{
//			System.out.println("Failed to update marks.");
//		}


		//---------------------------Deletion----------------------
		Scanner sc = new Scanner(System.in);
		long id;
		System.out.print("Enter the id to delete : ");
		id = sc.nextLong();
		boolean status = stdService.deletestudentById(id);
		if(status){
			System.out.println("Student details Deleted successfully.");
		}
		else{
			System.out.println("Failed to delete student!!");
		}
	}

}
