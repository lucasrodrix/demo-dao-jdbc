package app;

import java.util.List;
import java.util.Scanner;

import model.DAO.DAOFactory;
import model.DAO.DepartmentDAO;
import model.entities.Department;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DepartmentDAO departmentDAO = DAOFactory.createDepartmentDAO();
		
		/*
		SellerDAO sellerDAO = DAOFactory.createSellerDAO();
		
		System.out.println("=== TEST 1: seller findbyId ===");
		Seller seller = sellerDAO.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: seller findbyDepartment ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDAO.findByDepartment(department);
		list.forEach(System.out::println);
		
		System.out.println("\n=== TEST 3: seller findAll ===");
		list = sellerDAO.findAll();
		list.forEach(System.out::println);

		System.out.println("\n=== TEST 4: seller insert ===");
		Seller newSeller = new Seller(null, "Lucas Rodrix", "lucas@rodrix,.net"	,new Date(),4000.00, department);
		sellerDAO.insert(newSeller);
		System.out.println("Inserted New ID: " + newSeller.getId());
		
		System.out.println("\n=== TEST 5: seller update ===");
		seller = sellerDAO.findById(7);
		seller.setName("Sarah Rodrix");
		seller.setEmail("sarah@rodrix.net");
		sellerDAO.update(seller);
		System.out.println("Updated Complete");
		
		System.out.println("\n=== TEST 6: seller delete ===");
		System.out.print("Enter id for delete test:");
		int id = sc.nextInt();
		sellerDAO.deleteById(id);
		System.out.println("Delete Complete");
		*/
		
		
		System.out.println("=== TEST 1: department findbyId ===");
		Department department = departmentDAO.findById(3);
		System.out.println(department);
		
		System.out.println("\n=== TEST 2: department findAll ===");
		List<Department> list = departmentDAO.findAll();
		list.forEach(System.out::println);
		/*
		System.out.println("\n=== TEST 3: department insert ===");
		Department newDepartment = new Department(null, "D1");
		departmentDAO.insert(newDepartment);
		System.out.println("Inserted New ID: " + newDepartment.getId());

		System.out.println("\n=== TEST 4: department update ===");
		department = departmentDAO.findById(7);
		department.setName("Food");
		departmentDAO.update(department);
		System.out.println("Updated Complete");
		*/
		System.out.println("\n=== TEST 5: department delete ===");
		System.out.print("Enter id for delete test:");
		int id = sc.nextInt();
		departmentDAO.deleteById(id);
		System.out.println("Delete Complete");
		
		sc.close();
	}
}
