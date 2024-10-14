package service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import model.Product;
import repository.CloudProductRepo;
import service.CloudProductService;


@Service
public class CloudProductserviceImpli implements CloudProductService {
	
	CloudProductRepo cloudproductrepo;

	public CloudProductserviceImpli(CloudProductRepo cloudproductrepo) {
	
		this.cloudproductrepo = cloudproductrepo;
	}

	@Override
	public String createCloudProduct(Product product) {
		// TODO Auto-generated method stub
		cloudproductrepo.save(product);
		return "sucess";
	}

	@Override
	public String updateCloudProduct(Product product) {
		// TODO Auto-generated method stub
		cloudproductrepo.save(product);
		return "sucess";
	}

	@Override
	public String deleteCloudProduct(String productId) {
		// TODO Auto-generated method stub
		cloudproductrepo.deleteById(productId);
		return "sucess";
	}

	@Override
	public Product getcloudProduct(String productId) {
		// TODO Auto-generated method stub
		return cloudproductrepo.findById(productId).get();
	
	}

	@Override
	public List<Product> getAllproduct() {
		// TODO Auto-generated method stub
		return cloudproductrepo.findAll();
	}

}
