package com.emusicstore.dao;

import com.emusicstore.model.Product;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

/**
 * Created by rayhan on 11/24/16.
 */
public interface ProductDao {
    void addProduct(Product product);

    void editProduct(Product product);

    Product getProductById(String id);

    List<Product> getAllProducts();

    void deleteProduct(String id);
}
