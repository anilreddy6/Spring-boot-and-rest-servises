package service;

import java.util.List;

import model.Product;

public interface CloudProductService {
	
	
	public String createCloudProduct(Product product);
	public String updateCloudProduct(Product product);
	public String deleteCloudProduct(String productId);
	public Product getcloudProduct(String productId);
	public List<Product> getAllproduct();
	

}
