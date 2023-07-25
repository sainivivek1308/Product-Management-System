package com.product.Repo;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.product.database.ProductDB;
import com.product.entity.Product;
@SpringBootTest
public class ProductRepoTest {
	//Testing of Repository using JUNIT 5
	@Autowired
	ProductDB repo;
	@Test
	void GetName() {
		String name="Mi Smart";
		Product product=new Product(name,"TV","Wall",2023);
		repo.save(product);
		List<Product> list=repo.findname(name);
		System.out.println(list);
		assertThat(!(list.isEmpty())).isEqualTo(true);
		
		
	}
	@AfterEach
	void setafter() {
		System.out.println("after all rows are deleted");
		repo.deleteAll();
	}
	@BeforeEach
	void Setbefore() {
		System.out.println("run before Method");
	}

}
