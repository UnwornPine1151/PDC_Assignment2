
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kstor
 */
public class Printer {

    public void printProductlist(List<Product> productlist) // function for printing the productlist to the user
    {
        for(Product product: productlist){
        System.out.println(product.toString());
        }
    }
    
    public void printShoppingCart(HashMap<Product,Integer> shoppingcart) // function to print the ShoppingCart
    {
       Set keySet = shoppingcart.keySet();
       Iterator iterator = keySet.iterator();
       
       while(iterator.hasNext())
       {
           System.out.println(iterator.next().toString());
       }
            
    }
    
    public void printTotalCost(ShoppingCart shoppingcart) // function to print the total cost of the shopping cart which is calculated in the shoppingcart class
    {
        System.out.println("The total cost of your cart in NZD is: " + shoppingcart.totalPrice());
    }
    
    public void printUserInfo(UserInfo customer)
    {
        System.out.println(customer.toString());
    }
}
