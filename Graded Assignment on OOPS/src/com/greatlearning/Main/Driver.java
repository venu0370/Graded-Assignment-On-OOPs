package com.greatlearning.Main;
import com.greatlearning.Organization.AdminDepartment;
import com.greatlearning.Organization.HrDepartment;
import com.greatlearning.Organization.SuperDepartment;
import com.greatlearning.Organization.TechDepartment;

public class Driver {

	public static void main(String[] args) {
		
		SuperDepartment Ad = new AdminDepartment();
		
		System.out.println("Welcome To "+ Ad.departmentName());
		System.out.println(Ad.getTodaysWork());
		System.out.println(Ad.getWorkDeadline());
		System.out.println(Ad.isTodayAHoliday());
		
		System.out.println();
	
		HrDepartment Hr = new HrDepartment();
		
		System.out.println("Welcome To "+Hr.departmentName());
		System.out.println(Hr.doActivity());
		System.out.println(Hr.getTodaysWork());
		System.out.println(Hr.getWorkDeadline());
		System.out.println("Today is not a Holiday");
	
		System.out.println();
	
		TechDepartment Td = new TechDepartment();
		
		System.out.println("Welcome To "+Td.departmentName());
		System.out.println(Td.getTodaysWork());
		System.out.println(Td.getWorkDeadline());
		System.out.println(Td.getStackInformation());
		System.out.println("Today is not a Holiday");		
	}
}
