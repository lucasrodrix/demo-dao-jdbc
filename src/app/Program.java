package app;

import java.util.Date;

import model.DAO.DAOFactory;
import model.DAO.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		SellerDAO sellerDAO = DAOFactory.createSellerDAO();
		Seller seller = sellerDAO.findById(3);
		System.out.println(seller);
	}
}
