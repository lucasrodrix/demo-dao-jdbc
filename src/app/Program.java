package app;

import model.DAO.DAOFactory;
import model.DAO.SellerDAO;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		SellerDAO sellerDAO = DAOFactory.createSellerDAO();
		System.out.println("=== TEST 1: seller findbyId ===");
		
		Seller seller = sellerDAO.findById(3);
		System.out.println(seller);
	}
}
