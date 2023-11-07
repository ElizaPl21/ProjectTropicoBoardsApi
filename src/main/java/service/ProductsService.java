package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Products;
import repository.ProductsRepository;

@Service
public class ProductsService {
	@Autowired
	private ProductsRepository productsRepository;
	
	//Get
	public List<Products> getAllProducts(){
		return productsRepository.findAll();		
	}
	
	//Get one by Id
	public Products getProductsById(Long id) {
		return productsRepository.findById(id).orElse(null);
		
	}
	//POST
	public void createProducts(Products products) {
		productsRepository.save(products);
	}
	
	//PUT
	public Products updateProducts(Long id, Products productsDetails) {
		//Encontrar producto
		Products products = productsRepository.findById(id).orElse(null);
		
		products.setProduct_name(productsDetails.getProduct_name());
		products.setPrice(productsDetails.getPrice());
		products.setStock(productsDetails.getStock());
		products.setImage(productsDetails.getImage());
		
		return productsRepository.save(products);
	}
	
	//DELETE
	public void deleteProducts(Long id) {
		productsRepository.deleteById(id);
	}

}
