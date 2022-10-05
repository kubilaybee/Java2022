package oopWithNLayerApp.dataAccess;

import oopWithNLayerApp.entities.Product;

public class HibernateProductDao implements ProductDao{
    public void add(Product product){
        // db erişim .. sql
        System.out.println("Hibernate ile veri tabanına eklendi..");
    }
}
