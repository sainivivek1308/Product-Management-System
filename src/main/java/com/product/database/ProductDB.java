package com.product.database;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.product.entity.Product;

import jakarta.transaction.Transactional;
@Repository
public interface ProductDB extends JpaRepository<Product, Integer> {
	
	@Query(value="Select p.id,p.name,p.type,p.place,p.warranty"
			+ " from product p where p.name=:name",nativeQuery = true)
	List<Product> findname(@Param(value = "name") String  name1);
	
	@Query(value="Select p.id,p.name,p.type,p.place,p.warranty"
			+ " from product p where p.type=:type",nativeQuery = true)
	List<Product> findType(@Param(value = "type") String  type);
	
	@Modifying
	@Transactional
	@Query(value="Delete from product p where p.name=:name",nativeQuery=true)
	int deleteproductname(@Param("name") String name);

	@Query(value="Select p.id,p.name,p.type,p.place,p.warranty from product p where p.warranty<2022",nativeQuery = true)
	List<Product> getwarranty();
}	
