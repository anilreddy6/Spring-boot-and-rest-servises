package Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Product;
import service.CloudProductService;

@RestController
@RequestMapping("/product")
public class Productcontroller {
	
	
	CloudProductService cloudproductservice;
	
	
public Productcontroller(CloudProductService cloudproductservice) {
		this.cloudproductservice = cloudproductservice;
	}

@GetMapping("{productId}")
public Product Getproductdettails(@PathVariable("productId") String productId)
{
		return cloudproductservice.getcloudProduct(productId);
}


@GetMapping()
public List<Product> GetAllproductdettails()
{
		return cloudproductservice.getAllproduct();
}


@PutMapping
public String putProductDetails(@RequestBody Product product){
	cloudproductservice.updateCloudProduct(product);
	return " product updated  sucessfull";
	
}

@PostMapping
public String postpeoductdetails(@RequestBody Product product) {
	
	cloudproductservice.createCloudProduct(product);
	return "product creation sucessful";
}

@DeleteMapping("{productId}")
public String deletetheproductdetails(@PathVariable("productId") String productId) {
	cloudproductservice.deleteCloudProduct(productId);
return " product deleted sucessfully";
}


}