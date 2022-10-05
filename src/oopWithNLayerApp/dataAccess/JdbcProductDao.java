package oopWithNLayerApp.dataAccess;

import oopWithNLayerApp.entities.Product;

public class JdbcProductDao implements ProductDao{
    public void add(Product product){
        // db erişim .. sql
        System.out.println("JDBC ile veri tabanına eklendi..");
    }
}

// Hibernate