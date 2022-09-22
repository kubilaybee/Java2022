package ClassesWithAttributes;

public class Main {
    public static void main(String[] args){
        Product product = new Product(1,"Product","Product Description",15.59,2);

        ProductManager productManager = new ProductManager();
        productManager.add(product);
        // set
        product.setPrice(199.99);
        productManager.add(product.getId(),product.getName(),product.getDescription(),product.getPrice(),product.getStockAmount());
    }
}
