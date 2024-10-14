package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Product;


@Repository
public interface CloudProductRepo extends JpaRepository<Product,String>{
	
	

}
