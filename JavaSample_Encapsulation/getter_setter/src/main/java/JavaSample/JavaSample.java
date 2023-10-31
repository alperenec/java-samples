
package JavaSample;


public class JavaSample {
public static void main(String[] args){
    
    Product product = new Product(); 
    
    product.setName("Laptop"); 
    product.setDescription("Asus laptop");
    product.setPrice(10000);
    product.setStockAmount(4);
    product.setId(1);
    
    System.out.println(product.getKod());
    
    }
}
