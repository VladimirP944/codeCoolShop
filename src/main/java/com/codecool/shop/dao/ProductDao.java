package com.codecool.shop.dao;

import com.codecool.shop.model.Supplier;
import com.codecool.shop.model.Product;
import com.codecool.shop.model.ProductCategory;

import java.util.List;

public interface ProductDao {

    void add(Product product);
    Product find(int id);
    Product find(String name);
    Product findOne(String name);
    void remove(int id);

    List<Product> getAll();
    List<Product> getBy(Supplier supplier);
    List<Product> getBy(ProductCategory productCategory);
    List<Product> getBy(String name);
    Product getByOne(String name);

}