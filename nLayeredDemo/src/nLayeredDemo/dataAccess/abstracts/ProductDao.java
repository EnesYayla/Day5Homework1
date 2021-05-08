package nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductDao { // veri eriþim interface i ürün eklem ürün güncelleme ürün silme etc.

	void add(Product product);

	void update(Product product);

	void delete(Product product);

	Product get(int id); // Product için get methodu product ile çaðýrýlýr

	List<Product> getAll();

}
