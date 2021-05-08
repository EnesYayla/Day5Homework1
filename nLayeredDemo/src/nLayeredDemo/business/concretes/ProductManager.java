package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.JLoggerManagerAdaptor;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;


public class ProductManager implements ProductService {

	private ProductDao productDao;
	private JLoggerManagerAdaptor jLoggerManagerAdaptor;

	public ProductManager(ProductDao productDao, JLoggerManagerAdaptor jLoggerManagerAdaptor) {
		
		this.productDao = productDao;
		this.jLoggerManagerAdaptor = jLoggerManagerAdaptor;
	}


	@Override
	public void add(Product product) {
		if (product.getCategoryId() == 1) {
			System.out.println("Not a Valid Item");
			return;
		}
		this.productDao.add(product);
		this.jLoggerManagerAdaptor.logToSystem("Bruh");}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
