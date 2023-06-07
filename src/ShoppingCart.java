
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kstor
 */
public class ShoppingCart {
    
    private HashMap<Product,Integer> shoppingcart; // hashmap used to store the Products as a shoppingcart

    public ShoppingCart() { // constructor for the shopping cart whiich initializes the hashmap
        shoppingcart = new HashMap<Product,Integer>();
    }

    public HashMap<Product, Integer> getShoppingcart() { // getter for shoppingcart
        return shoppingcart;
    }

    public void setShoppingcart(HashMap<Product, Integer> shoppingcart) { // setter for shoppingcart
        this.shoppingcart = shoppingcart;
    }
    
    public void addToShoppingcart(Product product) // method to add products to the shoppingcart 
    {
        shoppingcart.put(product, Integer.MIN_VALUE);
    }
    
    public void removeFromShoppingcart(Product product) //method to remove products from the shoppingcart
    {
        shoppingcart.remove(product);
    }
    
    public double totalPrice() //calculates the total price of the 
    {
        double cost = 0;
        
        for(Product product: shoppingcart.keySet())
        {
            cost += product.getProductprice();
        }
        return cost;
    }
}
