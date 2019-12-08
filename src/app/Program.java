package app;

import java.util.Date;

import model.DAO.DAOFactory;
import model.DAO.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Department obj = new Department(1, "Books");
		Seller seller = new Seller(21, "Renata", "renata@rodrix.net", new Date(), 3000.0, obj);
		SellerDAO sellerDAO = DAOFactory.createSellerDAO();
		System.out.println(seller);
	}
}
