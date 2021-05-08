package nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductDao { // veri eri�im interface i �r�n eklem �r�n g�ncelleme �r�n silme etc.

	void add(Product product);

	void update(Product product);

	void delete(Product product);

	Product get(int id); // Product i�in get methodu product ile �a��r�l�r

	List<Product> getAll();

}
