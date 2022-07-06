package Progam;


import java.util.Date;

import model.entities.Department;
import model.entities.seller;

public class Application {

	public static void main(String[] args) {
	
		Department obj = new  Department();
		
		
	  seller  seller = new seller (21, "bob", "bob@gmail.com", new Date(), 3000.0, obj );
	  
	  System.out.println(seller);

	}

}
