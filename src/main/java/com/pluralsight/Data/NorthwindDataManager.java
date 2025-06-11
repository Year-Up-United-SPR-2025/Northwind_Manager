package com.pluralsight.Data;


import com.pluralsight.Models.Category;
import com.pluralsight.Models.Product;
import com.pluralsight.Models.Supplier;
import org.apache.commons.dbcp2.BasicDataSource;

import java.net.NoRouteToHostException;
import java.util.List;

public class NorthwindDataManager {
    private BasicDataSource dataSource;

    public NorthwindDataManager(BasicDataSource dataSource){
        this.dataSource = dataSource;
    }

    public List<Category> getCategories(){
        return null;
    }

    public Category getCategoryByName(String categoryName){
        return null;
    }

    public List<Product> getProducts(){
        return  null;
    }

    public List<Product> getProductsByCategory(Category category){
        return null;
    }

    public List<Product> getProductsByPrice(double minPrice, double maxPrice){
        return null;
    }

    public List<Product> getProductsBySupplier(Supplier supplier){
        return null;
    }

    public List<Supplier> getSuppliers(){
        return null;
    }
}