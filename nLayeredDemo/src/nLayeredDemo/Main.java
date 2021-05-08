package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdaptor;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.dataAccess.concretes.RivalProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		ProductService productservice = new ProductManager(new RivalProductDao(),new JLoggerManagerAdaptor()); // yeni bir þey gelirse np

		Product product = new Product(2, 2, "Yes", 100, 20);
		productservice.add(product);
		
		

	}

}
