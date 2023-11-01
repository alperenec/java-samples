
package JavaSample;


public class JavaSample {
public static void main(String[] args){
    
    Product product = new Product(1, "Laptop", "Lenovo İdeaped", 9000, 1, "mavi"); 
    
    /* 
    Product product = new Product(){
    }
    product.setName("Laptop"); 
    product.setDescription("Asus laptop");
    product.setPrice(10000);
    product.setStockAmount(4);
    product.setId(1);
    product.setRenk("mavi"); */
    
    System.out.println(product.getKod());
    
    }
}
