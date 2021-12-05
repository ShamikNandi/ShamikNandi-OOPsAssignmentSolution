package com.gl.departmentInfoApp;

import com.gl.modelDepartments.AdminDepartment;
import com.gl.modelDepartments.HRDepartment;
import com.gl.modelDepartments.TechDepartment;

public class departmentInfoAppDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminDepartment objAdmin = new AdminDepartment();
		HRDepartment objHR = new HRDepartment();
		TechDepartment objTech = new TechDepartment();

		System.out.println(" Welcome to " + objAdmin.departmentName());
		System.out.println(objAdmin.getTodaysWork());
		System.out.println(objAdmin.getWorkDeadline());
		System.out.println(objAdmin.isTodayAHoliday() + "\n");

		System.out.println(" Welcome to " + objHR.departmentName());
		System.out.println(objHR.doActivity());
		System.out.println(objHR.getTodaysWork());
		System.out.println(objHR.getWorkDeadline());
		System.out.println(objHR.isTodayAHoliday() + "\n");

		System.out.println(" Welcome to  " + objTech.departmentName());
		System.out.println(objTech.getTodaysWork());
		System.out.println(objTech.getWorkDeadline());
		System.out.println(objTech.getTechStackInformation());
		System.out.println(objTech.isTodayAHoliday());
	}

}
