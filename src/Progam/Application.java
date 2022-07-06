package Progam;


import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Application {

	public static void main(String[] args) {
	
		
	  
	  SellerDao sellerDao = DaoFactory.creaSellerDao();
	  
	  Seller seller = sellerDao.findById(3);
	  
	  System.out.println(seller);

	}

}
