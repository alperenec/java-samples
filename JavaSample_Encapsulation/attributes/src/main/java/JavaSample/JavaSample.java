
package JavaSample;


public class JavaSample {
public static void main(String[] args){

    Product product = new Product(); 
    product.name ="Laptop";
    product.description="Asus laptop";
    product.price=10000;
    product.stockAmount=4;
    product.id=1;
    System.out.println(product.name);
    
    ProductManager productManager = new ProductManager();
    productManager.Add(product);
    }
}
