package StaticDemo;

import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args){
        // staticDemo
        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.price = 10;
        product.name = "Mouse";

        manager.add(product);
    }

    // DatabaseHelper.Cruid.Connection.createConnection();

    /*public class AnotherClass{
        public static void delete(){
            // java 11 not supported static method!!
        }
    }*/
}
