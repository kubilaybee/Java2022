package ClassesWithAttributes;

public class ProductManager {

    public void add(Product product){
        // JDBC
        System.out.println(product.getName()+" Added!!");
    }
    public void add(int id, String name, String description,double price, int stockAmount){
        // JDBC
        System.out.println("id:"+id);
        System.out.println("name:"+name);
        System.out.println("description:"+description);
        System.out.println("price:"+price);
        System.out.println("stockAmount:"+stockAmount);
    }
}
