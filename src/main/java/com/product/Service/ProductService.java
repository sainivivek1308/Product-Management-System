
package com.product.Service;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.database.ProductDB;
import com.product.entity.Product;
@Service
public class ProductService {
	
	@Autowired
	ProductDB db;
	public ArrayList<Product> getallproducts() {
		// TODO Auto-generated method stub
		return (ArrayList<Product>) db.findAll();
	}
	
	public List<Product> getproductname(String name) {
		return db.findname(name);
	}
	public List<Product> getproducttype(String type) {
		return db.findType(type);
	}

	public void addproduct(Product p) {
		// TODO Auto-generated method stub
		db.save(p);
	}

	public int   deleteproductname(String name) {
		// TODO Auto-generated method stub
		//List<Product> p=db.findname(name);
		return db.deleteproductname(name);
		//List<Product> list=db.findname(name);
		//list.forEach(item->db.delete(item));
	}

	public List<Product> getproductwarranty() {
		// TODO Auto-generated method stub
		return db.getwarranty();
	}

}
