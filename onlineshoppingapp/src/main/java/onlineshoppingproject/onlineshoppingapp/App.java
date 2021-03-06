package onlineshoppingproject.onlineshoppingapp;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("springbeans.xml");

    	User user = context.getBean("user",User.class);
    	System.out.println("User-Name       : " +user.getUsername());
    	System.out.println("Email Id        : "+user.getEmail());
    	System.out.println("Password        : "+user.getPassword());
    	System.out.println("Shipping Address: "+user.getShipping_address());
    	System.out.println("Billing Address : "+user.getBilling_address());
    	System.out.println("=================================================================================");
    	
    	Product product = context.getBean("product",Product.class);
    	System.out.println("Product Name     : "+product.getProduct_name());
    	System.out.println("Price            : "+product.getPrice());
    	System.out.println("Quantity In Stock: "+product.getQuantity_in_stock());
    	System.out.println("Image Location   : "+product.getImagelocation());
    	System.out.println("=================================================================================");








        Order order=context.getBean("order",Order.class);
        

        List<Cart> cartList=order.getCartList();
        for(Cart ca:cartList){
        	
            System.out.println(ca.getUser().getUsername());
            
            System.out.println(ca.getUser().getEmail());
            System.out.println(ca.getUser().getPassword());
            System.out.println(ca.getUser().getShipping_address());
            System.out.println(ca.getUser().getBilling_address());
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        	for(Product p:ca.getProductList()){
        		System.out.println(p.getProduct_name());
        		System.out.println(p.getPrice());
        		System.out.println(p.getQuality_in());
        		System.out.println(p.getImagelocation());
               System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        		
        	}
        	
        	System.out.println(ca.getTotal_amount());
        	//System.out.println(ca.isStatus());
        	System.out.println(ca.isConfirmorder());
            System.out.println("===============================================================");

        }
        
	    
    	
    }
}
