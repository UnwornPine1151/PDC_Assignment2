
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kstor
 */
public abstract class Product {
    
    private String productname; // variable to store the name of the Product
    private double productprice; // variable to store the price of the Product
    private String productdescription; // variable to store the description of the Product

    public Product(String productname, double productprice, String productdescription) { // constructor for Product class
        this.productname = productname; 
        this.productprice = productprice;  
        this.productdescription = productdescription;
    }

    public String getProductdescription() { //getter for productdescription
        return productdescription;
    }

    public void setProductdescription(String productdescription) { //setter for productdescription
        this.productdescription = productdescription;
    }
    
    public String getProductname() { // getter for productname
        return productname;
    }

    public void setProductname(String productname) { //setter for productname
        this.productname = productname;
    }

    public double getProductprice() { // getter for productprice
        return productprice;
    }

    public void setProductprice(double productprice) { // setter for product price
        this.productprice = productprice;
    }

    @Override
    public String toString() { // toString method that displays the Products name, price and description
        return "\n"+"Product Name = " + productname + "\n" + "Product Price in NZD = " + productprice + "\n" + "Product Description = " + productdescription+"\n";
    }
    
}
