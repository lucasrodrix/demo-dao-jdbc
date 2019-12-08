package app;

import java.util.List;

import model.DAO.DAOFactory;
import model.DAO.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
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
	}
}
