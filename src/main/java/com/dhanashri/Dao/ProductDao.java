package com.dhanashri.Dao;

import java.util.List;

import com.dhanashri.entity.Product;

public interface ProductDao {
	public Boolean addProduct(Product product);
	public Product getProductById(Long id);
	public List<Product> getAllProducts();
	public Boolean deleteProduct(Long id);
	public Boolean updateProduct(Product product);
	public List<Product> sortProducts(String sortBy,String fieldName);
	public List<Product> getMaxPriceProducts();
	public Double countSumOfProductPrice();
	public Long getTotalCountOfProducts();
	public Product getProductByName(String getProductByName);
	public String uploadSheet(List<Product> list);
}
