package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		
//		System.out.println("\n===== TEST 1: department insert =====");	
//		Department newDepartment = new Department(null, "Kitchen");
//		departmentDao.insert(newDepartment); ;
//		System.out.println("Inserted! New id = " + newDepartment.getId());
//		
		
		
//		System.out.println("\n===== TEST 2: department findById =====");
//		Department department = departmentDao.findById(3);
//		System.out.println(department);
		
		System.out.println("\n===== TEST 3: department update =====");	
		Department department = departmentDao.findById(6);
		department.setName("Development");
		departmentDao.update(department);
		System.out.println("Update completed");
		
		
	}

}
